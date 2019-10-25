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
select max(accountNo)+1 Accno from Accounts
</sql:query>
<c:set var="accno" value="0"></c:set>
<c:forEach var="account" items="${accounts.rows }">
<c:set var="accno" value="${account.Accno }"></c:set>
</c:forEach>
Account No:
<b>
<c:out value="${accno }"></c:out>
</b>
<br/><br/>
<sql:update dataSource="${conn }" var="accounts">
insert into Accounts(AccountNo,FirstName,LastName,City,State,Amount,CheqFacil,AccountType) values(?,?,?,?,?,?,?,?)
<sql:param value="${accno }"></sql:param>
<sql:param value='${param["firstName"]}'></sql:param>
<sql:param value='${param["lastName"]}'></sql:param>
<sql:param value='${param["city"]}'></sql:param>
<sql:param value='${param["state"]}'></sql:param>
<sql:param value='${param["amount"]}'></sql:param>
<sql:param value='${param["cheqfacil"]}'></sql:param>
<sql:param value='${param["accountType"]}'></sql:param>
</sql:update>
<c:out value="Account Created Successfully"></c:out>
</body>
</html>