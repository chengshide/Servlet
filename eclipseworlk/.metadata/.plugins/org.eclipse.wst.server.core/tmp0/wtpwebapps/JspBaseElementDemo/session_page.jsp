<%@ page language="java" import="java.util.*,java.text.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
     <h1>session内置对象</h1>
     <hr>
     <%
       SimpleDateFormat adf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Date d=new Date(session.getCreationTime());
       session.setAttribute("username", "admin");
       session.setAttribute("age", 20);
       session.setAttribute("passworld", "1234456");
     %>
     Session创建的时间是：<%=adf.format(d) %><br>
     Session的ID：<%=session.getId() %><br>
     Session的用户名：<%=session.getAttribute("username") %><br>
     <a href="session_page2.jsp" target="blank">跳转到session_page2页面</a>
     
</body>
</html>