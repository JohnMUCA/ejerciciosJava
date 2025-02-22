/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

import java.util.Scanner;

/**
 * Leer 15 números negativos y convertirlos a positivos e imprimir dichos números.
 * @author JOHN
 */
public class e2_7 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Iniciar scanner
        
        Scanner scanner = new Scanner(System.in);
        
        //Declarar variables
        
        int num;
        
        //Declarar constantes
        
        final int CANTIDAD_NUMEROS = 5;
        
        for (int i = 0; i < CANTIDAD_NUMEROS; i++){
            System.out.println("Ingrese el numero #" + (i+1) + ": ");
            num = scanner.nextInt();
            System.out.println("El numero positivo es: " + (num * -1));
            
        }
        
    }
    
}
