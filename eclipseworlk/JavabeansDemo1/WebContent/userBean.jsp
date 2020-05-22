<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
   <jsp:useBean id="myUser" class="com.po.User" scope="page" />
   <h1>使用普通方法创建Javabean的实例</h1>
   <hr>
   用户名：<%=myUser.getUsername() %><br>
   密码：<%=myUser.getPassword() %><br>
</body>
</html>