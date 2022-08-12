

<%-- 
    Document   : consultarVehiculo
    Created on : 31/05/2022, 11:11:40 AM
    Author     : SENA
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.VehiculoDAO"%>
<%@page import="ModeloVO.VehiculoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sesiones.jsp" %>

<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Estilos/css/bootstrap.min.css">
        <link rel="shortcut icon" type="image/x-icon" href="Imagenes/logo.png">
        <link rel="stylesheet" href="Estilos/css/style.css">
        <title>Actualizar Vehículo</title>
    </head>
    <body>
        <h1><b> <span class="icon-accommodate1">Actualizar Vehículo</span>
                <form method="post" action="vendedor.jsp">
                    <input type="submit" value="Atras" id="guardar">

                    <form method="post" action="Sesiones" >
                        <input type="submit" value="Cerrar Sesión" id="guardar">
                    </form>
                </form>
        </h1></b><br>

    <form method="post" action="Vehiculo">
        <center>

            <label>PLACA VEHÍCULO</label>
            <input type="text" name="textPlaca">
            <button id="guardar">Consultar</button>

            <br><br>
            <input type="hidden" value="4" name="opcion" >
            </form><br>

            <%                if (request.getAttribute("mensajeError") != null) { %>
            <h5>
                ${mensajeError} 
            </h5>

            <%} else {%>
            <h5>
                ${mensajeExito}

            </h5>
            <% }%>


            </body>
            </html>
