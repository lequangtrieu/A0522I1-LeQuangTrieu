<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Favicon -->

    <link rel="icon" href="./assets/images/favicon/favicon.png" type="image/x-icon" />

    <!-- Title -->
    <title>Thêm phòng</title>

    <!-- Link Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">


    <link rel="stylesheet" href="./assets/css/core_style/core.css">
    <link rel="stylesheet" href="./assets/css/hostel_owner_style/room-create-account-style/style.css">
    <link rel="stylesheet" href="./assets/css/push_notification_style/style.css">

</head>
<style>
    /* CSS cho nút khi ở trạng thái disabled */
    button[disabled] {
        pointer-events: none; /* Không cho phép sự kiện click */
        background-color: grey; /* Màu nền xám */

        opacity: 0.5; /* Độ mờ */
    }

    /* Không cho phép hover khi disabled */
    button[disabled]:hover {
        background-color: grey; /* Giữ màu nền xám */
        color: #666; /* Giữ màu chữ tương phản */
        cursor: default; /* Không hiển thị icon chuột */
    }
    #loading-overlay {
        display: none;
        position: fixed;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background-color: rgba(255, 255, 255, 0.8); /* Một lớp mờ */
        z-index: 9999; /* Đảm bảo nó hiển thị trên tất cả các phần tử khác */
    }

    #loading-overlay img {
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
    }
</style>
<!-- Core CSS -->
<link rel="stylesheet" href="./assets/css/core_style/core.css">

<!-- Link your CSS here -->
<link rel="stylesheet" href="./assets/css/hostel_owner_style/add-new-room-style/style.css">

<!-- CSS Push Nnotification -->
<link rel="stylesheet" href="./assets/css/push_notification_style/style.css">

</head>

<body class="${requestScope.RESPONSE_MSG eq null ? "over-flow-hidden" : ""}">

<!-- Navbar -->
<%@include file="../components/navbar.jsp"%>

<c:if test="${requestScope.RESPONSE_MSG eq null}">
    <div id="preloader">
        <div class="dots">
            <div></div>
            <div></div>
            <div></div>
        </div>
    </div>
</c:if>

