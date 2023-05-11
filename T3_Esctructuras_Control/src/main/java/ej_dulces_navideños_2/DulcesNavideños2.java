
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_dulces_navideños_2;

import javax.swing.JOptionPane;

/**
 *
 * @author joseangel
 */
public class DulcesNavideños2 {

    public static void main(String[] args) {
        // Declaracion variables
        String codigo = "";
        int numeroVentasNecesarias;
        double costeProduccion;
        double costeMateriaPrima;
        double precioVentaUnitario;
        double precioManoObra;
        final int DINERO_A_LLEGAR = 2500;
        int resultadoOpcion;
        // Repetir hasta que se ingresa el codigo 2 o hasta que se ingrese
        // salir una vez entremos en la opcion de calculos
        do {

            do {
                // Pedir la opcion deseada hasta que sea 1 o 2
                String opcion = """
                           Introduce una opcion:
                           1-Hacer calculos
                           2-Salir
                           """;
                resultadoOpcion = Integer.parseInt(JOptionPane.showInputDialog(opcion));
            } while (resultadoOpcion < 1 || resultadoOpcion > 2);

            // Si el resultado de la opcion es 1 hacer los calculos
            if (resultadoOpcion == 1) {
                // Pedir el codigo del polvoron hasta que sea correcto
                do {
                    String mensaje = """
                         Introduce un codigo de producto:
                         Mantecados de limón --> M1
                         Polvorones          --> P1
                         Turron de chocolate --> T1
                         Turron clasico      --> T2
                         Mazapanes           --> M2
                         O ESCRIBRE SALIR PARA ACABAR LA EJECUCION
                         """;
                    // guardar el codigo del producto en mayuscula
                    codigo = JOptionPane.showInputDialog(mensaje).toUpperCase();
                    // mientras no sea m1 p1 t1 t2 o m2 se repite
                } while (!codigo.equals("M1") && !codigo.equals("P1")
                        && !codigo.equals("T1") && !codigo.equals("T2")
                        && !codigo.equals("M2") && !codigo.equals("SALIR"));
                
                // Si el codigo es valido
                if (codigo.equals("M1") || codigo.equals("P1")
                        || codigo.equals("T1") || codigo.equals("T2")
                        || codigo.equals("M2")) {
                    //Controlar que el precio de la materia prima sea menor que 1
                    // o mayor que 0, si no lo es pedirlo de nuevo
                    do {
                        costeMateriaPrima = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de"
                                + " la materia prima entre 0 y 1"));
                    } while (costeMateriaPrima < 0 || costeMateriaPrima > 1);

                    //Una vez sea correcto, pedir el coste de la mano de obra
                    // controlando que sea entre 0.5 y 1
                    do {
                        precioManoObra = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de"
                                + " la mano de obra entre 0.5 y 1"));
                    } while (precioManoObra < 0.5 || precioManoObra > 1);

                    // Calcular el precio de coste de produccion con
                    // precio mano obra y  materia prima
                    costeProduccion = precioManoObra + costeMateriaPrima;

                    // Calcular precio venta unitario con coste produccion
                    // previamente calculado
                    // Para M1 T2 y P2 el precio de venta depende del porcentaje
                    // de la venta (50%)
                    if (codigo.equals("M1") || codigo.equals("T2")
                            || codigo.equals("P1")) {
                        // declarar la constante del porcentaje de venta
                        final double PORCENTAJE_VENTA_M1_T2_P1 = 1.5;

                        precioVentaUnitario = costeProduccion
                                + (costeProduccion * PORCENTAJE_VENTA_M1_T2_P1);

                        // ver cuanto es el beneficio precioVentaUnitario - costeProduccion 
                        double beneficio = precioVentaUnitario - costeProduccion;

                        // las ventas necesarias para llegar al dinero deseado
                        numeroVentasNecesarias = (int) Math.ceil((DINERO_A_LLEGAR / beneficio));
                    } // Sino hacer el precio de venta unitario de T1 y M2 (65%)
                    else {
                        // declarar la constante del porcentaje de venta
                        final double PORCENTAJE_VENTA_T1_M2 = 1.65;

                        precioVentaUnitario = costeProduccion
                                + (costeProduccion * PORCENTAJE_VENTA_T1_M2);

                        // ver cuanto es el beneficio precioVentaUnitario - costeProduccion 
                        double beneficio = precioVentaUnitario - costeProduccion;

                        // las ventas necesarias para llegar al dinero deseado
                        numeroVentasNecesarias = (int) Math.ceil((DINERO_A_LLEGAR / beneficio));
                    }

                    // Mostrar los resultados
                    String resultados = """
                                    Coste de produccion : %.3f
                                    Precio de venta unitario : %.3f
                                    Unidades a vender para %s : %d
                                   """.formatted(costeProduccion,
                            precioVentaUnitario, codigo,
                            numeroVentasNecesarias);

                    JOptionPane.showMessageDialog(null, resultados);
                }
                // si el codigo es salir
                else {
                    codigo = "SALIR";
                }
            }
            // repetir el bucle hasta que el codigo sea salir o la opcion sea 2
        } while (!codigo.equals("SALIR") && resultadoOpcion != 2);
    }
}
