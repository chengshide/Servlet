<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%
  request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="loginUser" class="com.po.Users" scope="page"/>
<jsp:useBean id="userDao" class="com.dao.UserDao" scope="page"/>
<jsp:setProperty property="*" name="loginUser"/>
<%
  
  //判断用户登录的用户名和密码
  if(userDao.userLogin(loginUser)){
	  session.setAttribute("loginUser", loginUser.getUsername());
	  request.getRequestDispatcher("login_success.jsp").forward(request, response);
  }else{
	  response.sendRedirect("login_failure.jsp");
  }
%>