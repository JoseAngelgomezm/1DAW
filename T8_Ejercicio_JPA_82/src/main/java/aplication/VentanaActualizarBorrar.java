/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplication;

import controlers.FacturasJpaController;
import controlers.exceptions.NonexistentEntityException;
import entities.Facturas;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Angel
 */
public class VentanaActualizarBorrar extends javax.swing.JFrame {

    // atributos del JForm
    private EntityManagerFactory emf;
    private controlers.FacturasJpaController controlador;

    /**
     * Creates new form VentanaActualizar
     */
    public VentanaActualizarBorrar() {
        initComponents();
        // crear un manejador de entidades con la el nombre de la unidad de persistencia
        // que tenemos en la carpeta META-INF
        this.emf = Persistence.createEntityManagerFactory("facturas");
        // crear el controlador pasandole el manejador de entidades
        this.controlador = new FacturasJpaController(emf);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaResultados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BotonActualizar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(76, 76, 109));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonRegresar.setBackground(new java.awt.Color(27, 156, 133));
        BotonRegresar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BotonRegresar.setForeground(new java.awt.Color(232, 246, 239));
        BotonRegresar.setText("Regresar");
        BotonRegresar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(232, 246, 239)));
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 220, 50));

        TablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaResultados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 740, 220));

        jLabel1.setBackground(new java.awt.Color(255, 225, 148));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 225, 148));
        jLabel1.setText("Actalizar / Borrar Facturas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 600, 60));

        BotonActualizar.setBackground(new java.awt.Color(27, 156, 133));
        BotonActualizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BotonActualizar.setForeground(new java.awt.Color(232, 246, 239));
        BotonActualizar.setText("Actualizar");
        BotonActualizar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(232, 246, 239)));
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 220, 50));

        BotonBorrar.setBackground(new java.awt.Color(27, 156, 133));
        BotonBorrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BotonBorrar.setForeground(new java.awt.Color(232, 246, 239));
        BotonBorrar.setText("Borrar");
        BotonBorrar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(232, 246, 239)));
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 220, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        // TODO add your handling code here:

        // crear la ventana de inicio
        VentanaInicio ventana = new VentanaInicio();
        // hacerla visible
        ventana.setVisible(true);

        // hacer que se cierre esta ventana y abrir la nueva
        this.dispose();

    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        // obtener todos los registros de las facturas
        List<Facturas> listaFacturas = this.controlador.findFacturasEntities();

        // crear las columnas que va a tener nuestra tabla        
        String[] columnas = {"Codigo", "Fecha", "Descripcion", "Importe"};

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

        // poner los identificadores de los campos en el modelo
        modelo.setColumnIdentifiers(columnas);

        // recorrer la lista
        for (Facturas f : listaFacturas) {
            // añadir los datos de cada factura a un array de object
            Object[] datosFilaFactura = {f.getCodigo(), f.getFecha(), f.getDescripcion(), f.getImporte()};
            // añadir el array de object como una fila del modelo de la tabla
            modelo.addRow(datosFilaFactura);
        }

        for (Facturas f : listaFacturas) {
            System.out.println(f);
        }

        // establecer el modelo a la tabla
        this.TablaResultados.setModel(modelo);
    }//GEN-LAST:event_formWindowOpened


    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        // TODO add your handling code heree:

        // obtener la fila que esta seleccionada
        int fila = TablaResultados.getSelectedRow();

        // obtener el id de la factura a actualizar de la tabla
        int codigo = Integer.parseInt(this.TablaResultados.getValueAt(fila, 0).toString());

        // obtener la fecha de la factura a actualizar de la tabla
        Date fecha = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            fecha = formatter.parse(this.TablaResultados.getValueAt(fila, 1).toString());
        } catch (ParseException ex) {
            Logger.getLogger(VentanaActualizarBorrar.class.getName()).log(Level.SEVERE, null, ex);
        }

        // obtener la descripcion de la factura a actualizar de la tabla
        String descripcion = (this.TablaResultados.getValueAt(fila, 2).toString());

        // obtener el importe de la factura a actualizar de la tabla
        Double importe = Double.valueOf(this.TablaResultados.getValueAt(fila, 3).toString());

        // crear la factura con los datos obtenidos de la tabla
        Facturas facturaActualizar = new Facturas();
        facturaActualizar.setCodigo(codigo);
        facturaActualizar.setFecha(fecha);
        facturaActualizar.setDescripcion(descripcion);
        facturaActualizar.setImporte(importe);

        // intentar editar
        try {
            controlador.edit(facturaActualizar);
        } catch (Exception ex) {
            Logger.getLogger(VentanaActualizarBorrar.class.getName()).log(Level.SEVERE, null, ex);
        }

        // mostrar de nuevo los datos actualizados 
        // obtener todos los registros de las facturas
        List<Facturas> listaFacturas = controlador.findFacturasEntities();

        // crear las columnas que va a tener nuestra tabla        
        String[] columnas = {"Codigo", "Fecha", "Descripcion", "Importe"};

        // crear un modelo para la tabla
        DefaultTableModel modelo = new DefaultTableModel();

        // poner los identificadores de los campos en el modelo
        modelo.setColumnIdentifiers(columnas);

        // recorrer la lista
        for (Facturas f : listaFacturas) {
            // añadir los datos de cada factura a un array de object
            Object[] datosFilaFactura = {f.getCodigo(), f.getFecha(), f.getDescripcion(), f.getImporte()};
            // añadir el array de object como una fila del modelo de la tabla
            modelo.addRow(datosFilaFactura);
        }

        for (Facturas f : listaFacturas) {
            System.out.println(f);
        }

        // establecer el nuevo modelo a la tabla
        this.TablaResultados.setModel(modelo);

    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        // TODO add your handling code here:

        // obtener la fila que esta seleccionada
        int fila = TablaResultados.getSelectedRow();

        // obtener el id de la factura a borrar mediante fila y columna
        int idBorrar = Integer.parseInt(TablaResultados.getValueAt(fila, 0).toString());
        System.out.println(idBorrar);
        // intentar borrar la factura por el id
        try {
            controlador.destroy(idBorrar);
        } catch (NonexistentEntityException ex) {
            JOptionPane.showMessageDialog(rootPane, "No se ha podido borrar la factura");
        }

        // actualizar los datos de la tabla
        // obtener todos los registros de las facturas
        List<Facturas> listaFacturas = controlador.findFacturasEntities();

        // crear las columnas que va a tener nuestra tabla        
        String[] columnas = {"Codigo", "Fecha", "Descripcion", "Importe"};

        // crear un modelo para la tabla
        DefaultTableModel modelo = new DefaultTableModel();

        // poner los identificadores de los campos en el modelo
        modelo.setColumnIdentifiers(columnas);

        // recorrer la lista
        for (Facturas f : listaFacturas) {
            // añadir los datos de cada factura a un array de object
            Object[] datosFilaFactura = {f.getCodigo(), f.getFecha(), f.getDescripcion(), f.getImporte()};
            // añadir el array de object como una fila del modelo de la tabla
            modelo.addRow(datosFilaFactura);
        }

        for (Facturas f : listaFacturas) {
            System.out.println(f);
        }

        // establecer el modelo a la tabla
        this.TablaResultados.setModel(modelo);

    }//GEN-LAST:event_BotonBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaActualizarBorrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaActualizarBorrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaActualizarBorrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaActualizarBorrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaActualizarBorrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JTable TablaResultados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
