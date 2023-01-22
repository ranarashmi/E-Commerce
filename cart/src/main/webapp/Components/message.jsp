<%

String msg =(String)session.getAttribute("message");

if(msg != null){
	
	out.print(msg);
	session.removeAttribute("message");
}

%>