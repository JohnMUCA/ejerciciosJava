/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

import java.util.Scanner;

/**
 * Cajero Electrónico
 * @author JOHN
 */
public class cuentaBanco {
    
    /**
     * 
     *  @param args the command line arguments
     * 
     */
    
    //atributos clase
    
    private static double saldo = 1500000;
    
    
    public static void main(String[] args) {
        
        //Definir el nombre de usuario:
        
        String usuario = "John";
        menu(usuario);
        
    }
    
    //Metodos clase
    
    private static double getSaldo(){
        return saldo;
    }
    
    private static void setSaldo(double newSaldo){
        saldo = newSaldo;
    }
    
    private static void consultarSaldo(){
        System.out.println("Su saldo actual es de: $" + getSaldo());
    }
    
    private static void hacerRetiro(Scanner scanner){
        double monto;
        
        System.out.println("Ingrese el monto a retirar: $");
        monto = scanner.nextDouble();
        System.out.println();
        
        if (monto < getSaldo()){
            setSaldo(getSaldo() - monto);
            System.out.println("Retiro realizado con éxito.\nSu saldo actual es de: $" + getSaldo());
        }
        else System.out.println("El monto a retirar supera el saldo.");
    }
    
    private static void hacerConsignacion(Scanner scanner){
        double monto;
        
        System.out.println("Ingrese el monto a consignar: $");
        monto = scanner.nextDouble();
        System.out.println();
        
        setSaldo(getSaldo() + monto);
        System.out.println("Consignación realizada con éxito.\nSu saldo actual es de: $" + getSaldo());
    }
    
    //Meú-----------------------------------------------------------
    
    private static void menu(String usuario){
        
        short opcion = 0;
        
        //Iniciar Scanner
            
        Scanner scanner = new Scanner(System.in);
        
        while(opcion != 4){
            
            System.out.println("Hola Usuario" + usuario + "\n");
            System.out.println("¿Qué quieres hacer el día de hoy?\n");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Hacer Retiro");
            System.out.println("3. Hacer Consignación");
            System.out.println("4. Salir");
            opcion = scanner.nextShort();
            System.out.println();
            
            switch (opcion){
            
                case 1 -> consultarSaldo();
                case 2 -> hacerRetiro(scanner);
                case 3 -> hacerConsignacion(scanner);
                case 4 -> {
                }
                default -> System.out.println("Opción incorrecta.");
            }
            
        }
    }
    
    
}
