/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.DatosDAO;
import ModeloDAO.VehiculoDAO;
import ModeloVO.DatosVO;
import ModeloVO.VehiculoVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SENA
 */
@WebServlet(name = "VehiculoControlador", urlPatterns = {"/Vehiculo"})
public class VehiculoControlador extends HttpServlet {

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
        String vehplaca = request.getParameter("textPlaca");
        String datid = request.getParameter("textDatid");
        String catid = request.getParameter("textCatid");
        String vehmodelo = request.getParameter("txtModelo");
        String vehmarca = request.getParameter("txtMarca");
        String vehestado = request.getParameter("txtEstado");
        String vehprecio = request.getParameter("txtPrecio");
        String datos = request.getParameter("datos");

        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //¿Quien tiene los datos de forma segura? -> VO
        VehiculoVO vehVO = new VehiculoVO(vehplaca, datid, catid, vehmodelo, vehmarca, vehestado, vehprecio);

        //Se intancia la clase de DAO y se pone el parametro de la instancia del VO
        VehiculoDAO vehDAO = new VehiculoDAO(vehVO);

        //Administrar operaciones
        switch (opcion) {

            case 1: //Metodo de agregar registro
                if (vehDAO.agregarRegistro()) {

                    request.setAttribute("mensajeExito", "El vehiculo se registro correctamente");
                } else {
                    request.setAttribute("mensajeError", "El vehiculo NO se registro correctamente");
                }

                request.getRequestDispatcher("registrarVehiculo.jsp").forward(request, response);
                break;

            case 2: //Metodo de actualizar 
                if (vehDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "El vehiculo se actulizo correctamente");
                } else {
                    request.setAttribute("mensajeError", "El vehiculo NO se actualizo correctamente");
                }

                request.getRequestDispatcher("consultarVehiculo.jsp").forward(request, response);
                break;

            case 3: //Metodo de eliminar registro
                if (vehDAO.eliminarRegistro()) {

                    request.setAttribute("mensajeExito", "El vehiculo se elimino correctamente");
                } else {
                    request.setAttribute("mensajeError", "El vehiculo NO se elimino correctamente");
                }

                request.getRequestDispatcher("eliminarVehiculo.jsp").forward(request, response);
                break;
            case 4: //Metodo de consultar vehiculo

                vehVO = vehDAO.consultarPlaca(vehplaca);

                if (vehVO != null) {

                    request.setAttribute("vehiculoConsultado", vehVO);
                    request.getRequestDispatcher("actualizarVehiculo.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "El vehiculo NO existe!");
                    request.getRequestDispatcher("consultarVehiculo.jsp").forward(request, response);

                }
                break;

            case 5: //Metodo de consultar vehiculo

                vehVO = vehDAO.consultarMarca(vehmarca);

                if (vehVO != null) {

                    request.setAttribute("modeloConsultado", vehVO);
                    request.getRequestDispatcher("consultarModelo.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "El modelo NO existe!");
                    request.getRequestDispatcher("consultarModelo.jsp").forward(request, response);

                }
                break;

            case 6:

                DatosVO datVO = new DatosVO();
                DatosDAO datDAO = new DatosDAO();

                datVO = datDAO.consultarDatos(datos);

                if (datVO != null) {
                    request.setAttribute("datosPersonales", datVO);
                    request.getRequestDispatcher("DatosPersonales.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "Los datos no se encontraron");
                    request.getRequestDispatcher("DatosPersonales.jsp").forward(request, response);
                }

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
