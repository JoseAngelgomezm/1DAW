/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Aplicacion;

import entities.Clientes;
import entities.Proveedores;
import entities.TarjetasBancarias;
import entities.exceptions.NonexistentEntityException;
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
public class VentanaAñadirTarjetas extends javax.swing.JFrame {

    // atributos del JForm
    private EntityManagerFactory emf;
    private controllers.TarjetasBancariasJpaController controladorTarjetas;

    /**
     * Creates new form VentanaAñadirProveedores2
     */
    public VentanaAñadirTarjetas() {
        initComponents();
        this.emf = Persistence.createEntityManagerFactory("bdp83");
        // crear el controlador pasandole el manejador de entidades
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
        EntradaNumeroTarjeta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaResultadosTarjetas = new javax.swing.JTable();
        BotonAñadirTarjeta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BotonRegresar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Número Tarjeta:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        EntradaNumeroTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNumeroTarjetaActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaNumeroTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 130, 30));

        TablaResultadosTarjetas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaResultadosTarjetas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 620, 260));

        BotonAñadirTarjeta.setText("Añadir Tarjeta");
        BotonAñadirTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirTarjetaActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAñadirTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setText("Añadir Tarjeta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        BotonRegresar.setText("Regresar");
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, 30));

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 80, 30));

        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaNumeroTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaNumeroTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaNumeroTarjetaActionPerformed

    private boolean verificarTarjeta(String numeroTarjeta) {

        final String regexTarjeta = "\\d{16}";
        // crear el texto que vamos a comprobar que cumple la expresion regular
        final String pruebaTarjeta = numeroTarjeta;

        // crear el pattern y pasarle el patron
        final Pattern patternTarjeta = Pattern.compile(regexTarjeta, Pattern.UNIX_LINES);
        // crear el matcher pasandole el texto a comprobar
        final Matcher matcherTarjeta = patternTarjeta.matcher(pruebaTarjeta);

        // si el numero de tarjeta coincide
        if (matcherTarjeta.matches()) {
            return true;
        } else {
            return false;
        }
    }


    private void BotonAñadirTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirTarjetaActionPerformed
        // TODO add your handling code here:

        // obtener la lista de tarjetas
        List<TarjetasBancarias> listaTarjetas = controladorTarjetas.findTarjetasBancariasEntities();

        // crear una nueva tarjeta 
        TarjetasBancarias nuevaTarjeta = new TarjetasBancarias();

        // verificar que la tarjeta sea una numero valido
        if (verificarTarjeta(this.EntradaNumeroTarjeta.getText())) {

            // comprobar que la tarjeta no existe
            for (TarjetasBancarias t : listaTarjetas) {
                if (t.getNumeroTarjeta().equalsIgnoreCase(this.EntradaNumeroTarjeta.getText())) {
                    JOptionPane.showMessageDialog(rootPane, "La tarjeta ya existe");
                    break;
                    // si no existe ponerle el numero e intentar introducirla
                } else {
                    nuevaTarjeta.setNumeroTarjeta(this.EntradaNumeroTarjeta.getText());
                    controladorTarjetas.create(nuevaTarjeta);
                    actualizarTablaResultados();
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Numero de tarjeta no valido");
        }


    }//GEN-LAST:event_BotonAñadirTarjetaActionPerformed
    private void actualizarTablaResultados() {
        // crear un modelo para la tabla con la columna 0 no editable
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0) {
                    return false;
                }
                return true;
            }

        };

        // obtener todos los registros de las facturas
        List<TarjetasBancarias> listaTarjetas = this.controladorTarjetas.findTarjetasBancariasEntities();

        // crear las columnas que va a tener nuestra tabla        
        String[] columnas = {"ID", "Numero_Tarjeta"};

        // poner los identificadores de los campos en el modelo
        modelo.setColumnIdentifiers(columnas);

        // recorrer la lista
        for (TarjetasBancarias t : listaTarjetas) {
            // añadir los datos de cada factura a un array de object
            Object[] datosFilaFactura = {t.getIdtarjetaBancaria(), t.getNumeroTarjeta()};
            // añadir el array de object como una fila del modelo de la tabla
            modelo.addRow(datosFilaFactura);
        }

        // establecer el modelo a la tabla
        this.TablaResultadosTarjetas.setModel(modelo);
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        actualizarTablaResultados();
    }//GEN-LAST:event_formWindowOpened

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        // TODO add your handling code here:
        VentanaAñadirClientes ventana = new VentanaAñadirClientes();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed

        // TODO add your handling code here:
        // obtener la fila que esta seleccionada
        int fila = TablaResultadosTarjetas.getSelectedRow();

        // obtener el id de la tarjeta a eliminar
        int idBorrar = Integer.parseInt(TablaResultadosTarjetas.getValueAt(fila, 0).toString());

        try {
            // intentar borrar la tarjeta por id
            controladorTarjetas.destroy(idBorrar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(VentanaAñadirTarjetas.class.getName()).log(Level.SEVERE, null, ex);
        }

        actualizarTablaResultados();
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        // TODO add your handling code here:
        // crear un proveedor con los nuevos datos
        Proveedores proveedorActualizar = new Proveedores();

        // obtener la fila que esta seleccionada
        int fila = TablaResultadosTarjetas.getSelectedRow();

        // actualizar datos de la tabla
        actualizarTablaResultados();
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
            java.util.logging.Logger.getLogger(VentanaAñadirTarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAñadirTarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAñadirTarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAñadirTarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAñadirTarjetas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAñadirTarjeta;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JTextField EntradaNumeroTarjeta;
    private javax.swing.JTable TablaResultadosTarjetas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
