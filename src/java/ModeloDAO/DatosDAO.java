/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.DatosVO;
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
 * @author karen_b
 */
public class DatosDAO extends ConexionBD {
    //Declarar variables y/o objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;
    private boolean operacion = false;
    private String sql;

    
    private String datId = "", usuId = "", datNombre = "", datApellido = "", datTipoId = "", datNumeroId = "", daTelefono = "", datCorreo = "";

    public DatosDAO() {
    }
    
    
      public DatosDAO(DatosVO datVO) {
        super();
        try {
            conexion = this.obtenerConexion();

            //2.2  Traigo los datos del VO
            datId = datVO.getDatId();
            usuId = datVO.getUsuId();
            datNombre = datVO.getDatNombre();
            datApellido = datVO.getDatApellido();
            datTipoId = datVO.getDatTipoId();
            datNumeroId = datVO.getDatNumeroId();
            daTelefono = datVO.getDaTelefono();
            datCorreo = datVO.getDatCorreo();
        } catch (Exception e) {
            Logger.getLogger(DatosDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
      
      
     public ArrayList<DatosVO> listar(String datId) {
        ArrayList<DatosVO> listaDatos = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            //seleccionar segun el id del usuario que este en sesion (solo puede ser un  usuario con Rol de vendedor)
            sql="SELECT * FROM datospersonales WHERE datospersonales.DATID=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, datId);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                DatosVO datVO = new DatosVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3),
                        mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8));

                listaDatos.add(datVO);
            }
        } catch (SQLException e) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            //Sentencia para que independientemnte de lo que pase haga eso
            try {

                this.cerrarConexion();
            } catch (SQLException e) {

                Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return listaDatos;

    }
      
public DatosVO consultarDatos(String datId) {
        DatosVO datVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "SELECT * FROM datospersonales INNER JOIN vehiculo ON vehiculo.DATID = datospersonales.DATID WHERE datospersonales.DATID=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, datId);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                datVO = new DatosVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3),
                        mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8));
            }

        } catch (SQLException e) {
            Logger.getLogger(DatosDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            //Sentencia para que independientemnte de lo que pase haga eso
            try {

                this.cerrarConexion();
            } catch (SQLException e) {

                Logger.getLogger(DatosDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return datVO;

    }
      
}