<!-- Body -->
<div class="container min-height">
    <div class="row position-relative">
        <!-- Sidebar -->
        <div class="col-12 col-lg-3 col-xl-3 col-xxl-2">
            <%@include file="../components/sidebar.jsp"%>
        </div>
        <!-- Content -->
        <div class="col-12 col-lg-9 col-xl-9 col-xxl-10 content-group">
            <!-- Content head bar -->
            <div class="content-history">
                <a href="list-hostels" class="history-link">Danh sách khu trọ</a>
                <i class="fa-solid fa-chevron-right"></i>
                <a href="detailHostel?hostelID=${requestScope.hostel.hostelID}" class="history-link">${requestScope.hostel.hostelName}</a>
                <i class="fa-solid fa-chevron-right"></i>
                <div class="current">Thêm phòng</div>
            </div>
            <!-- Form -->
            <div class="row mb-5">
                <div class="content-body col-12 col-md-10 col-lg-9 col-xl-8 col-xxl-6 m-auto">
                    <!-- Form body -->
                    <form action="${requestScope.rid eq null ? 'AddNewRoom' : 'updateRoom'}" method="post" enctype="multipart/form-data" class="custom-form add-room-form" id="add-hostel-form">
                        <!-- Title -->
                        <div class="form-header">
                            <div class="form-title main-title">${requestScope.rid eq null ? "Thêm phòng mới" : "Cập nhật phòng"}</div>
                        </div>
                        <!-- Warning -->
                        <c:if test="${requestScope.rid eq null}">

                            <div class="form-warning">
                                <p><span>*</span> Để tạo cùng lúc nhiều phòng, hãy thay đổi số lượng
                                    phòng cần tạo,
                                    mặc định để 1 là tạo 1 phòng!</p>
                                <p><span>*</span> Khi tạo nhiều phòng cùng lúc, tên phòng,ảnh phòng sẽ được tạo ngẫu nhiên,
                                    bạn có thể đổi tên phòng, ảnh phòng sau này!</p>
                            </div>

                        </c:if>
                        <c:if test="${requestScope.rid != null}">
                            <div class="form-warning">
                                <p><span>*</span>Nếu cập nhật ảnh của phòng thì tất cả ảnh cũ sẽ bị xoá và thay bằng ảnh mới! </p>

                            </div>
                        </c:if>
                        <div class="spacer"></div>
                        <!-- Input -->
                        <c:if test="${requestScope.rid eq null}">
                            <div class="form-group">
                                <div class="form-wrapper">
                                    <label for="room-quantity" class="form-label">Số lượng: <span>*</span></label>
                                    <input id="room-quantity" name="room-quantity" type="number" value="1" class="form-control">
                                </div>
                                <span class="form-message"></span>
                            </div>
                        </c:if>
                        <div class="form-group">
                            <div class="form-wrapper">
                                <label for="room-img" class="form-label">Room Images: <span>*</span></label>
                                <input id="room-img" type="file" name="fileImage" accept=".png, .jpg" multiple class="form-control" onchange="validateFiles(this)">

                            </div>
                            <span class="form-message"></span>
                        </div>
                        <div class="form-group">
                            <div class="form-wrapper">
                                <label for="room-name" class="form-label">Phòng số: </label>
                                <input id="room-name" name="room-name" type="number" class="form-control"
                                       placeholder="Phòng số ..." >
                            </div>
                            <span id="form-mess-roomNumber" class="form-message"></span>
                        </div>
                        <div class="form-group">
                            <div class="form-wrapper">
                                <label for="room-capacity" class="form-label">Số lượng thành viên tối đa:
                                    <span>*</span></label>

                                <input id="room-capacity" name="room-capacity" type="number"
                                       class="form-control" value="${requestScope.rid != null ? r.capacity:1}">
                            </div>


                            <span class="form-message"></span>
                        </div>

                        <div class="form-group">
                            <div class="form-wrapper">
                                <label for="room-price" class="form-label">Giá phòng:
                                    <span>*</span></label>

                                <input id="room-price" name="room-price" type="number"
                                       class="form-control" value="1000000">
                            </div>


                            <span class="form-message"></span>
                        </div>

                        <div class="form-group">
                            <div class="form-wrapper">
                                <label for="room-area" class="form-label fill-label">
                                    Diện tích <span>*</span></label>

                                <input id="room-area" name="room-area" value="${requestScope.rid != null ? r.roomArea:20}" type="number"

                                       class="form-control">
                                <span class="form-unit d-block text-end" style="width: 34px;">m2</span>
                            </div>
                            <span class="form-message"></span>
                        </div>
                        <div class="form-group">
                            <div class="form-wrapper">
                                <label for="room-floor" class="form-label fill-label">
                                    Gác <span>*</span>
                                </label>
                                <select id="room-floor" class="form-control fill-input"
                                        name="room-floor">

                                    <c:if test="${requestScope.rid eq null}">
                                        <option value="1" selected>Có</option>
                                        <option value="0">Không</option>
                                    </c:if>
                                    <c:if test="${requestScope.r.hasAttic == 1}">
                                        <option value="1" selected>Có</option>
                                        <option value="0">Không</option>
                                    </c:if>
                                    <c:if test="${requestScope.r.hasAttic == 0}">
                                        <option value="1" >Có</option>
                                        <option value="0" selected>Không</option>
                                    </c:if>

                                </select>
                                <span class="fill-unit"></span>
                            </div>
                            <span class="form-message"></span>
                        </div>
                        <div class="spacer"></div>

                        <c:if test="${requestScope.rid eq null}">

                            <div class="infrastructure-group">
                                <div class="form-header">
                                    <div class="form-title infrastructure-title">Cơ sở vật chất</div>
                                </div>
                                <div class="form-group infrastructure-fill">
                                    <div class="infrastructure-wrapper">
                                        <label for="room-toilet" class="form-label fill-label">Nhà vệ
                                            sinh:</label>
                                        <input id="room-toilet" name="room-toilet" value="1" type="number"
                                               class="form-control fill-input">
                                        <span class="fill-unit">cái</span>
                                        <select name="room-toilet-status" class="fill-status">
                                            <option value="1" selected>Sử dụng tốt</option>
                                            <option value="0">Hư hỏng</option>
                                        </select>
                                    </div>
                                    <span class="form-message"></span>
                                </div>
                                <div class="form-group infrastructure-fill">
                                    <div class="infrastructure-wrapper">
                                        <label for="room-window" class="form-label fill-label">Cửa
                                            sổ:</label>
                                        <input id="room-window" name="room-window" value="1" type="number"
                                               class="form-control fill-input">
                                        <span class="fill-unit">cái</span>
                                        <select name="room-window-status" class="fill-status">
                                            <option value="1" selected>Sử dụng tốt</option>
                                            <option value="0">Hư hỏng</option>
                                        </select>
                                    </div>
                                    <span class="form-message"></span>
                                </div>
                                <div class="form-group infrastructure-fill">
                                    <div class="infrastructure-wrapper">
                                        <label for="room-door" class="form-label fill-label">Cửa ra
                                            vào</label>
                                        <input id="room-door" name="room-door" value="1" type="number"
                                               class="form-control fill-input">
                                        <span class="fill-unit">cái</span>
                                        <select name="room-door-status" class="fill-status">
                                            <option value="1" selected>Sử dụng tốt</option>
                                            <option value="0">Hư hỏng</option>
                                        </select>
                                    </div>
                                    <span class="form-message"></span>
                                </div>
                                <div class="form-group infrastructure-fill">
                                    <div class="infrastructure-wrapper">
                                        <label for="room-air-conditioner" class="form-label fill-label">Máy
                                            lạnh</label>
                                        <input id="room-air-conditioner" name="room-air-conditioner" value="1"
                                               type="number" class="form-control fill-input">
                                        <span class="fill-unit">cái</span>
                                        <select name="room-air-conditioner-status" class="fill-status">
                                            <option value="1" selected>Sử dụng tốt</option>
                                            <option value="0">Hư hỏng</option>
                                        </select>
                                    </div>
                                    <span class="form-message"></span>
                                </div>
                            </div>

                        </c:if>

                        <div class="spacer"></div>
                        <!-- Action -->
                        <div class="add-room-action">
                            <a href="detailHostel?hostelID=${requestScope.hid}" class="form-submit">Hủy bỏ</a>
                            <input id="hostID" type="hidden" name="hid" value="${requestScope.hid}">


                            <c:if test="${requestScope.rid != null}">

                                <input type="hidden" name="RoomID" value="${requestScope.r.roomId}">

                            </c:if>
                            <%--                            change hostelID ben Servlet--%>
                            <button id="submitBTN" class="form-submit">${requestScope.rid eq null?"Tạo phòng":"Cập nhật"}</button>

                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Footer -->
