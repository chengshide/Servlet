/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.103
 * Generated at: 2020-05-14 02:02:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("     <h1>用户登录</h1>\r\n");
      out.write("     <hr>\r\n");
      out.write("     ");

     request.setCharacterEncoding("utf-8");
     String username="";
     String password="";
     Cookie[] cookies=request.getCookies();
     if(cookies!=null && cookies.length>0){
		  for(Cookie c:cookies){
			  if(c.getName().equals("username")){
				  username=URLDecoder.decode(c.getValue(),"utf-8");
			  }else if( c.getName().equals("password"))
				  password=URLDecoder.decode(c.getValue(),"utf-8");
		  }
	  }
   
      out.write("\r\n");
      out.write("     <form action=\"dologin.jsp\" name=\"loginForm\" method=\"post\">\r\n");
      out.write("       <table>\r\n");
      out.write("         <tr>\r\n");
      out.write("           <td>用户名：</td>\r\n");
      out.write("           <td><input type=\"text\" name=\"username\" value=\"");
      out.print(username );
      out.write("\" /></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("           <td>密码：</td>\r\n");
      out.write("           <td><input type=\"password\" name=\"password\" value=\"");
      out.print(password );
      out.write("\" /></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("           <td colspan=\"2\"><input type=\"checkbox\" name=\"isUseCookie\" checked=\"checked\"  />十天内记住我的登录状态</td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr>\r\n");
      out.write("           <td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"登录\" /><input type=\"reset\" value=\"取消\" /></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("       </table>\r\n");
      out.write("     </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
