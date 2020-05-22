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
    
     Session的ID：<%=session.getId() %><br>
     Session的用户名：<%=session.getAttribute("username") %><br>
     Session中保存的属性有：<%
              String[] names=session.getValueNames();
              for(int i=0;i<names.length;i++){
            	  out.println(names[i]);
              }
     %><br>
</body>
</html>