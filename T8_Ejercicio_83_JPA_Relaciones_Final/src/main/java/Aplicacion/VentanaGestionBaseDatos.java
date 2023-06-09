/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Aplicacion;

import entities.Clientes;
import entities.Facturas;
import entities.FacturasPK;
import entities.Productos;
import entities.Proveedores;
import entities.TarjetasBancarias;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Angel
 */
public class VentanaGestionBaseDatos extends javax.swing.JFrame {

    // atributos de ventana
    private final EntityManagerFactory emf;
    private final EntityManager em;
    private final controllers.ClientesJpaController controladorClientes;
    private final controllers.ProductosJpaController controladorProductos;
    private final controllers.ProveedoresJpaController controladorProveedores;
    private final controllers.FacturasJpaController controladorFacturas;
    private final controllers.TarjetasBancariasJpaController controladorTarjetas;

    /**
     * Creates new form VentanaGestionBaseDatos
     */
    public VentanaGestionBaseDatos() {
        this.emf = Persistence.createEntityManagerFactory("bdp83");
        this.em = emf.createEntityManager();
        this.controladorClientes = new controllers.ClientesJpaController(emf);
        this.controladorProductos = new controllers.ProductosJpaController(emf);
        this.controladorProveedores = new controllers.ProveedoresJpaController(emf);
        this.controladorFacturas = new controllers.FacturasJpaController(emf);
        this.controladorTarjetas = new controllers.TarjetasBancariasJpaController(emf);

        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonRegresar = new javax.swing.JButton();
        BotonRealizarCopia = new javax.swing.JButton();
        BotonRecuperar = new javax.swing.JButton();
        ListaCopias = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        BotonRegresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonRegresar.setText("Regresar");
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });

        BotonRealizarCopia.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        BotonRealizarCopia.setText("Realizar una copia de seguridad");
        BotonRealizarCopia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRealizarCopiaActionPerformed(evt);
            }
        });

        BotonRecuperar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonRecuperar.setText("Recuperar base de datos desde una copia de seguridad");
        BotonRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRecuperarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Selecciona una copia de seguridad:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(BotonRealizarCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(ListaCopias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(BotonRecuperar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonRegresar)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonRealizarCopia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(BotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ListaCopias, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(BotonRecuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        // TODO add your handling code here:
        Main_Aplicacion_83 ventana = new Main_Aplicacion_83();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private List<Clientes> leerFicheroClientes(String ruta) {
        List<Clientes> clientes = new ArrayList<>();
        String linea; // string que contiene cada linea leida
        String[] datosDivididos; // array que contiene los datos divididos

        // bloque try catch para lectura del fichero
        try ( Scanner datosFichero = new Scanner(new File(ruta), "UTF-8")) {
            // leer mientras tengamos una linea disponible en el fichero
            while (datosFichero.hasNextLine()) {
                // obtener datos de cada linea
                linea = datosFichero.nextLine();
                // dividir cada linea por los dos puntos para obtener cada valor
                datosDivididos = linea.split(";");
                // crear un cliente temporal para pasarle los datos del archivo
                Clientes clienteTmp = new Clientes();
                

                // obtener la tarjeta bancaria mediante el numero
                TypedQuery<TarjetasBancarias> query = this.em.createNamedQuery("TarjetasBancarias.findByNumeroTarjeta", TarjetasBancarias.class);
                query.setParameter("numeroTarjeta", datosDivididos[1]);
                TarjetasBancarias tarjetaEncontrada = query.getSingleResult();

                // establecer la tarjeta
                clienteTmp.setIdtarjetaBancaria(tarjetaEncontrada);

                clienteTmp.setNifCliente(datosDivididos[2]);
                clienteTmp.setNombrecliente(datosDivididos[3]);
                clienteTmp.setApellidosCliente(datosDivididos[4]);

                // obtener la fecha de nacimiento
                try {
                    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                    Date fecha = formatter.parse(datosDivididos[5]);
                    clienteTmp.setFechaNacimientocliente(fecha);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(rootPane, "FECHA no se ha podido convertir");
                }

                // agregar el cliente a la lista
                clientes.add(clienteTmp);

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return clientes;
    }

    private List<TarjetasBancarias> leerFicheroTarjetas(String ruta) {
        List<TarjetasBancarias> tarjetas = new ArrayList<>();

        String linea; // string que contiene cada linea leida
        String[] datosDivididos; // array que contiene los datos divididos

        // bloque try catch para lectura del fichero
        try ( Scanner datosFichero = new Scanner(new File(ruta), "UTF-8")) {
            // leer mientras tengamos una linea disponible en el fichero
            while (datosFichero.hasNextLine()) {
                // obtener datos de cada linea
                linea = datosFichero.nextLine();
                // dividir cada linea por los dos puntos para obtener cada valor
                datosDivididos = linea.split(";");
                // crear una tarjeta temporal para pasarle los datos del archivo
                TarjetasBancarias tarjetaTmp = new TarjetasBancarias();
                
                tarjetaTmp.setNumeroTarjeta(datosDivididos[1]);

                // agregar el cliente a la lista
                tarjetas.add(tarjetaTmp);

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return tarjetas;
    }

    private List<Productos> leerFicheroProductos(String ruta) {
        List<Productos> productos = new ArrayList<>();

        String linea; // string que contiene cada linea leida
        String[] datosDivididos; // array que contiene los datos divididos

        // bloque try catch para lectura del fichero
        try ( Scanner datosFichero = new Scanner(new File(ruta), "UTF-8")) {
            // leer mientras tengamos una linea disponible en el fichero
            while (datosFichero.hasNextLine()) {
                // obtener datos de cada linea
                linea = datosFichero.nextLine();
                // dividir cada linea por los dos puntos para obtener cada valor
                datosDivididos = linea.split(";");
                // crear un producto temporal para pasarle los datos del archivo
                Productos productoTmp = new Productos();
                // pasarle los datos al producto
                
                // buscar el proveedor que le pertenece por el nif
                TypedQuery<Proveedores> query = this.em.createNamedQuery("Proveedores.findByNifProveedor", Proveedores.class);
                query.setParameter("nifProveedor", datosDivididos[1]);
                // asignarle el proveedor al producto
                Proveedores proveedorAsociado = query.getSingleResult();
                productoTmp.setIdProveedor(proveedorAsociado);
                // poner la referencia
                productoTmp.setRefProducto(datosDivididos[2]);
                productoTmp.setNombreProducto(datosDivididos[3]);
                productoTmp.setImporteProducto(Double.valueOf(datosDivididos[4]));

                // añadir el producto a la lista
                productos.add(productoTmp);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return productos;
    }

    private List<Proveedores> leerFicheroProveedores(String ruta) {
        List<Proveedores> proveedores = new ArrayList<>();

        String linea; // string que contiene cada linea leida
        String[] datosDivididos; // array que contiene los datos divididos

        // bloque try catch para lectura del fichero
        try ( Scanner datosFichero = new Scanner(new File(ruta), "UTF-8")) {
            // leer mientras tengamos una linea disponible en el fichero
            while (datosFichero.hasNextLine()) {
                // obtener datos de cada linea
                linea = datosFichero.nextLine();
                // dividir cada linea por los dos puntos para obtener cada valor
                datosDivididos = linea.split(";");
                // crear un proveedor temporal para pasarle los datos del archivo
                Proveedores proveedorTmp = new Proveedores();
                // pasarle los datos al proveedor
                
                proveedorTmp.setNifProveedor(datosDivididos[1]);
                proveedorTmp.setNombreProveedor(datosDivididos[2]);
                proveedorTmp.setDireccionProveedor(datosDivididos[3]);

                // añadir el proveedor a la lista 
                proveedores.add(proveedorTmp);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return proveedores;
    }

    private List<Facturas> leerFicheroFacturas(String ruta) {
        List<Facturas> listaFacturas = new ArrayList<>();

        String linea; // string que contiene cada linea leida
        String[] datosDivididos; // array que contiene los datos divididos

        // bloque try catch para lectura del fichero
        try ( Scanner datosFichero = new Scanner(new File(ruta), "UTF-8")) {
            // leer mientras tengamos una linea disponible en el fichero
            while (datosFichero.hasNextLine()) {
                // obtener datos de cada linea
                linea = datosFichero.nextLine();
                // dividir cada linea por los dos puntos para obtener cada valor
                datosDivididos = linea.split(";");
                // crear una facturaPK para asignarle a la factura
                FacturasPK pkFactura = new FacturasPK();
                // buscar por el nif al cliente para obtener el id
                // buscar el proveedor que le pertenece por el nif
                TypedQuery<Clientes> queryCliente = this.em.createNamedQuery("Clientes.findByNifCliente", Clientes.class);
                queryCliente.setParameter("nifCliente", datosDivididos[0]);
                // obtener el cliente mediante la named query
                Clientes clienteAsociado = queryCliente.getSingleResult();
                // asignarle el id del cliente asociado al pkFactura
                pkFactura.setIdCliente(clienteAsociado.getIdCliente());
                
                // obtener el producto asociado mediante la ref para obtener el id
                TypedQuery<Productos> queryProducto = this.em.createNamedQuery("Productos.findByRefProducto", Productos.class);
                queryProducto.setParameter("refProducto", datosDivididos[1]);
                // obtener el producto mediante la named query
                Productos productoAsociado = queryProducto.getSingleResult();
                // asignarle el id del prodcuto asociado al pkFactura
                pkFactura.setIdProducto(productoAsociado.getIdProducto());
                 // obtener la fecha de la factura
                try {
                    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                    Date fecha = formatter.parse(datosDivididos[3]);
                    pkFactura.setFechaFactura(fecha);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(rootPane, "FECHA no se ha podido convertir");
                }
                
                // crear la factura tmp para añadirla a la bd
                Facturas facturaTmp = new Facturas();
                facturaTmp.setFacturasPK(pkFactura);
                facturaTmp.setCantidadProductos(Integer.valueOf(datosDivididos[2]));
                facturaTmp.setImporteTotal(Double.valueOf(datosDivididos[4]));
                facturaTmp.setClientes(clienteAsociado);
                facturaTmp.setProductos(productoAsociado);
                // añadir la factura a la lista 
                listaFacturas.add(facturaTmp);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return listaFacturas;
    }

    public void borrarTablas() {

        // obtener una transiccion del entity manager
        EntityTransaction transaction = this.em.getTransaction();
        transaction.begin();

        TypedQuery<Clientes> queryBorrarClientes = this.em.createNamedQuery("Clientes.deleteAll", Clientes.class);
        TypedQuery<Facturas> queryBorrarFacturas = this.em.createNamedQuery("Facturas.deleteAll", Facturas.class);
        TypedQuery<Productos> queryBorrarProductos = this.em.createNamedQuery("Productos.deleteAll", Productos.class);
        TypedQuery<Proveedores> queryBorrarProveedores = this.em.createNamedQuery("Proveedores.deleteAll", Proveedores.class);
        TypedQuery<TarjetasBancarias> queryBorrarTarjetas = this.em.createNamedQuery("TarjetasBancarias.deleteAll", TarjetasBancarias.class);
        
        queryBorrarClientes.executeUpdate();
        queryBorrarTarjetas.executeUpdate();
        queryBorrarProductos.executeUpdate();
        queryBorrarProveedores.executeUpdate();
        queryBorrarFacturas.executeUpdate();
        
        
        
        
        // hacer commit de la transicion
        transaction.commit();
    }

    private void BotonRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRecuperarActionPerformed
        // TODO add your handling code here:

        borrarTablas();

        // obtener el nombre de la carpeta da la que leer los archivos desde 
        // el desplegable
        String rutaCarpeta = "copias/" + this.ListaCopias.getSelectedItem();
        
        // leer los archivos de cada una de las tablas
        
        // leer los archivos de las tarjeta
        List<TarjetasBancarias> listaTarjetas = leerFicheroTarjetas(rutaCarpeta.concat("/tarjetas.csv"));
        // añadir la lista de tarjetas a la tabla
        for (TarjetasBancarias t : listaTarjetas) {
            controladorTarjetas.create(t);
        }

        
        List<Clientes> listaClientes = leerFicheroClientes(rutaCarpeta.concat("/clientes.csv"));
        // añadir la lista de clientes a la tabla
        for (Clientes c : listaClientes) {
            controladorClientes.create(c);
        }
        
        List<Proveedores> listaProveedores = leerFicheroProveedores(rutaCarpeta.concat("/proveedores.csv"));
        // añadir la lista de proveedores a la tabla
        for (Proveedores p : listaProveedores) {
            controladorProveedores.create(p);
        }
        
        List<Productos> listaProductos = leerFicheroProductos(rutaCarpeta.concat("/productos.csv"));
        // añadir a la base de datos la lista de productos
        for (Productos p : listaProductos) {
            controladorProductos.create(p);
        }
        
        List<Facturas> listaFacturas = leerFicheroFacturas(rutaCarpeta.concat("/facturas.csv"));
        for (Facturas f : listaFacturas) {
            try {
                controladorFacturas.create(f);
            } catch (Exception ex) {
                Logger.getLogger(VentanaGestionBaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        JOptionPane.showMessageDialog(rootPane, "Base de datos reestablecida");
    }//GEN-LAST:event_BotonRecuperarActionPerformed

    private void crearDirectorio(String ruta) {
        // crear el objeto path
        Path directory = Paths.get(ruta);

        // control expecciones
        try {
            Files.createDirectory(directory);
        } catch (FileAlreadyExistsException faee) {
            System.out.println("No se puede crear " + ruta + " porque ya existe");
        } catch (AccessDeniedException ade) {
            System.out.println("No tiene permisos para crear " + ruta);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio " + ruta);
            System.out.println("Seguramente la ruta está mal escrita o no existe");
        }

    }

    private void crearFicheroClientes(List<Clientes> clientes) {

        // captura de expcepcion al crear el fichero
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter("copias/" + obtenerFechaHoraActual() + "/clientes.csv"))) {// crea el objeto bufferedWriter + fileWriter
            // recorrer la lista para obtener facturas
            for (int i = 0; i < clientes.size(); i++) {
                Clientes tmp = clientes.get(i);
                flujo.write(tmp.getIdCliente() + ";"
                        + tmp.getIdtarjetaBancaria().getNumeroTarjeta() + ";"
                        + tmp.getNifCliente() + ";" + tmp.getNombrecliente()
                        + ";" + tmp.getApellidosCliente() + ";" + tmp.getFechaNacimientocliente());
                // añadir un salto de linea
                flujo.newLine();
                // guardar cambios en disco
                flujo.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void crearFicheroProductos(List<Productos> productos) {

        // captura de expcepcion al crear el fichero
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter("copias/" + obtenerFechaHoraActual() + "/productos.csv"))) {// crea el objeto bufferedWriter + fileWriter
            // recorrer la lista para obtener facturas
            for (int i = 0; i < productos.size(); i++) {
                Productos tmp = productos.get(i);
                flujo.write(tmp.getIdProducto() + ";" + tmp.getIdProveedor().getNifProveedor() + ";"
                        + tmp.getRefProducto() + ";" + tmp.getNombreProducto() + ";"
                        + tmp.getImporteProducto());
                // añadir un salto de linea
                flujo.newLine();
                // guardar cambios en disco
                flujo.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void crearFicheroProveedores(List<Proveedores> proveedores) {

        // captura de expcepcion al crear el fichero
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter("copias/" + obtenerFechaHoraActual() + "/proveedores.csv"))) {// crea el objeto bufferedWriter + fileWriter
            // recorrer la lista para obtener facturas
            for (int i = 0; i < proveedores.size(); i++) {
                Proveedores tmp = proveedores.get(i);
                flujo.write(tmp.getIdProveedor() + ";" + tmp.getNifProveedor() + ";"
                        + tmp.getNombreProveedor() + ";" + tmp.getNombreProveedor() + ";"
                        + tmp.getDireccionProveedor());
                // añadir un salto de linea
                flujo.newLine();
                // guardar cambios en disco
                flujo.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void crearFicheroTarjetasBancarias(List<TarjetasBancarias> tarjetas) {

        // captura de expcepcion al crear el fichero
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter("copias/" + obtenerFechaHoraActual() + "/tarjetas.csv"))) {// crea el objeto bufferedWriter + fileWriter
            // recorrer la lista para obtener facturas
            for (int i = 0; i < tarjetas.size(); i++) {
                TarjetasBancarias tmp = tarjetas.get(i);
                flujo.write(tmp.getIdtarjetaBancaria() + ";" + tmp.getNumeroTarjeta());
                // añadir un salto de linea
                flujo.newLine();
                // guardar cambios en disco
                flujo.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private String obtenerFechaHoraActual() {
        LocalDateTime localdate = LocalDateTime.now();

        String fecha = localdate.getDayOfMonth() + "-"
                + localdate.getMonthValue() + "-"
                + localdate.getYear() + "-" + localdate.getHour() + "-"
                + localdate.getMinute() + "-" + localdate.getSecond();

        return fecha;
    }

    private void crearFicheroFacturas(List<Facturas> facturas) {

        // captura de expcepcion al crear el fichero
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter("copias/" + obtenerFechaHoraActual() + "/facturas.csv"))) {// crea el objeto bufferedWriter + fileWriter
            // recorrer la lista para obtener facturas
            for (int i = 0; i < facturas.size(); i++) {
                Facturas tmp = facturas.get(i);
                flujo.write(tmp.getClientes().getNifCliente() + ";" + tmp.getProductos().getRefProducto() + ";"
                        + tmp.getCantidadProductos() + ";" + tmp.getFacturasPK().getFechaFactura() + ";" + tmp.getImporteTotal());
                // añadir un salto de linea
                flujo.newLine();
                // guardar cambios en disco
                flujo.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void actualizarListaCopias() {

        // vaciar la lista 
        this.ListaCopias.removeAllItems();

        // crear el directorio a listar
        File directorio = new File("copias");

        // si el directorio existe
        if (directorio.exists()) {
            // obtener el nombre de los ficheros que contiene
            File[] ficheros = directorio.listFiles();

            // una vez tenemos la lista de directorios obtener los nombres
            String[] nombreCarpetas = new String[ficheros.length];
            for (int i = 0; i < ficheros.length; i++) {
                nombreCarpetas[i] = ficheros[i].getName();

            }

            // una vez tenemos en un array los nombres de las carpetas, asignarlos
            // al desplegable
            for (int i = 0; i < nombreCarpetas.length; i++) {
                this.ListaCopias.addItem(nombreCarpetas[i]);

            }

        }

    }

    private void BotonRealizarCopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRealizarCopiaActionPerformed
        // TODO add your handling code here:

        // crear el directorio copias
        crearDirectorio("copias");

        // crear la carpeta con la hora fecha y hora actual
        crearDirectorio("copias/" + obtenerFechaHoraActual());

        // obtener todos los datos de las tablas en listas
        List<Clientes> listaClientes = controladorClientes.findClientesEntities();
        List<Productos> listaProductos = controladorProductos.findProductosEntities();
        List<Proveedores> listaProveedores = controladorProveedores.findProveedoresEntities();
        List<Facturas> listaFacturas = controladorFacturas.findFacturasEntities();
        List<TarjetasBancarias> listaTarjetasBancarias = controladorTarjetas.findTarjetasBancariasEntities();

        // crear un fichero por cada lista de objetos que tenemos 
        crearFicheroClientes(listaClientes);
        crearFicheroFacturas(listaFacturas);
        crearFicheroProductos(listaProductos);
        crearFicheroProveedores(listaProveedores);
        crearFicheroTarjetasBancarias(listaTarjetasBancarias);

        actualizarListaCopias();

    }//GEN-LAST:event_BotonRealizarCopiaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        actualizarListaCopias();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionBaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionBaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionBaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionBaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaGestionBaseDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRealizarCopia;
    private javax.swing.JButton BotonRecuperar;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JComboBox<String> ListaCopias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
