<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Apartment</title>
</head>
<body class="flex">
    <!-- sidebar -->
    <jsp:include page="../sidebar.jsp"/>

    <!-- Container -->
    <div class="w-10/12 bg-[#f5f6fa] flex h-full flex flex-col items-center min-h-screen">
        <div class="flex w-11/12 gap-4 justify-between my-6">
            <div class="w-full bg-[#f5f6fa]">
                <div class="relative overflow-x-auto shadow-md p-3 flex flex-col gap-4">
                    <div class="flex justify-between border-b-2 border-[#7f8c8d] pb-4">
                        <div class="text-[#2c3e50] text-2xl font-semibold">Căn hộ hiện tại</div>
                        <button
                                type="button"
                                class="w-fit px-6 py-2 text-sm font-medium text-white focus:outline-none bg-[#27ae60] rounded-lg border border-gray-200 hover:bg-gray-100 hover:text-[#27ae60] focus:z-10 focus:ring-4 focus:ring-gray-200"
                        >
                            Thêm căn hộ
                        </button>
                    </div>

                    <!-- List phòng của 1 căn hộ -->
                    <div class="overflow-x-auto shadow-md m-4 rounded">
                        <table class="w-full text-sm text-left text-gray-500">
                            <thead class="text-xs text-white uppercase bg-[#2c3e50]">
                            <tr>
                                <th scope="col" class="px-6 py-3">STT</th>
                                <th scope="col" class="px-6 py-3">Tên</th>
                                <th scope="col" class="px-6 py-3">Địa chỉ</th>
                                <th scope="col" class="px-6 py-3">Số lượng căn hộ</th>
                                <th scope="col" class="px-6 py-3">Action</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                                <th scope="row" class="px-6 py-4">01</th>
                                <td class="px-6 py-2">
                                    <a href="" class="text-[#3498db] font-base">Land Math</a>
                                </td>
                                <td class="px-6 py-2">Hàm lũy thừa, tích phân, đồ thị, xác suất</td>
                                <td class="px-6 py-2">4</td>
                                <td class="px-6 py-2 flex gap-2">
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
                                        <path d="M20 14.66V20a2 2 0 0 1-2 2H4a2 2 0 0 1-2-2V6a2 2 0 0 1 2-2h5.34"></path>
                                        <polygon points="18 2 22 6 12 16 8 16 8 12 18 2"></polygon>
                                    </svg>
                                    <svg
                                            xmlns="http://www.w3.org/2000/svg"
                                            width="24"
                                            height="24"
                                            viewBox="0 0 24 24"
                                            fill="none"
                                            stroke="#c0392b"
                                            stroke-width="2"
                                            stroke-linecap="round"
                                            stroke-linejoin="round"
                                    >
                                        <polyline points="3 6 5 6 21 6"></polyline>
                                        <path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path>
                                        <line x1="10" y1="11" x2="10" y2="17"></line>
                                        <line x1="14" y1="11" x2="14" y2="17"></line>
                                    </svg>
                                </td>
                            </tr>

                            <!-- Tòa 2 -->
                            <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                                <th scope="row" class="px-6 py-4">01</th>
                                <td class="px-6 py-2">
                                    <a href="" class="text-[#3498db] font-base">Land Math</a>
                                </td>
                                <td class="px-6 py-2">Hàm lũy thừa, tích phân, đồ thị, xác suất</td>
                                <td class="px-6 py-2">4</td>
                                <td class="px-6 py-2 flex gap-2">
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
                                        <path d="M20 14.66V20a2 2 0 0 1-2 2H4a2 2 0 0 1-2-2V6a2 2 0 0 1 2-2h5.34"></path>
                                        <polygon points="18 2 22 6 12 16 8 16 8 12 18 2"></polygon>
                                    </svg>
                                    <svg
                                            xmlns="http://www.w3.org/2000/svg"
                                            width="24"
                                            height="24"
                                            viewBox="0 0 24 24"
                                            fill="none"
                                            stroke="#c0392b"
                                            stroke-width="2"
                                            stroke-linecap="round"
                                            stroke-linejoin="round"
                                    >
                                        <polyline points="3 6 5 6 21 6"></polyline>
                                        <path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path>
                                        <line x1="10" y1="11" x2="10" y2="17"></line>
                                        <line x1="14" y1="11" x2="14" y2="17"></line>
                                    </svg>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>

        <div class="w-fit shadow-lg rounded border-2 p-4 text-[#2c3e50]">
            <div>
                Bạn có thể upload file excel để import 1 cách tự động, hướng dẫn về file excel
                <a href="" class="text-[#3498db]">ở đây</a>
            </div>
            <div class="">
                <label class="block mb-2 text-lg font-semibold" for="file_input">Upload file</label>
                <input
                        class="block w-/12 text-sm text-gray-900 border border-gray-300 rounded-lg cursor-pointer bg-[#95a5a6] focus:outline-none"
                        aria-describedby="file_input_help"
                        id="file_input"
                        type="file"
                />
            </div>
        </div>
    </div>

    <!-- Scripts -->
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.2.0/flowbite.min.js"></script>
    </body>
</html>
