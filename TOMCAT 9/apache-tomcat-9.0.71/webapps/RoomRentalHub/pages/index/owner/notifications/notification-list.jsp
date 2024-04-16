
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
        <div class="w-4/6 h-fit border-2 shadow-lg rounded p-4 mt-4">
            <!-- Text and button -->
            <div class="flex justify-between border-b-2 border-[#7f8c8d] pb-4 items-center">
                <div class="text-[#2980b9] text-xl font-semibold">Tất cả thông báo</div>
                <button
                        class="bg-[#f5f6fa] text-[#27ae60] font-semibold p-2 rounded border-2 border-[#27ae60] hover:bg-[#27ae60] hover:text-white hover:border-white"
                >
                    Tạo thông báo
                </button>
            </div>

            <!-- Tất cả thông báo -->
            <div class="">
                <!-- Chọn khu vực -->
                <div class="flex items-center gap-4 my-4">
                    <div class="font-medium">Chọn khu trọ</div>
                    <button
                            id="dropdownDefaultButton"
                            data-dropdown-toggle="dropdown"
                            class="text-[#2c3e50] shadow-lg rounded border-2 font-medium rounded-lg text-sm px-5 py-2.5 text-center inline-flex items-center"
                            type="button"
                    >
                        Land Math
                        <svg class="w-2.5 h-2.5 ms-3" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 10 6">
                            <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="m1 1 4 4 4-4" />
                        </svg>
                    </button>

                    <!-- Dropdown menu -->
                    <div id="dropdown" class="z-10 hidden shadow-lg bg-white rounded divide-y divide-gray-100 rounded-lg shadow w-44">
                        <ul class="py-2 text-sm text-[#2c3e50] font-medium" aria-labelledby="dropdownDefaultButton">
                            <li>
                                <a href="#" class="rounded block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white"
                                >Land Math</a
                                >
                            </li>
                        </ul>
                    </div>
                </div>

                <!-- Table list -->
                <div class="overflow-x-auto shadow-md m-4 rounded">
                    <table class="w-full text-sm text-left text-gray-500 text-center">
                        <thead class="text-xs text-white uppercase bg-[#2c3e50]">
                        <tr>
                            <th scope="col" class="px-4 py-3">Mã Thông báo</th>
                            <th scope="col" class="px-12 py-3">Tiêu Đề</th>
                            <th scope="col" class="px-6 py-3">Ngày gửi</th>
                            <th scope="col" class="px-6 py-3">Phòng</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                            <th scope="row" class="px-4 py-4 font-medium whitespace-nowrap">#TB01</th>
                            <td class="px-12 py-4">
                                <a href="#" class="font-medium text-[#3498db] hover:underline">Tăng giá nhà</a>
                            </td>
                            <td class="px-6 py-4 font-semibold text-[#2c3e50]">14/06/2023</td>
                            <td class="px-6 py-4 text-[#e74c3c] font-medium">Tất cả</td>
                        </tr>
                        <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                            <th scope="row" class="px-4 py-4 font-medium whitespace-nowrap">#TB02</th>
                            <td class="px-12 py-4">
                                <a href="#" class="font-medium text-[#3498db] hover:underline">Giữ gìn trật tự về đêm</a>
                            </td>
                            <td class="px-6 py-4 font-semibold text-[#2c3e50]">14/06/2023</td>
                            <td class="px-6 py-4 text-[#2ecc71] font-medium">Phòng 01</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>

    <!-- Scripts -->
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.2.0/flowbite.min.js"></script>
    </body>
</html>
