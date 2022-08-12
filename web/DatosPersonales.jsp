<%-- 
    Document   : DatosPersonales
    Created on : 28/06/2022, 12:20:36 AM
    Author     : karen_b
--%>

<%@page import="ModeloDAO.DatosDAO"%>
<%@page import="ModeloVO.DatosVO"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloDAO.VehiculoDAO"%>
<%@page import="ModeloVO.VehiculoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Estilos/css/bootstrap.min.css">

        <link rel="shortcut icon" type="image/x-icon" href="Imagenes/logo.png">
        <link rel="stylesheet" href="Estilos/css/style.css">
        <title>Datos Vendedor</title>
    </head>
    <body>
        <h1><b> <span class="icon-datos" >Datos Vendedor</span>

                <form method="post" action="Sesiones" >
                    <input type="submit" value="Cerrar Sesión" id="guardar">
                </form>
                </form>
        </h1></b><br>


    <%

        DatosVO datVO = new DatosVO();
        DatosDAO datDAO = new DatosDAO();

        datVO = (DatosVO) request.getAttribute("datosPersonales");

        if (datVO != null) {

    %>  

    <form>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="table-responsive">
                        <table  class="table users " >
                            <tr class="bg-primary">
                                <th >Nombre</th>
                                <th >Apellido</th>
                                <th >Tipo Documento</th>
                                <th >Numero Documento</th>
                                <th >Telefono</th>
                                <th>Correo</th>


                            </tr>



                            <tr >
                                <td><%=datVO.getDatNombre()%></td>
                                <td><%=datVO.getDatApellido()%></td>
                                <td><%=datVO.getDatTipoId()%></td>
                                <td><%=datVO.getDatNumeroId()%></td>
                                <td><%=datVO.getDaTelefono()%></td>
                                <td><%=datVO.getDatCorreo()%></td>



                            </tr>

                            <% }%>  
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </form>
</center>



</body>
</html>
