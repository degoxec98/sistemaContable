/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacontable;

import controlador.Controlador;
import vista.Ventana;

/**
 *
 * @author DIEGO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Controlador controlador = new Controlador();
        Ventana ventana = new Ventana(controlador);
        controlador.setVentana(ventana);
        ventana.setVisible(true);
    }
    
}
