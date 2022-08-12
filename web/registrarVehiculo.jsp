<%-- 
    Document   : registrarUsuario
    Created on : 24/05/2022, 10:56:42 AM
    Author     : SENA
--%>

<%@page import="ModeloDAO.DatosDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloVO.CategoriaVO"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sesiones.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Estilos/css/bootstrap.min.css">
        <link rel="shortcut icon" type="image/x-icon" href="Imagenes/logo.png">
        <link rel="stylesheet" href="Estilos/css/style.css">
        <title>Registrar Vehículo</title>
    </head>
    <body>
    <center>
        <h1><b> <span class="icon-carro1"> Registrar Vehículo</span>

                <form method="post" action="vendedor.jsp">
                    <input type="submit" value="Atras" id="guardar">

                    <form method="post" action="Sesiones" >
                        <input type="submit" value="Cerrar Sesión" id="guardar">
                    </form>
                </form>

        </h1></b>


    <form method="post" action="Vehiculo" id="dos">


        <label>Placa Vehículo</label><br>
        <input type="text" name="textPlaca" required><br>
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
        <input type="text" name="txtModelo" required><br>
        <label> Marca Vehículo</label><br>
        <select name="txtMarca" required>
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
        <select name="txtEstado" required>
            <option>Usado</option>
            <option>Nuevo</option>
        </select><br>
        <label>Precio Vehículo</label><br>
        <input type="text" name="txtPrecio" required><br>
        <br>
        <button id="guardar">Registrar Vehículo</button>
        <input type="hidden" value="1" name="opcion">
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

</center>
</body>
</html>
