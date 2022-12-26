<%@page import="cart.helper.FactoryProvider"%>
<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<title>E-comm -> Home</title>
<%@include file="Components/common_css_js.jsp" %>

</head>
<body>

<%@include file="Components/navbar.jsp" %>
	<h2>Hello World!</h2>
	<h1>Created Session Factory</h1>
	<%
	out.println(FactoryProvider.getFactory());
	%>
</body>
</html>
