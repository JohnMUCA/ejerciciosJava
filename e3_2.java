/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

/**
 * Crear una funci�n llamada "division", que reciba como par�metros dos n�meros enteros
 * y devuelva como resultado un n�mero real, que sea el resultado de dividir 
 * el primer n�mero entre el segundo (con decimales).
 * @author JOHN
 */
public class e3_2 {
   
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Declarar variables
        
        float num1 = 86;
        float num2 = 21;
        
        System.out.println("El cociente de los dos numeros es: " + division(num1, num2));
        
    }
    
    private static float division(float dividendo, float divisor){
        return dividendo / divisor;
    }
    
}
