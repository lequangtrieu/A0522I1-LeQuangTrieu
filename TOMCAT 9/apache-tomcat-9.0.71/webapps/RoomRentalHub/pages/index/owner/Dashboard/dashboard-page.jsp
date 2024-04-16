<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
</head>
<body class="flex">
    <!-- sidebar -->
    <jsp:include page="../sidebar.jsp"/>

    <!-- Container -->
    <div class="w-10/12 bg-[#f5f6fa] flex h-full flex flex-col items-center min-h-screen">
        <!-- Thong ke -->
        <div class="w-full flex mt-6">
            <!-- Card tong doanh thu -->
            <div class="w-1/4 bg-white gap-12 p-4 rounded-md m-2 border-2 flex flex-col justify-between">
                <div class="flex justify-between">
                    <svg
                            xmlns="http://www.w3.org/2000/svg"
                            width="24"
                            height="24"
                            viewBox="0 0 24 24"
                            fill="none"
                            stroke="#0be881"
                            stroke-width="2"
                            stroke-linecap="round"
                            stroke-linejoin="round"
                    >
                        <line x1="12" y1="1" x2="12" y2="23"></line>
                        <path d="M17 5H9.5a3.5 3.5 0 0 0 0 7h5a3.5 3.5 0 0 1 0 7H6"></path>
                    </svg>
                    <a href="#">
                        <h5 class="mb-2 text- font-semibold tracking-tight">Tổng doanh thu</h5>
                    </a>
                </div>
                <div>
                    <div class="text-lg font-semibold text-[#0be881]">300 000 000</div>
                    <div class="text-base font-semibold text-gray-400">Viet nam dong</div>
                </div>
            </div>
            <!-- Card can ho cua ban -->
            <div class="w-1/4 bg-white p-4 rounded-md m-2 border-2 flex flex-col justify-between">
                <div class="flex justify-between">
                    <svg
                            xmlns="http://www.w3.org/2000/svg"
                            width="24"
                            height="24"
                            viewBox="0 0 24 24"
                            fill="none"
                            stroke="#3c40c6"
                            stroke-width="2"
                            stroke-linecap="round"
                            stroke-linejoin="round"
                    >
                        <path d="M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z"></path>
                        <polyline points="9 22 9 12 15 12 15 22"></polyline>
                    </svg>
                    <a href="#">
                        <h5 class="mb-2 text- font-semibold tracking-tight">Tổng căn hộ</h5>
                    </a>
                </div>
                <div>
                    <div class="text-lg font-semibold text-[#3c40c6]">6969</div>
                    <div class="text-base font-semibold text-gray-400">Căn hộ</div>
                </div>
            </div>
            <div class="w-1/4 bg-white p-4 rounded-md m-2 border-2 flex flex-col justify-between">
                <div class="flex justify-between">
                    <svg
                            xmlns="http://www.w3.org/2000/svg"
                            width="24"
                            height="24"
                            viewBox="0 0 24 24"
                            fill="none"
                            stroke="#0fbcf9"
                            stroke-width="2"
                            stroke-linecap="round"
                            stroke-linejoin="round"
                    >
                        <path d="M3 9l9-7 9 7v11a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2z"></path>
                        <polyline points="9 22 9 12 15 12 15 22"></polyline>
                    </svg>
                    <a href="#">
                        <h5 class="mb-2 text- font-semibold tracking-tight">Căn hộ đã cho thuê</h5>
                    </a>
                </div>
                <div>
                    <div class="text-lg font-semibold text-[#0fbcf9]">6969</div>
                    <div class="text-base font-semibold text-gray-400">Căn hộ</div>
                </div>
            </div>
            <div class="w-1/4 bg-white p-4 rounded-md m-2 border-2 flex flex-col justify-between">
                <div class="flex justify-between">
                    <svg
                            xmlns="http://www.w3.org/2000/svg"
                            width="24"
                            height="24"
                            viewBox="0 0 24 24"
                            fill="none"
                            stroke="#f53b57"
                            stroke-width="2"
                            stroke-linecap="round"
                            stroke-linejoin="round"
                    >
                        <path d="M14 2H6a2 2 0 0 0-2 2v16c0 1.1.9 2 2 2h12a2 2 0 0 0 2-2V8l-6-6z" />
                        <path d="M14 3v5h5M12 18v-6M9 15h6" />
                    </svg>
                    <a href="#">
                        <h5 class="mb-2 text- font-semibold tracking-tight">Số feedbacks</h5>
                    </a>
                </div>
                <div>
                    <div class="text-lg font-semibold text-[#0be881]">50</div>
                    <div class="text-base font-semibold text-gray-400">Feedback</div>
                </div>
            </div>
        </div>

        <!-- Bảng wellcome -->
        <div class="w-full flex mt-6 justify-center">
            <div class="rounded border border-gray-300 w-1/2 bg-teal-400 border-teal-400 shadow-md text-white mx-4">
                <div class="p-6 flex flex-row">
                    <!-- image -->
                    <div class="img-wrapper w-40 h-40 flex justify-center items-center">
                        <img src="happy.svg" alt="img title" />
                    </div>
                    <!-- end image -->

                    <!-- info -->
                    <div class="py-4 ml-10">
                        <h1 class="text-3xl font-bold">Good Job, Kudamii!</h1>
                        <p class="text-white text-sm font-semibold">This month, I've done really well. Here's a quick report!!</p>

                        <ul class="mt-4">
                            <li class="text-sm font-semibold flex gap-2 items-center">
                                <svg xmlns="http://www.w3.org/2000/svg" height="12" width="10.5" viewBox="0 0 448 512">
                                    <path
                                            fill="#ffffff"
                                            d="M342.6 86.6c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0L160 178.7l-57.4-57.4c-12.5-12.5-32.8-12.5-45.3 0s-12.5 32.8 0 45.3l80 80c12.5 12.5 32.8 12.5 45.3 0l160-160zm96 128c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0L160 402.7 54.6 297.4c-12.5-12.5-32.8-12.5-45.3 0s-12.5 32.8 0 45.3l128 128c12.5 12.5 32.8 12.5 45.3 0l256-256z"
                                    />
                                </svg>
                                Đăng kí thêm được 5 căn hộ
                            </li>
                            <li class="text-sm font-semibold flex gap-2 items-center">
                                <svg xmlns="http://www.w3.org/2000/svg" height="12" width="10.5" viewBox="0 0 448 512">
                                    <path
                                            fill="#ffffff"
                                            d="M342.6 86.6c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0L160 178.7l-57.4-57.4c-12.5-12.5-32.8-12.5-45.3 0s-12.5 32.8 0 45.3l80 80c12.5 12.5 32.8 12.5 45.3 0l160-160zm96 128c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0L160 402.7 54.6 297.4c-12.5-12.5-32.8-12.5-45.3 0s-12.5 32.8 0 45.3l128 128c12.5 12.5 32.8 12.5 45.3 0l256-256z"
                                    /></svg
                                >Cho thuê được 5 căn hộ
                            </li>
                            <li class="text-sm font-semibold flex gap-2 items-center">
                                <svg xmlns="http://www.w3.org/2000/svg" height="12" width="10.5" viewBox="0 0 448 512">
                                    <path
                                            fill="#ffffff"
                                            d="M342.6 86.6c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0L160 178.7l-57.4-57.4c-12.5-12.5-32.8-12.5-45.3 0s-12.5 32.8 0 45.3l80 80c12.5 12.5 32.8 12.5 45.3 0l160-160zm96 128c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0L160 402.7 54.6 297.4c-12.5-12.5-32.8-12.5-45.3 0s-12.5 32.8 0 45.3l128 128c12.5 12.5 32.8 12.5 45.3 0l256-256z"
                                    /></svg
                                >Tổng rate tháng này 5 sao
                            </li>
                        </ul>
                    </div>
                    <!-- end info -->
                </div>
            </div>

            <div class="w-1/2 rounded border border-gray-300 bg-white rounded-lg shadow dark:bg-gray-800 p-10">
                <div class="flex justify-between">
                    <div>
                        <h5 class="leading-none text-3xl font-bold text-gray-900 dark:text-white pb-2">9.999k</h5>
                        <p class="text-base font-normal text-gray-500 dark:text-gray-400">In this month</p>
                    </div>
                    <div class="flex items-center px-2.5 py-0.5 text-base font-semibold text-green-500 dark:text-green-500 text-center">
                        99%
                        <svg class="w-3 h-3 ms-1" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 10 14">
                            <path
                                    stroke="currentColor"
                                    stroke-linecap="round"
                                    stroke-linejoin="round"
                                    stroke-width="2"
                                    d="M5 13V1m0 0L1 5m4-4 4 4"
                            />
                        </svg>
                    </div>
                </div>
                <div id="area-chart"></div>
            </div>
        </div>
    </div>

    <!-- Scripts -->
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>

    <script>
        // ApexCharts options and config
        window.addEventListener("load", function () {
            let options = {
                chart: {
                    height: "60%",
                    maxWidth: "90%",
                    type: "area",
                    fontFamily: "Inter, sans-serif",
                    dropShadow: {
                        enabled: false,
                    },
                    toolbar: {
                        show: false,
                    },
                },
                tooltip: {
                    enabled: true,
                    x: {
                        show: false,
                    },
                },
                fill: {
                    type: "gradient",
                    gradient: {
                        opacityFrom: 0.55,
                        opacityTo: 0,
                        shade: "#1C64F2",
                        gradientToColors: ["#1C64F2"],
                    },
                },
                dataLabels: {
                    enabled: false,
                },
                stroke: {
                    width: 6,
                },
                grid: {
                    show: false,
                    strokeDashArray: 4,
                    padding: {
                        left: 2,
                        right: 2,
                        top: 0,
                    },
                },
                series: [
                    {
                        name: "New users",
                        data: [6500, 6418, 6456, 6526, 6356, 6456],
                        color: "#1A56DB",
                    },
                ],
                xaxis: {
                    categories: ["01 February", "02 February", "03 February", "04 February", "05 February", "06 February", "07 February"],
                    labels: {
                        show: false,
                    },
                    axisBorder: {
                        show: false,
                    },
                    axisTicks: {
                        show: false,
                    },
                },
                yaxis: {
                    show: false,
                },
            };

            if (document.getElementById("area-chart") && typeof ApexCharts !== "undefined") {
                const chart = new ApexCharts(document.getElementById("area-chart"), options);
                chart.render();
            }
        });
    </script>
</body>
</html>
