/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import vista.Ventana;

/**
 *
 * @author DIEGO
 */
public class Controlador {
    private Ventana ventana;
    
    
    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }
    
    public boolean iniciarSesion(String usuario, String contrasenia) {
        try {
            if (usuario.equals("afiliacion") && contrasenia.equals("123")){
                return true;
            }
            else if (usuario.equals("cobranzas") && contrasenia.equals("456")){
                return true;
            }
            else if (usuario.equals("superusuario") && contrasenia.equals("123456")){
                return true;
            } 
            else{
                JOptionPane.showMessageDialog(null,"ingrese correctamente los datos o el usuario ha sido deshabilitado");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"el usuario no esta registrado o los datos no son correctos");
            return false;
        }
    }
    
    public void cerrarSesion(){
        //this.conexion.desconectarBD(con);
    }
    
}
