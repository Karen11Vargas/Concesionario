<%-- 
    Document   : comprador
    Created on : 27/06/2022, 08:26:31 PM
    Author     : karen_b
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sesiones.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Estilos/css/bootstrap.min.css">
        <link rel="shortcut icon" type="image/x-icon" href="Imagenes/logo.png">
        <link rel="stylesheet" href="Estilos/css/style.css">
        <title>Comprador</title>
    </head>


    <body>
        <h1><span class="icon-adjust"><b>Comprador</span>
                <form method="post" action="Sesiones" >
                    <input type="submit" value="Cerrar Sesión" id="guardar">
                </form>
        </h1><b>
            <br>
            <center>
                

                <div>
                  
                       <form method="post" action="consultarModelo.jsp">
                        <span class="icon-car1"><input type="submit" value="Consultar Vehículo"></span>
                    </form><br>
                    
                      <form method="post" action="listaVehiculos1.jsp">
                    <span class="icon-adjust2"><input type="submit" value="Lista de Vehículos"></span>  
                    </form><br>

                </div>
            </center>

    </body>
</html>
