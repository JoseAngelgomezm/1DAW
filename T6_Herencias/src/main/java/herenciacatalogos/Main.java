/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciacatalogos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
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
        Scanner teclado = new Scanner(System.in);
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
                    // si existe avisar al usuario
                    }else{
                        System.out.println("El cliente ya existe en la lista");
                    }
                    // mostrar catalogoClientes
                    System.out.println(miEmpresa.getCatalogoClientes());
                }
                case 2 -> {
                    // pedir los datos del vehiculo y guardarlos en un vehiculo
                    Vehiculo nuevoVehiculo = pedirDatosVehiculo();
                    // si el vehiculo no existe en la empresa
                     if (miEmpresa.getCatalogoVehiculo().buscarVehiculo(nuevoVehiculo.getBastidor()) == null) {
                        // añadirlo
                        miEmpresa.añadirVehiculo(nuevoVehiculo);
                    // si ya existe avisar al usuario
                    }else{
                        System.out.println("El vehiculo ya existe en la lista");
                    }
                    // añadir el vehiculo a la empresa
                    miEmpresa.añadirVehiculo(nuevoVehiculo);

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
                    // asginar el cliente 
                    Clientes clienteAlquiler = miEmpresa.buscarCliente(NIF);
                    // comprobar que el cliente y el vheiculo existen en la lista
                    // si no contiene el cliente que hemos introducido
                    if (miEmpresa.getCatalogoClientes().lista.contains(clienteAlquiler)) {
                        // si el cliente existe , se crea el vehiculo que vamos a buscar
                        Vehiculo vehiculoAlquiler = miEmpresa.buscarVehiculo(bastidor);
                        // y se comprueba que exista el vehiculo
                        if (miEmpresa.getCatalogoVehiculo().lista.contains(vehiculoAlquiler)) {
                            // si el vehiculo tambien existe, realizar el alquiler
                            // crear el alquiler con los datos pasados por teclado
                            Alquiler nuevoAlquiler = new Alquiler(clienteAlquiler, vehiculoAlquiler, LocalDate.now());
                            // añadir el alquiler a la empresa
                            miEmpresa.registrarAlquiler(nuevoAlquiler);
                            // mostrar los alquileres 
                            System.out.println(miEmpresa.getCatalogoAlquiler());
                        // si el vehiculo no existe informar al usuario
                        }else{
                             System.out.println("El vehiculo no existe");
                        }
                    // si el cliente no existe informar al usuario
                    } else{
                        System.out.println("El cliente no existe");
                    }
                }
                case 4 -> {
                    // pedir el nif del cliente que se quiere mostrar la lista
                    System.out.println("Introduce el NIF de un cliente");
                    String NIF = teclado.nextLine();
                    // crear un arrayList con los alquileres de ese cliente
                    ArrayList alquileresDeUnCliente = miEmpresa.alquileresDeUnCliente(NIF);
                    // mostrar arrayList
                    for (int i = 0; i < alquileresDeUnCliente.size(); i++) {
                        System.out.println(alquileresDeUnCliente.get(i));
                    }

                }
                case 5 -> {
                    // Pedir el bastidor del vehiculo que se quiere mostrar la lista
                    System.out.println("Introduce el bastidor de un vehiculo");
                    String bastidor = teclado.nextLine();
                    // crear un arrayList con los alquileres de ese vehiculo
                    ArrayList alquileresDeUnVehiculo = miEmpresa.alquileresDeUnVehiculo(bastidor);
                    // mostrar arrayList
                    for (int i = 0; i < alquileresDeUnVehiculo.size(); i++) {
                        System.out.println(alquileresDeUnVehiculo.get(i));
                    }
                }
                case 6 -> {
                    // mostrar alquileres
                    System.out.println("ALQUILERES:");
                    System.out.println(miEmpresa.getCatalogoAlquiler());
                    // pedir el id del alquiler que se quiere borrar
                    System.out.println("Introduce el ID de un alquiler a eliminar");
                    int id = teclado.nextInt();
                    // crear un alquiler con el id introducido anteriormente
                    Alquiler aux = new Alquiler();
                    aux.setAlquilerID(id);
                    // borrar el alquiler
                    miEmpresa.borrarAlquilerID(aux);
                    // mostrar alquileres
                    System.out.println("ALQUILERES:");
                    System.out.println(miEmpresa.getCatalogoAlquiler());
                }
                case 7 -> {
                    // mostrar los clientes
                    System.out.println("CLIENTES:");
                    System.out.println(miEmpresa.getCatalogoClientes());
                    // mostrar los alquileres
                    System.out.println("ALQUILERES:");
                    System.out.println(miEmpresa.getCatalogoAlquiler());
                    // pedir el nif del cliente que no tiene alquiler
                    System.out.println("Introduce el NIF de un CLIENTE que no tiene alquileres");
                    String nif = teclado.nextLine();
                    // borrar el cliente
                    miEmpresa.borrarClienteSinAlquiler(nif);
                    System.out.println("CLIENTES:");
                    // mostrar el catalogo de nuevo
                    System.out.println(miEmpresa.getCatalogoClientes());
                }
                case 8 -> {
                    // muestra los vehiculos
                    System.out.println("VEHICULOS:");
                    System.out.println(miEmpresa.getCatalogoVehiculo());
                    // muestra los alquileres
                    System.out.println("ALQUILERES:");
                    System.out.println(miEmpresa.getCatalogoAlquiler());
                    // pedir el bastidor del vehiculo que no tiene alquiler
                    System.out.println("Introduce el BASTIDOR de un VEHICULO que no tiene alquileres");
                    String bastidor = teclado.nextLine();
                    // borrar el vehiculo
                    miEmpresa.borrarVehiculoSinAlquiler(bastidor);
                    // mostrar el catalogo de vehiculos de nuevo
                    System.out.println("VEHICULOS:");
                    System.out.println(miEmpresa.getCatalogoVehiculo());

                }
                case 9 -> {
                    // pedir la fecha por teclado como string
                    System.out.println("Introduce una fecha limite: (yyyy-MM-dd) ");
                    String fecha = teclado.nextLine();
                    // convertir la fecha de string a localDate
                    LocalDate fechaLimite = LocalDate.parse(fecha);
                    System.out.println("VEHICULOS QUE DEBEN SER DEVULETOS EN LA FECHA: " + fechaLimite);
                    // añadir los vehiculos que deben ser devueltos en la fecha
                    ArrayList vehiculosDebenSerDevueltos = miEmpresa.vehiculosQueDebenSerEntregados(fechaLimite);
                    // mostrar arrayList con vehiculos
                    for (int i = 0; i < vehiculosDebenSerDevueltos.size(); i++) {
                        System.out.println(vehiculosDebenSerDevueltos.get(i));
                    }

                }
                case 10 -> {
                    System.out.println("Has elegido salir");
                }

            }
        } while (opcion != 10);

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
                      4- alquileres de un cliente introduciendo nif
                      5- alquileres de un vehiculio introduciendo bastidor
                      6- borrar un alquiler por id.
                      7- borrar cliente del catalogo si no tiene alquileres
                      8- borrar vehiculo del catalogo si no tiene alquileres
                      9- obtener lista de vehiculos que deben ser entregados en una fecha
                      10- SALIR
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
            // mientras la opcion no este entre 1 y 6 se repite
        } while (opcion < 1 || opcion > 10);
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
    
    // Arreglar null pointer en el main al agregar alquiler hay que comprobar si 
    // el cliente existe o no existe
    
    // Arreglar que no borre un cliente del catalogo de clientes si contiene
    // un alquiler
    
    // modificar metodo que muestra los alquileres antes de un dia a un dia exacto
    
    // avisar al usuario cuando un cliente ya esta en el catalogo y cuando un 
    // vehiculo ya esta en el catalogo
}
