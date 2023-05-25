/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Aplicacion;

import entities.Productos;
import controllers.exceptions.IllegalOrphanException;
import controllers.exceptions.NonexistentEntityException;
import entities.Proveedores;
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
public class VentanaAñadirProductos extends javax.swing.JFrame {

// atributos del JForm
    private final EntityManagerFactory emf;
    private final controllers.ProductosJpaController controladorProductos;
    private final controllers.ProveedoresJpaController controladorProveedores;

    /**
     * Creates new form VentanaAñadirProveedores2
     */
    public VentanaAñadirProductos() {
        initComponents();
        this.emf = Persistence.createEntityManagerFactory("bdp83");
        // crear el controlador pasandole el manejador de entidades
        this.controladorProductos = new controllers.ProductosJpaController(emf);
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
        EntradaImporteProducto = new javax.swing.JTextField();
        EntradaREFProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaResultadosProductos = new javax.swing.JTable();
        BotonAñadirProductos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EntradaNombreProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BotonRegresar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        DesplegableProveedores = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("REF:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        EntradaImporteProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaImporteProductoActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaImporteProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 130, -1));

        EntradaREFProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaREFProductoActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaREFProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 130, -1));

        TablaResultadosProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaResultadosProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 620, 260));

        BotonAñadirProductos.setText("Añadir Producto");
        BotonAñadirProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirProductosActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAñadirProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setText("Añadir Productos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        EntradaNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaNombreProductoActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 130, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Proveedor:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        BotonRegresar.setText("Regresar");
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, -1, 30));

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 80, 30));

        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 560, 90, 30));

        jPanel1.add(DesplegableProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 130, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Importe:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 8, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EntradaImporteProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaImporteProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaImporteProductoActionPerformed

    private void EntradaREFProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaREFProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaREFProductoActionPerformed

    private boolean verificarRef(String refProducto) {
        // crear una expresion para que se introduzca un nif valido con un regex
        final String regexNIF = "[0-9]{10}";
        // crear el texto que vamos a comprobar que cumple la expresion regular
        final String pruebaNIF = refProducto;

        // crear el pattern y pasarle el regex
        final Pattern patternNIF = Pattern.compile(regexNIF, Pattern.UNIX_LINES);
        // crear el matcher pasandole el texto a comprobar
        final Matcher matcherNIF = patternNIF.matcher(pruebaNIF);

        // si el nif introducido es valido
        if (matcherNIF.matches()) {
            return true;

        } else {
            return false;
        }

    }

    private boolean verificarNombre(String nombre) {
        // crear una expresion para que se introduzca un nif valido con un regex
        final String regexNombre = ".+";
        // crear el texto que vamos a comprobar que cumple la expresion regular
        final String pruebaNombre = nombre;

        // crear el pattern y pasarle el regex
        final Pattern patternNIF = Pattern.compile(regexNombre, Pattern.UNIX_LINES);
        // crear el matcher pasandole el texto a comprobar
        final Matcher matcherNIF = patternNIF.matcher(pruebaNombre);

        // si el nif introducido es valido
        if (matcherNIF.matches()) {
            return true;

        } else {
            return false;
        }

    }

    private boolean verificarImporte(String importe) {
        // crear una expresion para que se introduzca un nif valido con un regex
        final String regexImporte = "\\d+(\\.\\d{1,4})?";
        // crear el texto que vamos a comprobar que cumple la expresion regular
        final String pruebaImporte = importe;

        // crear el pattern y pasarle el regex
        final Pattern patternNIF = Pattern.compile(regexImporte, Pattern.UNIX_LINES);
        // crear el matcher pasandole el texto a comprobar
        final Matcher matcherNIF = patternNIF.matcher(pruebaImporte);

        // si el nif introducido es valido
        if (matcherNIF.matches()) {
            return true;

        } else {
            return false;
        }

    }

    private boolean comprobarSiNifExiste(String ref) {
        boolean noExiste = true;
        // cargar los productos
        List<Productos> listaProductos = this.controladorProductos.findProductosEntities();

        // recorrer la lista
        for (Productos p : listaProductos) {
            // si encuentra algun nif de proveedor igual, devuelve false
            if (p.getRefProducto().equalsIgnoreCase(ref)) {
                noExiste = false;
                break;
            }
        }
        return noExiste;
    }

    private void actualizarTablaResultados() {
        // crear un modelo para la tabla con la columna 0 no editable
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1) {
                    return false;
                }
                return true;
            }

        };

        // obtener todos los registros de las tarjetas
        List<Productos> listaProductose = this.controladorProductos.findProductosEntities();

        // crear las columnas que va a tener nuestra tabla        
        String[] columnas = {"ID_Producto", "ID_Proveedor", "REF_Prodcuto", "Nombre_Producto", "Importe_Producto"};

        // poner los identificadores de los campos en el modelo
        modelo.setColumnIdentifiers(columnas);

        // recorrer la lista
        for (Productos p : listaProductose) {
            // añadir los datos de cada factura a un array de object
            Object[] datosFila = {p.getIdProducto(), p.getIdProveedor(), p.getRefProducto(), p.getNombreProducto(), p.getImporteProducto()};
            // añadir el array de object como una fila del modelo de la tabla
            modelo.addRow(datosFila);
        }

        // establecer el modelo a la tabla
        this.TablaResultadosProductos.setModel(modelo);
    }

    private void BotonAñadirProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirProductosActionPerformed
        // TODO add your handling code here:
        // crear un producto
        Productos productoIntroducir = new Productos();

        // verificar que lo datos que hemos introducido son correctos
        if (verificarRef(EntradaREFProducto.getText()) && comprobarSiNifExiste(EntradaREFProducto.getText())) {

            if (verificarNombre(EntradaNombreProducto.getText())) {

                if (verificarImporte(EntradaImporteProducto.getText())) {

                    // si todos los datos son correctos, asignarlos al nuevo producto
                    productoIntroducir.setRefProducto(EntradaREFProducto.getText());
                    productoIntroducir.setNombreProducto(EntradaNombreProducto.getText());
                    productoIntroducir.setImporteProducto(Double.valueOf(EntradaImporteProducto.getText()));

                    // obtener el string de lo que tenemos en el desplegable
                    String proveedorSeleccionado = DesplegableProveedores.getSelectedItem().toString();

                    // obtener el id de ese proveedor
                    int id = Character.getNumericValue(proveedorSeleccionado.charAt(0));

                    // buscar el proveedor
                    Proveedores proveedorAsignado = controladorProveedores.findProveedores(id);

                    // asignar el proveedor al nuevo producto
                    productoIntroducir.setIdProveedor(proveedorAsignado);

                    // introducir el producto en la base de datos
                    controladorProductos.create(productoIntroducir);

                    // actualizar la tabla de consulta
                    actualizarTablaResultados();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Importe del producto no valido");
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Nombre del producto no valido");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Referencia producto no valida o existente");
        }

    }//GEN-LAST:event_BotonAñadirProductosActionPerformed

    private void EntradaNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaNombreProductoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        actualizarTablaResultados();
        // cargar los datos de los proveedores al desplegable
        List<Proveedores> listaProveedores = controladorProveedores.findProveedoresEntities();

        // una vez tenemos los datos cargarlos al desplegable
        for (Proveedores p : listaProveedores) {
            DesplegableProveedores.addItem(p.getIdProveedor() + "-" + p.getNombreProveedor());
        }

    }//GEN-LAST:event_formWindowOpened

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        // TODO add your handling code here:
        Main_Aplicacion_83 ventana = new Main_Aplicacion_83();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed

        try {
            // TODO add your handling code here:
            // obtener la fila que esta seleccionada
            int fila = TablaResultadosProductos.getSelectedRow();

            // obtener el id del producto de la columna
            int idBorrar = Integer.parseInt(TablaResultadosProductos.getValueAt(fila, 0).toString());

            // intentar borrar el producto por el id
            controladorProductos.destroy(idBorrar);

            actualizarTablaResultados();
        } catch (IllegalOrphanException ex) {
            Logger.getLogger(VentanaAñadirProductos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(VentanaAñadirProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        // TODO add your handling code here:
        // crear un proveedor con los nuevos datos
        Productos prodcutoActualizar = new Productos();

        // obtener la fila que esta seleccionada
        int fila = TablaResultadosProductos.getSelectedRow();

        // obtener el id del producto
        int id = Integer.parseInt(TablaResultadosProductos.getValueAt(fila, 0).toString());

        // obtener el producto buscandolo por id
        Productos productoModificar = controladorProductos.findProductos(id);

        // obtener los datos de la tabla que se han modificiado
        // verificando que se han introducido correctamente y que la referencia
        // no existe ya en la bd
        if (verificarRef(TablaResultadosProductos.getValueAt(fila, 2).toString()) && comprobarSiNifExiste(TablaResultadosProductos.getValueAt(fila, 2).toString())) {

            if (verificarNombre(TablaResultadosProductos.getValueAt(fila, 3).toString())) {

                if (verificarImporte(TablaResultadosProductos.getValueAt(fila, 4).toString())) {

                    // si todos los datos estan correctos asignarlos al producto a modificar
                    productoModificar.setRefProducto(TablaResultadosProductos.getValueAt(fila, 2).toString());
                    productoModificar.setNombreProducto(TablaResultadosProductos.getValueAt(fila, 3).toString());
                    productoModificar.setImporteProducto(Double.valueOf(TablaResultadosProductos.getValueAt(fila, 4).toString()));

                    try {
                        // modificar el producto
                        controladorProductos.edit(productoModificar);
                    } catch (NonexistentEntityException ex) {
                        Logger.getLogger(VentanaAñadirProductos.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(VentanaAñadirProductos.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    // actualizar los datos de la tabla
                    actualizarTablaResultados();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Importe no valido o vacio");
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Nombre no puede estar vacío");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Referencia no valida o existente");
        }

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
            java.util.logging.Logger.getLogger(VentanaAñadirProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAñadirProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAñadirProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAñadirProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAñadirProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAñadirProductos;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JComboBox<String> DesplegableProveedores;
    private javax.swing.JTextField EntradaImporteProducto;
    private javax.swing.JTextField EntradaNombreProducto;
    private javax.swing.JTextField EntradaREFProducto;
    private javax.swing.JTable TablaResultadosProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
