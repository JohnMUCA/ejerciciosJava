/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

import java.util.ArrayList;

/**
 *
 * @author JOHN
 */
public class Concesionario {
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Venta> ventas;
    private Inventario inventario;

    public Concesionario() {
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.inventario = new Inventario();
    }
    
    
    
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    
    public void agregarVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }
    
    public ArrayList<Vendedor> getVendedores(){
        return vendedores;
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
        inventario.agregarVehiculo(vehiculo);
    }
    
    public void eliminarVehiculo(Vehiculo vehiculo){
        inventario.eliminarVehiculo(vehiculo);
    }
    
    public ArrayList<Vehiculo> getVehiculos(){
        return inventario.getVehiculos();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("? Concesionario:\n");

        sb.append("\n? Clientes:\n");
        if (clientes.isEmpty()) {
            sb.append("\t? No hay clientes registrados.\n");
        } else {
            for (Cliente c : clientes) {
                sb.append("\t").append(c).append("\n");
            }
        }

        sb.append("\n??? Vendedores:\n");
        if (vendedores.isEmpty()) {
            sb.append("\t? No hay vendedores registrados.\n");
        } else {
            for (Vendedor v : vendedores) {
                sb.append("\t").append(v).append("\n");
            }
        }

        sb.append("\n? Inventario:\n").append(inventario).append("\n");

        sb.append("\n? Ventas:\n");
        if (ventas.isEmpty()) {
            sb.append("\t? No hay ventas registradas.\n");
        } else {
            for (Venta venta : ventas) {
                sb.append("\t").append(venta).append("\n");
            }
        }

        return sb.toString();
    }

    
    //Gestion ventas
    
    public void registrarVenta(Vendedor vendedor, Cliente cliente, Vehiculo vehiculo, String fecha_venta){
        Venta venta = new Venta(vendedor, cliente, vehiculo, fecha_venta);
        ventas.add(venta);
    }
    
    public void imprimirVentas(){
        for (int i = 0; i < ventas.size(); i++){
            System.out.println(ventas.get(i));
        }
    }
    
    
    public static void main(String[] args) {
        
        Funcionalidades.mostrarMenu();
        
    }
}


