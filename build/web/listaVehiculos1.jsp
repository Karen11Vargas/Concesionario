<%-- 
    Document   : listaVehiculos1
    Created on : 27/06/2022, 11:48:42 PM
    Author     : karen_b
--%>

<%@page import="java.util.ArrayList"%>
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
        <title>Lista de Vehículos </title>
    </head>
    <h1><b> <span class="icon-adjust3">Lista de Vehículos </span>
            <form method="post" action="comprador.jsp">
                <input type="submit" value="Atras" id="guardar">

                <form method="post" action="Sesiones" >
                    <input type="submit" value="Cerrar Sesión" id="guardar">
                </form>
            </form>
    </h1></b><br>


<form method="post" action="Vehiculo">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="table-responsive">
                    <table  class="table users " >
                        <tr class="bg-primary">
                            <th >PLACA</th>
                            <th >DATOS</th>
                            <th >CATEGORÍA</th>
                            <th >MODELO</th>
                            <th>MARCA</th>
                            <th>ESTADO</th>
                            <th>PRECIO</th>
                            <th>DATOS VENDEDOR</th>


                        </tr>

                        <%

                            VehiculoVO vehVO = new VehiculoVO();
                            VehiculoDAO vehDAO = new VehiculoDAO();

                            ArrayList<VehiculoVO> listaVehiculos = vehDAO.listar();
                            for (int i = 0; i < listaVehiculos.size(); i++) {
                                vehVO = listaVehiculos.get(i);


                        %>  


                        <tr >
                            <td><%=vehVO.getVehPlaca()%></td>
                        <input type="hidden" value="6" name="opcion">

                        <td><%=vehVO.getDatId()%></td>
                        <td><%=vehVO.getCatId()%></td>
                        <td><%=vehVO.getVehModelo()%></td>
                        <td><%=vehVO.getVehMarca()%></td>
                        <td><%=vehVO.getVehEstado()%></td>
                        <td><%=vehVO.getVehPrecio()%></td>
                        <td><button  class="btn btn-warning"  name="datos" value="<%=vehVO.getDatId()%>">Consultar</button></td>



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
