/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author SENA
 */
public class CategoriaVO {

    //Declarar variables
    private String catId, catIpo;
    
    //Constructor Vacio

    public CategoriaVO() {
    }

    //Constructor
    public CategoriaVO(String catId, String catIpo) {
        this.catId = catId;
        this.catIpo = catIpo;
    }
    //GETT AND SETTER

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getCatIpo() {
        return catIpo;
    }

    public void setCatIpo(String catIpo) {
        this.catIpo = catIpo;
    }

}
