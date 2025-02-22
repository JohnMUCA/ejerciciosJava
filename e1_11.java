/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

import java.util.Scanner;

/**
 * Solicitar al usuario la inicial del día de la semana y mostrar el nombre del día completo. 
 * La letra inicial puede ser mayúscula o minúscula. Usar la x para el miércoles.
 * @author JOHN
 */
public class e1_11 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Iniciar el scanner
        
        Scanner scanner = new Scanner(System.in);
        
        //Pedir el dia de la semana al usuario
        System.out.println("Ingrese la inicial del dia de la semana(x para miercoles): ");
        char inicialDia = scanner.nextLine().toLowerCase().charAt(0);
        
        scanner.close();
        //Imprimir el dia ingresado
        
        switch (inicialDia){
        
            case 'l' -> System.out.println("El dia es lunes");
            case 'm' -> System.out.println("El dia es martes");
            case 'x' -> System.out.println("El dia es miercoles");
            case 'j' -> System.out.println("El dia es jueves");
            case 'v' -> System.out.println("El dia es viernes");
            default -> System.out.println("dia invalido.");
        }
        
    }
}
