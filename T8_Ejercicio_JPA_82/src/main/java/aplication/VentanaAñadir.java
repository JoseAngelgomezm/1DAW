/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplication;

import controlers.FacturasJpaController;
import entities.Facturas;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Angel
 */
public class VentanaAñadir extends javax.swing.JFrame {

    // atributos del JFORM
    private EntityManagerFactory emf;
    private controlers.FacturasJpaController controlador;

    /**
     * Creates new form VentanaAñadir
     */
    public VentanaAñadir() {
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
        EntradaFecha = new javax.swing.JTextField();
        EntradaDescripcion = new javax.swing.JTextField();
        EntradaImporte = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotonInsertar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(76, 76, 109));
        jPanel1.setForeground(new java.awt.Color(255, 225, 148));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonRegresar.setBackground(new java.awt.Color(255, 225, 148));
        BotonRegresar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BotonRegresar.setForeground(new java.awt.Color(76, 76, 109));
        BotonRegresar.setText("Regresar");
        BotonRegresar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(232, 246, 239)));
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 140, -1));

        EntradaFecha.setBackground(new java.awt.Color(232, 246, 239));
        EntradaFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaFechaActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 240, 30));

        EntradaDescripcion.setBackground(new java.awt.Color(232, 246, 239));
        EntradaDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaDescripcionActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 240, 30));

        EntradaImporte.setBackground(new java.awt.Color(232, 246, 239));
        EntradaImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaImporteActionPerformed(evt);
            }
        });
        jPanel1.add(EntradaImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 240, 30));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 225, 148));
        jLabel2.setText("Fecha:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 110, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 225, 148));
        jLabel3.setText("Descripcion:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 200, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 225, 148));
        jLabel4.setText("Importe:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 140, -1));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(27, 156, 133));
        jLabel5.setText("Insertar Factura");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        BotonInsertar.setBackground(new java.awt.Color(27, 156, 133));
        BotonInsertar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BotonInsertar.setForeground(new java.awt.Color(232, 246, 239));
        BotonInsertar.setText("Ingresar Datos");
        BotonInsertar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(232, 246, 239)));
        BotonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 220, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 460));

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

    private void EntradaFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaFechaActionPerformed

    private void EntradaDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaDescripcionActionPerformed

    private void EntradaImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaImporteActionPerformed

    private void BotonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertarActionPerformed
        // TODO add your handling code here:

        // obtener todos los registros de las facturas
        List<Facturas> listaFacturas = controlador.findFacturasEntities();

        // crear la facturas con los datos vacios
        Facturas facturaIntroducir = new Facturas();

        // si la lista de facturas esta vacia poner el codigo a 1
        if (listaFacturas.isEmpty()) {
            facturaIntroducir.setCodigo(1);
            // sino obtener la ultima factura y ponerle el codigo de esa +1
        } else {
            int indiceUltima = listaFacturas.size() - 1;
            Facturas ultimaFactura = listaFacturas.get(indiceUltima);
            int codigo = ultimaFactura.getCodigo() + 1;
            // ponerle el codigo a la factura a introducir de la ultima +1
            facturaIntroducir.setCodigo(codigo);
        }

        // crear una expresion para que se introduzca una fecha con el patron "yyyy-MM-dd"
        // crear el patron con un string
        final String patron1 = "\\d{4}-\\d{2}-\\d{2}";
        // crear el texto que vamos a comprobar que cumple la expresion regular
        final String prueba1 = EntradaFecha.getText();

        // crear el pattern y pasarle el patron
        final Pattern pattern1 = Pattern.compile(patron1, Pattern.UNIX_LINES);
        // crear el matcher pasandole el texto a comprobar
        final Matcher matcher1 = pattern1.matcher(prueba1);

        // si la fecha introducida coincide
        if (matcher1.matches()) {
            // intentar parsear la fecha y establecer la fecha a la factura
            try {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date fecha = formatter.parse(EntradaFecha.getText());
                facturaIntroducir.setFecha(fecha);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(rootPane, "FECHA no se ha podido convertir");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "FECHA no valida");
        }

        // crear una expresion para que se introduzca una descripcion
        // crear el patron con un string de cualquier longitud
        final String patron2 = ".+";
        // crear el texto que vamos a comprobar que cumple la expresion regular
        final String prueba2 = EntradaDescripcion.getText();

        // crear el pattern y pasarle el patron
        final Pattern pattern2 = Pattern.compile(patron2, Pattern.UNIX_LINES);
        // crear el matcher pasandole el texto a comprobar
        final Matcher matcher2 = pattern2.matcher(prueba2);

        // si el string coincide
        if (matcher2.matches()) {
            facturaIntroducir.setDescripcion(EntradaDescripcion.getText());
        } else {
            JOptionPane.showMessageDialog(rootPane, "DESCRIPCION no valida");
        }

        // crear una expresion para que se introduzca un importe
        // crear el patron con double de maximo 4 digitos
        final String patron3 = "\\d+(\\.\\d{1,4})?";
        // crear el texto que vamos a comprobar que cumple la expresion regular
        final String prueba3 = EntradaImporte.getText();

        // crear el pattern y pasarle el patron
        final Pattern pattern3 = Pattern.compile(patron3, Pattern.UNIX_LINES);
        // crear el matcher pasandole el texto a comprobar
        final Matcher matcher3 = pattern3.matcher(prueba3);

        // si el string coincide pasarlo a double y establecerlo en la factura
        if (matcher3.matches()) {
            facturaIntroducir.setImporte(Double.valueOf(EntradaImporte.getText()));
        } else {
            JOptionPane.showMessageDialog(rootPane, "IMPORTE no valido");
        }

        // comprobar que la factura a introducir no tienes campos a null
        if (facturaIntroducir.getDescripcion() != null && facturaIntroducir.getFecha() != null
                && facturaIntroducir.getImporte() != null) {
            // intentar introducir la factura
            try {
                controlador.create(facturaIntroducir);
                JOptionPane.showMessageDialog(rootPane, "Factura Introducida correctamente :)");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Error al añadir factura");
            }
        }

    }//GEN-LAST:event_BotonInsertarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAñadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAñadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAñadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAñadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAñadir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInsertar;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JTextField EntradaDescripcion;
    private javax.swing.JTextField EntradaFecha;
    private javax.swing.JTextField EntradaImporte;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
