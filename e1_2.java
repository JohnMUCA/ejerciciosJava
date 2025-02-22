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
public class e1_2 {
    /**
     * Escribir un programa que solicite un valor entero al usuario y determine si es positivo o negativo.  
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    //Iniciacion scanner
        
        Scanner scanner = new Scanner(System.in);
        
        //Se pide el numero al usuario
        System.out.println("Ingrese un numero entero: ");
        int num = scanner.nextInt();
        
        scanner.close();
        
        //Se verifica el signo
        
        if (num < 0){
            System.out.print("El numero es negativo\n");
        }
        else {
            System.out.print("El numero es positivo\n");
        }
        
        scanner.close();
    
    }
    
}
