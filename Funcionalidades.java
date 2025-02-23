/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprogramacion;

import java.util.Scanner;
/**
 *
 * @author JOHN
 */

public class Funcionalidades {

    private static Scanner scanner = new Scanner(System.in);
    private static Concesionario concesionario = new Concesionario();

    public static void mostrarMenu() {
        int opcion;
        do {
            System.out.println("----- Menú Concesionario -----");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Agregar Vendedor");
            System.out.println("3. Agregar Vehículo");
            System.out.println("4. Registrar Venta");
            System.out.println("5. Imprimir datos del Concesionario");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1 -> agregarCliente();
                case 2 -> agregarVendedor();
                case 3 -> agregarVehiculo();
                case 4 -> registrarVenta();
                case 5 -> imprimirConcesionario();
                case 6 -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 6);
        
        scanner.close();
    }

    private static void agregarCliente() {
        System.out.println("--- Agregar Cliente ---");
        System.out.print("Código: ");
        String codCliente = scanner.nextLine();
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        Cliente cliente = new Cliente(codCliente, cedula, nombre, direccion, telefono);
        concesionario.agregarCliente(cliente);
        System.out.println("Cliente agregado exitosamente.");
    }

    private static void agregarVendedor() {
        System.out.println("--- Agregar Vendedor ---");
        System.out.print("Código: ");
        String codVendedor = scanner.nextLine();
        System.out.print("Cédula: ");
        String cedulaV = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombreV = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionV = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoV = scanner.nextLine();
        Vendedor vendedor = new Vendedor(codVendedor, cedulaV, nombreV, direccionV, telefonoV);
        concesionario.agregarVendedor(vendedor);
        System.out.println("Vendedor agregado exitosamente.");
    }

    private static void agregarVehiculo() {
        System.out.println("--- Agregar Vehículo ---");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Año: ");
        int anio = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        Vehiculo vehiculo = new Vehiculo(marca, anio, modelo, precio);
        concesionario.agregarVehiculo(vehiculo);
        System.out.println("Vehículo agregado exitosamente.");
    }

    private static void registrarVenta() {
        System.out.println("--- Registrar Venta ---");

        if (concesionario.getVendedores().isEmpty()) {
            System.out.println("No hay vendedores registrados.");
            return;
        }
        System.out.println("Seleccione un Vendedor:");
        for (int i = 0; i < concesionario.getVendedores().size(); i++) {
            System.out.println(i + ": " + concesionario.getVendedores().get(i));
        }
        int indexVendedor = scanner.nextInt();
        scanner.nextLine();
        Vendedor vendedorVenta = concesionario.getVendedores().get(indexVendedor);

        if (concesionario.getClientes().isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        System.out.println("Seleccione un Cliente:");
        for (int i = 0; i < concesionario.getClientes().size(); i++) {
            System.out.println(i + ": " + concesionario.getClientes().get(i));
        }
        int indexCliente = scanner.nextInt();
        scanner.nextLine();
        Cliente clienteVenta = concesionario.getClientes().get(indexCliente);

        if (concesionario.getVehiculos().isEmpty()) {
            System.out.println("No hay vehículos en el inventario.");
            return;
        }
        System.out.println("Seleccione un Vehículo:");
        for (int i = 0; i < concesionario.getVehiculos().size(); i++) {
            System.out.println(i + ": " + concesionario.getVehiculos().get(i));
        }
        int indexVehiculo = scanner.nextInt();
        scanner.nextLine();
        Vehiculo vehiculoVenta = concesionario.getVehiculos().get(indexVehiculo);

        System.out.print("Ingrese la fecha de venta (YYYY-MM-DD): ");
        String fechaVenta = scanner.nextLine();

        concesionario.registrarVenta(vendedorVenta, clienteVenta, vehiculoVenta, fechaVenta);
        System.out.println("Venta registrada exitosamente.");
    }

    private static void imprimirConcesionario() {
        System.out.println("--- Datos del Concesionario ---");
        System.out.println(concesionario);
    }

}
