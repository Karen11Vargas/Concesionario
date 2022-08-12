/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.CategoriaVO;
import Util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SENA
 */
public class CategoriaDAO extends ConexionBD {

    //Declarar variables y/o objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    private String sql;

    //Metodo para LISTAR
    public ArrayList<CategoriaVO> listar() {

        //Crear Array, nombre del objeto + nombre del array 
        ArrayList<CategoriaVO> listaCategoria = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "SELECT * FROM categoria";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                CategoriaVO catVO = new CategoriaVO(mensajero.getString("CATID"), mensajero.getString("CATIPO"));
                listaCategoria.add(catVO);
            }

        } catch (SQLException e) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            //Sentencia para que independientemnte de lo que pase haga eso
            try {

                this.cerrarConexion();
            } catch (SQLException e) {

                Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return listaCategoria;

    }

}
