/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.103
 * Generated at: 2020-05-16 10:32:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.*;

public final class userinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <style type=\"text/css\">\r\n");
      out.write("\t .title{\r\n");
      out.write("\t\t width: 30%;\t\r\n");
      out.write("\t\t background-color: #CCC;\r\n");
      out.write("\t\t font-weight: bold;\r\n");
      out.write("\t }\r\n");
      out.write("\t .content{\r\n");
      out.write("\t     width:70%;\r\n");
      out.write("\t     background-color: #CBCFE5;\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("   </style>  \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <h1>用户信息</h1>\r\n");
      out.write("   <hr>\r\n");
      out.write("   <center>\r\n");
      out.write("     ");
      entity.Users regUser = null;
      synchronized (session) {
        regUser = (entity.Users) _jspx_page_context.getAttribute("regUser", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (regUser == null){
          regUser = new entity.Users();
          _jspx_page_context.setAttribute("regUser", regUser, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("     <table width=\"600\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\">\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td class=\"title\">用户名：</td>\r\n");
      out.write("         <td class=\"content\">&nbsp;");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((entity.Users)_jspx_page_context.findAttribute("regUser")).getUsername())));
      out.write("</td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td class=\"title\">密码：</td>\r\n");
      out.write("         <td class=\"content\">&nbsp;");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((entity.Users)_jspx_page_context.findAttribute("regUser")).getMypassword())));
      out.write("</td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td class=\"title\">性别：</td>\r\n");
      out.write("         <td class=\"content\">&nbsp;");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((entity.Users)_jspx_page_context.findAttribute("regUser")).getGender())));
      out.write("</td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td class=\"title\">E-mail：</td>\r\n");
      out.write("         <td class=\"content\">&nbsp;");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((entity.Users)_jspx_page_context.findAttribute("regUser")).getEmail())));
      out.write("</td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td class=\"title\">出生日期：</td>\r\n");
      out.write("         <td class=\"content\">&nbsp;\r\n");
      out.write("           ");

             SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
             String date=sdf.format(regUser.getBirthday());
           
      out.write("\r\n");
      out.write("           ");
      out.print(date );
      out.write("\r\n");
      out.write("         </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td class=\"title\">爱好：</td>\r\n");
      out.write("         <td class=\"content\">&nbsp;\r\n");
      out.write("           ");

              String[] favorites=regUser.getFavorites();
              for(String f:favorites){
           
      out.write("\r\n");
      out.write("            ");
      out.print(f );
      out.write("&nbsp;&nbsp;\r\n");
      out.write("           ");
} 
      out.write("\r\n");
      out.write("         </td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td class=\"title\">自我介绍：</td>\r\n");
      out.write("         <td class=\"content\">&nbsp;");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((entity.Users)_jspx_page_context.findAttribute("regUser")).getIntroduce())));
      out.write("</td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       <tr>\r\n");
      out.write("         <td class=\"title\">是否接受协议：</td>\r\n");
      out.write("         <td class=\"content\">&nbsp;");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((entity.Users)_jspx_page_context.findAttribute("regUser")).isFlag())));
      out.write("</td>\r\n");
      out.write("       </tr>\r\n");
      out.write("     </table>\r\n");
      out.write("   </center>\r\n");
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
