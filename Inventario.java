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
public class Inventario {
    private ArrayList<Vehiculo> vehiculos;
    
    //Constructor
    
    public Inventario(){
        this.vehiculos = new ArrayList<>();
    }
    
    //Metodo para agregar vehiculo:
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    //Metodo para eliminar vehiculo
    public void eliminarVehiculo(Vehiculo vehiculo){
        vehiculos.remove(vehiculo);
    }
    
    public ArrayList<Vehiculo> getVehiculos(){
        return vehiculos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("? Inventario de Vehículos: \n");
        if (vehiculos.isEmpty()) {
            sb.append("\t? No hay vehículos en inventario.\n");
        } else {
            for (Vehiculo v : vehiculos) {
                sb.append("\t? ").append(v).append("\n");
            }
        }
        return sb.toString();
    }

    
}
