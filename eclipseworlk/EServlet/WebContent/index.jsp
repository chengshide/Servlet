<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
    <h1>第一个Servlet例子</h1>
    <hr>
    <a href="servlet/HelloServlet">Get方式请求HelloServlet</a>
    <form action="servlet/HelloServlet" method="post">
      <input type="submit" value="Post方式请求HelloServlet">
    </form>
</body>
</html>