<%-- 
    Document   : consultarModelo
    Created on : 25/06/2022, 10:05:04 PM
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
        <title>Consultar Marca</title>
    </head>
    <body>
        <h1><b>  <span class="icon-car11">Consultar Vehículo</span>
                <form method="post" action="comprador.jsp">
                    <input type="submit" value="Atras" id="guardar">

                    <form method="post" action="Sesiones" >
                        <input type="submit" value="Cerrar Sesión" id="guardar">
                    </form>
                </form>
        </h1></b><br>

    <form method="post" action="Vehiculo">
        <center>

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
            </select><br> <br>
            <button id="guardar">Consultar</button>

            <br><br>
            <input type="hidden" value="5" name="opcion" >
            </form><br>

            <%                if (request.getAttribute("mensajeError") != null) { %>
            <h5>
                ${mensajeError} 
            </h5>

            <%} else {%>
            <h5>
                ${mensajeExito}

            </h5>
            <% }%>

            <%
                if (request.getAttribute("modeloConsultado") != null) {
                    VehiculoVO vehVO = (VehiculoVO) request.getAttribute("modeloConsultado");

            %>


            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="table-responsive">
                            <table  class="table users " >
                                <tr class="bg-primary">
                                    <th >PLACA</th>
                                    <th >DATOS</th>
                                    <th >CATEGORIA</th>
                                    <th >MODELO</th>
                                    <th>MARCA</th>
                                    <th>ESTADO</th>
                                    <th>PRECIO</th>


                                </tr>

                                <%                                   
                                    VehiculoDAO vehDAO = new VehiculoDAO();
                                    ArrayList<VehiculoVO> listaMarca = vehDAO.listarM(vehVO.getVehMarca());
                                    for (int i = 0; i < listaMarca.size(); i++) {
                                        vehVO = listaMarca.get(i);


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


                                    

                                </tr>
<%}%>
                            </table>
                        </div>
                    </div>
                </div>
            </div>


            <%}%>
            </body>
            </html>
