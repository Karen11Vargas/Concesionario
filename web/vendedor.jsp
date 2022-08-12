<%-- 
    Document   : vendedor
    Created on : 27/06/2022, 08:26:37 PM
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
        <title>Vendedor</title>
    </head>


    <body>
        <h1><span class="icon-adjust"><b>Vendedor</span>
                <form method="post" action="Sesiones" >
                    <input type="submit" value="Cerrar Sesión" id="guardar">
                </form>
        </h1><b>
            <br>
            <center>
                

                <div>
                    <form method="post" action="registrarVehiculo.jsp">
                      <span class="icon-carro"> <input type="submit" value="Registrar Vehículo" ></span>
                    </form><br>
                    <form method="post" action="consultarVehiculo.jsp">
                       <span class="icon-accommodate"><input type="submit" value="Actualizar Vehículo"></span> 
                    </form><br>
     
                      <form method="post" action="listaVehiculos.jsp">
                    <span class="icon-adjust2"><input type="submit" value="Lista de Vehículos"></span>  
                    </form><br>

                </div>
            </center>

    </body>
</html>