<%@include file="../components/footer.jsp"%>

<!-- Script Bootstrap !important -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
<!-- Jquery -->

<script src="assets/js/jquery-3.5.1.min.js"></script>
<!-- Axios -->
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
<!-- Link your script here -->
<script src="assets/js/handle-main-navbar.js"></script>
<script src="assets/js/valid-form.js"></script>
<!-- Push notification -->
<script src="assets/js/push-notification-alert.js"></script>
<!-- Web socket -->
<script src="assets/js/receiveWebsocket.js"></script>

<script>

    // Validator({
    //     form: '#add-hostel-form',
    //     formGroupSelector: '.form-group',
    //     errorSelector: '.form-message',
    //     rules: [
    //         Validator.isRequired('#room-name', 'Vui lòng nhập phòng số'),
    //         Validator.isRequired('#room-capacity', 'Vui lòng nhập số lượng thành viên tối đa'),
    //         Validator.minNumber('#room-capacity', 1, 'Vui lòng nhập số lượng tối thiểu là 1'),
    //         Validator.maxNumber('#room-capacity', 10, 'Vui lòng nhập số lượng dưới 10'),
    //         Validator.isInteger('#room-capacity', 'Số lượng người phải là số nguyên'),
    //         Validator.maxNumber('#room-area', 1000, 'Vui lòng nhập giá trị dưới 1000'),
    //         Validator.minNumber('#room-area', 1, 'Vui lòng nhập giá trị tối thiểu là 1'),
    //     ]
    // });

    function getParent(element, selector) {
        while (element.parentElement) {
            if (element.parentElement.matches(selector)) {
                return element.parentElement;
            }
            element = element.parentElement;
        }
    }


    if (${requestScope.rid eq null}){
        Validator({
            form: '#add-hostel-form',
            formGroupSelector: '.form-group',
            errorSelector: '.form-message',
            rules: [

                Validator.isRequired('#room-quantity', 'Vui lòng nhập số lượng phòng cần tạo'),

                Validator.minNumber('#room-quantity', 1, 'Vui lòng nhập số lượng tối thiểu là 1'),
                Validator.maxNumber('#room-quantity', 50, 'Vui lòng nhập số lượng dưới 50'),
                Validator.isInteger('#room-quantity', 'Số lượng phòng phải là số nguyên'),

                Validator.isRequired('#room-price', 'Vui lòng nhập số tiền phòng cần tạo'),
                Validator.minNumber('#room-price', 1000, 'Vui lòng nhập số tiền tối thiểu là 1000'),
                Validator.isInteger('#room-price', 'Số lượng phòng phải là số nguyên'),

                Validator.isRequired('#room-name', 'Vui lòng nhập phòng số'),
                Validator.isRequired('#room-capacity', 'Vui lòng nhập số lượng thành viên tối đa'),
                Validator.minNumber('#room-capacity', 1, 'Vui lòng nhập số lượng tối thiểu là 1'),
                Validator.maxNumber('#room-capacity', 10, 'Vui lòng nhập số lượng dưới 10'),
                Validator.isInteger('#room-capacity', 'Số lượng người phải là số nguyên'),
                Validator.maxNumber('#room-area', 1000, 'Vui lòng nhập giá trị dưới 1000'),
                Validator.minNumber('#room-area', 1, 'Vui lòng nhập giá trị tối thiểu là 1'),
                Validator.minNumber('#room-toilet', 0, 'Vui lòng nhập giá trị tối thiểu là 0'),
                Validator.isInteger('#room-toilet', 'Số lượng phải là số nguyên'),
                Validator.minNumber('#room-window', 0, 'Vui lòng nhập giá trị tối thiểu là 0'),
                Validator.isInteger('#room-window', 'Số lượng phải là số nguyên'),
                Validator.minNumber('#room-door', 0, 'Vui lòng nhập giá trị tối thiểu là 0'),
                Validator.isInteger('#room-door', 'Số lượng phải là số nguyên'),
                Validator.minNumber('#room-air-conditioner', 0, 'Vui lòng nhập giá trị tối thiểu là 0'),
                Validator.isInteger('#room-air-conditioner', 'Số lượng phải là số nguyên'),
            ]
        });

        const inputName = document.querySelector('#room-name');
        const fileImg = document.querySelector('#room-img');
        const errorElement = getParent(inputName, ".form-group").querySelector('.form-message');
        document.querySelector('#room-quantity').addEventListener('change', (e) => {
            if (e.target.value != '1') {
                document.getElementById("submitBTN").removeAttribute("disabled");
                inputName.setAttribute("disabled", "true");
                inputName.value = "0";
                fileImg.setAttribute("disabled", "true");
                // fileImg.removeAttribute("required");
                errorElement.innerHTML = "";
            } else {
                inputName.removeAttribute("disabled");
                inputName.value = "";
                fileImg.removeAttribute("disabled");


            }
        })
    }

