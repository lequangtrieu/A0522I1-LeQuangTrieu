<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List room</title>
</head>
    <body class="flex">
    <!-- Popup thêm dịch vụ -->
    <div
            id="add-service"
            tabindex="-1"
            aria-hidden="true"
            class="hidden overflow-y-auto overflow-x-hidden fixed top-0 right-0 left-0 z-50 justify-center items-center w-full md:inset-0 h-[calc(100%-1rem)] max-h-full"
    >
        <div class="relative p-4 w-full max-w-2xl max-h-full">
            <!-- Modal content -->
            <div class="relative bg-[#f5f6fa] rounded-lg shadow text-[#2c3e50]">
                <!-- Modal header -->
                <div class="flex items-center justify-between p-4 md:p-5 border-b rounded-t">
                    <h3 class="text-xl font-semibold text-[#2980b9]">Thêm dịch vụ</h3>
                    <button
                            type="button"
                            class="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm w-8 h-8 ms-auto inline-flex justify-center items-center dark:hover:bg-gray-600 dark:hover:text-white"
                            data-modal-hide="add-service"
                    >
                        <svg class="w-3 h-3" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 14 14">
                            <path
                                    stroke="currentColor"
                                    stroke-linecap="round"
                                    stroke-linejoin="round"
                                    stroke-width="2"
                                    d="m1 1 6 6m0 0 6 6M7 7l6-6M7 7l-6 6"
                            />
                        </svg>
                        <span class="sr-only">Close modal</span>
                    </button>
                </div>
                <!-- Modal body -->
                <div class="p-4 space-y-4 w-full">
                    <div class="_title">
                        <label for="title" class="block mb-2 text-base font-medium text-[#2c3e50] flex gap-2">Tên dịch vụ: </label>
                        <select
                                id="countries"
                                class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-1/2 p-2.5"
                        >
                            <option selected>Phí giữ xe</option>
                            <option value="all">Phí giặt giũ</option>
                        </select>
                    </div>
                </div>

                <div class="flex w-full justify-between p-4">
                    <div class="_title w-1/2">
                        <label for="title" class="block mb-2 text-base font-medium text-[#2c3e50] flex gap-2"
                        >Giá dịch vụ:
                            <div class="text-[#c0392b]">*</div>
                        </label>
                        <div class="flex items-center gap-2">
                            <input
                                    type="text"
                                    id="first_name"
                                    class="font-base bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block p-2.5"
                                    required
                            />
                            <div>VND</div>
                        </div>
                    </div>
                    <div class="_title w-1/2">
                        <label for="title" class="block mb-2 text-base font-medium text-[#2c3e50] flex gap-2"
                        >Đơn giá:
                            <div class="text-[#c0392b]">*</div>
                        </label>
                        <select
                                id="countries"
                                class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-1/2 p-2.5"
                        >
                            <option selected>Phòng</option>
                            <option value="all">Kg</option>
                        </select>
                    </div>
                </div>
                <!-- Modal footer -->
                <div class="flex items-center p-4 md:p-5 border-t border-gray-200 rounded-b gap-2">
                    <button
                            class="bg-[#f5f6fa] w-fit text-[#2ecc71] font-semibold py-1 px-8 rounded border-2 border-[#2ecc71] hover:bg-[#2ecc71] hover:text-white hover:border-white"
                    >
                        Gửi
                    </button>
                    <button
                            class="bg-[#f5f6fa] w-fit text-[#e74c3c] font-semibold py-1 px-8 rounded border-2 border-[#e74c3c] hover:bg-[#e74c3c] hover:text-white hover:border-white"
                    >
                        Hủy
                    </button>
                </div>
            </div>
        </div>
    </div>

    <!-- Popup update service -->
    <div
            id="update-service"
            tabindex="-1"
            aria-hidden="true"
            class="hidden overflow-y-auto overflow-x-hidden fixed top-0 right-0 left-0 z-50 justify-center items-center w-full md:inset-0 h-[calc(100%-1rem)] max-h-full"
    >
        <div class="relative p-4 w-full max-w-2xl max-h-full">
            <!-- Modal content -->
            <div class="relative bg-[#f5f6fa] rounded-lg shadow text-[#2c3e50]">
                <!-- Modal header -->
                <div class="items-center justify-between p-4 border-b rounded-t">
                    <div class="flex items-center justify-between p-4 md:p-5 border-b rounded-t pb-4 border-b-2 border-[#7f8c8d]">
                        <h3 class="text-xl font-semibold text-[#2980b9]">Cập nhật dịch vụ</h3>

                        <button
                                type="button"
                                class="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm w-8 h-8 ms-auto inline-flex justify-center items-center dark:hover:bg-gray-600 dark:hover:text-white"
                                data-modal-hide="update-service"
                        >
                            <svg class="w-3 h-3" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 14 14">
                                <path
                                        stroke="currentColor"
                                        stroke-linecap="round"
                                        stroke-linejoin="round"
                                        stroke-width="2"
                                        d="m1 1 6 6m0 0 6 6M7 7l6-6M7 7l-6 6"
                                />
                            </svg>
                            <span class="sr-only">Close modal</span>
                        </button>
                    </div>
                    <div></div>
                    <!-- List dịch vụ sẵn có -->
                    <table class="w-full text-sm text-left text-gray-500 my-4">
                        <thead class="text-xs text-white uppercase bg-[#2c3e50]">
                        <tr>
                            <th scope="col" class="px-6 py-3">Tên nội thất</th>
                            <th scope="col" class="px-6 py-3">Số lượng</th>
                            <th scope="col" class="px-6 py-3">tình trạng</th>
                            <th scope="col" class="px-6 py-3">Action</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                            <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">Phí giữ xe</th>
                            <td class="px-6 py-4">150.000</td>
                            <td class="px-6 py-4 font-semibold text-[#009432]">Phòng</td>
                            <td class="px-6 py-4 flex gap-2">
                                <a href="">
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
                                        <polygon points="14 2 18 6 7 17 3 17 3 13 14 2"></polygon>
                                        <line x1="3" y1="22" x2="21" y2="22"></line>
                                    </svg>
                                </a>
                                <a href="">
                                    <svg
                                            xmlns="http://www.w3.org/2000/svg"
                                            width="24"
                                            height="24"
                                            viewBox="0 0 24 24"
                                            fill="none"
                                            stroke="#e74c3c"
                                            stroke-width="2"
                                            stroke-linecap="round"
                                            stroke-linejoin="round"
                                    >
                                        <polyline points="3 6 5 6 21 6"></polyline>
                                        <path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path>
                                        <line x1="10" y1="11" x2="10" y2="17"></line>
                                        <line x1="14" y1="11" x2="14" y2="17"></line>
                                    </svg>
                                </a>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <!-- Modal footer -->
                <div class="flex items-center p-4 md:p-5 border-t border-gray-200 rounded-b gap-2">
                    <button
                            class="bg-[#f5f6fa] w-fit text-[#2ecc71] font-semibold py-1 px-8 rounded border-2 border-[#2ecc71] hover:bg-[#2ecc71] hover:text-white hover:border-white"
                    >
                        Gửi
                    </button>
                    <button
                            class="bg-[#f5f6fa] w-fit text-[#e74c3c] font-semibold py-1 px-8 rounded border-2 border-[#e74c3c] hover:bg-[#e74c3c] hover:text-white hover:border-white"
                    >
                        Hủy
                    </button>
                </div>
            </div>
        </div>
    </div>

    <!-- Popup thêm phòng -->
    <div
            id="add-room"
            tabindex="-1"
            aria-hidden="true"
            class="hidden overflow-y-auto overflow-x-hidden fixed top-0 right-0 left-0 z-50 justify-center items-center w-full md:inset-0 h-[calc(100%-1rem)] max-h-full"
    >
        <div class="relative p-4 w-full max-w-2xl max-h-full">
            <!-- Modal content -->
            <div class="relative bg-[#f5f6fa] rounded-lg shadow text-[#2c3e50]">
                <!-- Modal header -->
                <div class="items-center justify-between p-4 border-b rounded-t">
                    <div class="flex items-center justify-between p-4 md:p-5 border-b rounded-t pb-4 border-b-2 border-[#7f8c8d]">
                        <h3 class="text-xl font-semibold text-[#2980b9]">Thêm phòng</h3>

                        <button
                                type="button"
                                class="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm w-8 h-8 ms-auto inline-flex justify-center items-center dark:hover:bg-gray-600 dark:hover:text-white"
                                data-modal-hide="add-room"
                        >
                            <svg class="w-3 h-3" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 14 14">
                                <path
                                        stroke="currentColor"
                                        stroke-linecap="round"
                                        stroke-linejoin="round"
                                        stroke-width="2"
                                        d="m1 1 6 6m0 0 6 6M7 7l6-6M7 7l-6 6"
                                />
                            </svg>
                            <span class="sr-only">Close modal</span>
                        </button>
                    </div>
                </div>
                <div class="p-4 w-full max-w-2xl max-h-full flex flex-col gap-2">
                    <div class="text-[#2c3e50] font-semibold flex gap-2">
                        Khu vực:
                        <div class="font-light">Land Math</div>
                    </div>

                    <div class="text-[#2c3e50] font-semibold flex gap-2 whitespace-nowrap">
                        Địa chỉ:
                        <div class="font-light whitespace-normal">Tầng 19, toà nhà Indochina, Số 4, đường Nguyễn Đình Chiểu, Q1, Tp.HCM</div>
                    </div>

                    <!-- Thông tin cần input -->
                    <div class="grid grid-cols-2 gap-2">
                        <div class="flex gap-2">
                            <label for="title" class="block mb-2 text-base font-medium text-[#2c3e50] flex gap-2">
                                Số phòng:
                                <div class="text-[#c0392b]">*</div>
                            </label>
                            <input
                                    type="text"
                                    id="first_name"
                                    class="w-full sm:w-24 font-base bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block p-2"
                                    required
                            />
                        </div>
                        <div class="flex gap-2">
                            <label for="title" class="block mb-2 text-base font-medium text-[#2c3e50] flex gap-2">
                                Diện tích:
                                <div class="text-[#c0392b]">*</div>
                            </label>
                            <input
                                    type="text"
                                    id="first_name"
                                    class="w-full sm:w-24 font-base bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block p-2"
                                    required
                            />
                            <div>m <sup>2</sup></div>
                        </div>
                        <div class="flex gap-2">
                            <label for="title" class="block mb-2 text-base font-medium text-[#2c3e50] flex gap-2">
                                Tầng :
                                <div class="text-[#c0392b]">*</div>
                            </label>
                            <select
                                    id="countries"
                                    class="w-full sm:w-24 font-base bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block p-2"
                            >
                                <option selected>Có</option>
                                <option value="all">Không</option>
                            </select>
                        </div>
                    </div>

                    <!-- Thong tin khac -->
                    <table id="addRoom" class="w-full text-sm text-left text-gray-500 my-4">
                        <thead class="text-xs text-white uppercase bg-[#2c3e50]">
                        <tr>
                            <th scope="col" class="px-6 py-3">Tên Nội thất</th>
                            <th scope="col" class="px-6 py-3">Số lượng</th>
                            <th scope="col" class="px-6 py-3">Tình trạng</th>
                            <th scope="col" class="px-6 py-3">Action</th>
                        </tr>
                        </thead>
                        <tbody class="_addroom">
                        <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                            <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">Bàn</th>
                            <td class="px-6 py-4">01</td>
                            <td class="px-6 py-4 font-semibold text-[#009432]">Mới</td>
                            <td class="px-6 py-4 flex gap-2">
                                <a href="">
                                    <svg
                                            xmlns="http://www.w3.org/2000/svg"
                                            width="24"
                                            height="24"
                                            viewBox="0 0 24 24"
                                            fill="none"
                                            stroke="#e74c3c"
                                            stroke-width="2"
                                            stroke-linecap="round"
                                            stroke-linejoin="round"
                                    >
                                        <polyline points="3 6 5 6 21 6"></polyline>
                                        <path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path>
                                        <line x1="10" y1="11" x2="10" y2="17"></line>
                                        <line x1="14" y1="11" x2="14" y2="17"></line>
                                    </svg>
                                </a>
                            </td>
                        </tr>
                        <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                            <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">Ghế</th>
                            <td class="px-6 py-4">01</td>
                            <td class="px-6 py-4 font-semibold text-[#c0392b]">Cũ</td>
                            <td class="px-6 py-4 flex gap-2">
                                <a href="">
                                    <svg
                                            xmlns="http://www.w3.org/2000/svg"
                                            width="24"
                                            height="24"
                                            viewBox="0 0 24 24"
                                            fill="none"
                                            stroke="#e74c3c"
                                            stroke-width="2"
                                            stroke-linecap="round"
                                            stroke-linejoin="round"
                                    >
                                        <polyline points="3 6 5 6 21 6"></polyline>
                                        <path d="M19 6v14a2 2 0 0 1-2 2H7a2 2 0 0 1-2-2V6m3 0V4a2 2 0 0 1 2-2h4a2 2 0 0 1 2 2v2"></path>
                                        <line x1="10" y1="11" x2="10" y2="17"></line>
                                        <line x1="14" y1="11" x2="14" y2="17"></line>
                                    </svg>
                                </a>
                            </td>
                        </tr>
                        <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black" id="newRow">
                            <td class="px-6 py-4" colspan="4">
                                <div class="flex items-center gap-2">
                                    <input
                                            type="text"
                                            placeholder="Tên nội thất"
                                            class="border border-gray-300 rounded-md px-2 py-1 w-36"
                                            id="add-room-name"
                                    />
                                    <input
                                            type="text"
                                            placeholder="Số lượng"
                                            class="border border-gray-300 rounded-md px-2 py-1 w-36"
                                            id="add-room-quantity"
                                    />
                                    <select
                                            id="add-room-status"
                                            class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-1/2 p-2.5"
                                    >
                                        <option value="Mới" selected>Mới</option>
                                        <option value="Cũ">Cũ</option>
                                    </select>
                                    <button onclick="addRow()" class="bg-blue-500 text-white px-4 py-1 rounded-md">Thêm</button>
                                </div>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>

                <!-- Modal footer -->
                <div class="flex items-center p-4 md:p-5 border-t border-gray-200 rounded-b gap-2">
                    <button
                            class="bg-[#f5f6fa] w-fit text-[#2ecc71] font-semibold py-1 px-8 rounded border-2 border-[#2ecc71] hover:bg-[#2ecc71] hover:text-white hover:border-white"
                    >
                        Gửi
                    </button>
                    <button
                            class="bg-[#f5f6fa] w-fit text-[#e74c3c] font-semibold py-1 px-8 rounded border-2 border-[#e74c3c] hover:bg-[#e74c3c] hover:text-white hover:border-white"
                    >
                        Hủy
                    </button>
                </div>
            </div>
        </div>
    </div>

    <!-- sidebar -->
    <jsp:include page="../sidebar.jsp"/>

    <!-- Container -->
    <div class="w-10/12 bg-[#f5f6fa] flex h-full flex flex-col items-center min-h-screen">
        <div class="w-11/12 flex mt-6 text-[#2c3e50] font-semibold justify-start gap-2">
            Danh sách căn hộ
            <div class="text-[#2980b9] items-center text-center">></div>
            <a href="" class="text-[#2980b9]">Land Math</a>
        </div>
        <div class="flex flex-col w-11/12 gap-4 justify-between my-6 shadow-md rounded">
            <div class="w-full _top flex justify-between p-4">
                <div class="flex flex-col gap-2">
                    <div class="_hostel-name text-black text-3xl text-bold">Land Math</div>
                    <div class="_address text-muted">Tầng 19, toà nhà Indochina, Số 4, đường Nguyễn Đình Chiểu, Q1, Tp.HCM</div>
                </div>

                <div class="_buttons flex flex-col gap-2">
                    <button
                            data-modal-target="add-room"
                            data-modal-toggle="add-room"
                            class="bg-[#f5f6fa] text-[#27ae60] font-semibold py-1 px-4 rounded border-2 border-[#27ae60] hover:bg-[#27ae60] hover:text-white hover:border-white"
                    >
                        thêm phòng
                    </button>
                    <button
                            data-modal-target="add-service"
                            data-modal-toggle="add-service"
                            class="bg-[#f5f6fa] text-[#2980b9] font-semibold py-1 px-4 rounded border-2 border-[#2980b9] hover:bg-[#2980b9] hover:text-white hover:border-white"
                    >
                        Thêm dịch vụ
                    </button>
                </div>
            </div>

            <div class="_bottom flex gap-2 m-6">
                <div class="_list-room w-4/6 border-2 border-[#2980b9] rounded shadow-md shadow-[#2980b9]">
                    <div class="_title flex justify-between m-4">
                        <div class="text-[#2980b9] font-semibold">Danh sách phòng</div>
                        <div class="text-[#2980b9] font-semibold flex gap-4">
                            Tổng:
                            <div class="text-[#c0392b]">3</div>
                        </div>
                    </div>

                    <div class="overflow-x-auto shadow-md m-4 rounded">
                        <table class="w-full text-sm text-left text-gray-500">
                            <thead class="text-xs text-white uppercase bg-[#2c3e50]">
                            <tr>
                                <th scope="col" class="px-6 py-3">STT</th>
                                <th scope="col" class="px-6 py-3">Số phòng</th>
                                <th scope="col" class="px-6 py-3">Trạng thái</th>
                                <th scope="col" class="px-6 py-3">Action</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                                <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">1</th>
                                <td class="px-6 py-4">97</td>
                                <td class="px-6 py-4 font-semibold text-[#009432]">Sẵn sàng</td>
                                <td class="px-6 py-4">
                                    <a href="#" class="font-medium text-[#EE5A24] hover:underline">View</a>
                                </td>
                            </tr>
                            <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                                <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">2</th>
                                <td class="px-6 py-4">98</td>
                                <td class="px-6 py-4 font-semibold text-[#009432]">Sẵn sàng</td>
                                <td class="px-6 py-4">
                                    <a href="#" class="font-medium text-[#EE5A24] hover:underline">View</a>
                                </td>
                            </tr>
                            <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                                <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">3</th>
                                <td class="px-6 py-4">99</td>
                                <td class="px-6 py-4 font-semibold text-[#EA2027]">Đã được thuê</td>
                                <td class="px-6 py-4">
                                    <a href="#" class="font-medium text-[#EE5A24] hover:underline">View</a>
                                </td>
                            </tr>
                            <tr class="odd:bg-[#bdc3c7] even:bg-[#ecf0f1] border-b text-black">
                                <th scope="row" class="px-6 py-4 font-medium whitespace-nowrap">4</th>
                                <td class="px-6 py-4">100</td>
                                <td class="px-6 py-4 font-semibold text-[#EA2027]">Đã được thuê</td>
                                <td class="px-6 py-4">
                                    <a href="#" class="font-medium text-[#EE5A24] hover:underline">View</a>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="_list-service w-2/6 h-fit border-2 shadow-[#27ae60] border-[#27ae60] shadow-md rounded">
                    <div class="_top m-4 flex justify-between border-b-2 border-[#27ae60] pb-4">
                        <div class="_title flex flex-col text-[#2c3e50]">
                            <div class="font-semibold text-[#2980b9]">Các dịch vụ</div>
                            <div class="flex font-semibold">
                                Áp dụng từ:
                                <div class="_date">14/06/2023</div>
                            </div>
                        </div>
                        <button
                                data-modal-target="update-service"
                                data-modal-toggle="update-service"
                                class="bg-[#f5f6fa] text-[#c0392b] font-semibold px-2 rounded border-2 border-[#c0392b] hover:bg-[#c0392b] hover:text-white hover:border-white"
                        >
                            Update
                        </button>
                    </div>
                    <div class="_bot m-4 text-[#2c3e50]">
                        <div class="_service flex justify-between font-semibold">
                            Điện
                            <div class="_cost font-light">5.000 VND/Kwh</div>
                        </div>
                        <div class="_service flex justify-between font-semibold">
                            Nước
                            <div class="_cost font-light">5.000 VND/m<sup>2</sup></div>
                        </div>
                        <div class="_service flex justify-between font-semibold">
                            Wifi
                            <div class="_cost font-light">150.000 VND/Tháng</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Scripts -->
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.2.0/flowbite.min.js"></script>
    <script src="../../list-hostel-script.js"></script>
    </body>
</html>
