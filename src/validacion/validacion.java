
package validacion;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class validacion {

    public static void validarNumeros (KeyEvent tecla, String texto, int cantidad) {
        
        char t=tecla.getKeyChar();
        if(Character.isDigit(t) && texto.length()<cantidad){
            
        }else{
            tecla.consume();
        }
    }
    
    public static void validarTamaño(KeyEvent tecla, String texto, int cantidad){
        char t= tecla.getKeyChar();
        if (texto.length()<cantidad){
            
        }else{
            tecla.consume();
        }
    }
    
    public static void validarDescripcion(KeyEvent tecla, String texto, int cantidad){
        char t= tecla.getKeyChar();
        String letra = Character.toString(t);
        if ((Character.isLetter(t) || letra.equals(" ")) && texto.length()<cantidad){
            if(Character.isLowerCase(t)){
                tecla.setKeyChar(Character.toUpperCase(t));
            }
        }else{
            tecla.consume();
        }
    }
    
    public static void validarAlfaNumerico (KeyEvent tecla, String texto, int cantidad) {
        char t=tecla.getKeyChar();
        if(Character.isLetterOrDigit(t) && texto.length()<cantidad){
            if(Character.isLowerCase(t)){
                tecla.setKeyChar(Character.toUpperCase(t));
            }
        }else{
            tecla.consume();
        }
    }
    
    public static void validarCaracteres (KeyEvent tecla, String texto, int cantidad) {
        char t=tecla.getKeyChar();
        if(Character.isAlphabetic(t) && texto.length()<cantidad){
            if(Character.isLowerCase(t)){
                tecla.setKeyChar(Character.toUpperCase(t));
            }
        }else{
            tecla.consume();
        }
    }
    
    public static void validarCaracteresEspeciales (KeyEvent tecla, String texto, int cantidad) {
        char t=tecla.getKeyChar();
        String letra = Character.toString(t);
        if((Character.isLetterOrDigit(t)|| letra.equals(" ")|| letra.equals(".") || letra.equals("#") ) && texto.length()<cantidad){
            if(Character.isLowerCase(t)){
                tecla.setKeyChar(Character.toUpperCase(t));
            }
        }else{
            tecla.consume();
        }
    }
    
    public static boolean validarEmail(String email) {
        boolean respuesta = false;
        Pattern patron = Pattern.compile
        ("([A-Z0-9]+(\\.?[A-Z0-9])*)+@(([A-Z]+)\\.([A-Z]+))+");
        Matcher mather = patron.matcher(email);
        if (mather.find()) {
            respuesta = true;
        }
        return respuesta;
    }
    
    public static void validarEmail2(KeyEvent tecla, String texto, int cantidad) {
        char t=tecla.getKeyChar();
        String letra = Character.toString(t);
        if((Character.isLetterOrDigit(t)|| letra.equals("@")|| letra.equals("."))
                && texto.length()<cantidad){
            if(Character.isLowerCase(t)){
                tecla.setKeyChar(Character.toUpperCase(t));
            }
        }else{
            tecla.consume();
        }
    }
    
    public static boolean validarFecha(String fecha) {
        boolean respuesta = false;
        
        Pattern patron = Pattern.compile("([0-9]{4}-[0-9]{2}-[0-9]{2}");
        
        Matcher mather = patron.matcher(fecha);
 
        if (mather.find()) {
            respuesta = true;
        }
        
        return respuesta;
    }
    public static void validarContra(KeyEvent tecla, String texto, int cantidad) {
        char t=tecla.getKeyChar();
        String letra = Character.toString(t);
        if((Character.isLetterOrDigit(t) || letra.equals("_")|| letra.equals("-")
            || letra.equals("@")|| letra.equals(".")) && texto.length()<cantidad){
            if(Character.isLowerCase(t)){
                tecla.setKeyChar(Character.toUpperCase(t));
            }
        }else{
            tecla.consume();
        }
    }
}
