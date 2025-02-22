/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

/**
 * Realizar un programa que transforme todas las letras del alfabeto de mayúsculas a minúsculas.
 * @author JOHN
 */
public class e2_1 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //iniciar el alfabeto
        
        String alfabetoMin = "abcdefghijklmnopqrstuvxyz";
        String alfabetoMay = "";
        
        System.out.println(alfabetoMin);
        
        for (int i = 0; i < alfabetoMin.length(); i++) {
            alfabetoMay = alfabetoMay + alfabetoMin.toUpperCase().charAt(i);
        }
        
        System.out.println(alfabetoMay);
        
        
    }
}
