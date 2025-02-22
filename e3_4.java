/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

/**
 * Crear una funci�n llamada "rotulo", que tome como par�metro una cadena de texto, 
 * no devuelva ning�n valor, y escriba en pantalla ese texto centrado 
 * (suponiendo una anchura de pantalla de 80 letras) y en la l�nea siguiente escriba guiones 
 * para que el r�tulo parezca subrayado (tantos guiones como letras formen la palabra). 
 * @author JOHN
 */
public class e3_4 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String cadena = "Hola";
        
        rotulo(cadena);
    }
    
    private static void rotulo(String cadena){
    
        //Tama�o caracteres pantalla
        
        final short SCREEN_SIZE = 80;
        
        for (short i = 0; i < SCREEN_SIZE; i++){
            if ( (SCREEN_SIZE / 2 - cadena.length() / 2) < i && i < (SCREEN_SIZE / 2 - cadena.length() / 2) + cadena.length() ){
                System.out.print(cadena.charAt(i - SCREEN_SIZE / 2));
            }
            else System.out.print(" ");
        }
        
    }
    
    
}
