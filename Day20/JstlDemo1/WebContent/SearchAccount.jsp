<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="conn"
driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/bank"
user="root"
password="root"
/>
<sql:query var="accounts" dataSource="${conn }">
select * from Accounts where AccountNo=?
<sql:param value="${param.accountNo }"></sql:param>
</sql:query>
<c:set var="flag" value="0"></c:set>
<c:forEach var="e" items="${accounts.rows }">
First Name:
<c:out value="${e.firstName }"></c:out><br/>
Last Name:
<c:out value="${e.lastName }"></c:out><br/>
City:
<c:out value="${e.city }"></c:out><br/>
State:
<c:out value="${e.state }"></c:out><br/>
Amount:
<c:out value="${e.amount }"></c:out><br/>
Cheq Facil:
<c:out value="${e.cheqFacil }"></c:out><br/>
Account Type:
<c:out value="${e.accountType }"></c:out><br/>
<c:set var="flag" value="1"></c:set>
</c:forEach>
<c:if test="${flag==0 }">
<c:out value="Account Not Found"></c:out>
</c:if>

</body>
</html>