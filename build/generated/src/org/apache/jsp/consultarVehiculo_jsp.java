package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.VehiculoDAO;
import ModeloVO.VehiculoVO;
import ModeloVO.DatosVO;
import ModeloVO.UsuarioVO;

public final class consultarVehiculo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/sesiones.jsp");
  }

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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Estilos/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"Imagenes/logo.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Estilos/css/style.css\">\n");
      out.write("        <title>Sesiones</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    ");

        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
        response.setDateHeader("Expires", 0);
    
      out.write("\n");
      out.write("\n");
      out.write("    ");

        HttpSession miSesion = (HttpSession) request.getSession();
        String usuario = "";
        if (miSesion.getAttribute("datosUsuario") == null) {
            request.getRequestDispatcher("index.jsp").forward(request, response);

        } else {
            UsuarioVO usuVO = (UsuarioVO) miSesion.getAttribute("datosUsuario");
            usuario = usuVO.getUsuLogin();

        }

    
      out.write("\n");
      out.write("    \n");
      out.write("   \n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("  \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Estilos/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"Imagenes/logo.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Estilos/css/style.css\">\n");
      out.write("        <title>Actualizar Vehículo</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1><b> <span class=\"icon-accommodate1\">Actualizar Vehículo</span>\n");
      out.write("                <form method=\"post\" action=\"vendedor.jsp\">\n");
      out.write("                    <input type=\"submit\" value=\"Atras\" id=\"guardar\">\n");
      out.write("\n");
      out.write("                    <form method=\"post\" action=\"Sesiones\" >\n");
      out.write("                        <input type=\"submit\" value=\"Cerrar Sesión\" id=\"guardar\">\n");
      out.write("                    </form>\n");
      out.write("                </form>\n");
      out.write("        </h1></b><br>\n");
      out.write("\n");
      out.write("    <form method=\"post\" action=\"Vehiculo\">\n");
      out.write("        <center>\n");
      out.write("\n");
      out.write("            <label>PLACA VEHÍCULO</label>\n");
      out.write("            <input type=\"text\" name=\"textPlaca\">\n");
      out.write("            <button id=\"guardar\">Consultar</button>\n");
      out.write("\n");
      out.write("            <br><br>\n");
      out.write("            <input type=\"hidden\" value=\"4\" name=\"opcion\" >\n");
      out.write("            </form><br>\n");
      out.write("\n");
      out.write("            ");
                if (request.getAttribute("mensajeError") != null) { 
      out.write("\n");
      out.write("            <h5>\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \n");
      out.write("            </h5>\n");
      out.write("\n");
      out.write("            ");
} else {
      out.write("\n");
      out.write("            <h5>\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("            </h5>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </body>\n");
      out.write("            </html>\n");
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
