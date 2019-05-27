package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html><html lang=\"en\" class=\" \"><head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Meta, title, CSS, favicons, etc. -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <title>Gentelella Alela! | </title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"vendorsbootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link href=\"vendors/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- NProgress -->\n");
      out.write("        <link href=\"vendors/nprogress.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- iCheck -->\n");
      out.write("        <link href=\"vendors/green.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- bootstrap-wysiwyg -->\n");
      out.write("        <link href=\"vendors/prettify.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Select2 -->\n");
      out.write("        <link href=\"vendors/select2.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Switchery -->\n");
      out.write("        <link href=\"vendors/switchery.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- starrr -->\n");
      out.write("        <link href=\"vendors/starrr.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- bootstrap-daterangepicker -->\n");
      out.write("        <link href=\"vendors/daterangepicker.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom Theme Style -->\n");
      out.write("        <link href=\"vendors/custom.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"nav-md\">\n");
      out.write("        <div class=\"container body\">\n");
      out.write("            <div class=\"main_container col-lg-11\">\n");
      out.write("                <!-- top navigation -->\n");
      out.write("                <div class=\"top_nav\"> </div>\n");
      out.write("                <!-- /top navigation -->\n");
      out.write("\n");
      out.write("                <!-- page content -->\n");
      out.write("                <div class=\"right_col\" role=\"main\">\n");
      out.write("                    <div class=\"\">\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                        <div class=\"col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                            <div class=\"x_panel\">\n");
      out.write("                                <div class=\"x_content\">\n");
      out.write("                                    <div class=\"btn-toolbar editor\" data-role=\"editor-toolbar\" data-target=\"#editor-one\">\n");
      out.write("                                        <div class=\"btn-group\">                </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"x_panel\">\n");
      out.write("                            <div class=\"x_title\">\n");
      out.write("                                <h2>Text areas<small>Sessions</small></h2>\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"x_content\">\n");
      out.write("                                <div id=\"alerts\"></div>\n");
      out.write("                                <div class=\"btn-toolbar editor\" data-role=\"editor-toolbar\" data-target=\"#editor-one\">\n");
      out.write("                                    <div class=\"btn-group\"> <a title=\"Font\" class=\"btn dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-font\"></i><b class=\"caret\"></b></a>\n");
      out.write("                                        <ul class=\"dropdown-menu\">\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"btn-group\"> <a title=\"Font Size\" class=\"btn dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-text-height\"></i>&nbsp;<b class=\"caret\"></b></a>\n");
      out.write("                                        <ul class=\"dropdown-menu\">\n");
      out.write("                                            <li> <a data-edit=\"fontSize 5\">\n");
      out.write("                                                    <p style=\"font-size:17px\">Huge</p>\n");
      out.write("                                                </a> </li>\n");
      out.write("                                            <li> <a data-edit=\"fontSize 3\">\n");
      out.write("                                                    <p style=\"font-size:14px\">Normal</p>\n");
      out.write("                                                </a> </li>\n");
      out.write("                                            <li> <a data-edit=\"fontSize 1\">\n");
      out.write("                                                    <p style=\"font-size:11px\">Small</p>\n");
      out.write("                                                </a> </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"btn-group\"> <a title=\"Bold (Ctrl/Cmd+B)\" class=\"btn\" data-edit=\"bold\"><i class=\"fa fa-bold\"></i></a> <a title=\"Italic (Ctrl/Cmd+I)\" class=\"btn\" data-edit=\"italic\"><i class=\"fa fa-italic\"></i></a> <a title=\"Strikethrough\" class=\"btn\" data-edit=\"strikethrough\"><i class=\"fa fa-strikethrough\"></i></a> <a title=\"Underline (Ctrl/Cmd+U)\" class=\"btn\" data-edit=\"underline\"><i class=\"fa fa-underline\"></i></a> </div>\n");
      out.write("                                    <div class=\"btn-group\"> <a title=\"Bullet list\" class=\"btn\" data-edit=\"insertunorderedlist\"><i class=\"fa fa-list-ul\"></i></a> <a title=\"Number list\" class=\"btn\" data-edit=\"insertorderedlist\"><i class=\"fa fa-list-ol\"></i></a> <a title=\"Reduce indent (Shift+Tab)\" class=\"btn\" data-edit=\"outdent\"><i class=\"fa fa-dedent\"></i></a> <a title=\"Indent (Tab)\" class=\"btn\" data-edit=\"indent\"><i class=\"fa fa-indent\"></i></a> </div>\n");
      out.write("                                    <div class=\"btn-group\"> <a title=\"Align Left (Ctrl/Cmd+L)\" class=\"btn\" data-edit=\"justifyleft\"><i class=\"fa fa-align-left\"></i></a> <a title=\"Center (Ctrl/Cmd+E)\" class=\"btn\" data-edit=\"justifycenter\"><i class=\"fa fa-align-center\"></i></a> <a title=\"Align Right (Ctrl/Cmd+R)\" class=\"btn\" data-edit=\"justifyright\"><i class=\"fa fa-align-right\"></i></a> <a title=\"Justify (Ctrl/Cmd+J)\" class=\"btn\" data-edit=\"justifyfull\"><i class=\"fa fa-align-justify\"></i></a> </div>\n");
      out.write("                                    <div class=\"btn-group\"> <a title=\"Hyperlink\" class=\"btn dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-link\"></i></a>\n");
      out.write("                                        <div class=\"dropdown-menu input-append\">\n");
      out.write("                                            <input class=\"span2\" placeholder=\"URL\" type=\"text\" data-edit=\"createLink\">\n");
      out.write("                                            <button type=\"button\" class=\"btn\">Add</button>\n");
      out.write("                                        </div>\n");
      out.write("                                        <a title=\"Remove Hyperlink\" class=\"btn\" data-edit=\"unlink\"><i class=\"fa fa-cut\"></i></a> </div>\n");
      out.write("                                    <div class=\"btn-group\"> <a class=\"btn\" title=\"Insert picture (or just drag &amp; drop)\" id=\"pictureBtn\"><i class=\"fa fa-picture-o\"></i></a>\n");
      out.write("                                        <input type=\"file\" data-role=\"magic-overlay\" accept=\".png,.jpg\" data-target=\"#pictureBtn\" data-edit=\"insertImage\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"btn-group\"> <a title=\"Undo (Ctrl/Cmd+Z)\" class=\"btn\" data-edit=\"undo\"><i class=\"fa fa-undo\"></i></a> <a title=\"Redo (Ctrl/Cmd+Y)\" class=\"btn\" data-edit=\"redo\"><i class=\"fa fa-repeat\"></i></a> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"editor-wrapper\" id=\"editor-one\"></div>\n");
      out.write("                                <textarea name=\"descr\" id=\"descr\" style=\"display:none;\"></textarea>\n");
      out.write("                                <input type=\"submit\">\n");
      out.write("                                <br>\n");
      out.write("                                <div class=\"ln_solid\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"x_content\"> </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /page content -->\n");
      out.write("\n");
      out.write("                <!-- footer content -->\n");
      out.write("                <footer>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </footer>\n");
      out.write("                <!-- /footer content -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"vendors/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <script src=\"vendors/bootstrap.min.js\"></script>\n");
      out.write("        <!-- FastClick -->\n");
      out.write("        <script src=\"vendors/fastclick.js\"></script>\n");
      out.write("        <!-- NProgress -->\n");
      out.write("        <script src=\"vendors/nprogress.js\"></script>\n");
      out.write("        <!-- bootstrap-progressbar -->\n");
      out.write("        <script src=\"vendors/bootstrap-progressbar.min.js\"></script>\n");
      out.write("        <!-- iCheck -->\n");
      out.write("        <script src=\"vendors/icheck.min.js\"></script>\n");
      out.write("        <!-- bootstrap-daterangepicker -->\n");
      out.write("        <script src=\"vendors/moment.min.js\"></script>\n");
      out.write("        <script src=\"vendors/daterangepicker.js\"></script>\n");
      out.write("        <!-- bootstrap-wysiwyg -->\n");
      out.write("        <script src=\"vendors/bootstrap-wysiwyg.min.js\"></script>\n");
      out.write("        <script src=\"vendors/jquery.hotkeys.js\"></script>\n");
      out.write("        <script src=\"vendors/prettify.js\"></script>\n");
      out.write("        <!-- jQuery Tags Input -->\n");
      out.write("        <script src=\"vendors/jquery.tagsinput.js\"></script>\n");
      out.write("        <!-- Switchery -->\n");
      out.write("        <script src=\"vendors/switchery.min.js\"></script>\n");
      out.write("        <!-- Select2 -->\n");
      out.write("        <script src=\"vendors/select2.full.min.js\"></script>\n");
      out.write("        <!-- Parsley -->\n");
      out.write("        <script src=\"vendors/parsley.min.js\"></script>\n");
      out.write("        <!-- Autosize -->\n");
      out.write("        <script src=\"vendors/autosize.min.js\"></script>\n");
      out.write("        <!-- jQuery autocomplete -->\n");
      out.write("        <script src=\"vendors/jquery.autocomplete.min.js\"></script>\n");
      out.write("        <!-- starrr -->\n");
      out.write("        <script src=\"vendors/starrr.js\"></script>\n");
      out.write("        <!-- Custom Theme Scripts -->\n");
      out.write("        <script src=\"vendors/custom.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body></html>\n");
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
