<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 1/4/2024
  Time: 2:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Roomate</title>
</head>
<body class="flex">
<!-- sidebar -->
<jsp:include page="sidebar-root.jsp"/>

<!-- Container -->
<div class="w-10/12 bg-[#dcdde1] flex justify-center items-center h-screen">
    <div class="block w-5/6 h-5/6 p-4 bg-white border border-gray-200 rounded-lg shadow">
        <h5 class="mb-2 text-lg font-medium tracking-tight text-[#27ae60]">Add Roomate</h5>
        <hr class="border-b-2 border-[#1e272e] mb-4" />
        <form class="w-full mx-auto grid grid-cols-2 gap-4 text-[#27ae60] font-bold">
            <div class="w-3/4">
                <label for="email" class="block mb-2 text-sm">Tên: </label>
                <input
                        type="text"
                        id="name_input"
                        aria-describedby="helper-text-explanation"
                        class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-[#f5f6fa] dark:border-gray-600 dark:placeholder-gray-400 dark:text-[#1e272e] dark:focus:ring-blue-500 dark:focus:border-blue-500"
                />
            </div>
            <div class="w-3/4">
                <label for="email" class="block mb-2 text-sm t">Ngày sinh:</label>
                <input
                        type="date"
                        id="date_join"
                        aria-describedby="helper-text-explanation"
                        class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-[#f5f6fa] dark:border-gray-600 dark:placeholder-gray-400 dark:text-[#1e272e] dark:focus:ring-blue-500 dark:focus:border-blue-500"
                />
            </div>
            <div class="w-3/4">
                <label for="email" class="block mb-2 text-sm">Giới tính:</label>
                <select
                        id="sex"
                        class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-[#f5f6fa] dark:border-gray-600 dark:placeholder-gray-400 dark:text-[#1e272e] dark:focus:ring-blue-500 dark:focus:border-blue-500"
                >
                    <option value="male">Nam</option>
                    <option value="female">Nữ</option>
                    <option value="banana">Quả chuối</option>
                </select>
            </div>
            <div class="w-3/4">
                <label for="email" class="block mb-2 text-sm t">Số CMND/CCCD:</label>
                <input
                        type="text"
                        id="cccd_number"
                        aria-describedby="helper-text-explanation"
                        class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-[#f5f6fa] dark:border-gray-600 dark:placeholder-gray-400 dark:text-[#1e272e] dark:focus:ring-blue-500 dark:focus:border-blue-500"
                />
            </div>
            <div class="w-3/4">
                <label for="email" class="block mb-2 text-sm">Your email</label>
                <input
                        type="email"
                        id="email"
                        aria-describedby="helper-text-explanation"
                        class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-[#f5f6fa] dark:border-gray-600 dark:placeholder-gray-400 dark:text-[#1e272e] dark:focus:ring-blue-500 dark:focus:border-blue-500"
                />
            </div>
            <div class="w-3/4">
                <label for="email" class="block mb-2 text-sm">Số điện thoại</label>
                <input
                        type="text"
                        id="email"
                        aria-describedby="helper-text-explanation"
                        class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-[#f5f6fa] dark:border-gray-600 dark:placeholder-gray-400 dark:text-[#1e272e] dark:focus:ring-blue-500 dark:focus:border-blue-500"
                />
            </div>
        </form>

        <div class="flex gap-4 mt-10">
            <button
                    id="btn-add-roomate"
                    class="flex gap-2 bg-transparent hover:bg-[#27ae60] text-[#27ae60] font-semibold hover:text-white py-2 px-4 border border-[#27ae60] hover:border-transparent rounded"
            >
                Submit
            </button>

            <button
                    id="btn-add-roomate"
                    class="flex gap-2 bg-transparent hover:bg-[#c0392b] text-[#c0392b] font-semibold hover:text-white py-2 px-4 border border-[#c0392b] hover:border-transparent rounded"
            >
                Cancel
            </button>
        </div>

        <div class="w-full mt-2 text-sm text-[#1e272e] dark:text-[#1e272e]">
            Thêm thành cần phải chờ xử lý của chủ trọ, mã OTP sẽ được gửi về mail người được mời sau khi chủ trọ duyệt
        </div>
        <div class="w-full mt-2 text-sm text-[#1e272e] dark:text-[#1e272e]">
            Cần đảm bảo các chính sách về cư trú tại địa phương, đọc tại
            <a href="http://www.youtube.com/watch?v=dQw4w9WgXcQ" class="text-[#2ecc71]">đây</a>
        </div>
    </div>
</div>

<!-- Scripts -->
<script src="https://cdn.tailwindcss.com"></script>
</body>
</html>
