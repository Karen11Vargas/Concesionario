/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SENA
 */
public class ConexionBD {
    
    //Declarar variables
    private String driver,userDB,passwordDB,dataBase,urlDB;
    
    //Objeto de elemento conexion, es el que almacena la conexion 
    private Connection conexion;
    
    //Constructor.
    
    public ConexionBD(){
        
        // Asignar valores
        driver="com.mysql.jdbc.Driver";
        userDB="root";
        passwordDB="";
        dataBase="concesionario";
        urlDB="jdbc:mysql://localhost:3306/"+dataBase;
        
        //Conectarse 
        //El try es una forma de controlar errores 
        try {
            
            //Creando nueva instancia del driver
            Class.forName(driver).newInstance();
            conexion=DriverManager.getConnection(urlDB, userDB, passwordDB);     
            System.out.println("Conexión ok!");
            
        } catch (Exception e) {
            
            System.out.println("Error al conectarse" + e.toString());
        }  
    }
    
    //Metodos tipo objeto ( para obtener la conexion y otro para cerrarla)
    public Connection obtenerConexion(){
        return conexion;
    }
    
    public Connection cerrarConexion() throws SQLException{
        conexion.close();
        conexion=null;
        return conexion;
    }
    
    public static void main(String[] args) {
        new ConexionBD();
    }
}
