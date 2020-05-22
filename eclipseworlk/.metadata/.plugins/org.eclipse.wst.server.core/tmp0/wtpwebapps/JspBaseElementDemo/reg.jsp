<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
    <h1>用户注册</h1>
    <hr>
    <form name="regForm" action="response.jsp" method="post">
    <table>
     <tr>
      <td>用户名：</td>
      <td><input type="text" name="username"> </td>
     </tr>
     <tr>
      <td>爱好：</td>
      <td>
         <input type="checkbox" name="favorite" value="read">读书
         <input type="checkbox" name="favorite" value="music">音乐
         <input type="checkbox" name="favorite" value="movie">电影
         <input type="checkbox" name="favorite" value="internet">上网
       </td>
     </tr>
     <tr>
       <td colspan="2"><input type="submit" value="提交"></td>
     </tr>
    </table>    
    </form>
    <br>
    <br>
    <a href="request.jsp?username=lisi">测试URL传参数</a>

</body>
</html>