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
        <link rel="shortcut icon" type="image/x-icon" href="Imagenes/logo.png">
                <link rel="stylesheet" href="Estilos/css/style.css">

        <title>Registrar Usuario</title>
    </head>
    <body>
        
         <div id="div">  
    <center>
        <h1><b>Registrar Usuario</h1></b><br>
        <form method="post" action="Usuario" id="dos">
 
            <label><span  class="icon-cloud1">Usuario<br></label><br></span>
                <input type="text" name="txtUsuario"required><br>
                <label><span class="icon-music">Contraseña<br></label><br></span>
                <input type="password" name="txtClave" required><br>
            <br>
            <button id="guardar">Registrarse</button>
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
        
         <a href="index.jsp">¿Ya tienes una cuenta? Inicia Sesión aquí</a>

    </center>
         </div>
</body>
</html>
