<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("userName");
String pwd=request.getParameter("passWord");
if(name.equals("Hema") && pwd.equals("hema")){
%>
<jsp:forward page="menupage.jsp"></jsp:forward>
<% 	
}else{
	out.println("Please Re-Enter Correct Credentials");
%>
<jsp:include page="login.html"></jsp:include>
<%
}
%>

</body>
</html>