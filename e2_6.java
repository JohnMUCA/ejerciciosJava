/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

import java.util.Scanner;

/**
 * Leer 20 números e imprimir cuantos son  positivos, cuantos negativos y cuantos neutros. 
 * @author JOHN
 */

public class e2_6 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Iniciar Scanner
        
        Scanner scanner = new Scanner(System.in);
        
        //Iniciar variables
        
        short contPositivos = 0;
        short contNegativos = 0;
        short contNeutros = 0;
        int numero;
        
        //Iniciar constantes
        
        final short CANTIDAD_NUMEROS = 20;
        
        for (short i = 0; i < CANTIDAD_NUMEROS; i++){
        
            System.out.println("Ingrese un número: ");
            numero = scanner.nextInt();
            
            if (numero < 0) contPositivos += 1;
            else if (numero > 0) contNegativos += 1;
            else contNeutros += 1;
        }
        
        System.out.println("La cantidad de numeros positivos es: " + contPositivos + "\n");
        System.out.println("La cantidad de numeros negativos es: " + contNegativos + "\n");
        System.out.println("La cantidad de numeros neutros es: " + contNeutros + "\n");
        
        scanner.close();
    }
}
