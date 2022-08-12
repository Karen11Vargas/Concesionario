<%-- 
    Document   : sesiones
    Created on : 15/06/2022, 09:07:42 AM
    Author     : SENA
--%>

<%@page import="ModeloVO.DatosVO"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Estilos/css/bootstrap.min.css">
        <link rel="shortcut icon" type="image/x-icon" href="Imagenes/logo.png">
        <link rel="stylesheet" href="Estilos/css/style.css">
        <title>Sesiones</title>
    </head>

    <%
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
        response.setDateHeader("Expires", 0);
    %>

    <%
        HttpSession miSesion = (HttpSession) request.getSession();
        String usuario = "";
        if (miSesion.getAttribute("datosUsuario") == null) {
            request.getRequestDispatcher("index.jsp").forward(request, response);

        } else {
            UsuarioVO usuVO = (UsuarioVO) miSesion.getAttribute("datosUsuario");
            usuario = usuVO.getUsuLogin();

        }

    %>
    
   

    <body>
        
      
  
        
    </body>
</html>
