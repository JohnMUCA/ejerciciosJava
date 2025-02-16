/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

import java.util.Scanner;

/**
 *
 * @author JOHN
 */
public class e1_1 {
    /**
     * Escribir un programa que solicite un valor entero al usuario y determine si es par o impar.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Iniciacion scanner
        
        Scanner scanner = new Scanner(System.in);
        
        //variables
        System.out.println("Ingrese un numero entero: ");
        int num = scanner.nextInt();
        
        if (num % 2 == 0){
            System.out.print("El numero es par\n");
        }
        else {
            System.out.print("El numero es inpar\n");
        }
        
        scanner.close();
    }
    
}