</script>

<c:choose>
    <c:when test="${requestScope.RESPONSE_MSG ne null && requestScope.RESPONSE_MSG.status eq true}">
        <!-- Alert Modal -->
        <div class="modal fade" id="alert-modal" tabindex="-1" aria-labelledby="alert-modal-label" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title text-success" id="alert-modal-label">Thành công</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body pt-5 pb-5">
                            ${requestScope.RESPONSE_MSG.content}

                    </div>
                    <div class="modal-footer justify-content-between">
                        <a href="detailHostel?hostelID=${sessionScope.hostel.hostelID}" class="btn btn-secondary">Quay về khu trọ</a>
                        <button type="button" class="btn btn-primary" data-bs-dismiss="modal">Thêm tiếp</button>
                    </div>
                </div>
            </div>
        </div>

        <script>
            new bootstrap.Modal(document.getElementById('alert-modal')).show();
        </script>
    </c:when>
    <c:when test="${requestScope.RESPONSE_MSG ne null && requestScope.RESPONSE_MSG.status eq false}">
        <!-- Alert Modal -->

        <div class="modal fade" id="alert-modal" tabindex="-1" aria-labelledby="alert-modal-label2" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title text-danger" id="alert-modal-label2">Thất bại</h5>

                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body pt-5 pb-5">
                            ${requestScope.RESPONSE_MSG.content}
                    </div>
                    <div class="modal-footer justify-content-between">
                        <a href="detailHostel?hostelID=${requestScope.hostel.hostelID}" class="btn btn-secondary">Quay về khu trọ</a>
                        <button type="button" class="btn btn-primary" data-bs-dismiss="modal">Thêm lại</button>
                    </div>
                </div>
            </div>
        </div>

        <script>
            new bootstrap.Modal(document.getElementById('alert-modal')).show();
        </script>
    </c:when>
