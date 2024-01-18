<%@ page import="java.util.Locale" %>
<%@include file="head.jsp" %>
<% String welcome = messageSource.getMessage("welcome",null,(Locale) request.getAttribute("lang")); %>

<div class="container-fluid">
    <center>
        <h2 class="m-5"><%=welcome%></h2>

        <img class="img-fluid" src="<%=request.getContextPath()%>/images/img.png">
    </center>

</div>

<%@include file="footer.jsp" %>