<%@ page import="com.example.project_jsp.model.Category" %>
<%@ page import="java.util.List" %>
<%@include file="../head.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% List<Category> list = (List<Category>) request.getAttribute("category"); %>
<html>
<head>

</head>
<body>
<table class="table-bordered" style="width: 700px">

    <tr style="border: 1px solid black; background-color: #a6c3ca; text-space: 25px">
        <th>id</th>
        <th>nomi</th>
    </tr>
        <% for (Category cat:list) {%>
    <tr style="border: 1px solid black; background-color: #a6c3ca">
        <td><%=cat.getId()%></td>
        <td><%=cat.getName()%></td>
        <td> <a href="<%=request.getContextPath()%>/update_category2/<%=cat.getId()%>"><%=update%></a></td>
    </tr>
        <%}%>
    <%@include file="../footer.jsp"%>
</body>
</html>