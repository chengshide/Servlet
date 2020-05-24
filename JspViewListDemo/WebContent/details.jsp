<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="dao.ItemsDAO" %>
<%@ page import="entity.Items" %>
<%
 String path=request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<title>Insert title here</title>
<!-- 
<link rel="stylesheet" type="text/css" href="styles.css">
 -->
<link rel="stylesheet" type="text/css" href="css/main.css">
<script type="text/javascript" src="js/lhgdialog.js"></script>
<script type="text/javascript" src="js/lhgcore.js"></script>
  <script type="text/javascript">
      function selflog_show(id)
      { 
         var num =  document.getElementById("number").value; 
         J.dialog.get({id: 'haoyue_creat',title: '购物成功',width: 600,height:400, link: '<%=path%>/servlet/CartServlet?id='+id+'&num='+num+'&action=add', cover:true});
      }
      function add()
      {
         var num = parseInt(document.getElementById("number").value);
         if(num<100)
         {
            document.getElementById("number").value = ++num;
         }
      }
      function sub()
      {
         var num = parseInt(document.getElementById("number").value);
         if(num>1)
         {
            document.getElementById("number").value = --num;
         }
      }
     
    </script>
 <style type="text/css">
	   hr{
	     
	     border-color:FF7F00; 
	   }
	   
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
	   div #cart
	   {
	     margin:0px auto;
	     text-align:right; 
	   }
	   span{
	     padding:0 2px;border:1px #c0c0c0 solid;cursor:pointer;
	   }
	   a{
	      text-decoration: none; 
	   }
	</style>
</head>
<body>
   <h1>商品详情</h1>
   <a href="index.jsp">首页</a>>><a href="index.jsp">商品列表</a>
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
          <div id="cart">
            <img src="images/buy_now.png"><a href="javascript:selflog_show(<%=item.getId()%>)"><img src="images/in_cart.png"></a>
            <a href="servlet/CartServlet?action=show"><img src="images/view_cart.jpg"></a>
          </div>
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
            	 for(Items ite:itemlist){
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