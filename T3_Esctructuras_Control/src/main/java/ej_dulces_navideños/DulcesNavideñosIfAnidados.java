/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_dulces_navideños;

import javax.swing.JOptionPane;

/**
 *
 * @author joseangel
 */
public class DulcesNavideñosIfAnidados {
    public static void main(String[] args) {
        // Declaracion variables
        String codigo;
        int numeroVentasNecesarias;
        double costeProduccion;
        double costeMateriaPrima;
        double precioVentaUnitario;
        final double MANO_OBRA_M1_T1 = 0.15 ;
        final double MANO_OBRA_M2_T2_P1 = 0.22;
        final int DINERO_A_LLEGAR = 2500;
        
        // Pedir el codigo del polvoron
        String mensaje = """
                         Introduce un codigo de producto:
                         Mantecados de limón --> M1
                         Polvorones          --> P1
                         Turron de chocolate --> T1
                         Turron clasico      --> T2
                         Mazapanes           --> M2
                         """;
        // guardar el codigo del producto en mayuscula
        codigo = JOptionPane.showInputDialog(mensaje).toUpperCase();
        
        // Si el codigo de polvoron es correcto, pedir el coste de produccion
        if (codigo.equals("M1") || codigo.equals("P1") ||
                codigo.equals("T1") || codigo.equals("T2") ||
                codigo.equals("M2")) {
            
            costeMateriaPrima = Double.parseDouble
                (JOptionPane.showInputDialog("Introduce el importe de la "
                + "materia prima"));
            
            //Controlar que el precio de la materia prima sea menor que 1
            // y mayor que 0
            if (costeMateriaPrima > 0 && costeMateriaPrima <1) {
                //Una vez sea correcto, calcular el coste produccion
                // Si el codigo es M1 o T1 seleccionar el coste de estos
                if (codigo.equals("M1") || codigo.equals("T1")) {
                    costeProduccion = MANO_OBRA_M1_T1 + costeMateriaPrima;
                }
                // Sino hacer el coste de produccion con los datos de M2,T2,P1
                else {
                    costeProduccion = MANO_OBRA_M2_T2_P1 + costeMateriaPrima;
                }
                    
                // Calcular precio venta unitario de M1, T2, P1 y sacar las
                // ventas que necesitamos para llegar a 2500€
                if (codigo.equals("M1") || codigo.equals("T2") ||
                        codigo.equals("P1")){
                    // declarar la constante del porcentaje de venta
                    final double PORCENTAJE_VENTA_M1_T2_P1 = 1.5;
                    
                    precioVentaUnitario = costeProduccion + 
                            (costeProduccion * PORCENTAJE_VENTA_M1_T2_P1);
                    
                    numeroVentasNecesarias = (int) Math.ceil
                    ((DINERO_A_LLEGAR / precioVentaUnitario));
                }
                // Sino hacer el precio de venta unitario de T1 y M2 y sacar
                // las venta que necesitamos para llegar a 2500€
                else{
                    // declarar la constante del porcentaje de venta
                    final double PORCENTAJE_VENTA_T1_M2 = 1.65;
                    
                    precioVentaUnitario = costeProduccion + 
                            (costeProduccion * PORCENTAJE_VENTA_T1_M2);
                    
                    numeroVentasNecesarias = (int) Math.ceil
                    ((DINERO_A_LLEGAR / precioVentaUnitario));
                }
                
                // Mostrar los resultados
                String resultados = """
                                    Coste de produccion : %.3f
                                    Precio de venta unitario : %.3f
                                    Unidades a vender para %s : %d
                                   """.formatted(costeProduccion,
                                           precioVentaUnitario,codigo,
                                           numeroVentasNecesarias);
                
                JOptionPane.showMessageDialog(null, resultados);
                
                
            }
            // Si el precio materia prima es erroneo
            else {
                JOptionPane.showMessageDialog(null, "El precio "
                        + "de la materia prima es erroneo");
            }
            
        }
        // Si el codigo del polvoron no existe
        else {
            JOptionPane.showMessageDialog(null, "El codigo "
                    + "del polvoron es erroneo");
        }
    }
}
