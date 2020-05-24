package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ItemsDAO;
import entity.Cart;
import entity.Items;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private String action; //表示购物车的动作
	private ItemsDAO idao=new ItemsDAO();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		if(request.getParameter("action")!=null) {
			this.action = request.getParameter("action");
			if(action.equals("add")) {
				if(addToCart(request,response)) {
					request.getRequestDispatcher("/success.jsp").forward(request, response);
				}else {
					request.getRequestDispatcher("/failure.jsp").forward(request, response);
				}
			}
			if(action.equals("show")) {
				request.getRequestDispatcher("/cart.jsp").forward(request, response);
			}
			if(action.equals("delete")) {
				deleteFromCart(request,response);
				request.getRequestDispatcher("/cart.jsp").forward(request, response);
			}
		}
	}
	
	private boolean addToCart(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String number=request.getParameter("num");
		Items item = idao.getItemsByID(Integer.parseInt(id));
		
		//判断是否第一次给购物车添加商品
		if(request.getSession().getAttribute("cart")==null) {
			Cart cart = new Cart();
			request.getSession().setAttribute("cart", cart);
		}
		Cart cart=(Cart)request.getSession().getAttribute("cart");
		if(cart.addGoodsInCart(item, Integer.parseInt(number))) {
			return true;
		}else {
			return false;
		}
	}
	
	private boolean deleteFromCart(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		Cart cart = (Cart)request.getSession().getAttribute("cart");
		Items item = idao.getItemsByID(Integer.parseInt(id));
		if(cart.removeGoodsFromCart(item)) {
			return true;
		}else {
			return false;
		}
	}

}
