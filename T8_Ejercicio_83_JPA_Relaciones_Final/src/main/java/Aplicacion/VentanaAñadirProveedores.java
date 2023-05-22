/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Aplicacion;

import entities.Productos;
import entities.Proveedores;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Angel
 */
public class VentanaAñadirProveedores extends javax.swing.JFrame {
    
    // atributos del JForm
    private EntityManagerFactory emf;
    private controllers.ProveedoresJpaController controladorProveedores;

    /**
     * Creates new form VentanaAñadirProveedores2
     */
    public VentanaAñadirProveedores() {
        initComponents();
        this.emf = Persistence.createEntityManagerFactory("bdp83");
        // crear el controlador pasandole el manejador de entidades
        this.controladorProveedores = new controllers.ProveedoresJpaController(emf);
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
        EntradaDireccionProveedor = new javax.swing.JTextField();
        EntradaNIFProveedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaResultadosProveedores = new javax.swing.JTable();
        BotonAñadirProveedor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EntradaNombreProveedor1 = new javax.swing.JTextField();
        BotonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("NIF:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Dirección:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        EntradaDireccionProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaDireccionProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaDireccionProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 130, -1));

        EntradaNIFProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNIFProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaNIFProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 130, -1));

        TablaResultadosProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaResultadosProveedores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 620, 260));

        BotonAñadirProveedor.setText("Añadir Proveedor");
        BotonAñadirProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAñadirProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setText("Añadir Proveedor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        EntradaNombreProveedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNombreProveedor1ActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaNombreProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 130, -1));

        BotonRegresar.setText("Regresar");
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaDireccionProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaDireccionProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaDireccionProveedorActionPerformed

    private void EntradaNIFProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaNIFProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaNIFProveedorActionPerformed

    private void BotonAñadirProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAñadirProveedorActionPerformed

    private void EntradaNombreProveedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaNombreProveedor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaNombreProveedor1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
                // bloquear la tabla
        this.TablaResultadosProveedores.setEnabled(false);

        // obtener todos los registros de las facturas
        List<Proveedores> listaProveedores = this.controladorProveedores.findProveedoresEntities();

        // crear las columnas que va a tener nuestra tabla        
        String[] columnas = {"ID", "NIF_Proveedor", "Nombre_Proveedor" , "Direccion_Proveedor"};

        // crear un modelo para la tabla
        DefaultTableModel modelo = new DefaultTableModel();

        // poner los identificadores de los campos en el modelo
        modelo.setColumnIdentifiers(columnas);

        // recorrer la lista
        for (Proveedores p : listaProveedores) {
            // añadir los datos de cada factura a un array de object
            Object[] datosFilaFactura = {p.getIdProveedor(), p.getNifProveedor(), p.getNombreProveedor(), p.getDireccionProveedor()};
            // añadir el array de object como una fila del modelo de la tabla
            modelo.addRow(datosFilaFactura);
        }

        // establecer el modelo a la tabla
        this.TablaResultadosProveedores.setModel(modelo);
        
    }//GEN-LAST:event_formWindowOpened

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        // TODO add your handling code here:
        Main_Aplicacion_83 ventana = new Main_Aplicacion_83();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAñadirProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAñadirProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAñadirProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAñadirProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAñadirProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAñadirProveedor;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JTextField EntradaDireccionProveedor;
    private javax.swing.JTextField EntradaNIFProveedor;
    private javax.swing.JTextField EntradaNombreProveedor1;
    private javax.swing.JTable TablaResultadosProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
