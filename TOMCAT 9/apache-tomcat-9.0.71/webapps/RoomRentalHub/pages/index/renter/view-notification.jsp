<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 1/4/2024
  Time: 2:57 PM
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
    <div class="block max-w-xl w-fit h-fit p-4 bg-white border border-gray-200 rounded-lg shadow">
        <div class="text-lg font-bold text-[#7158e2]">Thông báo chỉnh giá nhà</div>
        <div class="flex gap-4 text-sm mt-2 font-semibold">
            Ngày nhận:
            <div class="font-normal text-[#7158e2]">14/06/2023</div>
        </div>
        <hr class="border-b-2 border-[#1e272e] my-4" />
        <div>Vì thời buổi kinh tế khó khăn, nên từ tháng sau tiền nhà giảm từ 5.500.000 xuống còn 8.000.000 nha! Mãi yêu</div>
        <button
                id="btn-add-roomate"
                class="flex gap-2 mt-3 bg-transparent hover:bg-[#c0392b] text-[#c0392b] font-semibold hover:text-white py-2 px-4 border border-[#c0392b] hover:border-transparent rounded"
        >
            Back
        </button>
    </div>
</div>
<!-- Scripts -->
<script src="https://cdn.tailwindcss.com"></script>
</body>
</html>
