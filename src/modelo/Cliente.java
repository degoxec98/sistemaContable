/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author DIEGO
 */
public class Cliente extends Persona{
    
    private boolean estadoCliente;
    
    public Cliente(){}

    public Cliente(boolean estadoCliente, String idPersona, String tipoDocIdentidad, String docIdentidad, String nombres, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono, String email, String sexo, Date fechaNacimiento) {
        super(idPersona, tipoDocIdentidad, docIdentidad, nombres, apellidoPaterno, apellidoMaterno, direccion, telefono, email, sexo, fechaNacimiento);
        this.estadoCliente = estadoCliente;
    }

    public boolean isEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(boolean estadoCliente) {
        this.estadoCliente = estadoCliente;
    }
    
    
    
    
}
