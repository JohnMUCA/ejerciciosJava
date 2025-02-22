/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;
import java.util.Scanner;

/**
 * Un año es bisiesto si es divisible por 4 y no es por 100, o si es divisible por 400. 
 * Escribe un programa que lea un año y devuelva si es bisiesto o no. 
 * @author JOHN
 */
public class e1_8 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Iniciar Scanner
        
        Scanner scanner = new Scanner(System.in);
        
        //Solicitar año al usuario
        
        System.out.println("Ingrese un año para saber si es bisiesto o no: ");
        int year = scanner.nextInt();
        
        scanner.close();
        
        //Verificar si es un año bisiesto
        
        if ((year % 100 != 0) && (year % 4 == 0)){
            System.out.println("Es un año bisiesto.");
        }
        else if((year % 100 == 0) && (year % 400 == 0)){
                System.out.println("Es un año bisiesto.");
        }
        else{
            System.out.println("No es un año bisiesto.");
        }
        
        
    }
}
