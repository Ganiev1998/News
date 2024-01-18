<%@ page import="java.util.List" %>
<%@ page import="com.example.project_jsp.model.Category" %>
<%@include file="../head.jsp" %>
<% String id = messageSource.getMessage("id",null,lang);%>
<% String name = messageSource.getMessage("name",null,lang);%>
<% List<Category> list = (List<Category>) request.getAttribute("category");%>

<body>
<table class="table-bordered" style="width: 700px">

    <tr style="border: 1px solid black; background-color: #9cc9d2; text-space: 25px">
        <th><%=id%></th>
        <th><%=news%></th>
    </tr>
        <% for (Category cat:list) {%>
    <tr style="border: 1px solid black;background-color: #8cbdc5">
        <td><%=cat.getId()%></td>
        <td><%=cat.getName()%></td>
    </tr>
        <%}%>
</body>

<%@include file="../footer.jsp" %>