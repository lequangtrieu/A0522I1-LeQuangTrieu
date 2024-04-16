<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 1/4/2024
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Notification</title>
</head>
<body class="flex">
<!-- sidebar -->
<jsp:include page="sidebar-root.jsp"/>

<!-- Container -->
<div class="w-10/12 bg-[#dcdde1] flex justify-center items-center h-screen">
  <!-- Card -->
  <div class="flex min-h-screen items-center justify-center">
    <div class="overflow-x-auto">
      <table class="min-w-full bg-white shadow-md rounded-xl">
        <thead>
        <tr class="bg-blue-gray-100 text-gray-700">
          <th class="py-3 px-4 text-left">STT</th>
          <th class="py-3 px-4 text-left">Thông báo</th>
          <th class="py-3 px-4 text-left">Ngày nhận</th>
          <th class="py-3 px-4 text-left">Tình trạng</th>
          <th class="py-3 px-4 text-left">Action</th>
        </tr>
        </thead>
        <tbody class="text-blue-gray-900">
        <tr class="border-b border-blue-gray-200">
          <td class="py-3 px-4">1</td>
          <td class="py-3 px-4">Thay đổi về giá nhà</td>
          <td class="py-3 px-4">14/06/2023</td>
          <td class="py-3 px-4 text-[#c0392b]">Unread</td>
          <td class="py-3 px-4">
            <a href="#" class="font-medium text-blue-600 hover:text-blue-800">View</a>
          </td>
        </tr>
        <tr class="border-b border-blue-gray-200">
          <td class="py-3 px-4">2</td>
          <td class="py-3 px-4">Thay đổi về giá điện</td>
          <td class="py-3 px-4">14/06/2023</td>
          <td class="py-3 px-4 text-[#2ecc71]">Readed</td>
          <td class="py-3 px-4">
            <a href="#" class="font-medium text-blue-600 hover:text-blue-800">View</a>
          </td>
        </tr>
        </tbody>
      </table>
      <nav class="flex items-center flex-column flex-wrap md:flex-row justify-between pt-4" aria-label="Table navigation">
                        <span class="text-sm font-normal text-[#1e272e] mb-4 md:mb-0 block w-full md:inline md:w-auto"
                        >Showing <span class="font-semibold text-[#1e272e]">1-10</span> of
                            <span class="font-semibold text-[#1e272e]">1000</span></span
                        >
        <ul class="inline-flex -space-x-px rtl:space-x-reverse text-sm h-8">
          <li>
            <a
                    href="#"
                    class="flex items-center justify-center px-3 h-8 ms-0 leading-tight text-[#1e272e] bg-white border border-gray-300 rounded-s-lg hover:bg-gray-100 hover:text-gray-700"
            >Previous</a
            >
          </li>
          <li>
            <a
                    href="#"
                    class="flex items-center justify-center px-3 h-8 leading-tight text-[#1e272e] bg-white border border-gray-300 hover:bg-gray-100 hover:text-gray-700"
            >1</a
            >
          </li>
          <li>
            <a
                    href="#"
                    class="flex items-center justify-center px-3 h-8 leading-tight text-[#1e272e] bg-white border border-gray-300 hover:bg-gray-100 hover:text-gray-700"
            >2</a
            >
          </li>
          <li>
            <a
                    href="#"
                    class="flex items-center justify-center px-3 h-8 text-[#1e272e] border border-gray-300 bg-white hover:bg-blue-100 hover:text-blue-700 !bg-[#9b59b6]"
            >3</a
            >
          </li>
          <li>
            <a
                    href="#"
                    class="flex items-center justify-center px-3 h-8 leading-tight text-[#1e272e] bg-white border border-gray-300 hover:bg-gray-100 hover:text-gray-700"
            >4</a
            >
          </li>
          <li>
            <a
                    href="#"
                    class="flex items-center justify-center px-3 h-8 leading-tight text-[#1e272e] bg-white border border-gray-300 hover:bg-gray-100 hover:text-gray-700"
            >5</a
            >
          </li>
          <li>
            <a
                    href="#"
                    class="flex items-center justify-center px-3 h-8 leading-tight text-[#1e272e] bg-white border border-gray-300 rounded-e-lg hover:bg-gray-100 hover:text-gray-700"
            >Next</a
            >
          </li>
        </ul>
      </nav>
    </div>
  </div>
</div>
<!-- Scripts -->
<script src="https://cdn.tailwindcss.com"></script>
</body>
</html>
