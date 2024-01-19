<%@ page import="com.example.project_jsp.model.Category" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../head.jsp"%>
<% Category category = (Category) request.getAttribute("category");%>
<html>
<head>
</head>
<body>
<form id="myForm" action="<%= request.getContextPath()%>/update_category3/<%=category.getId()%>">
    <div class="mb-3">
        <label for="name" class="form-label">Name: </label>
        <input type="text"  id="name" name="name" value="<%=category.getName()%>" required>
    </div>
    <button type="submit" class="btn btn-primary"><%=update%></button>
</form>
<%@include file="../footer.jsp"%>
</body>
</html>