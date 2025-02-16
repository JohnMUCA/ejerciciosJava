/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

import java.util.Scanner;

/**
 * Calcular el mayor de cuatro números enteros introducidos por teclado. 
 * @author JOHN
 */

public class e1_6 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Iniciar el Scanner
        
        Scanner scanner = new Scanner(System.in);
        
        //---------------------------------
        
        //Se piden los cuatro valores al usuario
        
        System.out.println("Ingrese un numero entero: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingrese otro numero entero: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Ingrese otro numero entero: ");
        int num3 = scanner.nextInt();
        
        System.out.println("Ingrese un ultimo numero entero: ");
        int num4 = scanner.nextInt();
        
        //Se verifica cual es el numero mayor
          
        
        if (num1 == num2 && num2 == num3 && num3 == num4){
            System.out.println("Todos son el mismo numero.");
        }
        else{
            int mayor = num1;
            
            if (num1 < num2){
                mayor = num2;
                
                if (mayor < num3){
                    mayor = num3;
                    
                    if (mayor < num4){
                    mayor = num4;
                    }
                }
                
            }
            else if (num1 < num3){
                mayor = num3;
                if (mayor < num4){
                    mayor = num4;
                }
                
            }
            else if (num1 < num4)
            {
                mayor = num4;
            }
            
            
        
        System.out.println("El numero mayor es: " + mayor);
        
        }
        
    }
}
