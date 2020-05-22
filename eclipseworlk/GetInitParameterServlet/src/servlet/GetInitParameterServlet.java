package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetInitParameterServlet
 */
@WebServlet("/GetInitParameterServlet")
public class GetInitParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String username;
	private String password;
	
    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public GetInitParameterServlet() {
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
		PrintWriter out=response.getWriter();
		out.println("<h2>"+"”√ªß√˚£∫"+this.getPassword()+"</h2>");
		out.println("<h2>√‹¬Î£∫"+this.getPassword()+"</h2>");
	}
	
	public void init() throws ServletException{
		this.setUsername(this.getInitParameter("username"));
		this.setPassword(this.getInitParameter("password"));
	}

}
