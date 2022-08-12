<%-- 
    Document   : menu.jsp
    Created on : 25/05/2022, 08:22:54 AM
    Author     : SENA
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Estilos/css/bootstrap.min.css">
        <link rel="shortcut icon" type="image/x-icon" href="Imagenes/logo.png">
        <link rel="stylesheet" href="Estilos/css/style.css">
        <title>Menú</title>
    </head>


    <body>
        <h1><span class="icon-adjust"><b>Menú </span>
                <form method="post" action="Sesiones" >
                    <input type="submit" value="Cerrar Sesión" id="guardar">
                </form>
        </h1><b>
            <br>
            <center>
                

                <div>
                    <form method="post" action="vendedor.jsp">
                      <span class="icon-atras"> <input type="submit" value="Vendedor" ></span>
                    </form><br>
                    <form method="post" action="comprador.jsp">
                       <span class="icon-cerrar"><input type="submit" value="Comprador"></span> 
                    </form><br>
                    
                    
                    
                </div>
            </center>

    </body>
</html>
