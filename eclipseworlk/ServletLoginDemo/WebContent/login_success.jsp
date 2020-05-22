<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
    <%
       String loginUser="";
       if(session.getAttribute("loginUser")!=null){
    	   loginUser=session.getAttribute("loginUser").toString();
       }
    %>
    <h1>欢迎您<%=loginUser %>，登录成功</h1>
</body>
</html>