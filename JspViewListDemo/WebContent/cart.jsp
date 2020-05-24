<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="entity.Cart" %>
<%@ page import="entity.Items" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/style1.css">
<script language="javascript">
  function delcfm(){
	  if(!confirm("确认要删除？")){
		  window.event.returnValue=false;
	  }
  }
</script>
</head>
<body>
  <h1>我的购物车</h1>
  <a href="index.jsp">首页</a>>><a href="index.jsp">商品列表</a>
  <hr>
  <div id="shoping">
   <form action="" method="">
     <table>
        <tr>
          <th>商品名称</th>
          <th>商品单价</th>
          <th>商品价格</th>
          <th>商品数量</th>
          <th>操作</th>
        </tr>
        <%
          //首先判断session中是否有购物车对象
          if(request.getSession().getAttribute("cart")!=null){
        %>
        <%
          Cart cart = (Cart)request.getSession().getAttribute("cart");
          HashMap<Items,Integer> goods = cart.getGoods();
          Set<Items> items = goods.keySet();
          Iterator<Items> it = items.iterator();
          
          while(it.hasNext()){
        	  Items i=it.next();
        %>
        <tr name="products" id="product_id_1">
          <td class="thumb"><img src="images/<%=i.getPicture()%>" /><a href=""><%=i.getName() %></a></td>
          <td class="number"><%=i.getPrice() %></td>
          <td class="price" id="price_id_1">
            <span><%=i.getPrice()*goods.get(i) %></span>
            <input type="hidden" value="">
          </td>
          <td class="number"><%=goods.get(i) %></td>
          <td class="delete">
            <a href="servlet/CartServlet?action=delete&id=<%=i.getId()%>" onclick="delcfm();">删除</a>
          </td>
        </tr>
        <%} %>
     </table>
     <div class="total"><span id="total">总计：<%=cart.getTotalPrice() %>￥</span></div>
     <%} %>
     <div class="button"><input type="submit" value=""></div>
   </form>
  </div>
</body>
</html>