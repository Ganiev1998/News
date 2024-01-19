<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <%@include file="../head.jsp"%>
    <% String name = messageSource.getMessage("name",null,lang);%>
</head>
<body>
<form id="myForm" action="<%= request.getContextPath()%>/insert_category">
    <div class="mb-3">
        <label for="name" class="form-label"><%=name+ ":"%> </label>
        <input type="text"  id="name" name="name" required>
    </div>
    <button type="submit" class="btn btn-success"><%=create%></button>
</form>
<%@include file="../footer.jsp"%>
</body>
</html>