</c:choose>

<script type="text/javascript">
    // Receive
    receiveWebsocket(alertPushNoti);

    // Close when leave
    window.onbeforeunload = function () {
        receiveWebsocket.disconnectWebSocket();
    };
</script>

<c:if test="${requestScope.RESPONSE_MSG eq null}">
    <!-- Loader -->

    <script src="assets/js/loading-handler.js"></script>
</c:if>

<script>


    var hostelId = $("#hostID").val();
    var submitBtn = document.getElementById("submitBTN");
    console.log(submitBtn.innerText);
    var fm = document.getElementById("form-mess-roomNumber");

    console.log("hostelid:"+hostelId);
    var roomNumber = document.getElementById("room-name");
    if (document.getElementById("room-quantity").value == '1'){
        roomNumber.onblur = function(){
        console.log("Người dùng đã thoát khỏi trường nhập liệu");
        console.log("room enter: " + roomNumber.value);
        $.ajax({
            url: "check-room-exist",
            type: "GET",
            data: { roomNum: roomNumber.value, hostelID: hostelId, updateRoomNumber:0 },
            success: function (response) {
                console.log("repsonse: "+response)
                if (response === "true") {
                    submitBtn.setAttribute("disabled", "true");
                    fm.innerText = "Phòng đã tồn tại";
                } else {

                    submitBtn.removeAttribute("disabled");
                    fm.innerText = "";
                }
            },
            error: function (xhr, status, error) {
                console.error(xhr, status, error);

            },
        });
    };};



</script>
<script>
    function validateFiles(input) {
        console.log("validateFiles")
        const files = input.files;
        const allowedExtensions = /(\.png|\.jpg)$/i;
        const maxSize = 2097152; // 10 MB
        var totalSize = 0;
        var submitBtn = document.getElementById("submitBTN");
        console.log(submitBtn.innerText);

        for (let i = 0; i < files.length; i++) {
            const file = files[i];

            if (!allowedExtensions.exec(file.name)) {
                alert('Chỉ chấp nhận ảnh .png và .jpg.');
                input.value = '';
                return false;
            }

            if (file.size > maxSize) {
                alert('Kích thước file tối đa là 2 MB.');
                input.value = '';
                return false;
            }
        }
        for (let i = 0; i < files.length; i++) {
            const file = files[i];
                totalSize += file.size
            console.log(i+": "+file.size);
        }
        console.log(totalSize)
        console.log(maxSize)
        if (totalSize > 2097152) {
            alert('Tổng Kích thước tất cả file tối đa là 2 MB.');
            input.value = '';
            return false;
        }
    }
</script>
</body>

</html>