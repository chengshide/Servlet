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
    <h1>setProperty动作元素</h1>
    <hr>
    <!-- 根据表单自动匹配所有的属性 -->
     
    <jsp:setProperty property="*" name="myUser"/>
   
    <!-- 跟表单无关，通过手工赋值给属性-->
    <%-- 
    <jsp:setProperty property="username" name="myUser" value="lisi"/>   
    <jsp:setProperty property="password" name="myUser" value="8888"/>  
     --%>
    <!-- 通过URL传参给属性赋值 -->
    <%-- 
    <jsp:setProperty property="password" name="myUser" param="mypass"/> 
      用户名：<%=myUser.getUsername() %><br>
      密码：<%=myUser.getPassword() %><br>
      --%>
      <!-- 使用getProperty方式获取用户名和密码 -->
      用户名：<jsp:getProperty property="username" name="myUser"/><br>
      密码：<jsp:getProperty property="password" name="myUser"/>
</body>
</html>