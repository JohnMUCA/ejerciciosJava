/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

import java.util.Scanner;

/**
 * Pedir al usuario un valor. Si el valor es positivo, pedir un segundo valor y calcular la suma, 
 * resta y producto de ambos. Mostrar los resultados por pantalla.
 * @author JOHN
 */
public class e1_3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Iniciación Sccanner
        
        Scanner scanner = new Scanner(System.in);
        
        //--------------------------------------------
        System.out.println("Ingrese un numero entero: ");
        int num1 = scanner.nextInt();
        
        if (num1 > 0){
            System.out.println("Ingrese otro numero entero: ");
            int num2 = scanner.nextInt();
            System.out.println(num1 + " + " + num2 + " es: " + (num1 + num2));
            System.out.println(num1 + " - " + num2 + " es: " + (num1 - num2));
            System.out.println(num1 + " * " + num2 + " es: " + (num1 * num2));
            
        }
        
    }
    
}
