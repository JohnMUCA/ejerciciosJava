/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;
import java.util.Scanner;

/**
 * Dada la fecha de hoy, calcular la fecha del día siguiente. Suponer que el año no es bisiesto. 
 * @author JOHN
 */
public class e1_9 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Iniciar el scanner
        
        Scanner scanner = new Scanner(System.in);
        
        //Pedir fecha del día a consultar
        
        
        System.out.println("Ingrese el día: ");
        short dia = scanner.nextShort();
        
        System.out.println("Ingrese el mes: ");
        short mes = scanner.nextShort();
        
        System.out.println("Ingrese el año: ");
        short year = scanner.nextShort();
        
        scanner.close();
        
        //Calcular fecha día siguiente
        
        dia += 1;
        
        if ((mes ==  1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 ||mes == 12) && (dia > 31)){
            dia -= 31;
            mes += 1;
        }
        else if ((mes ==  4 || mes == 6 || mes == 9 || mes == 11) && (dia > 30)){
            dia -= 30;
            mes += 1;        
        }
        
        //Teniendo encuenta que no es un año bisiesto 
        else if ((mes == 2) && (dia > 28)){
            dia -= 28;
            mes += 1;
        }
        
        if (mes > 12){
            mes -= 12;
            year += 1;
        }
        
        //Se imprime la fecha dle día siguiente
        
        System.out.println(dia + "/" + mes + "/" + year);
        
    }
}
