/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

import java.util.Scanner;
/**
 * Determinar en que estado est� el agua en funci�n de su temperatura. Si es negativa el estado ser� s�lido, 
 * si es menor que 100 ser� l�quido y si es mayor que 100 ser� gas. Pedir al usuario el valor de la 
 * temperatura. 
 * @author JOHN
 */
public class e1_7 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Iniciar scanner
        
        Scanner scanner = new Scanner(System.in);
        
        
        //Pedir temperatura al usuario
        
        System.out.println("Ingrese la temperatura del agua en grados celcius: ");
        float temperatura = scanner.nextFloat();
        
        //Verificar el estado del agua
        
        if (temperatura < 0.0){
            System.out.println("El agua esta en estado s�lido");
        }
        else if(temperatura < 100.0){
            System.out.println("El agua esta en estado l�quido");
        }
        else{
            System.out.println("El agua esta en estado gaseoso");
        }
        
    }
}

