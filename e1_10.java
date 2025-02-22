/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

import java.util.Scanner;

/**
 * Pedir un mes (número) y mostrar el nombre del mes. 
 * @author JOHN
 */

public class e1_10 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Iniciar el scanner
        
        Scanner scanner = new Scanner(System.in);
        
        //Pedir el mes al usuario
        System.out.println("Ingrese el numero equivalente a un mes del año: ");
        short mes = scanner.nextShort();
        
        scanner.close();
        
        //Imprimir el mes ingresado
        
        switch (mes){
        
            case 1:
                System.out.println("El mes es Enero");
                break;
            case 2:
                System.out.println("El mes es Febrero");
                break;
            case 3:
                System.out.println("El mes es Marzo");
                break;
            case 4:
                System.out.println("El mes es Abril");
                break;
            case 5:
                System.out.println("El mes es Mayo");
                break;
            case 6:
                System.out.println("El mes es Junio");
                break;
            case 7:
                System.out.println("El mes es Julio");
                break;
            case 8:
                System.out.println("El mes es Agosto");
                break;
            case 9:
                System.out.println("El mes es Septiembre");
                break;
            case 10:
                System.out.println("El mes es Octubre");
                break;
            case 11:
                System.out.println("El mes es Noviembre");
                break;
            case 12:
                System.out.println("El mes es Diciembre");
                break;
            default:
                System.out.println("Mes invalido.");
        }
        
    }
    
}

