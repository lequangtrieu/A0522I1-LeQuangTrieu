<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 1/4/2024
  Time: 2:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Invoice</title>
</head>
<body class="flex">
<!-- sidebar -->
<jsp:include page="sidebar-root.jsp"/>

<!-- Container -->
<div class="w-10/12 bg-[#dcdde1] flex justify-center items-center h-screen">
    <div class="w-3/4 relative overflow-x-auto shadow-md sm:rounded-lg p-4 bg-[#f5f6fa]">
        <div class="flex items-center justify-between flex-column flex-wrap md:flex-row space-y-4 md:space-y-0 pb-4 bg-[#f5f6fa]">
            <div>
                <h5 class="text-lg font-bold text-[#d35400]">List Invoice</h5>
            </div>
        </div>
        <table class="w-full text-sm text-left rtl:text-right text-gray-500 dark:text-gray-400">
            <thead class="text-xs text-gray-700 uppercase bg-[#dcdde1] border-2">
            <tr>
                <th scope="col" class="px-6 py-3">Invoice ID</th>
                <th scope="col" class="px-6 py-3">Create date</th>
                <th scope="col" class="px-6 py-3">Status</th>
                <th scope="col" class="px-6 py-3">Action</th>
            </tr>
            </thead>
            <tbody>
            <tr class="bg-[#f1f2f6] border-b border-2 shadow-md text-[#1e272e]">
                <th scope="row" class="flex items-center px-6 py-4 text-gray-900 whitespace-nowrap dark:text-white">
                    <div class="">
                        <div class="text-base font-semibold text-[#1e272e]">Land Mạt 69</div>
                        <div class="font-normal text-gray-500">Invoice #999</div>
                    </div>
                </th>
                <td class="px-6 py-4">14/06/2023</td>
                <td class="px-6 py-4">
                    <div class="flex items-center font-semibold text-[#c0392b]">Chưa thanh toán</div>
                </td>
                <td class="px-6 py-4">
                    <a href="#" class="font-medium text-[#2980b9] hover:underline">View</a>
                </td>
            </tr>
            <tr class="bg-[#f1f2f6] border-b border-2 shadow-md text-[#1e272e]">
                <th scope="row" class="flex items-center px-6 py-4 text-gray-900 whitespace-nowrap dark:text-white">
                    <div class="">
                        <div class="text-base font-semibold text-[#1e272e]">Kế Land Mạt</div>
                        <div class="font-normal text-gray-500">Invoice #888</div>
                    </div>
                </th>
                <td class="px-6 py-4">14/06/2023</td>
                <td class="px-6 py-4">
                    <div class="flex items-center font-semibold text-[#2ecc71]">Đã thanh toán</div>
                </td>
                <td class="px-6 py-4">
                    <a href="#" class="font-medium text-[#2980b9] hover:underline">View</a>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

<!-- Scripts -->
<script src="https://cdn.tailwindcss.com"></script>
</body>
</html>
