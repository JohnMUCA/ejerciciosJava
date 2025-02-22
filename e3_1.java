/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

/**
 * Crear una función llamada "suma", que reciba como parámetros dos números enteros
 * y devuelva como resultado otro número entero que sea la suma de ambos. 
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
