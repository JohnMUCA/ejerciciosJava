/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;
import java.util.Scanner;

/**
 * Un a�o es bisiesto si es divisible por 4 y no es por 100, o si es divisible por 400. 
 * Escribe un programa que lea un a�o y devuelva si es bisiesto o no. 
 * @author JOHN
 */
public class e1_8 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Iniciar Scanner
        
        Scanner scanner = new Scanner(System.in);
        
        //Solicitar a�o al usuario
        
        System.out.println("Ingrese un a�o para saber si es bisiesto o no: ");
        int year = scanner.nextInt();
        
        scanner.close();
        
        //Verificar si es un a�o bisiesto
        
        if ((year % 100 != 0) && (year % 4 == 0)){
            System.out.println("Es un a�o bisiesto.");
        }
        else if((year % 100 == 0) && (year % 400 == 0)){
                System.out.println("Es un a�o bisiesto.");
        }
        else{
            System.out.println("No es un a�o bisiesto.");
        }
        
        
    }
}
