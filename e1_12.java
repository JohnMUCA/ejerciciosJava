/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

import java.util.Scanner;

/**
 *  Solicitar al usuario una fecha (dd:mm:aaaa) y comprobar si es correcta. Para que una fecha sea correcta es necesario: 
 * • El año debe ser mayor que cero. 
 * • El mes debe estar entre 1 y 12. 
 * • Dependiendo del mes que sea, el día debe estar dentro de los límites válidos. Los meses que tienen 31 días 
 * son 1, 3, 5, 7, 8, 10 y 12. Los meses de 30 días son 4, 6, 9 y 11. El mes de 28 días es 2, excepto en un año 
 * bisiesto que es 29 días.
 * @author JOHN
 */
public class e1_12 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Inicialización scanner y banderaBisiesto
        
        Scanner scanner = new Scanner(System.in);
        boolean banderaBisiesto = false;
        
        //Recibir fecha
        
        System.out.println("Introduce el dia: ");
        short dia = scanner.nextShort();
        
        System.out.println("Introduce el mes: ");
        short mes = scanner.nextShort();
        
        System.out.println("Introduce el año: ");
        short year = scanner.nextShort();
        
        scanner.close();
        
        //validar si es un año bisiesto
        
        if ((year % 100 != 0) && (year % 4 == 0)){
            banderaBisiesto = true;
        }
        else banderaBisiesto = (year % 100 == 0) && (year % 400 == 0);
        
        //Validar fecha

        boolean validYear = year > 0;
        boolean validMonth = (0 < mes) && (mes < 13);
        boolean valid30Day = ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) && (0 < dia && dia < 31) ; // Los meses de 30 días son 4, 6, 9 y 11
        boolean valid31Day = ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 10) || (mes == 12)) && (0 < dia && dia < 32); //Los meses de 31 días son 1, 3, 5, 7, 8, 10 y 12
        boolean valid28Day = (mes == 2) && (0 < dia && dia < 29 && !banderaBisiesto);
        boolean valid29Day = (mes == 2) && (0 < dia && dia < 30) && banderaBisiesto;
        boolean validDay = valid30Day || valid31Day || valid28Day || valid29Day;
        
        if (validYear && validMonth && validDay){
            System.out.println("La fecha ingresada es valida.");
        }
        else{
            System.out.println("La fecha ingresada no es valida.");
        }
    }
}
