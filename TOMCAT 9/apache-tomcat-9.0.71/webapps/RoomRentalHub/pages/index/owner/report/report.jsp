
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
            <!-- ID TThong bao -->
            <div class="flex justify-between border-b-2 border-[#7f8c8d] pb-4 items-center">
                <div class="text-[#c0392b] text-xl font-semibold">Báo cáo #BC01</div>
            </div>

            <!-- thong bao container -->
            <div class="grid grid-cols-2 gap-2 text-[#2c3e50] font-medium my-4">
                <!-- Khu vực -->
                <div class="flex gap-2">
                    Khu trọ:
                    <div class="font-normal">Land Math</div>
                </div>
                <!-- Phòng -->
                <div class="flex gap-2">
                    Phòng:
                    <div class="font-normal">01</div>
                </div>
                <!-- Người đại diện -->
                <div class="flex gap-2">
                    Người đại diện:
                    <div class="font-normal">Kudamii</div>
                </div>
                <!-- Ngày -->
                <div class="flex gap-2">
                    Ngày gửi:
                    <div class="font-normal">14/06/2023</div>
                </div>
                <!-- Loại -->
                <div class="flex gap-2">
                    Số điện thoại:
                    <div class="font-normal text-[#2ecc71]">0765868665</div>
                </div>
                <div class="flex gap-2">
                    Tình trạng:
                    <!-- #27ae60 nếu đã xử lý -->
                    <div class="font-normal text-[#c0392b] font-semibold">Chưa xử lý</div>
                </div>
            </div>

            <!-- Nội dung -->
            <div class="text-[#2c3e50] font-medium whitespace-nowrap flex gap-2">
                Nội dung:
                <div class="font-normal whitespace-normal">
                    abcxyz abcxyzabcxyz abcxyzabcxyz abcxyzabcxyzabcxyz whitespace-nowrap abcxyzabcxyzabcxyz abcxyzabcxyzabcxyzabcxyz
                </div>
            </div>

            <label for="message" class="block mb-2 text-base font-medium text-[#2c3e50]">Phản hồi</label>
            <!-- Nếu chưa có phản hồi, nếu có phản hồi thì làm 1 cái như nội dung nhưng ghi phản hồi -->
            <textarea
                    id="message"
                    rows="4"
                    class="block p-2.5 w-full text-sm text-gray-900 bg-gray-50 rounded-lg border border-gray-300 focus:ring-blue-500 focus:border-blue-500"
                    placeholder="Write your thoughts here..."
            ></textarea>

            <div class="flex justify-between">
                <div>
                    <button
                            class="mt-6 bg-[#f5f6fa] text-[#27ae60] font-semibold px-4 py-2 rounded border-2 border-[#27ae60] hover:bg-[#27ae60] hover:text-white hover:border-white"
                    >
                        Gửi
                    </button>
                    <button
                            class="mt-6 bg-[#f5f6fa] text-[#f39c12] font-semibold px-4 py-2 rounded border-2 border-[#f39c12] hover:bg-[#f39c12] hover:text-white hover:border-white"
                    >
                        Đã Xử lý
                    </button>
                </div>

                <button
                        class="mt-6 bg-[#f5f6fa] text-[#c0392b] font-semibold px-4 py-2 rounded border-2 border-[#c0392b] hover:bg-[#c0392b] hover:text-white hover:border-white"
                >
                    Quay lại
                </button>
            </div>
        </div>
    </div>

    <!-- Scripts -->
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.2.0/flowbite.min.js"></script>
    </body>
</html>
