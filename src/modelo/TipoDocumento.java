/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DIEGO
 */
public class TipoDocumento {
    
    private int idTipoDocumento;
    private String tipoDocIdentidad;
    
    public TipoDocumento(){}

    public TipoDocumento(int idTipoDocumento, String tipoDocIdentidad) {
        this.idTipoDocumento = idTipoDocumento;
        this.tipoDocIdentidad = tipoDocIdentidad;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getTipoDocIdentidad() {
        return tipoDocIdentidad;
    }

    public void setTipoDocIdentidad(String tipoDocIdentidad) {
        this.tipoDocIdentidad = tipoDocIdentidad;
    }
    
    
    
}
