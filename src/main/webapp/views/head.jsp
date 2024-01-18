<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ page import="org.springframework.context.support.ReloadableResourceBundleMessageSource" %>
<%@ page import="java.util.Locale" %>
<% Locale lang = (Locale) request.getAttribute("lang");%>
<% ReloadableResourceBundleMessageSource messageSource = (ReloadableResourceBundleMessageSource) request.getAttribute("messageSource"); %>

<html>
<head>
    <title>Logo</title>
    <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/css/custom.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/images/brand.png" rel="icon">
</head>
<body>

<%@include file="novbar.jsp"  %>
<div class="container-fluid px-5 pt-3"/>