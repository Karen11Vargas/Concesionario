/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author karen_b
 */
public class DatosVO {
    
    private String datId, usuId, datNombre, datApellido, datTipoId, datNumeroId, daTelefono, datCorreo;
    
    
    public DatosVO() {
    }

    public DatosVO(String datId, String usuId, String datNombre, String datApellido, String datTipoId, String datNumeroId, String daTelefono, String datCorreo) {
        this.datId = datId;
        this.usuId = usuId;
        this.datNombre = datNombre;
        this.datApellido = datApellido;
        this.datTipoId = datTipoId;
        this.datNumeroId = datNumeroId;
        this.daTelefono = daTelefono;
        this.datCorreo = datCorreo;
    }
    

    public String getDatId() {
        return datId;
    }

    public void setDatId(String datId) {
        this.datId = datId;
    }

    public String getUsuId() {
        return usuId;
    }

    public void setUsuId(String usuId) {
        this.usuId = usuId;
    }

    public String getDatNombre() {
        return datNombre;
    }

    public void setDatNombre(String datNombre) {
        this.datNombre = datNombre;
    }

    public String getDatApellido() {
        return datApellido;
    }

    public void setDatApellido(String datApellido) {
        this.datApellido = datApellido;
    }

    public String getDatTipoId() {
        return datTipoId;
    }

    public void setDatTipoId(String datTipoId) {
        this.datTipoId = datTipoId;
    }

    public String getDatNumeroId() {
        return datNumeroId;
    }

    public void setDatNumeroId(String datNumeroId) {
        this.datNumeroId = datNumeroId;
    }

    public String getDaTelefono() {
        return daTelefono;
    }

    public void setDaTelefono(String daTelefono) {
        this.daTelefono = daTelefono;
    }

    public String getDatCorreo() {
        return datCorreo;
    }

    public void setDatCorreo(String datCorreo) {
        this.datCorreo = datCorreo;
    }

}
