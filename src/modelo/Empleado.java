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
public class Empleado extends Persona{
    
    private boolean estadoEmpleado;
    
    public Empleado(){}

    public Empleado(boolean estadoEmpleado, String idPersona, String tipoDocIdentidad, String docIdentidad, String nombres, String apellidoPaterno, String apellidoMaterno, String direccion, String telefono, String email, String sexo, Date fechaNacimiento) {
        super(idPersona, tipoDocIdentidad, docIdentidad, nombres, apellidoPaterno, apellidoMaterno, direccion, telefono, email, sexo, fechaNacimiento);
        this.estadoEmpleado = estadoEmpleado;
    }

    public boolean isEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(boolean estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }
    
}
