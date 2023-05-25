/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Aplicacion;

import entities.Clientes;
import entities.Facturas;
import entities.FacturasPK;
import entities.Productos;
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
public class VentanaGenerarFacturas extends javax.swing.JFrame {

    // atributos del JForm
    private final EntityManagerFactory emf;
    private final controllers.FacturasJpaController controladorFacturas;
    private final controllers.ClientesJpaController controladorClientes;
    private final controllers.ProductosJpaController controladorProductos;

    /**
     * Creates new form VentanaAñadirProveedores2
     */
    public VentanaGenerarFacturas() {
        initComponents();
        this.emf = Persistence.createEntityManagerFactory("bdp83");
        // crear el controlador pasandole el manejador de entidades
        this.controladorFacturas = new controllers.FacturasJpaController(emf);
        this.controladorClientes = new controllers.ClientesJpaController(emf);
        this.controladorProductos = new controllers.ProductosJpaController(emf);
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
        BotonAñadirFactura = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        DesplegableProductos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EntradaCantidad = new javax.swing.JTextField();
        BotonRegresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        DesplegableClientes = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaResultados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonAñadirFactura.setText("Añadir Factura");
        BotonAñadirFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAñadirFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setText("Generar Factura");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jPanel1.add(DesplegableProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 120, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Selecciona Producto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 290, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Cantidad productos:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));
        jPanel1.add(EntradaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 120, 30));

        BotonRegresar.setText("Regresar");
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Selecciona Cliente:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jPanel1.add(DesplegableClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 120, 30));

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
        ));
        jScrollPane1.setViewportView(TablaResultados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 640, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean verificarFecha(String fecha) {

        // crear una expresion para que se introduzca una fecha con el patron "MM-dd-yyy"
        // crear el patron con un string
        final String regexFecha = "^\\d{1,2}-\\d{1,2}-\\d{4}$";
        // crear el texto que vamos a comprobar que cumple la expresion regular
        final String pruebaFechaNacimiento = fecha;

        // crear el pattern y pasarle el patron
        final Pattern patternFechaNacimiento = Pattern.compile(regexFecha, Pattern.UNIX_LINES);
        // crear el matcher pasandole el texto a comprobar
        final Matcher matcherFechaNacimiento = patternFechaNacimiento.matcher(pruebaFechaNacimiento);

        // si la fecha introducida coincide
        if (matcherFechaNacimiento.matches()) {
            // intentar parsear la fecha y establecer la fecha de nacimiento
            return true;
        } else {
            return false;
        }
    }

    private boolean verificarCantidad(String cantidad) {
        // fecha nacimiento
        // crear una expresion para que se introduzca una fecha con el patron "yyyy-MM-dd"
        // crear el patron con un string
        final String regexFecha = "[0-9]+";
        // crear el texto que vamos a comprobar que cumple la expresion regular
        final String pruebaFechaNacimiento = cantidad;

        // crear el pattern y pasarle el patron
        final Pattern patternFechaNacimiento = Pattern.compile(regexFecha, Pattern.UNIX_LINES);
        // crear el matcher pasandole el texto a comprobar
        final Matcher matcherFechaNacimiento = patternFechaNacimiento.matcher(pruebaFechaNacimiento);

        // si la fecha introducida coincide
        if (matcherFechaNacimiento.matches()) {
            // intentar parsear la fecha y establecer la fecha de nacimiento
            return true;
        } else {
            return false;
        }
    }

    private void actualizarTablaResultados() {
        // crear un modelo para la tabla con la columna 0 y 1 no editable
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0 || column == 1) {
                    return false;
                }
                return true;
            }

        };

        // obtener todos los registros de las facturas
        List<Facturas> listaFacturas = this.controladorFacturas.findFacturasEntities();

        // crear las columnas que va a tener nuestra tabla        
        String[] columnas = {"ID_cliente", "ID_Producto", "Cantidad_Prodcutos", "Fecha_Factura", "Importe_Total"};

        // poner los identificadores de los campos en el modelo
        modelo.setColumnIdentifiers(columnas);

        // recorrer la lista
        for (Facturas f : listaFacturas) {
            // añadir los datos de cada factura a un array de object
            Object[] datosFilaFactura = {f.getFacturasPK().getIdCliente(), f.getFacturasPK().getIdProducto(), f.getCantidadProductos(), f.getFacturasPK().getFechaFactura(), f.getImporteTotal()};
            // añadir el array de object como una fila del modelo de la tabla
            modelo.addRow(datosFilaFactura);
        }

        // establecer el modelo a la tabla
        this.TablaResultados.setModel(modelo);
    }

    private void BotonAñadirFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirFacturaActionPerformed
        // TODO add your handling code here:
        // crear una nueva factura
        Facturas facturaNueva = new Facturas();

        // obtener el dato del desplegable de clientes
        String clienteSeleccionado = DesplegableClientes.getSelectedItem().toString();
        
        // obtener el id de ese cliente
        int id_cliente = Character.getNumericValue(clienteSeleccionado.charAt(0));

        // buscar el cliente
        Clientes clienteAsignado = controladorClientes.findClientes(id_cliente);

        // obtener el dato del desplegable de productos
        String productoSeleccionado = DesplegableProductos.getSelectedItem().toString();
        
        // obtener el id de ese producto
        int id_producto = Character.getNumericValue(productoSeleccionado.charAt(0));

        // buscar el producto
        Productos productoAsignado = controladorProductos.findProductos(id_producto);

        // asignar el cliente a la nueva factura
        facturaNueva.setClientes(clienteAsignado);
        // asignar el prodcuto a la nueva factura
        facturaNueva.setProductos(productoAsignado);
        
       // crear el objeto que contiene las primary keys de la factura
        FacturasPK facturapk = new FacturasPK(clienteAsignado.getIdCliente(), productoAsignado.getIdProducto(), new Date());
        
        // verificar los demas datos de entrada
        // cantidad
        if (verificarCantidad(EntradaCantidad.getText())) {

            // si todos los datos estan correctos asignarlos
            facturaNueva.setCantidadProductos(Integer.valueOf(EntradaCantidad.getText()));

            // poner el importe a la factura
            facturaNueva.setImporteTotal(Double.valueOf(EntradaCantidad.getText()) * productoAsignado.getImporteProducto());
            
            //asginar las claves primarias
            facturaNueva.setFacturasPK(facturapk);
            
            try {
                // insertar la nueva factura
                controladorFacturas.create(facturaNueva);
            } catch (Exception ex) {
                Logger.getLogger(VentanaGenerarFacturas.class.getName()).log(Level.SEVERE, null, ex);
            }

            // actualizar la lista de datos
            actualizarTablaResultados();

        } else {
            JOptionPane.showMessageDialog(rootPane, "La cantidad no es valida");
        }

    }//GEN-LAST:event_BotonAñadirFacturaActionPerformed

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        // TODO add your handling code here:
        Main_Aplicacion_83 ventana = new Main_Aplicacion_83();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        actualizarTablaResultados();

        // obtener clientes
        List<Clientes> listaClientes = controladorClientes.findClientesEntities();
        for (Clientes c : listaClientes) {
            DesplegableClientes.addItem(c.getIdCliente() + "-" + c.getNifCliente());
        }

        // obtener productos
        List<Productos> listaProductos = controladorProductos.findProductosEntities();
        for (Productos p : listaProductos) {
            DesplegableProductos.addItem(p.getIdProducto() + "-" + p.getRefProducto());
        }

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
            java.util.logging.Logger.getLogger(VentanaGenerarFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGenerarFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGenerarFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGenerarFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaGenerarFacturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAñadirFactura;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JComboBox<String> DesplegableClientes;
    private javax.swing.JComboBox<String> DesplegableProductos;
    private javax.swing.JTextField EntradaCantidad;
    private javax.swing.JTable TablaResultados;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
