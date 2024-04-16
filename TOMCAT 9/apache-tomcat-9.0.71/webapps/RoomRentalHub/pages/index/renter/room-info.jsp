<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 1/4/2024
  Time: 2:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- Installation tailwind css -->
    <link rel="stylesheet" href="./assets/css/tailwind.min.css" />
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="flex">
<!-- sidebar -->
<jsp:include page="sidebar-root.jsp"/>

<div class="w-10/12 bg-[#dcdde1] flex justify-center items-center h-screen">
    <!-- Card -->
    <div class="block w-5/6 h-5/6 p-4 bg-white border border-gray-200 rounded-lg shadow">
        <h5 class="mb-2 text-center text-lg font-medium tracking-tight text-[#1e272e]">Thông tin phòng thuê</h5>

        <div class="_container flex w-full h-fit mx-6 justify-center gap-3">
            <div class="_left w-1/2">
                <div class="flex gap-1 text-[#1e272e]">
                    <h5 class="font-medium">Số phòng:</h5>
                    <h5>01</h5>
                </div>
                <div class="flex gap-1 text-[#1e272e]">
                    <h5 class="font-medium">Diện tích:</h5>
                    <h5>22m2</h5>
                </div>
                <div class="flex gap-1 text-[#1e272e]">
                    <h5 class="font-medium">Tên khu vực:</h5>
                    <h5>Land Mark</h5>
                </div>
                <h5 class="font-medium">
                    Địa chỉ:
                    <span class="font-normal">01, Quận 1, Tp. Hồ Chí Minh, 01, Quận 1, Tp. Hồ Chí Minh</span>
                </h5>
            </div>
            <div class="_right w-1/2">
                <div class="flex gap-1 text-[#1e272e]">
                    <h5 class="font-medium">Tên người cho thuê:</h5>
                    <h5>Kudamii</h5>
                </div>
                <div class="flex gap-1 text-[#1e272e]">
                    <h5 class="font-medium">Số điện thoại:</h5>
                    <h5>0123 456 789</h5>
                </div>
                <div class="flex gap-1 text-[#1e272e]">
                    <h5 class="font-medium">Số thành viên:</h5>
                    <h5>5</h5>
                </div>
                <div class="flex gap-1 text-[#1e272e]">
                    <h5 class="font-medium">Hạn cho thuê:</h5>
                    <h5>dd/mm/yyyy</h5>
                </div>
            </div>
        </div>
        <div class="_container flex w-full h-fit mx-6 justify-center gap-3">
            <div class="_left w-1/2">
                <div class="mt-2 w-5/6 overflow-x-auto">
                    <h5 class="text-center text-[#1e272e] font-medium my-4">Nội thất</h5>
                    <table class="w-full text-sm text-left rtl:text-right text-gray-500 dark:text-gray-400 border-2">
                        <thead class="text-xs text-[#1e272e] uppercase text-center">
                        <tr>
                            <th scope="col" class="px-6 py-3 rounded-s-lg">Tên</th>
                            <th scope="col" class="px-6 py-3 rounded-e-lg">Số lượng</th>
                        </tr>
                        </thead>
                        <tbody class="text-[#1e272e] text-center">
                        <tr class="bg-white border-2">
                            <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">Giường</th>
                            <td class="px-6 py-4">1</td>
                        </tr>
                        <tr class="bg-white border-2">
                            <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">Tủ lạnh</th>
                            <td class="px-6 py-4">1</td>
                        </tr>
                        <tr class="bg-white border-2">
                            <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">Bếp</th>
                            <td class="px-6 py-4">1</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="_left w-1/2">
                <div class="mt-2 w-5/6 overflow-x-auto">
                    <h5 class="text-center text-[#1e272e] font-medium my-4">Dịch vụ</h5>
                    <table class="w-full text-sm text-left rtl:text-right text-gray-500 dark:text-gray-400 border-2">
                        <thead class="text-xs text-[#1e272e] uppercase text-center">
                        <tr>
                            <th scope="col" class="px-6 py-3 rounded-s-lg">Tên</th>
                            <th scope="col" class="px-6 py-3 rounded-e-lg">Giá</th>
                        </tr>
                        </thead>
                        <tbody class="text-[#1e272e] text-center">
                        <tr class="bg-white border-2">
                            <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">Wifi</th>
                            <td class="px-6 py-4">100.000</td>
                        </tr>
                        <tr class="bg-white border-2">
                            <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">Điện</th>
                            <td class="px-6 py-4">999.999</td>
                        </tr>
                        <tr class="bg-white border-2">
                            <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">Nước</th>
                            <td class="px-6 py-4">999.999</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
