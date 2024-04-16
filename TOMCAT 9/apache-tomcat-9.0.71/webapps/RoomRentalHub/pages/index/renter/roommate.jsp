<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 1/4/2024
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Roomates</title>
</head>
<body class="flex">
<!-- sidebar -->
<jsp:include page="sidebar-root.jsp"/>

<!-- container -->
<div class="w-10/12 bg-[#dcdde1] flex justify-center items-center h-screen">
    <div class="w-3/4 relative overflow-x-auto shadow-md sm:rounded-lg p-4 bg-[#f5f6fa]">
        <div class="flex items-center justify-between flex-column flex-wrap md:flex-row space-y-4 md:space-y-0 pb-4 bg-[#f5f6fa]">
            <div>
                <h5 class="text-lg font-bold text-[#27ae60]">Roomates</h5>
            </div>
            <label for="table-search" class="sr-only">Search</label>
            <div class="relative">
                <button
                        id="btn-add-roomate"
                        class="flex gap-2 bg-transparent hover:bg-[#27ae60] text-[#27ae60] font-semibold hover:text-white py-2 px-4 border border-[#27ae60] hover:border-transparent rounded"
                >
                    <svg
                            xmlns="http://www.w3.org/2000/svg"
                            width="24"
                            height="24"
                            viewBox="0 0 24 24"
                            fill="none"
                            stroke="#27ae60"
                            stroke-width="2"
                            stroke-linecap="round"
                            stroke-linejoin="round"
                    >
                        <line x1="12" y1="5" x2="12" y2="19"></line>
                        <line x1="5" y1="12" x2="19" y2="12"></line>
                    </svg>
                    Add new roomate
                </button>
            </div>
        </div>
        <table class="w-full text-sm text-left rtl:text-right text-gray-500 dark:text-gray-400">
            <thead class="text-xs text-gray-700 uppercase bg-[#dcdde1] border-2">
            <tr>
                <th scope="col" class="px-6 py-3">Name</th>
                <th scope="col" class="px-6 py-3">Phone number</th>
                <th scope="col" class="px-6 py-3">Joining date</th>
                <th scope="col" class="px-6 py-3">Action</th>
            </tr>
            </thead>
            <tbody>
            <tr class="bg-[#f1f2f6] border-b border-2 shadow-md text-[#1e272e]">
                <th scope="row" class="flex items-center px-6 py-4 text-gray-900 whitespace-nowrap dark:text-white">
                    <div class="">
                        <div class="text-base font-semibold text-[#1e272e]">Kudamii</div>
                        <div class="font-normal text-gray-500">ducna62@codebrew.com</div>
                    </div>
                </th>
                <td class="px-6 py-4">0123 456 789</td>
                <td class="px-6 py-4">
                    <div class="flex items-center">14/06/2023</div>
                </td>
                <td class="px-6 py-4">
                    <a href="#" class="font-medium text-[#c0392b] hover:underline">Remove</a>
                </td>
            </tr>
            <tr class="bg-[#f1f2f6] border-b border-2 shadow-md text-[#1e272e]">
                <th scope="row" class="flex items-center px-6 py-4 text-gray-900 whitespace-nowrap dark:text-white">
                    <div class="">
                        <div class="text-base font-semibold text-[#1e272e]">Kudamii</div>
                        <div class="font-normal text-gray-500">ducna62@codebrew.com</div>
                    </div>
                </th>
                <td class="px-6 py-4">0123 456 789</td>
                <td class="px-6 py-4">
                    <div class="flex items-center">14/06/2023</div>
                </td>
                <td class="px-6 py-4">
                    <a href="#" class="font-medium text-[#c0392b] hover:underline">Remove</a>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

<script src="https://cdn.tailwindcss.com"></script>
</body>
</html>
