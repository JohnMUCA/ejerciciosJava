/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

import java.util.Scanner;

/**
 * Calcular el mayor de dos números enteros introducidos por teclado. 
 * @author JOHN
 */
public class e1_4 {
 /**
  * @param args the command line arguments
  */
    public static void main(String[] args) {
        
        //Inicializacion scanner
        
        Scanner scanner = new Scanner(System.in);
        
        //-----------------------------------------
        
        //Se piden los numeros al usuario
        System.out.println("Ingrese un numero: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingrese un numero: ");
        int num2 = scanner.nextInt();
        
        scanner.close();
        
        //se encuentra el numero mayor
        
        if (num1 > num2){
            System.out.println(num1 + " Es mayor que " + num2);
        }
        else if(num1 == num2){
            System.out.println("Los dos numeros son iguales");
        }
        else {
            System.out.println(num2 + " Es mayor que " + num1);
        }
        
    }
}
