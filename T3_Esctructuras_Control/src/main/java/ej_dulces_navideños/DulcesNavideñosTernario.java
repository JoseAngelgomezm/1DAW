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
public class DulcesNavideñosTernario {
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
                // Sino seleccionar M2,T2,P1
                double manoObra = (codigo.equals("M1") ||
                        codigo.equals("T1")) ? MANO_OBRA_M1_T1 :
                        MANO_OBRA_M2_T2_P1;
                // Una vez sabemos el coste de mano obra, realizar operacion
                costeProduccion = costeMateriaPrima + manoObra;
                    
                // Calcular precio venta unitario para M1,T2,P1 = 1.5
                // Sino calcular precio venta unitario para T1,M2 = 1.65
                final double PORCENTAJE_BENEFICIO_M1_T2_P1 = 1.5;
                final double PORCENTAJE_BENEFICIO_T1_M2 = 1.65;
                double beneficio = (codigo.equals("M1") ||
                        codigo.equals("T2") || 
                        codigo.equals ("P1")) ? 
                        PORCENTAJE_BENEFICIO_M1_T2_P1 : PORCENTAJE_BENEFICIO_T1_M2;
                
                // Una vez tenemos seleccionado el porcentaje beneficio sacamos
                // el precio venta unitario total
                precioVentaUnitario = costeProduccion * beneficio;
                
                // Una vez tenemos el precio de venta unitario, sacar las unidades
                // necesarias para llegar a 2500
                    numeroVentasNecesarias = (int) Math.ceil
                    ((DINERO_A_LLEGAR / precioVentaUnitario));
                
                
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
