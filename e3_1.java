/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

/**
 * Crear una funci�n llamada "suma", que reciba como par�metros dos n�meros enteros
 * y devuelva como resultado otro n�mero entero que sea la suma de ambos. 
 * @author JOHN
 */
public class e3_1 {
    
    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) {
        
        //Declarar varibles 
        
        int num1 = 5; 
        int num2 = 36;
        
        System.out.println(sumar(num1, num2));
        
    }
    
    
    
    
    private static int sumar(int a, int b){
        return a + b;
    }
}
