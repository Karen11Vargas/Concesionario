/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author SENA
 */
public interface Crud {
    
    //Definir metodos
    //Abstract: Que se pueden obtener esos valores o metodos despues
    //Manejar metodos bouleanos (true, false)
    
    public abstract boolean agregarRegistro();
    public abstract boolean actualizarRegistro();
    public abstract boolean eliminarRegistro();
    
}