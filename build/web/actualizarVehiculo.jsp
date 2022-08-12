<%-- 
    Document   : actualizarVehiculo
    Created on : 7/06/2022, 11:03:06 AM
    Author     : SENA
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloVO.CategoriaVO"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
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
        <h1><b><span class="icon-accommodate1">Actualizar Vehículo</span>
        <form method="post" action="consultarVehiculo.jsp">
                    <input type="submit" value="Atras" id="guardar">

                    <form method="post" action="Sesiones" >
                        <input type="submit" value="Cerrar Sesión" id="guardar">
                    </form>
                </h1></b>


    <%
        if (request.getAttribute("vehiculoConsultado") != null) {
            VehiculoVO vehVO = (VehiculoVO)request.getAttribute("vehiculoConsultado");
        
    %>
    <center>
    <form method="post" action="Vehiculo" id="dos">


        <label>Placa Vehículo</label><br>
        <input type="text" name="textPlaca"  value="<%=vehVO.getVehPlaca()%>" readonly><br>
            <% 
                    RolVO rolVO = new RolVO();
                    RolDAO rolDAO = new RolDAO();
                    ArrayList<RolVO> listaRoles = rolDAO.rol(usuario);

                    for (int i = 0; i < listaRoles.size(); i++) {

                        rolVO = listaRoles.get(i);
                    }
                %>
                <input type="hidden" name="textDatid" value="<%=rolVO.getRolId()%>"><br>
     
       <label> Categoría</label> <br>
        <select name="textCatid" required>
            <option>Seleccionar</option>
            <%                CategoriaDAO catDAO = new CategoriaDAO();
                for (CategoriaVO catVO : catDAO.listar()) {
            %>

            <option value="<%=catVO.getCatId()%>"><%=catVO.getCatIpo()%></option>
            <%}%>

        </select><br>
        <label>Modelo Vehículo</label><br>
        <input type="text" name="txtModelo" value="<%=vehVO.getVehModelo()%>"><br>
        <label> Marca Vehículo</label><br>
        <select name="txtMarca"   value="<%=vehVO.getVehMarca()%>">
            <option>Ford</option>
            <option>Chevrolet</option>
            <option>Ferrari</option>
            <option>Honda</option>
            <option>Hyundai</option>
            <option>Isuzu</option>
            <option>Kia</option>
            <option>Mazda</option>
            <option>Mini</option>
            <option>Nissan</option>
            <option>Renault</option>
            <option>Volvo</option>
            <option>Mercedes</option>
        </select><br>
        <label> Estado Vehículo</label><br>
        <select name="txtEstado" value="<%=vehVO.getVehEstado()%>">
            <option>Usado</option>
            <option>Nuevo</option>
        </select><br>
        <label>Precio Vehículo</label><br>
        <input type="text" name="txtPrecio" value="<%=vehVO.getVehPrecio()%>"><br>
        <br>
        <button id="guardar">Actualizar</button>
        <input type="hidden" value="2" name="opcion">
    </form><br>
    
      <%
                if (request.getAttribute("mensajeError") != null) { %>
            <h5>
                ${mensajeError} 
            </h5>

            <%} else {%>
            <h5>
                ${mensajeExito}

            </h5>
            <% }%>
    
    <%}else{%>
    
    <h4>No ingreso ningun Vehículo</h4>
    <%}%>
    
  
    </center>
</body>
</html>
