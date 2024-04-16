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
                <div class="text-[#2980b9] text-xl font-semibold">Thông báo #TB01</div>
            </div>

            <!-- thong bao container -->
            <div class="grid grid-cols-2 gap-2 text-[#2c3e50] font-medium my-4">
                <!-- Khu vực -->
                <div class="flex gap-2">
                    Khu trọ:
                    <div class="font-normal">Land Math</div>
                </div>
                <!-- Loại -->
                <div class="flex gap-2">
                    Loại:
                    <div class="font-normal text-[#27ae60]">Giá dịch vụ/nhà</div>
                </div>
                <!-- Phòng -->
                <div class="flex gap-2">
                    Phòng:
                    <div class="font-normal">Tất cả</div>
                </div>
                <!-- Ngày -->
                <div class="flex gap-2">
                    Ngày gửi:
                    <div class="font-normal">14/06/2023</div>
                </div>
                <!-- Người đại diện -->
                <div class="flex gap-2">
                    Người đại diện:
                    <!-- Nếu phòng là 1 phòng cụ thể
                    <div class="font-normal">Nguyễn Văn A</div> -->

                    <!-- Nếu phòng là tất cả -->
                    <div class="font-normal">---</div>
                </div>
            </div>

            <!-- Nội dung -->
            <div class="text-[#2c3e50] font-medium whitespace-nowrap flex gap-2">
                Nội dung:
                <div class="font-normal whitespace-normal">
                    abcxyz abcxyzabcxyz abcxyzabcxyz abcxyzabcxyzabcxyz whitespace-nowrap abcxyzabcxyzabcxyz abcxyzabcxyzabcxyzabcxyz
                </div>
            </div>

            <button
                    class="mt-6 bg-[#f5f6fa] text-[#27ae60] font-semibold px-4 py-2 rounded border-2 border-[#27ae60] hover:bg-[#27ae60] hover:text-white hover:border-white"
            >
                Quay lại
            </button>
        </div>
    </div>

    <!-- Scripts -->
    <script src="https://cdn.tailwindcss.com"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/flowbite/2.2.0/flowbite.min.js"></script>
    </body>
</html>
