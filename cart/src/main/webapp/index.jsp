<%@page import="cart.helper.FactoryProvider"%>
<html>
<body>
<h2>Hello World!</h2>
<h1>Created Session Factory</h1>
<% 
out.println(FactoryProvider.getFactory());
%>
</body>
</html>
