<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
 <center>
   <img src="images/add_catr_success.jpg"/>
   <hr>
   <%
    String id=request.getParameter("id");
    String num = request.getParameter("num");
   %>
   您成功购买了<%=num %>件商品编号为<%=id %>的商品&nbsp;&nbsp;&nbsp;&nbsp;
   <br>
   <br>
   <br>
 </center>
</body>
</html>