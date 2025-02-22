/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

import java.util.Scanner;

/**
 * Una institución educativa estableció un programa para estimular a los alumnos con buen rendimiento académico y 
 * que consiste en lo siguiente: 
 * 
 * • Si el promedio es de 9.5 o más y el alumno es de preparatoria, entonces este podrá cursar 55 unidades y se 
 * le hará un 25% de descuento. 
 * 
 * • Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de preparatoria, entonces este podrá 
 * cursar 50 unidades y se le hará un 10% de descuento. 
 * 
 * • Si el promedio es mayor que 7 y menor que 9 y el alumno es de preparatoria, este podrá cursar 50 unidades y 
 * no tendrá ningún descuento. 
 * 
 * • Si el promedio es de 7 o menor,  el numero de materias reprobadas es de 0 a 3 y el alumno es de 
 * preparatoria, entonces podrá cursar 45 unidades y no tendrá descuento. 
 * 
 * • Si el promedio es de 7 o menor, el numero de materias reprobadas es de 4 o mas y el alumno es de 
 * preparatoria, entonces podrá cursar 40 unidades y no tendrá ningún descuento. 
 * 
 * • Si el promedio es mayor o igual a 9.5 y el alumno es de profesional, entonces podrá cursar 55 unidades y se 
 * le hará un 20% de descuento. 
 * 
 * • Si el promedio es menor de 9.5 y el alumno es de profesional, entonces podrá cursar 55 unidades y no tendrá 
 * descuento. 
 * 
 * • Obtener el total que tendrá que pagar un alumno si la colegiatura para alumnos de profesional es de Bs. 300 
 * por cada cinco unidades y para alumnos de preparatoria es de Bs. 180 por cada cinco unidades.
 * @author JOHN
 */
public class e1_56 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //iniciar Scanner
        
        Scanner scanner = new Scanner(System.in);
        
        //Iniciar constantes
        
        final short PRECIO_UNIDAD_PROFESIONAL = 60;
        final short PRECIO_UNIDAD_PREPARATORIA = 36;
        
        float precioFinal = (float) 0.0;
        boolean banderaPago = false;
        
        //Pedir datos al usuario
        
        System.out.println("Ingrese el numero de unidades a matricular");
        short numUnidades = scanner.nextShort();
        
        System.out.println("Ingrese si es de\n(1)preparatoria\n(2)profesional: ");
        short alumnoDe = scanner.nextShort();
        scanner.nextLine();
        
        System.out.println("Ingrese el promedio: ");
        float promedio = scanner.nextFloat();
        
        if (alumnoDe == 1){
            
            if (promedio >= 9.5){
                if (numUnidades <= 55){
                    precioFinal = (float) (PRECIO_UNIDAD_PREPARATORIA * numUnidades * 0.75); //Se aplica el 25% de descuento al precio final
                    banderaPago = true;
                }
                else System.out.println("numero de unidades no permitido.");
            }
            else if (promedio >= 9.0 && promedio < 9.5){
                if (numUnidades <= 50){
                    precioFinal = (float) (PRECIO_UNIDAD_PREPARATORIA * numUnidades * 0.90); //Se aplica el 10% de descuento al precio final
                    banderaPago = true;
                }
                else System.out.println("numero de unidades no permitido.");
            }
            else if (promedio > 7.0 && promedio < 9.0){
                if (numUnidades <= 50){
                    precioFinal = (float) (PRECIO_UNIDAD_PREPARATORIA * numUnidades); //No se aplica descuento al precio final
                    banderaPago = true;
                }
                else System.out.println("numero de unidades no permitido.");
            }
            else if (promedio <= 7){
                System.out.println("Ingrese el numero de materias reprobadas: ");
                short materiasReprobadas = scanner.nextShort();
                
                if (materiasReprobadas > 0 && materiasReprobadas < 4){
                    if (numUnidades <= 45){
                    precioFinal = (float) (PRECIO_UNIDAD_PREPARATORIA * numUnidades); //No se aplica descuento al precio final
                    banderaPago = true;
                    }
                    else System.out.println("numero de unidades no permitido.");
                }
                else if(materiasReprobadas >= 4){
                    if (numUnidades <= 40){
                    precioFinal = (float) (PRECIO_UNIDAD_PREPARATORIA * numUnidades); //No se aplica descuento al precio final
                    banderaPago = true;
                    }
                    else System.out.println("numero de unidades no permitido.");
                }
            }  
            
            
        }
        else if (alumnoDe == 2){
            if (promedio >= 9.5){
                if (numUnidades <= 55){
                    precioFinal = (float) (PRECIO_UNIDAD_PREPARATORIA * numUnidades * 0.80); //Se aplica el 20% de descuento al precio final
                    banderaPago = true;
                }
                else System.out.println("numero de unidades no permitido.");
            }
            else if (promedio < 9.5){
                if (numUnidades <= 55){
                    precioFinal = (float) (PRECIO_UNIDAD_PREPARATORIA * numUnidades); //No se aplica descuento al precio final
                    banderaPago = true;
                }
                else System.out.println("numero de unidades no permitido.");
            }
        }
        else System.out.println("Opción invalida.");
        
        if (banderaPago) System.out.println("El valor a pagar es de: " + precioFinal + "Bs");
        
    }
}
