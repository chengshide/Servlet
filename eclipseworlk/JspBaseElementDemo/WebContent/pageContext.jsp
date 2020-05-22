<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
   <h1>pageContext内置对象</h1>
       用户名是：<%=pageContext.getSession().getAttribute("username") %>
   <%
     //跳转到注册页面
     //pageContext.forward("reg.jsp");
     pageContext.include("include.jsp");
   %>
</body>
</html>