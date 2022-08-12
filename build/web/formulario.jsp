<%-- 
    Document   : formulario
    Created on : 27/06/2022, 11:27:15 PM
    Author     : karen_b
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>JSP Page</title>
    </head>
    <body>
        <h1>Envio de Correo con JAVA MAIL</h1>
        
        <form method="post" action="DatosMail">
            <table>
                <tr>
                    <td>Destino: </td>
                    <td><input type="text" name="textCorreo"></td>
                </tr>
                
                <tr>
                    <td>Asunto: </td>
                    <td><input type="text" name="textAsunto"></td>
                </tr>
                
                <tr>
                    <td>Mensaje: </td>
                    <td><textarea rows="6" name="textMensaje"></textarea></td>
                </tr>
                
                <td><input type="submit" value="Enviar"></td>
            </table>
            
        </form>
    </body>
</html>

