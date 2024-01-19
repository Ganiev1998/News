<%@ page import="com.example.project_jsp.model.Category" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../head.jsp"%>
<% List<Category> list = (List<Category>) request.getAttribute("category"); %>
<html>
<head>
</head>
<body>
<table class="table-bordered" style="width: 700px">

    <tr style="border: 1px solid black; text-space: 25px; background-color: #a6c3ca">
        <th>id</th>
        <th>nomi</th>
    </tr>
        <% for (Category cat:list) {%>
    <tr style="border: 1px solid black; background-color: #a6c3ca">
        <td><%=cat.getId()%></td>
        <td><%=cat.getName()%></td>
        <td> <a href="<%=request.getContextPath()%>/delete_category2/<%=cat.getId()%>"><%=delete%></a></td>
    </tr>
        <%}%>
    <%@include file="../footer.jsp"%>
</body>
</html>