/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

/**
 *
 * @author JOHN
 */
public abstract class Persona {
    
    protected String cedula;
    protected String nombre_completo;
    protected String direccion;
    protected String telefono;
    
    public Persona(String cedula, String nombre_completo, String direccion, String telefono){
        this.cedula = cedula;
        this.nombre_completo = nombre_completo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + 
                ", nombre_completo=" + nombre_completo + 
                ", direccion=" + direccion + ", telefono=" + 
                telefono + '}';
    }
    
    
    
}
