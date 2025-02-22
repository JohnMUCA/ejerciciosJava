/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

import java.util.Scanner;

/**
 * Programa que lee las edades de un grupo de 100 alumnos y encuentra el promedio.
 * @author JOHN
 */

public class ej2_2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Iniciar Scanner
        
        Scanner scanner = new Scanner(System.in);
        
        //Iniciar variables
        
        float sumador = (float) 0.0;
        
        //Iniciar Constantes
        
        final int NUM_ESTUDIANTES = 100;
        
        
        
        //Se solicitan las edades
        
        for (int i = 1; i <= NUM_ESTUDIANTES; i++){
            System.out.println("Ingrese la edad del estudiante #" + i);
            sumador += scanner.nextFloat();
        }
        
        System.out.println("La edad promedio de los estudiantes es: ");
        System.out.println(sumador / (float) (NUM_ESTUDIANTES));
        
        scanner.close();
    }
}
