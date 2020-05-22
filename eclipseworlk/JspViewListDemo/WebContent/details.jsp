<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="dao.ItemsDAO" %>
<%@ page import="entity.Items" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style type="text/css">
	   div{
	      float:left;
	      margin-left: 30px;
	      margin-right:30px;
	      margin-top: 5px;
	      margin-bottom: 5px;
	   }
	   div dd{
	      margin:0px;
	      font-size:10pt;
	   }
	   div dd.dd_name
	   {
	      color:blue;
	   }
	   div dd.dd_city
	   {
	      color:#000;
	   }
	</style>
</head>
<body>
   <h1>商品详情</h1>
   <hr>
   <center>
     <table width="750" height="60" cellpadding="0" cellspacing="0" border="0">
      <tr>
       <!-- 商品详情 -->
         <%
           ItemsDAO itemsDao=new ItemsDAO();
           Items item=itemsDao.getItemsByID(Integer.parseInt(request.getParameter("id")));
           if(item!=null){
         %>
         <td width="70%" valign="top">
          <table>
            <tr>
              <td rowspan="5"><img src="images/<%=item.getPicture() %>" width="200" height="160"></td>
            </tr>
            <tr>
              <td><b><%=item.getName() %></b></td>
            </tr>
            <tr>
              <td>产地：<%=item.getCity() %></td>
            </tr>
            <tr>
              <td>价格：<%=item.getPrice() %>￥</td>
            </tr>
            <tr>
              <td>购买数量：<span id="sub" onclick="sub();">-</span>
              <input type="text" id="number" value="1" size="2" />
              <span id="add" onclick="add();">+</span></td>
            </tr>
          </table>
         </td>
           <%
             }
           %>
           <%
             String list="";
             Cookie[] cookies=request.getCookies();
             for(Cookie c:cookies){
            	 if(c.getName().equals("ListViewCookie")){
            		 list=c.getValue();
            	 }
             }
             list+=request.getParameter("id")+",";
             //如果浏览记录超过1000条，清零
             String[] arr=list.split(",");
             if(arr!=null && arr.length>0){
            	 if(arr.length>=1000){
            		 list="";
            	} 
             }
             Cookie cookie=new Cookie("ListViewCookie",list);
             response.addCookie(cookie);
           %>
           <!-- 浏览过的商品 -->
           <td width="30%" bgcolor="#EEE" align="center">
             <br>
             <b>您浏览过的商品</b><br>
             <!-- 循环开始 -->
             <%
               ArrayList<Items> itemlist=itemsDao.getViewList(list);
             if(itemlist!=null && itemlist.size()>0){
            	 System.out.println("itemlist.size="+itemlist.size());
            	 for(Items ite:itemlist){
            		 System.out.println(ite.toString());
             %>
             <div>
              <dl>
               <dt>
                <a href="details.jsp?id=<%=ite.getId()%>"><img src="images/<%=ite.getPicture() %>" width="120" height="90" border="1"></a>
               </dt>
               <dd class="dd_name"><%=ite.getName() %></dd>
               <dd class="dd_city">产地：<%=ite.getCity() %>&nbsp;&nbsp;价格：<%=ite.getPrice() %>￥</dd>
              </dl>
             </div>
             <%}} %>
           </td>
      </tr>
     </table>
   </center>
</body>
</html>