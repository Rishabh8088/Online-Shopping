<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css/"></spring:url>
<spring:url var="js" value="/resources/js/"></spring:url>
<spring:url var="images" value="/resources/images/"></spring:url>

<c:set var="contextRoot" value="${pageContext.request.contextPath }" />


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Amazon- ${title }</title>

<script>
	windows.menu = '${title}';
</script>


<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<%@include file="./shared/navbar.jsp"%>

	<!-- Page Content -->
	<c:if test="${ userClickHome == true}">
		<%@include file="home.jsp"%>
	</c:if>

	<!-- About page -->
	<c:if test="${ userClickAbout == true}">
		<%@include file="about.jsp"%>
	</c:if>
	
	

	<!-- Contact Us -->
	<c:if test="${ userClickContact == true}">
		<%@include file="contact.jsp"%>
	</c:if>


	<!-- footer -->
	<%@ include file="./shared/footer.jsp"%>

	<!-- JQuery -->
	<script src="${js}/jquery.js"></script>

	<!-- Bootstrap core JavaScript -->
	<script src="${js}/bootstrap.min.js"></script>

	<!-- self  JavaScript -->
	<script src="${js}/myapp.js"></script>

</body>

</html>