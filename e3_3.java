/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

/**
 * Crear una función llamada "letraRepetida", que reciba como parámetros una letra y un número, 
 * y escriba en talla esa letra repetida en pantalla varias veces (tantas como indique el número), 
 * sin devolver ningún valor. 
 * @author JOHN
 */

public class e3_3 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        letraRepetida('i', (short) 10);
        
    }
    
    private static void letraRepetida(char letra, short numVeces){
        
        for (short i = 0; i < numVeces; i++){
            System.out.print(letra);
        }
        System.out.println();
        
    }
}
