<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
   <h1>用户登录</h1>
   <hr>
   <form action="dologin.jsp" name="loginForm" method="post">
      <table>
        <tr>
          <td>用户名： </td>
          <td><input type="text" name="username"></td>
        </tr>
         <tr>
          <td>密码： </td>
          <td><input type="text" name="password"></td>
        </tr>
        <tr>
          <td colspan="2"><input type="submit" value="登录"></td>
        </tr>
      </table>
   
   </form>

</body>
</html>