/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.52
 * Generated at: 2022-05-11 14:38:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import map.Note;
import map.NoteDAO;

public final class popup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.PrintWriter");
    _jspx_imports_classes.add("map.NoteDAO");
    _jspx_imports_classes.add("map.Note");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--\r\n");
      out.write("김영원: CSS\r\n");
      out.write("서동학: 전체적인 코딩\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<!-- 아이템에 대한 추가적인 내용을 작성 -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>메모</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("@font-face {\r\n");
      out.write("  font-family: \"aTitleGothic2\";\r\n");
      out.write("  src: url('fonts/aTitleGothic2.ttf');\r\n");
      out.write("}\r\n");
      out.write("@font-face {\r\n");
      out.write("  font-family: \"aTitleGothic3\";\r\n");
      out.write("  src: url('fonts/aTitleGothic3.ttf');\r\n");
      out.write("}\r\n");
      out.write("@font-face {\r\n");
      out.write("  font-family: \"uninote\";\r\n");
      out.write("  src: url('fonts/UNINOTE.otf');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("	margin: 0px;\r\n");
      out.write("	background-color: #f9f9f9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main_box {\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".article_box {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#noteContent {\r\n");
      out.write("	width: 95%;\r\n");
      out.write("	height: 90vh;\r\n");
      out.write("	resize: none;\r\n");
      out.write("	font-family: aTitleGothic2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bottem_box {\r\n");
      out.write("	text-align: right;\r\n");
      out.write("	bottom: 3px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");

	/* 
	아이템에 추가 내용을 작성하는 페이지
	본인이 아니면 수정이 불가능
	*/
	String userID = null;
	if (session.getAttribute("userID") != null) {
		userID = (String) session.getAttribute("userID");
	}
	String itemID = null;
	itemID = request.getParameter("itemID");

	String mapID = null;
	mapID = request.getParameter("mapID");

	NoteDAO noteDAO = new NoteDAO();
	String noteContent = null;
	if (mapID.equals(userID)) {
		Note note = noteDAO.selectNote(userID, itemID);
		noteContent = note.getNoteContent();
	} else if (!mapID.equals(userID)) {
		Note note = noteDAO.selectNote(mapID, itemID);
		noteContent = note.getNoteContent();
	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"main_box\">\r\n");
      out.write("		<div class=\"article_box\">\r\n");
      out.write("			");

			if (noteContent == null && mapID.equals(userID)) {
			
      out.write("\r\n");
      out.write("			<form action=\"noteAction.jsp\" method=\"post\" id=\"noteForm\" method=\"post\">\r\n");
      out.write("				<input type=\"hidden\" id=\"noteItemID\" name=\"noteItemID\" value=");
      out.print(itemID);
      out.write(">\r\n");
      out.write("				<textarea id=\"noteContent\" name=\"noteContent\" placeholder=\"내용을 입력해주세요.\"></textarea>\r\n");
      out.write("				<input type=\"hidden\" id=\"noteType\" name=\"noteType\" value=\"update\">\r\n");
      out.write("				<button id=\"save_btn\" type=\"submit\">저장</button>\r\n");
      out.write("			</form>\r\n");
      out.write("			");

			} else if (!mapID.equals(userID) && noteContent != null) {
			
      out.write("\r\n");
      out.write("			<input type=\"hidden\" id=\"noteItemID\" name=\"noteItemID\" value=");
      out.print(itemID);
      out.write(">\r\n");
      out.write("			<textarea id=\"noteContent\" name=\"noteContent\" readonly>");
      out.print(noteContent);
      out.write("</textarea>\r\n");
      out.write("			");

			} else if (!mapID.equals(userID) && noteContent == null) {
			
      out.write("\r\n");
      out.write("			<input type=\"hidden\" id=\"noteItemID\" name=\"noteItemID\" value=");
      out.print(itemID);
      out.write(">\r\n");
      out.write("			<textarea id=\"noteContent\" name=\"noteContent\" placeholder=\"내용을 입력해주세요.\" readonly></textarea>\r\n");
      out.write("			");

			} else {
			
      out.write("\r\n");
      out.write("			<form action=\"noteAction.jsp\" method=\"post\" id=\"noteForm\" method=\"post\">\r\n");
      out.write("				<input type=\"hidden\" id=\"noteItemID\" name=\"noteItemID\" value=");
      out.print(itemID);
      out.write(">\r\n");
      out.write("				<textarea id=\"noteContent\" name=\"noteContent\">");
      out.print(noteContent);
      out.write("</textarea>\r\n");
      out.write("				<input type=\"hidden\" id=\"noteType\" name=\"noteType\" value=\"update\">\r\n");
      out.write("				<button id=\"save_btn\" type=\"submit\">저장</button>\r\n");
      out.write("			</form>\r\n");
      out.write("			");

			}
			
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"bottem_box\"></div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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