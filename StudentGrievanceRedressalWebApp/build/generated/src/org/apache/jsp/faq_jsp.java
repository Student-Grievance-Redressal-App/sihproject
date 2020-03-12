package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faq_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <style>\n");
      out.write("@import url(https://fonts.googleapis.com/css?family=Open+Sans:300,800);\n");
      out.write("\n");
      out.write("body {\n");
      out.write("    margin-top: 120px;\n");
      out.write("  font-family: 'Open Sans';\n");
      out.write("  font-size: 1.5em;\n");
      out.write("  background: #eee;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".content {\n");
      out.write("  width: 80%;\n");
      out.write("  padding: 20px;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  padding: 0 60px 0 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".centerplease {\n");
      out.write("  margin: 0 auto;\n");
      out.write("  max-width: 270px;\n");
      out.write("  font-size: 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".question {\n");
      out.write("  position: relative;\n");
      out.write("  background: #8FBC8F;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 10px 10px 10px 50px;\n");
      out.write("  display: block;\n");
      out.write("  width:100%;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".answers {\n");
      out.write("  background: #999;\n");
      out.write("  padding: 0px 15px;\n");
      out.write("  margin: 5px 0;\n");
      out.write("  max-height: 0;\n");
      out.write("  overflow: hidden;\n");
      out.write("  z-index: -1;\n");
      out.write("  position: relative;\n");
      out.write("  opacity: 0;\n");
      out.write("  -webkit-transition: .7s ease;\n");
      out.write("  -moz-transition: .7s ease;\n");
      out.write("  -o-transition: .7s ease;\n");
      out.write("  transition: .7s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".questions:checked ~ .answers{\n");
      out.write("  max-height: 500px;\n");
      out.write("  opacity: 1;\n");
      out.write("  padding: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".plus {\n");
      out.write("  position: absolute;\n");
      out.write("  margin-left: 10px;\n");
      out.write("  z-index: 5;\n");
      out.write("  font-size: 2em;\n");
      out.write("  line-height: 100%;\n");
      out.write("  -webkit-user-select: none;    \n");
      out.write("  -moz-user-select: none;\n");
      out.write("  -ms-user-select: none;\n");
      out.write("  -o-user-select: none;\n");
      out.write("  user-select: none;\n");
      out.write("  -webkit-transition: .3s ease;\n");
      out.write("  -moz-transition: .3s ease;\n");
      out.write("  -o-transition: .3s ease;\n");
      out.write("  transition: .3s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".questions:checked ~ .plus {\n");
      out.write("  -webkit-transform: rotate(45deg);\n");
      out.write("  -moz-transform: rotate(45deg);\n");
      out.write("  -o-transform: rotate(45deg);\n");
      out.write("  transform: rotate(45deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".questions {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("        <div class='centerplease'>\n");
      out.write("  FAQs\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div class=\"content\">\n");
      out.write("<div>\n");
      out.write("  <input type=\"checkbox\" id=\"question1\" name=\"q\"  class=\"questions\">\n");
      out.write("  <div class=\"plus\">+</div>\n");
      out.write("  <label for=\"question1\" class=\"question\">\n");
      out.write("    This is the question that will be asked?\n");
      out.write("  </label>\n");
      out.write("  <div class=\"answers\">\n");
      out.write("    What if the answer is really long and wraps the whole page and you never want to finish it but you have to because its the answer!\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("  <input type=\"checkbox\" id=\"question2\" name=\"q\" class=\"questions\">\n");
      out.write("  <div class=\"plus\">+</div>\n");
      out.write("  <label for=\"question2\" class=\"question\">\n");
      out.write("    This is the question that will be asked?\n");
      out.write("  </label>\n");
      out.write("  <div class=\"answers\">\n");
      out.write("    short!\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("<div>\n");
      out.write("  <input type=\"checkbox\" id=\"question3\" name=\"q\" class=\"questions\">\n");
      out.write("  <div class=\"plus\">+</div>\n");
      out.write("  <label for=\"question3\" class=\"question\">\n");
      out.write("    This is the question that will be asked?\n");
      out.write("  </label>\n");
      out.write("  <div class=\"answers\">\n");
      out.write("    This is the answer!\n");
      out.write("  </div>\n");
      out.write("  <div>\n");
      out.write("  <input type=\"checkbox\" id=\"question1\" name=\"q\"  class=\"questions\">\n");
      out.write("  <div class=\"plus\">+</div>\n");
      out.write("  <label for=\"question4\" class=\"question\">\n");
      out.write("    This is the question that will be asked?\n");
      out.write("  </label>\n");
      out.write("  <div class=\"answers\">\n");
      out.write("    What if the answer is really long and wraps the whole page and you never want to finish it but you have to because its the answer!\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("  <input type=\"checkbox\" id=\"question1\" name=\"q\"  class=\"questions\">\n");
      out.write("  <div class=\"plus\">+</div>\n");
      out.write("  <label for=\"question\" class=\"question\">\n");
      out.write("    This is the question that will be asked?\n");
      out.write("  </label>\n");
      out.write("  <div class=\"answers\">\n");
      out.write("    What if the answer is really long and wraps the whole page and you never want to finish it but you have to because its the answer!\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
