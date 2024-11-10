<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ page import = "com.model.User" %>
<title>Insert title here</title>
</head>
<body>
	<%	User user = (User)request.getAttribute("user"); %>
	<h1>xac nhan thong tin khach hang</h1>
	<label> Email: ${user.getEmail()} </label><br>
	<label>	Name: ${user.getName()} </label><br>
	<label> Diachi: ${user.getDiachi()}</label><br>
	<label> Sex: ${user.getSex()}</label> <br>
	<label>Loaiship:</labe l>
    <%
        for (String loaiship: user.getLoaiship()){
    %>
        <%=loaiship%>

    <%    } %> <br>
    <button type="button" onclick= "location.href= './quynh' " >Edit</button>
   
</body>
</html>
