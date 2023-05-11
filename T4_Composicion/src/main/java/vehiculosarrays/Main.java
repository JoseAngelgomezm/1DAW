/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculosarrays;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose Angel
 */
public class Main {

    public static void main(String[] args) {
        // Se debe poder interaccionar con la aplicación mediante un menú donde se puedan 
        //dar de alta clientes y vehículos
        // y también se deben poder realizar alquileres, solicitando datos por teclado al usuario
        Scanner teclado = new Scanner (System.in);
        int opcion;// recoge la opcion del menu
        //creacion de la empresa
        Empresa miEmpresa = new Empresa("232455", "miEmpresa");
        System.out.println("Empresa: " + miEmpresa.getNombre() + " CIF: " + miEmpresa.getCif());

        // ejecutar el programa hasta pulsar salir
        do {
            // muestra las opciones del menu
            opcion = menu();

            // segun la opcion hacer una cosa
            switch (opcion) {
                // si la opcion es 1
                case 1 -> {
                    // pedir los datos del cliente y guardarlos en un cliente
                    Clientes nuevoCliente = pedirDatosCliente();
                    // añadir el cliente a la empresa
                    // si el cliente no existe en la empresa
                    if (miEmpresa.getCatalogoClientes().buscarCliente(nuevoCliente.getNIF()) == null) {
                        // añadirlo
                        miEmpresa.añadirCliente(nuevoCliente);
                    }
                    // mostrar catalogoClientes
                    System.out.println(miEmpresa.getCatalogoClientes());
                }
                case 2 -> {
                    // pedir los datos del vehiculo y guardarlos en un vehiculo
                    Vehiculo nuevoVehiculo = pedirDatosVehiculo();
                    // añadir el vehiculo a la empresa
                    // si el vehiculo no existe en la empresa
                    if (miEmpresa.getCatalogoVehiculo().buscarVehiculo(nuevoVehiculo.getBastidor()) == null) {
                        // añadirlo
                        miEmpresa.añadirVehiculo(nuevoVehiculo);
                    }
                    // mostrar catalogoVehiculos
                    System.out.println(miEmpresa.getCatalogoVehiculo());
                }
                case 3 -> {
                    // realizar un alquiler
                    // mostrar los datos de los vehiculos
                    System.out.println(miEmpresa.getCatalogoVehiculo());
                    System.out.println("------------------------------");
                    // mostrar los datos de los clientes
                    System.out.println(miEmpresa.getCatalogoClientes());
                    System.out.println("------------------------------");
                    
                    System.out.println("Introduce el NIF de un cliente");
                    String NIF = teclado.nextLine();
                    System.out.println("Introduce el bastidor de un vehiculo");
                    String bastidor = teclado.nextLine();
                    // si el cliente existe
                    if ( miEmpresa.buscarCliente(NIF) != null) {
                        // guardar el cliente
                        Clientes clienteEncontrado = miEmpresa.buscarCliente(NIF);
                        // comprobar el vehiculo
                        if (miEmpresa.buscarVehiculo(bastidor) != null) {
                            // si ambos existen guardar el vehiculo
                            Vehiculo vehiculoEncontrado = miEmpresa.buscarVehiculo(bastidor);
                            // si el vehiculo encontrado tiene la disponibilidad a true
                            if (vehiculoEncontrado.isDisponible() == true) {
                                // registrar el alquiler
                                Alquiler nuevoAlquier = new Alquiler(clienteEncontrado, vehiculoEncontrado, LocalDate.now());
                                miEmpresa.registrarAlquiler(nuevoAlquier);
                            }
                        }
                    }
                    // mostrar los alquileres 
                    System.out.println(miEmpresa.getCatalogoAlquiler());
                   
                }
                case 4 -> {
                    System.out.println("Has elegido salir");
                }

            }
        } while (opcion != 4);

    }

    // metodo que muestra el menu y recoge la opcion
    private static int menu() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            String menu = """
                      1- dar de alta a un cliente
                      2- dar de alta a un vehiculo
                      3- realizar un alquiler
                      4- salir
                      """;

            System.out.println(menu);
            // control excepcion
            try {
                opcion = teclado.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Introduce una opcion valida");
                //limpìar buffer
                teclado.nextLine();
            }
            // mientras la opcion no este entre 1 y 3 se repite
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }

    // metodo que pide por teclado los datos de un cliente lo crea y lo devuelve
    private static Clientes pedirDatosCliente() {
        String nombre;
        String apellidos;
        String NIF;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre para el cliente nuevo: ");
        nombre = teclado.nextLine();
        System.out.println("Introduce un apellido para el cliente nuevo: ");
        apellidos = teclado.nextLine();
        System.out.println("Introduce un NIF para el cliente nuevo: ");
        NIF = teclado.nextLine();
        // constructor de cliente nuevo
        Clientes nuevoCliente = new Clientes(nombre, apellidos, NIF);
        return nuevoCliente;
    }

    // metodo que pide por teclado los datos de un vehiculo lo crea y lo devuelve
    private static Vehiculo pedirDatosVehiculo() {
        String bastidor;
        String matricula;
        int color = 0;
        int modelo = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un bastidor para el coche nuevo: ");
        bastidor = teclado.nextLine();
        System.out.println("Introduce una matricula para el coche nuevo: ");
        matricula = teclado.nextLine();
        // para los enum, introducimos un numero para seleccionar el color
        // controlando que el numero no sea distinto de las opciones permitidas
        // ni se recoga un tipo de dato no permitido
        do {
            System.out.println("Introduce un color para el coche nuevo: 1-ROJO, 2-NEGRO, 3-AMARILLO, 4-VERDE, 5-AZUL, 6-BLANCO;");
            try {
                color = teclado.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Intorduce un valor valido del 1 al 6");
                // limpiar buffer
                teclado.nextLine();
            }
        } while (color < 1 || color > 6);

        // para el enum de modelo hacemos lo mismo que con el color
        do {
            System.out.println("Introduce un modelo para el coche nuevo: 1-Seat Panda 2-Ford Kuga 3-Cupra");
            try {
                modelo = teclado.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Intorduce un valor valido del 1 al 3");
                // limpiar buffer
                teclado.nextLine();
            }
        } while (modelo < 1 || modelo > 3);

        // constructor de vehiculo nuevo
        Vehiculo nuevoVehiculo = new Vehiculo(bastidor, matricula, Color.values()[color - 1]// el color es igual al valor menos 1 ya que el indice del enum empieza en 0
                ,
                 Modelo.values()[modelo - 1], 0);
        return nuevoVehiculo;
    }

    
   
}
