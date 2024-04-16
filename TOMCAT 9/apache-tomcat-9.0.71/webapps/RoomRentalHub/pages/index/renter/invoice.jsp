<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 1/4/2024
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Invoice</title>
</head>
<body class="flex">
<!-- sidebar -->
<jsp:include page="sidebar-root.jsp"/>

<!-- Container -->
<div class="w-10/12 bg-[#dcdde1] flex justify-center items-center h-screen">
    <div class="hs-overlay w-full h-full overflow-x-hidden overflow-y-auto pointer-events-none">
        <div class="max-w-lg w-full m-3 mx-auto">
            <div class="relative flex flex-col bg-white shadow-lg rounded-xl pointer-events-auto dark:bg-gray-800">
                <div class="relative overflow-hidden min-h-[6rem] bg-gray-900 text-center rounded-t-xl">
                    <!-- SVG Background Element -->
                    <figure class="absolute inset-x-0 bottom-0 -mb-px">
                        <svg preserveAspectRatio="none" xmlns="http://www.w3.org/2000/svg" x="0px" y="0px" viewBox="0 0 1920 100.1">
                            <path
                                    fill="currentColor"
                                    class="fill-white dark:fill-gray-800"
                                    d="M0,0c0,0,934.4,93.4,1920,0v100.1H0L0,0z"
                            ></path>
                        </svg>
                    </figure>
                    <!-- End SVG Background Element -->
                </div>

                <div class="relative z-10 -mt-12">
                    <!-- Icon -->
                    <span
                            class="mx-auto flex justify-center items-center w-[62px] h-[62px] rounded-full border border-gray-200 bg-white text-gray-700 shadow-sm dark:bg-gray-800 dark:border-gray-700 dark:text-gray-400"
                    >
                                <svg
                                        class="flex-shrink-0 w-6 h-6"
                                        xmlns="http://www.w3.org/2000/svg"
                                        width="16"
                                        height="16"
                                        fill="currentColor"
                                        viewBox="0 0 16 16"
                                >
                                    <path
                                            d="M1.92.506a.5.5 0 0 1 .434.14L3 1.293l.646-.647a.5.5 0 0 1 .708 0L5 1.293l.646-.647a.5.5 0 0 1 .708 0L7 1.293l.646-.647a.5.5 0 0 1 .708 0L9 1.293l.646-.647a.5.5 0 0 1 .708 0l.646.647.646-.647a.5.5 0 0 1 .708 0l.646.647.646-.647a.5.5 0 0 1 .801.13l.5 1A.5.5 0 0 1 15 2v12a.5.5 0 0 1-.053.224l-.5 1a.5.5 0 0 1-.8.13L13 14.707l-.646.647a.5.5 0 0 1-.708 0L11 14.707l-.646.647a.5.5 0 0 1-.708 0L9 14.707l-.646.647a.5.5 0 0 1-.708 0L7 14.707l-.646.647a.5.5 0 0 1-.708 0L5 14.707l-.646.647a.5.5 0 0 1-.708 0L3 14.707l-.646.647a.5.5 0 0 1-.801-.13l-.5-1A.5.5 0 0 1 1 14V2a.5.5 0 0 1 .053-.224l.5-1a.5.5 0 0 1 .367-.27zm.217 1.338L2 2.118v11.764l.137.274.51-.51a.5.5 0 0 1 .707 0l.646.647.646-.646a.5.5 0 0 1 .708 0l.646.646.646-.646a.5.5 0 0 1 .708 0l.646.646.646-.646a.5.5 0 0 1 .708 0l.646.646.646-.646a.5.5 0 0 1 .708 0l.646.646.646-.646a.5.5 0 0 1 .708 0l.509.509.137-.274V2.118l-.137-.274-.51.51a.5.5 0 0 1-.707 0L12 1.707l-.646.647a.5.5 0 0 1-.708 0L10 1.707l-.646.647a.5.5 0 0 1-.708 0L8 1.707l-.646.647a.5.5 0 0 1-.708 0L6 1.707l-.646.647a.5.5 0 0 1-.708 0L4 1.707l-.646.647a.5.5 0 0 1-.708 0l-.509-.51z"
                                    />
                                    <path
                                            d="M3 4.5a.5.5 0 0 1 .5-.5h6a.5.5 0 1 1 0 1h-6a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h6a.5.5 0 1 1 0 1h-6a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h6a.5.5 0 1 1 0 1h-6a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h6a.5.5 0 0 1 0 1h-6a.5.5 0 0 1-.5-.5zm8-6a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 0 1h-1a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 0 1h-1a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 0 1h-1a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h1a.5.5 0 0 1 0 1h-1a.5.5 0 0 1-.5-.5z"
                                    />
                                </svg>
                            </span>
                    <!-- End Icon -->
                </div>

                <!-- Body -->
                <div class="p-4 sm:p-7 overflow-y-auto">
                    <div class="text-center">
                        <h3 class="text-lg font-semibold text-gray-800 dark:text-gray-200">House rent invoice</h3>
                        <p class="text-sm text-gray-500">Invoice #9999</p>
                    </div>

                    <!-- Grid -->
                    <div class="mt-5 sm:mt-10 grid grid-cols-2 gap-5">
                        <div>
                            <span class="block text-xs uppercase text-gray-500">Tên căn hộ:</span>
                            <span class="block text-sm font-medium text-gray-800 dark:text-gray-200">LandMark69</span>
                        </div>

                        <div>
                            <span class="block text-xs uppercase text-gray-500">Số Phòng:</span>
                            <span class="block text-sm font-medium text-gray-800 dark:text-gray-200">01</span>
                        </div>

                        <div>
                            <span class="block text-xs uppercase text-gray-500">Ngày tạo hóa đơn:</span>
                            <div class="flex items-center gap-x-2">
                                <span class="block text-sm font-medium text-gray-800 dark:text-gray-200">14/06/2023</span>
                            </div>
                        </div>

                        <div>
                            <span class="block text-xs uppercase text-gray-500">Tình trạng:</span>
                            <div class="flex items-center gap-x-2">
                                <span class="block text-sm font-medium text-[#2ecc71]">Đã thanh toán</span>
                                <span class="block text-sm font-medium text-[#c0392b]">Chưa thanh toán</span>
                            </div>
                        </div>
                    </div>
                    <!-- End Grid -->

                    <div class="mt-5 sm:mt-10">
                        <h4 class="text-xs font-semibold uppercase text-gray-800 dark:text-gray-200">Summary</h4>

                        <ul class="mt-3 flex flex-col">
                            <li
                                    class="inline-flex items-center gap-x-2 py-3 px-4 text-sm border text-gray-800 -mt-px first:rounded-t-lg first:mt-0 last:rounded-b-lg dark:border-gray-700 dark:text-gray-200"
                            >
                                <div class="flex items-center justify-between w-full">
                                    <span>Điện</span>
                                    <span>$264.00</span>
                                </div>
                            </li>
                            <li
                                    class="inline-flex items-center gap-x-2 py-3 px-4 text-sm border text-gray-800 -mt-px first:rounded-t-lg first:mt-0 last:rounded-b-lg dark:border-gray-700 dark:text-gray-200"
                            >
                                <div class="flex items-center justify-between w-full">
                                    <span>Nước</span>
                                    <span>$52.8</span>
                                </div>
                            </li>
                            <li
                                    class="inline-flex items-center gap-x-2 py-3 px-4 text-sm font-semibold bg-gray-50 border text-gray-800 -mt-px first:rounded-t-lg first:mt-0 last:rounded-b-lg dark:bg-slate-800 dark:border-gray-700 dark:text-gray-200"
                            >
                                <div class="flex items-center justify-between w-full">
                                    <span>Wifi</span>
                                    <span>$316.8</span>
                                </div>
                            </li>

                            <!-- Thêm -->
                            <li
                                    class="inline-flex items-center gap-x-2 py-3 px-4 text-sm font-semibold bg-gray-50 border text-gray-800 -mt-px first:rounded-t-lg first:mt-0 last:rounded-b-lg dark:bg-slate-800 dark:border-gray-700 dark:text-gray-200"
                            >
                                <div class="flex items-center justify-between w-full">
                                    <span>Khác</span>
                                    <span>$000.0</span>
                                </div>
                            </li>
                            <!-- Hết thêm -->
                        </ul>
                    </div>

                    <!-- Button -->
                    <form class="mt-5 flex justify-end gap-x-2">
                        <button
                                class="py-2 px-3 inline-flex justify-center items-center gap-2 rounded-lg border font-medium bg-white text-gray-700 shadow-sm align-middle hover:bg-gray-50 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-offset-white focus:ring-blue-600 transition-all text-sm dark:bg-gray-800 dark:hover:bg-slate-800 dark:border-gray-700 dark:text-gray-400 dark:hover:text-white dark:focus:ring-offset-gray-800"
                                href="#"
                        >
                            <svg
                                    class="flex-shrink-0 w-4 h-4"
                                    xmlns="http://www.w3.org/2000/svg"
                                    width="24"
                                    height="24"
                                    viewBox="0 0 24 24"
                                    fill="none"
                                    stroke="currentColor"
                                    stroke-width="2"
                                    stroke-linecap="round"
                                    stroke-linejoin="round"
                            >
                                <path d="M21 15v4a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2v-4" />
                                <polyline points="7 10 12 15 17 10" />
                                <line x1="12" x2="12" y1="15" y2="3" />
                            </svg>
                            Invoice PDF
                        </button>
                        <button
                                class="py-2 px-3 inline-flex items-center gap-x-2 text-sm font-semibold rounded-lg border border-transparent bg-blue-600 text-white hover:bg-blue-700 disabled:opacity-50 disabled:pointer-events-none dark:focus:outline-none dark:focus:ring-1 dark:focus:ring-gray-600"
                                href="#"
                        >
                            <svg
                                    class="flex-shrink-0 w-4 h-4"
                                    xmlns="http://www.w3.org/2000/svg"
                                    width="24"
                                    height="24"
                                    viewBox="0 0 24 24"
                                    fill="none"
                                    stroke="currentColor"
                                    stroke-width="2"
                                    stroke-linecap="round"
                                    stroke-linejoin="round"
                            >
                                <polyline points="6 9 6 2 18 2 18 9" />
                                <path d="M6 18H4a2 2 0 0 1-2-2v-5a2 2 0 0 1 2-2h16a2 2 0 0 1 2 2v5a2 2 0 0 1-2 2h-2" />
                                <rect width="12" height="8" x="6" y="14" />
                            </svg>
                            Print
                        </button>
                        <button
                                class="py-2 px-3 inline-flex items-center gap-x-2 text-sm font-semibold rounded-lg border border-transparent bg-[#27ae60] text-white hover:bg-[#27ae60] disabled:opacity-50 disabled:pointer-events-none dark:focus:outline-none dark:focus:ring-1 dark:focus:ring-gray-600"
                                href="#"
                        >
                            <svg
                                    class="flex-shrink-0 w-4 h-4"
                                    xmlns="http://www.w3.org/2000/svg"
                                    width="24"
                                    height="24"
                                    viewBox="0 0 24 24"
                                    fill="none"
                                    stroke="currentColor"
                                    stroke-width="2"
                                    stroke-linecap="round"
                                    stroke-linejoin="round"
                            >
                                <rect x="2" y="4" width="20" height="16" rx="2" />
                                <path d="M7 15h0M2 9.5h20" />
                            </svg>
                            Pay
                        </button>
                    </form>
                    <!-- End Buttons -->

                    <div class="mt-5 sm:mt-10">
                        <p class="text-sm text-gray-500">
                            If you have any questions, please contact us at
                            <a class="inline-flex items-center gap-x-1.5 text-blue-600 decoration-2 hover:underline font-medium" href="#"
                            >example@site.com</a
                            >
                            or call at
                            <a class="inline-flex items-center gap-x-1.5 text-blue-600 decoration-2 hover:underline font-medium" href=""
                            >0123 456 789</a
                            >
                        </p>
                    </div>
                </div>
                <!-- End Body -->
            </div>
        </div>
    </div>
</div>

<!-- Scripts -->
<script src="https://cdn.tailwindcss.com"></script>
</body>
</html>
