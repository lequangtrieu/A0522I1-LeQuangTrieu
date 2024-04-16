
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
    <body class="flex">
    <!-- sidebar -->
    <jsp:include page="../sidebar.jsp"/>

    <!-- Container -->
    <div class="w-10/12 bg-[#f5f6fa] flex h-full flex flex-col items-center min-h-screen">
        <div class="w-11/12 flex mt-6 text-[#2c3e50] font-semibold justify-start gap-2">
            Danh sách phòng
            <div class="text-[#2980b9] items-center text-center">></div>
            <a href="" class="text-[#2980b9]">Land Math</a>
            <div class="text-[#2980b9] items-center text-center">></div>
            <a href="" class="text-[#2980b9]">Phòng 09</a>
        </div>

        <div class="flex items-center flex-col w-11/12 gap-4 justify-between my-6 shadow-md rounded">
            <!-- Title and button  -->
            <div class="_f w-full mt-4 mb-2 flex justify-between">
                <div class="text-[#6c5ce7] font-semibold text-2xl mx-4">Phòng 09</div>
                <div class="_f_b flex gap-2 mx-4">
                    <!-- If phòng chưa được thuê -->
                    <button
                            class="bg-[#f5f6fa] text-[#d63031] font-semibold py-1 px-4 rounded border-2 border-[#d63031] hover:bg-[#d63031] hover:text-white hover:border-white"
                    >
                        Cập Nhật
                    </button>
                    <button
                            class="bg-[#f5f6fa] text-[#00b894] font-semibold py-1 px-4 rounded border-2 border-[#00b894] hover:bg-[#00b894] hover:text-white hover:border-white"
                    >
                        Tạo hợp đồng
                    </button>

                    <!-- Phòng đã được thuê -->
                    <!-- <button
                        class="bg-[#f5f6fa] text-[#00b894] font-semibold py-1 px-4 rounded border-2 border-[#00b894] hover:bg-[#00b894] hover:text-white hover:border-white"
                    >
                        Tạo hóa đơn
                    </button> -->
                    <!-- <button
                        class="bg-[#f5f6fa] text-[#c0392b] font-semibold py-1 px-4 rounded border-2 border-[#c0392b] hover:bg-[#c0392b] hover:text-white hover:border-white"
                    >
                        Kết thúc hợp đồng
                    </button> -->
                </div>
            </div>

            <!-- infotmation about room -->
            <div class="_s w-full mb-2 flex justify-between">
                <div class="_s_l w-3/6 text-[#2c3e50] mx-4">
                    <div class="_s_t font-semibold flex gap-2 whitespace-nowrap">
                        Thuộc căn hộ:
                        <div class="font-light whitespace-normal">Land Math</div>
                    </div>
                    <div class="_s_t font-semibold flex gap-2 whitespace-nowrap">
                        Địa chỉ:
                        <div class="font-light whitespace-normal">
                            255-257 Hùng Vương, Thanh Khê, Đà Nẵng 550000 Việt Nam, Đà Nẵng 550000 Việt Nam, Đà Nẵng 550000 Việt Nam
                        </div>
                    </div>
                    <div class="_s_t font-semibold flex gap-2 whitespace-nowrap">
                        Diện tích:
                        <div class="font-light whitespace-normal">99.0 m <sup>2</sup></div>
                    </div>
                    <div class="_s_t font-semibold flex gap-2 whitespace-nowrap">
                        Gác mái:
                        <div class="font-light whitespace-normal">Có / Không</div>
                    </div>
                    <div class="_s_t font-semibold flex gap-2 whitespace-nowrap">
                        Trạng thái:
                        <!-- Nếu chưa được thuê -->
                        <div class="font-semibold text-[#27ae60] whitespace-normal">Sẵng sàng được thuê</div>
                        <!-- Nếu đã được thuê -->
                        <!-- <div class="font-semibold text-[#c0392b] whitespace-normal">Đã được thuê</div> -->
                    </div>
                </div>
                <div class="_s_r w-2/6 text-[#2c3e50] mx-4">
                    <div class="_s_t font-semibold flex gap-2 whitespace-nowrap">
                        Ngày bắt đầu hợp đồng:
                        <div class="font-light whitespace-normal">None</div>
                    </div>
                    <div class="_s_t font-semibold flex gap-2 whitespace-nowrap">
                        Ngày kết thúc hợp đồng:
                        <div class="font-light whitespace-normal">None</div>
                    </div>
                    <div class="_s_t font-semibold flex gap-2 whitespace-nowrap">
                        Tiền cọc:
                        <div class="font-light whitespace-normal">None</div>
                    </div>
                    <div class="_s_t font-semibold flex gap-2 whitespace-nowrap">
                        Tiền phòng:
                        <div class="font-light whitespace-normal">None</div>
                    </div>
                    <div class="_s_t font-semibold flex gap-2 whitespace-nowrap">
                        Số thành viên:
                        <div class="font-light whitespace-normal">None</div>
                    </div>
                </div>
            </div>

            <!-- Last info -->
            <div class="_t w-full mx-4 flex gap-6">
                <!-- Hóa đơn -->
                <div class="mx-4 w-7/12 h-fit _t_l rounded shadow-lg border-2 border-[#2980b9] p-4">
                    <div class="_t_l_title border-b-2 border-[#bdc3c7] pb-2">
                        <div class="text-[#2980b9] font-semibold">Hóa đơn gần nhất</div>
                    </div>
                </div>

                <!-- Thông tin điện nước tiêu thụ -->
                <div class="mx-4 w-5/12 _t_r flex flex-col rounded shadow-lg border-2 border-[#f39c12] p-4">
                    <div class="_t_r_title text-[#f39c12] font-semibold pb-2 border-b-2 border-[#bdc3c7]">Số điện/nước tiêu thụ</div>
                    <div class="_t_r_lastUpdate text-[#2c3e50] font-semibold flex gap-4 my-2">
                        Lần cuối cập nhật:
                        <div class="date text-[#16a085]">14/06/2023</div>
                    </div>
                    <div class="_t_r_inf my-2">
                        <div class="w-2/6 flex justify-between">
                            Điện:
                            <div class="font-semibold text-[#c0392b]">0</div>
                        </div>
                        <div class="w-2/6 flex justify-between">
                            Nước:
                            <div class="font-semibold text-[#c0392b]">0</div>
                        </div>
                    </div>
                    <button
                            class="w-1/2 mt-2 bg-[#f5f6fa] text-[#c0392b] font-semibold py-1 px-4 rounded border-2 border-[#c0392b] hover:bg-[#c0392b] hover:text-white hover:border-white"
                    >
                        Lịch sử tiêu thụ
                    </button>
                </div>
            </div>

            <!-- Danh sách thành viên -->
            <div class="w-full">
                <div class="m-4 rounded shadow-lg border-2 border-[#8e44ad]">
                    <div class="flex justify-between border-b-2 border-[#bdc3c7] pb-2 m-4">
                        <div class="_title text-[#27ae60] font-semibold text-lg">Danh sách thành viên</div>

                        <button
                                class="bg-[#f5f6fa] h-fit text-[#2980b9] font-semibold py-1 px-4 rounded border-2 border-[#2980b9] hover:bg-[#2980b9] hover:text-white hover:border-white"
                        >
                            Thêm thành viên
                        </button>
                    </div>
                    <!-- List  -->
                    <div class="m-4">
                        <!-- Nếu không ai thuê -->
                        <div>None</div>

                        <!-- nếu có -->
                        <div class="overflow-x-auto shadow-md m-4 rounded">
                            <table class="w-full text-sm text-left text-gray-500">
                                <thead class="text-xs text-white uppercase bg-[#2c3e50]">
                                <tr>
                                    <th scope="col" class="px-6 py-3">STT</th>
                                    <th scope="col" class="px-6 py-3">Họ và tên</th>
                                    <th scope="col" class="px-6 py-3">Giới tính</th>
                                    <th scope="col" class="px-6 py-3">Số điện thoại</th>
                                    <th scope="col" class="px-6 py-3">Action</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                                    <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">1</th>
                                    <td class="px-6 py-4">Nguyen Anh Duc</td>
                                    <!-- Nếu là nam -->
                                    <td class="px-6 py-4 font-semibold text-[#009432]">Coconut</td>
                                    <!-- Nếu là nữ -->
                                    <!-- <td class="px-6 py-4 font-semibold text-[##8e44ad]">Coconut</td> -->

                                    <td class="px-6 py-4">+84 76 586 8665</td>
                                    <td class="px-6 py-4">
                                        <a href="#" class="font-medium text-[#EE5A24] hover:underline">ViewView</a>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>

            <div class="w-full flex gap-2">
                <!-- Cơ sở vật chất -->
                <div class="w-1/2 h-fit rounded shadow-lg border-2 border-[#2980b9] m-4 p-4">
                    <div class="text-[#2980b9] font-semibold border-b-2 border-[#bdc3c7] pb-2">Cơ sở vật chất</div>
                    <div class="overflow-x-auto shadow-md m-4 rounded">
                        <table class="w-full text-sm text-left text-gray-500">
                            <thead class="text-xs text-white uppercase bg-[#2c3e50]">
                            <tr>
                                <th scope="col" class="px-6 py-3">Tên</th>
                                <th scope="col" class="px-6 py-3">Số lượng</th>
                                <th scope="col" class="px-6 py-3">Đơn vị</th>
                                <th scope="col" class="px-6 py-3">Trạng thái</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                                <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">Ti vi</th>
                                <td class="px-6 py-2">1</td>
                                <td class="px-6 py-2">Cái</td>
                                <td class="px-6 py-2 text-[#27ae60] font-semibold">Sử dụng được</td>
                                <!-- <td class="px-6 py-4 text-[#c0392b]">Hư hỏng</td> -->
                            </tr>
                            <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                                <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">Ti vi</th>
                                <td class="px-6 py-2">1</td>
                                <td class="px-6 py-2">Cái</td>
                                <td class="px-6 py-4 text-[#c0392b] font-semibold">Hư hỏng</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="_btn mx-4">
                        <button
                                class="bg-[#f5f6fa] text-[#27ae60] font-semibold py-1 px-4 rounded border-2 border-[#27ae60] hover:bg-[#27ae60] hover:text-white hover:border-white"
                        >
                            Cập nhật
                        </button>
                        <button
                                class="bg-[#f5f6fa] text-[#2980b9] font-semibold py-1 px-4 rounded border-2 border-[#2980b9] hover:bg-[#2980b9] hover:text-white hover:border-white"
                        >
                            Thêm mới
                        </button>
                    </div>
                </div>

                <!-- Dịch vụ -->
                <div class="w-1/2 h-fit rounded shadow-lg border-2 border-[#27ae60] m-4 p-4">
                    <div class="text-[#27ae60] font-semibold border-b-2 border-[#bdc3c7] pb-2">Dịch vụ</div>
                    <div class="overflow-x-auto shadow-md m-4 rounded">
                        <table class="w-full text-sm text-left text-gray-500">
                            <thead class="text-xs text-white uppercase bg-[#2c3e50]">
                            <tr>
                                <th scope="col" class="px-6 py-3">Dịch vụ</th>
                                <th scope="col" class="px-6 py-3">Giá thành</th>
                                <th scope="col" class="px-6 py-3">Đơn vị</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                                <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">Điện</th>
                                <td class="px-6 py-2">6.000</td>
                                <td class="px-6 py-2">Kwh</td>
                            </tr>
                            <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                                <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">Nước</th>
                                <td class="px-6 py-2">3.500</td>
                                <td class="px-6 py-2">m<sup>2</sup></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Scripts -->
    <script src="https://cdn.tailwindcss.com"></script>
    </body>
</html>
