/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import JavaMail.ParametrosCorreo;
import ModeloDAO.RolDAO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.RolVO;
import ModeloVO.UsuarioVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SENA
 */
@WebServlet(name = "UsuarioControlador", urlPatterns = {"/Usuario"})
public class UsuarioControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        //Recoger o recibir datos de las vistas
        String usuid = request.getParameter("textId");
        String usulogin = request.getParameter("txtUsuario");
        String usupassword = request.getParameter("txtClave");
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //¿Quien tiene los datos de forma segura? -> VO
        //Se instancia la clase de Usuario VO
        UsuarioVO usuVO = new UsuarioVO(usuid, usulogin, usupassword);

        //¿Quien hace las operaciones? DAO
        //Se intancia la clase de DAO y se pone el parametro de la instancia del VO
        UsuarioDAO usuDAO = new UsuarioDAO(usuVO);

        String host;
        String puerto;
        String usuarioCorreo;
        String password;

        //Administrar operaciones
        switch (opcion) {

            case 1: //Metodo de agregar registro
                if (usuDAO.agregarRegistro()) {

                    request.setAttribute("mensajeExito", "El usuario se registro correctamente");

                    ServletContext context = getServletContext();

                    host = context.getInitParameter("host");
                    puerto = context.getInitParameter("puerto");
                    usuarioCorreo = context.getInitParameter("usuarioCorreo");
                    password = context.getInitParameter("password");

                    String receptor = request.getParameter("txtUsuario");
                    String asunto = "Correo de Registro";
                    String contenido = "¡BIENVEIDO! Usted se ha registrado correctamnete, gracias por usar nuestra pagina :)";
                    String resultadoMensaje = "";
                    try {
                        ParametrosCorreo.envioCorreo(host, puerto, usuarioCorreo, password, receptor, asunto, contenido);
                        resultadoMensaje = "El mensaje se envio de forma correcta";
                    } catch (Exception e) {

                        e.printStackTrace();
                        resultadoMensaje = "Error al enviar el mensaje " + e.getMessage();
                    } finally {

                        request.setAttribute("mensaje", resultadoMensaje);
                        getServletContext().getRequestDispatcher("/resultado.jsp");
                    }
                } else {
                    request.setAttribute("mensajeError", "El usuario NO se registro correctamente");
                }

                request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                break;

            case 2: //Metodo de actualizar 
                if (usuDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "El usuario se actulizo tamente");
                } else {
                    request.setAttribute("mensajeError", "El usuario NO se actualizo correctamente");
                }

                request.getRequestDispatcher("actualizarUsuario.jsp").forward(request, response);
                break;

            case 3: //Metodo de eliminar registro
                if (usuDAO.eliminarRegistro()) {

                    request.setAttribute("mensajeExito", "El usuario se elimino correctamente");
                } else {
                    request.setAttribute("mensajeError", "El usuario NO se elimino correctamente");
                }

                request.getRequestDispatcher("elimnarUsuario.jsp").forward(request, response);
                break;

            case 4: //Metodo de agregar registro

                if (usuDAO.iniciarSesion(usulogin, usupassword)) {

                    HttpSession miSesion = request.getSession(true);
                    usuVO = new UsuarioVO(usuid, usulogin, usupassword);
                    miSesion.setAttribute("datosUsuario", usuVO);

                    RolDAO rolDAO = new RolDAO();
                    RolVO rolVO = new RolVO();
                    ArrayList<RolVO> listaRoles = rolDAO.rol(usulogin);

                    for (int i = 0; i < listaRoles.size(); i++) {
                        rolVO = listaRoles.get(i);
                    }
                    String roltipo = rolVO.getRolTipo();

                    if (listaRoles.size() > 1) {

                        request.getRequestDispatcher("menu.jsp").forward(request, response);

                    }

                    if (roltipo.equals("Vendedor")) {

                        request.getRequestDispatcher("vendedor.jsp").forward(request, response);

                    } else if (roltipo.equals("Comprador")) {
                        request.getRequestDispatcher("comprador.jsp").forward(request, response);

                    }

                } else {
                    request.setAttribute("mensajeError", "Los datos de ingreso son incorrectos :(");

                    request.getRequestDispatcher("index.jsp").forward(request, response);

                }
                break;
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
