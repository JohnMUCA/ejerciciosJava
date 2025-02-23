/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

/**
 * Crear una función llamada "rotulo", que tome como parámetro una cadena de texto, 
 * no devuelva ningún valor, y escriba en pantalla ese texto centrado 
 * (suponiendo una anchura de pantalla de 80 letras) y en la línea siguiente escriba guiones 
 * para que el rótulo parezca subrayado (tantos guiones como letras formen la palabra). 
 * @author JOHN
 */
public class e3_4 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String cadena = "Como te ves de linda concentrada.";
        
        rotulo(cadena);
    }
    
    private static void rotulo(String cadena){
    
        //Tamaño caracteres pantalla
        
        final short SCREEN_SIZE = 80;
        
        int espacios = (SCREEN_SIZE - cadena.length()) / 2;
        
        for (int i = 0; i < espacios; i++){
            System.out.print(" ");
        }
        
        System.out.println(cadena);
        
        for (int j = 0; j < espacios; j++){
            System.out.print(" ");
        }
        
        for (int k = 0; k < cadena.length(); k++){
            System.out.print("_");
        }
        
        System.out.println("\n\n");
        
        
    }
    
    
}
