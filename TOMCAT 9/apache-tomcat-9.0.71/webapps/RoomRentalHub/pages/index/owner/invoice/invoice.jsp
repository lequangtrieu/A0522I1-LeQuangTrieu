
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Invoice</title>
</head>
    <body class="flex">
    <!-- sidebar -->
    <jsp:include page="../sidebar.jsp"/>

    <!-- Container -->
    <div class="w-10/12 bg-[#f5f6fa] flex h-full flex flex-col items-center min-h-screen">
        <div class="w-5/6 h-fit border-2 shadow-lg rounded p-4 mt-4">
            <!-- ID TThong bao -->
            <div class="flex justify-between border-b-2 border-[#7f8c8d] pb-4 items-center">
                <div class="text-[#8e44ad] text-xl font-semibold">Hóa đơn <span>#HD01</span></div>
            </div>

            <div class="text-center font-semibold my-4 text-xl text-[#27ae60]">Hóa đơn tháng 13/2023</div>

            <!-- thong bao container -->
            <div class="grid grid-cols-2 gap-2 text-[#2c3e50] font-medium my-4">
                <!-- Khu vực -->
                <div class="flex gap-2">
                    Khu trọ:
                    <div class="font-normal">Land Math</div>
                </div>
                <!-- Phòng -->
                <div class="flex gap-2">
                    Phòng:
                    <div class="font-normal">01</div>
                </div>
                <!-- Người đại diện -->
                <div class="flex gap-2">
                    Người đại diện:
                    <div class="font-normal">Kudamii</div>
                </div>
                <!-- Ngày -->
                <div class="flex gap-2">
                    Ngày tạo:
                    <div class="font-normal">14/06/2023</div>
                </div>
                <!-- Loại -->
                <div class="flex gap-2">
                    Số điện thoại:
                    <div class="font-normal text-[#2ecc71]">0765868665</div>
                </div>
                <div class="flex gap-2">
                    Hạn thanh toán:
                    <div class="font-normal text-[#c0392b]">14/06/2023</div>
                </div>
                <div class="flex gap-2">
                    Tình trạng:
                    <!-- #27ae60 nếu đã xử lý -->
                    <div class="font-normal text-[#c0392b] font-semibold">Chưa thanh toán</div>
                </div>
                <div class="flex gap-2">
                    Ngày thanh toán:
                    <div class="font-normal text-[#2c3e50]">None</div>
                </div>
                <div class="flex gap-2">
                    Điện:
                    <div class="overflow-x-auto shadow-md rounded">
                        <table class="w-full text-sm text-left text-gray-500 text-center">
                            <thead class="text-white bg-[#2c3e50]">
                            <tr>
                                <th scope="col" class="px-4 py-3">Số cũ</th>
                                <th scope="col" class="px-4 py-3">Số mới</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                                <td class="px-4 py-4 font-semibold text-[#2c3e50]">111111</td>
                                <td class="px-4 py-4 font-semibold text-[#2c3e50]">999999</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <span>( kwH )</span>
                </div>
                <div class="flex gap-2">
                    Nước:
                    <div class="overflow-x-auto shadow-md rounded">
                        <table class="w-full text-sm text-left text-gray-500 text-center">
                            <thead class="text-white bg-[#2c3e50]">
                            <tr>
                                <th scope="col" class="px-4 py-3">Số cũ</th>
                                <th scope="col" class="px-4 py-3">Số mới</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                                <td class="px-4 py-4 font-semibold text-[#2c3e50]">111111</td>
                                <td class="px-4 py-4 font-semibold text-[#2c3e50]">999999</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <span>( m<sup>2</sup> )</span>
                </div>
            </div>

            <div class="text-[#2c3e50] font-medium">Tổng kết:</div>

            <!-- Nội dung -->
            <div class="overflow-x-auto shadow-md m-4 rounded">
                <table class="w-full text-sm text-left text-gray-500 text-center">
                    <thead class="text-xs text-white uppercase bg-[#2c3e50]">
                    <tr>
                        <th scope="col" class="px-4 py-3">STT</th>
                        <th scope="col" class="px-6 py-3">Tên</th>
                        <th scope="col" class="px-6 py-3">Đơn vị tính</th>
                        <th scope="col" class="px-6 py-3">Số lượng</th>
                        <th scope="col" class="px-6 py-3">Đơn giá</th>
                        <th scope="col" class="px-6 py-3">Thành tiền</th>
                    </tr>
                    </thead>
                    <tbody id="tableBody">
                    <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-[#2c3e50]">
                        <td class="px-6 py-4 font-medium">01</td>
                        <td class="px-6 py-4 font-medium">Điện</td>
                        <td class="px-6 py-4 font-medium">kwH</td>
                        <td class="px-6 py-4 font-medium">88888</td>
                        <td class="px-6 py-4 font-medium">3.500 / kwH</td>
                        <td class="px-6 py-4 font-medium">4.000.000</td>
                    </tr>
                    <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-[#2c3e50]">
                        <td class="px-6 py-4 font-medium">02</td>
                        <td class="px-6 py-4 font-medium">Nước</td>
                        <td class="px-6 py-4 font-medium">m<sup>2</sup></td>
                        <td class="px-6 py-4 font-medium">88888</td>
                        <td class="px-6 py-4 font-medium">3.500 / kwH</td>
                        <td class="px-6 py-4 font-medium">4.000.000</td>
                    </tr>
                    <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-[#2c3e50]">
                        <td class="px-6 py-4 text-base font-semibold">Tổng</td>
                        <td class="px-6 py-4 font-medium"></td>
                        <td class="px-6 py-4 font-medium"></td>
                        <td class="px-6 py-4 font-medium"></td>
                        <td class="px-6 py-4 font-medium"></td>
                        <td class="px-6 py-4 text-base font-medium">4.000.000</td>
                    </tr>
                    </tbody>
                </table>
            </div>

            <div class="grid grid-cols-2 gap-2 text-[#2c3e50] font-medium my-4">
                <div class="flex gap-2">
                    Người tạo hóa đơn:
                    <div class="font-normal">Kudamii</div>
                </div>

                <div class="flex gap-2">
                    Người thanh toán
                    <div class="font-normal">None</div>
                </div>
            </div>

            <div class="flex justify-between">
                <button
                        class="mt-6 bg-[#f5f6fa] text-[#27ae60] font-semibold px-4 py-2 rounded border-2 border-[#27ae60] hover:bg-[#27ae60] hover:text-white hover:border-white"
                >
                    Xác nhận đã thanh toán
                </button>

                <button
                        class="mt-6 bg-[#f5f6fa] text-[#c0392b] font-semibold px-4 py-2 rounded border-2 border-[#c0392b] hover:bg-[#c0392b] hover:text-white hover:border-white"
                >
                    Quay lại
                </button>
            </div>
        </div>
    </div>

    <!-- Scripts -->
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.2.0/flowbite.min.js"></script>
    </body>
</html>
