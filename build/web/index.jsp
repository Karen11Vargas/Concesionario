<%-- 
    Document   : registrarUsuario
    Created on : 24/05/2022, 10:56:42 AM
    Author     : SENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Estilos/css/bootstrap.min.css">
        <link rel="stylesheet" href="Estilos/css/style.css">

        <link rel="shortcut icon" type="image/x-icon" href="Imagenes/logo.png">

        <title>Iniciar Sesión</title>
    </head>
    <body>
        <h1><b>Iniciar Sesión</h1><br></b>


    <div id="div">  

        <center>
            <form method="post" action="Usuario" id="dos">
                <table>
                    <tr>
                    <label><span class="icon-cloud1"> Usuario </label><br></span>
                    <input type="text" name="txtUsuario" required><br>
                    <label><span class="icon-music"> Contraseña</label><br></span>
                    <input type="password" name="txtClave" required><br>
                    </tr>
                </table>
                <br>
                <button id="guardar">Iniciar</button>
                <input type="hidden" value="4" name="opcion">
            </form><br>


            <%
                if (request.getAttribute("mensajeError") != null) { %>
                <h5>
                    ${mensajeError} 
                </h5> 
            <%} else {%>
            ${mensajeExito}
            <% }%>
            <a href="registrarUsuario.jsp">¿Aún no tienes cuenta? Registrate aquí</a>

        </center>
    </div>
   
</body>
</html>
