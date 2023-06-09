/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Aplicacion;

import entities.Clientes;
import entities.TarjetasBancarias;
import controllers.exceptions.IllegalOrphanException;
import controllers.exceptions.NonexistentEntityException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Angel
 */
public class VentanaAñadirClientes extends javax.swing.JFrame {

    // atributos del JForm
    private final EntityManagerFactory emf;
    private final controllers.ClientesJpaController controladorClientes;
    private final controllers.TarjetasBancariasJpaController controladorTarjetas;

    /**
     * Creates new form VentanaAñadirProveedores2
     */
    public VentanaAñadirClientes() {
        initComponents();
        this.emf = Persistence.createEntityManagerFactory("bdp83");
        // crear los controladores pasandole el manejador de entidades
        this.controladorClientes = new controllers.ClientesJpaController(emf);
        this.controladorTarjetas = new controllers.TarjetasBancariasJpaController(emf);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EntradaApellidoCliente = new javax.swing.JTextField();
        EntradaNombreCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaResultadosClientes = new javax.swing.JTable();
        BotonAñadirTarjeta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EntradaNIFCliente = new javax.swing.JTextField();
        EntradaFechaNacimientoCliente = new javax.swing.JTextField();
        DesplegableTarjetas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        BotonAñadirCliente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        BotonRegresar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("NIF:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Apellido:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        EntradaApellidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaApellidoClienteActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 130, -1));

        EntradaNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNombreClienteActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 130, -1));

        TablaResultadosClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaResultadosClientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 720, 260));

        BotonAñadirTarjeta.setText("Añadir Tarjeta");
        BotonAñadirTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirTarjetaActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAñadirTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Fecha Nacimiento: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Nº Tarjeta: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        EntradaNIFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNIFClienteActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaNIFCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 130, -1));

        EntradaFechaNacimientoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaFechaNacimientoClienteActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaFechaNacimientoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 130, -1));

        DesplegableTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesplegableTarjetasActionPerformed(evt);
            }
        });
        jPanel1.add(DesplegableTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 140, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Nombre:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        BotonAñadirCliente.setText("Añadir Cliente");
        BotonAñadirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirClienteActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAñadirCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel6.setText("Añadir Cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        BotonRegresar.setText("Regresar");
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, -1, 30));

        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 90, 30));

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaApellidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaApellidoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaApellidoClienteActionPerformed

    private void EntradaNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaNombreClienteActionPerformed

    private void BotonAñadirTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirTarjetaActionPerformed
        // TODO add your handling code here:
        VentanaAñadirTarjetas ventana = new VentanaAñadirTarjetas();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonAñadirTarjetaActionPerformed

    private void EntradaNIFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaNIFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaNIFClienteActionPerformed

    private void EntradaFechaNacimientoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaFechaNacimientoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaFechaNacimientoClienteActionPerformed

    private boolean verificarNif(String nif) {
        // crear una expresion para que se introduzca un nif valido con un regex
        final String regexNIF = "[0-9]{8}[A-Z]";
        // crear el texto que vamos a comprobar que cumple la expresion regular
        final String pruebaNIF = nif;

        // crear el pattern y pasarle el regex
        final Pattern patternNIF = Pattern.compile(regexNIF, Pattern.UNIX_LINES);
        // crear el matcher pasandole el texto a comprobar
        final Matcher matcherNIF = patternNIF.matcher(pruebaNIF);

        // si el nif introducido es valido
        return matcherNIF.matches();

    }

    private boolean verificarNombre(String nombre) {

        // crear una expresion para que se introduzca un nombre valido
        final String regexNombre = ".+";
        // crear el texto que vamos a comprobar que cumple la expresion regular
        final String pruebaNombre = nombre;

        // crear el pattern y pasarle el regex
        final Pattern patternNombre = Pattern.compile(regexNombre, Pattern.UNIX_LINES);
        // crear el matcher pasandole el texto a comprobar
        final Matcher matcherNombre = patternNombre.matcher(pruebaNombre);

        // si el nombre introducido es valido
        return matcherNombre.matches(); // si el nombre no es valido
    }

    private boolean verificarApellido(String apellido) {
        // crear una expresion para que se introduzca un nombre valido
        final String regexNombre = ".+";
        // podemos utilizar el regex del nombre
        // crear el texto que vamos a comprobar que cumple la expresion regular
        final String pruebaApellido = apellido;

        // crear el pattern y pasarle el regex
        final Pattern patternApelllido = Pattern.compile(regexNombre, Pattern.UNIX_LINES);
        // crear el matcher pasandole el texto a comprobar
        final Matcher matcherApellido = patternApelllido.matcher(pruebaApellido);

        // si el apellido introducido es valido
        return matcherApellido.matches();

    }

    private boolean verificarFechaNacimiento(String fecha) {
        // fecha nacimiento
        // crear una expresion para que se introduzca una fecha con el patron "dd-MM-yyyy"
        // crear el patron con un string
        final String regexFecha = "^\\d{1,2}-\\d{1,2}-\\d{4}$";
        // crear el texto que vamos a comprobar que cumple la expresion regular
        final String pruebaFechaNacimiento = fecha;

        // crear el pattern y pasarle el patron
        final Pattern patternFechaNacimiento = Pattern.compile(regexFecha, Pattern.UNIX_LINES);
        // crear el matcher pasandole el texto a comprobar
        final Matcher matcherFechaNacimiento = patternFechaNacimiento.matcher(pruebaFechaNacimiento);

        // si la fecha introducida coincide
        return matcherFechaNacimiento.matches();
    }

    private void actualizarTablaResultados() {
        // crear un modelo para la tabla con la columna 0 y 1 no editable
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return !(column == 0 || column == 1);
            }

        };

        // obtener todos los registros de las facturas
        List<Clientes> listaClientes = this.controladorClientes.findClientesEntities();

        // crear las columnas que va a tener nuestra tabla        
        String[] columnas = {"ID_Cliente", "ID_Tarjeta", "NIF_Cliente", "Nombre_Cliente", "Apellido_Cliente", "Fecha_Nacimiento"};

        // poner los identificadores de los campos en el modelo
        modelo.setColumnIdentifiers(columnas);

        // recorrer la lista
        for (Clientes c : listaClientes) {
            // añadir los datos de cada factura a un array de object
            Object[] datosFilaFactura = {c.getIdCliente(), c.getIdtarjetaBancaria().getIdtarjetaBancaria(), c.getNifCliente(), c.getNombrecliente(), c.getApellidosCliente(), c.getFechaNacimientocliente()};
            // añadir el array de object como una fila del modelo de la tabla
            modelo.addRow(datosFilaFactura);
        }

        // establecer el modelo a la tabla
        this.TablaResultadosClientes.setModel(modelo);
    }

    private boolean comprobarSiNifClienteExiste(String nifCliente) {
        boolean noExiste = true;
        // cargar los productos
        List<Clientes> listaClientes = this.controladorClientes.findClientesEntities();

        // recorrer la lista
        for (Clientes c : listaClientes) {
            // si encuentra algun numero de tarjeta igual
            if (c.getNifCliente().equalsIgnoreCase(nifCliente)) {
                noExiste = false;
                break;
            }
        }
        return noExiste;
    }

    private void BotonAñadirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirClienteActionPerformed
        // TODO add your handling code here:

        // crear un cliente que sera el que se introducirá
        Clientes nuevoCliente = new Clientes();

        // verificar que el nif sea valido
        if (verificarNif(this.EntradaNIFCliente.getText()) && comprobarSiNifClienteExiste(this.EntradaNIFCliente.getText())) {

            // verificar la fecha de nacimiento
            if (verificarFechaNacimiento(this.EntradaFechaNacimientoCliente.getText())) {
                // intentar parsear la fecha y establecer la fecha de nacimiento del cliente
                try {
                    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                    Date fecha = formatter.parse(this.EntradaFechaNacimientoCliente.getText());
                    nuevoCliente.setFechaNacimientocliente(fecha);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(rootPane, "FECHA no se ha podido convertir");
                }

                // verificar el nombre
                if (verificarNombre(this.EntradaNombreCliente.getText())) {

                    // verificar el apellido
                    if (verificarApellido(this.EntradaApellidoCliente.getText())) {

                        // establecer los datos 
                        nuevoCliente.setNifCliente(this.EntradaNIFCliente.getText());
                        nuevoCliente.setNombrecliente(this.EntradaNombreCliente.getText());
                        nuevoCliente.setApellidosCliente(this.EntradaApellidoCliente.getText());

                        // tarjeta bancaria desde el desplegable
                        try {
                            String datosTarjetaSeleccionada = this.DesplegableTarjetas.getSelectedItem().toString();
                            // obtener el id de la tarjeta asociada al cliente
                            String[] datosTarjetaSeleccionadaDividida = datosTarjetaSeleccionada.split("-");
                            int id = Integer.parseInt(datosTarjetaSeleccionadaDividida[0]);
                            // obtener la tarjeta asociada al cliente
                            TarjetasBancarias tarjetaAsociada = controladorTarjetas.findTarjetasBancarias(id);

                            // poner la tarjeta al nuevo cliente
                            nuevoCliente.setIdtarjetaBancaria(tarjetaAsociada);

                            // insertar el cliente
                            controladorClientes.create(nuevoCliente);

                            // actualizar resultados
                            actualizarTablaResultados();
                        } catch (NullPointerException npe) {
                            JOptionPane.showMessageDialog(rootPane, "No hay tarjeta seleccionada, añade una si esta vacio");
                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Apellido no valido");
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Nombre no valido");
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Fecha de nacimiento no valida");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "NIF no valido o existente");
        }


    }//GEN-LAST:event_BotonAñadirClienteActionPerformed

    private void DesplegableTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesplegableTarjetasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DesplegableTarjetasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        actualizarTablaResultados();

        actualizarDesplegableTarjetas();


    }//GEN-LAST:event_formWindowOpened

    private void actualizarDesplegableTarjetas() {
        // recoger las tarjetas para mostrarlas en el desplegable
        List<TarjetasBancarias> tarjetas = controladorTarjetas.findTarjetasBancariasEntities();

        for (TarjetasBancarias t : tarjetas) {
            // añadir solo las que tengan un cliente a null 
            // significando que la tarjeta esta libre para ser asignada
            if (t.getCliente() == null) {
                this.DesplegableTarjetas.addItem(t.getIdtarjetaBancaria() + "-" + t.getNumeroTarjeta());
            }

        }
    }

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        // TODO add your handling code here:
        Main_Aplicacion_83 ventana = new Main_Aplicacion_83();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed

        // TODO add your handling code here:
        // obtener la fila que esta seleccionada
        int fila = TablaResultadosClientes.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(rootPane, "no hay nada seleccionado");
        } else {
            try {
                // obtener el id del cliente de la columna
                int idBorrar = Integer.parseInt(TablaResultadosClientes.getValueAt(fila, 0).toString());

                // intentar borrar la factura por el id
                controladorClientes.destroy(idBorrar);

                actualizarTablaResultados();
                actualizarDesplegableTarjetas();
            } catch (IllegalOrphanException ex) {
                JOptionPane.showMessageDialog(rootPane, "cliente referenciado en factura");
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(VentanaAñadirClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed

        // TODO add your handling code here:
        // obtener la fila que esta seleccionada
        int fila = TablaResultadosClientes.getSelectedRow();

        if (fila < 0) {
            JOptionPane.showMessageDialog(rootPane, "No hay nada seleccionado");
        } else {
            // obtener el id del cliente a actualizar
            int id = Integer.parseInt(TablaResultadosClientes.getValueAt(fila, 0).toString());

            // buscar el cliente por id para obtener el cliente a modificar
            Clientes clienteModificar = controladorClientes.findClientes(id);

            // verificar que el nif sea valido
            if (verificarNif(TablaResultadosClientes.getValueAt(fila, 2).toString())) {

                // verificar la fecha de nacimiento
                if (verificarFechaNacimiento(TablaResultadosClientes.getValueAt(fila, 5).toString())) {
                    // intentar parsear la fecha y establecer la fecha de nacimiento del cliente
                    try {
                        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                        Date fecha = formatter.parse(TablaResultadosClientes.getValueAt(fila, 5).toString());
                        clienteModificar.setFechaNacimientocliente(fecha);
                    } catch (ParseException ex) {
                        JOptionPane.showMessageDialog(rootPane, "FECHA no se ha podido convertir");
                    }

                    // verificar el nombre
                    if (verificarNombre(TablaResultadosClientes.getValueAt(fila, 3).toString())) {

                        // verificar el apellido
                        if (verificarApellido(TablaResultadosClientes.getValueAt(fila, 4).toString())) {

                            // si todos los datos estan correctos, modificar los datos del cliente a editar
                            // establecer los datos 
                            clienteModificar.setNifCliente(TablaResultadosClientes.getValueAt(fila, 2).toString());
                            clienteModificar.setNombrecliente(TablaResultadosClientes.getValueAt(fila, 3).toString());
                            clienteModificar.setApellidosCliente(TablaResultadosClientes.getValueAt(fila, 4).toString());

                            try {
                                // modificar al cliente
                                controladorClientes.edit(clienteModificar);
                            } catch (NonexistentEntityException ex) {
                                Logger.getLogger(VentanaAñadirClientes.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (Exception ex) {
                                Logger.getLogger(VentanaAñadirClientes.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            // actualizar resultados
                            actualizarTablaResultados();

                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Apellido no valido");
                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Nombre no valido");
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Fecha de nacimiento no valida");
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "NIF no valido o existente");
            }

            // actualizar resultados
            actualizarTablaResultados();
        }


    }//GEN-LAST:event_BotonModificarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAñadirClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAñadirClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAñadirClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAñadirClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAñadirClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAñadirCliente;
    private javax.swing.JButton BotonAñadirTarjeta;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JComboBox<String> DesplegableTarjetas;
    private javax.swing.JTextField EntradaApellidoCliente;
    private javax.swing.JTextField EntradaFechaNacimientoCliente;
    private javax.swing.JTextField EntradaNIFCliente;
    private javax.swing.JTextField EntradaNombreCliente;
    private javax.swing.JTable TablaResultadosClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
