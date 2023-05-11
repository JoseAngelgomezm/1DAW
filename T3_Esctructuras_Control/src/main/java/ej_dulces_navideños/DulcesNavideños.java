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
public class DulcesNavideños {

    public static void main(String[] args) {
        String codigo;
        double costeProduccion;
        double materiaPrima;
        double precioVentaUnitario;
        int unidadesAvender;
        final double PORCENTAJE_BENEFICIO_M1_M2_P1 = 1.5;
        final double PORCENTAJE_BENEFICIO_T1_T2 = 1.65;
        final double COSTE_MANO_OBRA_M1_T1 = 0.15;
        final double COSTE_MANO_OBRA_M2_T2_P1 = 0.23;
        final double DINERO_A_OBTENER = 2500;

        // Mensaje para pedir el polvoron
        String mensaje = """
                         ------- LA ESTEPONERA TURRONERA -------
                         
                            INTRODUZCA EL CODIGO DEL POLVORON   
                         """;

        //Guardamos el codigo del polvoron en mayuscula para evaluarlo
        codigo = JOptionPane.showInputDialog(mensaje).toUpperCase();

        // Segun el codigo del polvoron, debemos hacer una serie de cosas
        switch (codigo) {
            case "M1":
                // Mensaje de seleccion
                JOptionPane.showMessageDialog(null,
                        "--- Mantecados de Limón --- ");
                // Determinar el coste de produccion de M1
                //Pedir el coste de la materia prima siempre siendo mayor que 0
                // y menor que 1
                materiaPrima = Double.parseDouble
                        (JOptionPane.showInputDialog("Introduce el precio "
                        + "de la materia prima para M1 (MANTECADOS DE LIMON)"));
                // Si el precio es mayor que 0 y menor que 1 hacer el coste 
                // de produccion sino, mensaje de error
                if (materiaPrima > 0 && materiaPrima <= 1) {
                    //coste de produccion
                    costeProduccion = materiaPrima + COSTE_MANO_OBRA_M1_T1;
                    
                    //Precio de venta por unidad
                    precioVentaUnitario = costeProduccion
                            + (costeProduccion * PORCENTAJE_BENEFICIO_M1_M2_P1);
                    
                    //Calcular unidades para tener un beneficio de 2500€
                    unidadesAvender =  (int) Math.ceil(
                            (DINERO_A_OBTENER / precioVentaUnitario))
                    ;
                    
                    
                    // Mostrar resultados
                    String resultados = """
                                        Coste Produccion : %.3f
                                        Precio de venta unitario : %.3f
                                        Unidades que deben venderse para 2500€: %d
                                        """.formatted(costeProduccion,
                                                precioVentaUnitario,
                                                unidadesAvender);
                    
                    JOptionPane.showMessageDialog(null, resultados);
                    

                } else {
                    JOptionPane.showMessageDialog(null, 
                            "ERROR! El precio de la"
                            + " materia prima es erroneo");
                }
                break;

            case "P1":
                // Mensaje de seleccion
                JOptionPane.showMessageDialog(null,
                        "--- Polvorones --- ");
                // Determinar el coste de produccion de P1
                //Pedir el coste de la materia prima siempre siendo mayor que 0
                // y menor que 1
                materiaPrima = Double.parseDouble
                        (JOptionPane.showInputDialog("Introduce el precio "
                        + "de la materia prima para P1 (Polvorones)"));
                
                // Si el precio es mayor que 0 y menor que 1 hacer el coste 
                // de produccion sino, mensaje de error
                if (materiaPrima > 0 && materiaPrima <= 1) {
                    //coste de produccion
                    costeProduccion = materiaPrima + COSTE_MANO_OBRA_M2_T2_P1;
                    
                    //Precio de venta por unidad
                    precioVentaUnitario = costeProduccion
                            + (costeProduccion * PORCENTAJE_BENEFICIO_M1_M2_P1);
                    
                    //Calcular unidades para tener un beneficio de 2500€
                    unidadesAvender =  (int) Math.ceil(
                            (DINERO_A_OBTENER / precioVentaUnitario))
                    ;
                    
                    
                    // Mostrar resultados
                    String resultados = """
                                        Coste Produccion : %.3f
                                        Precio de venta unitario : %.3f
                                        Unidades que deben venderse para 2500€: %d
                                        """.formatted(costeProduccion,
                                                precioVentaUnitario,
                                                unidadesAvender);
                    
                    JOptionPane.showMessageDialog(null, resultados);
                    

                } else {
                    JOptionPane.showMessageDialog(null, 
                            "ERROR! El precio de la"
                            + " materia prima es erroneo");
                }
                break;

            case "T1":
                // Mensaje Seleccion
                JOptionPane.showMessageDialog(null,
                        "--- Turrón de chocolate --- ");
                
                //Determinar el coste de produccion de T1
                //Pedir el coste de la materia prima siempre siendo mayor que 0
                // y menor que 1
                materiaPrima = Double.parseDouble
                        (JOptionPane.showInputDialog("Introduce el precio "
                        + "de la materia prima para T1 (Turrón de chocolate)"));
                
                // Si el precio es mayor que 0 y menor que 1 hacer el coste 
                // de produccion sino, mensaje de error
                if (materiaPrima > 0 && materiaPrima <= 1) {
                    //coste de produccion
                    costeProduccion = materiaPrima + COSTE_MANO_OBRA_M1_T1;
                    
                    //Precio de venta por unidad
                    precioVentaUnitario = costeProduccion
                            + (costeProduccion * PORCENTAJE_BENEFICIO_T1_T2 );
                    
                    //Calcular unidades para tener un beneficio de 2500€
                    unidadesAvender =  (int) Math.ceil(
                            (DINERO_A_OBTENER / precioVentaUnitario))
                    ;
                    
                    
                    // Mostrar resultados
                    String resultados = """
                                        Coste Produccion : %.3f
                                        Precio de venta unitario : %.3f
                                        Unidades que deben venderse para 2500€: %d
                                        """.formatted(costeProduccion,
                                                precioVentaUnitario,
                                                unidadesAvender);
                    
                    JOptionPane.showMessageDialog(null, resultados);
                    

                } else {
                    JOptionPane.showMessageDialog(null, 
                            "ERROR! El precio de la"
                            + " materia prima es erroneo");
                }
                break;

            case "T2":
                // Mensaje Seleccion
                JOptionPane.showMessageDialog(null,
                        "--- Turrón clásico --- ");
                
                //Determinar el coste de produccion de T2
                //Pedir el coste de la materia prima siempre siendo mayor que 0
                // y menor que 1
                materiaPrima = Double.parseDouble
                        (JOptionPane.showInputDialog("Introduce el precio "
                        + "de la materia prima para T2 (Turrón clásico)"));
                
                // Si el precio es mayor que 0 y menor que 1 hacer el coste 
                // de produccion sino, mensaje de error
                if (materiaPrima > 0 && materiaPrima <= 1) {
                    //coste de produccion
                    costeProduccion = materiaPrima + COSTE_MANO_OBRA_M2_T2_P1;
                    
                    //Precio de venta por unidad
                    precioVentaUnitario = costeProduccion
                            + (costeProduccion * PORCENTAJE_BENEFICIO_T1_T2 );
                    
                    //Calcular unidades para tener un beneficio de 2500€
                    unidadesAvender =  (int) Math.ceil(
                            (DINERO_A_OBTENER / precioVentaUnitario))
                    ;
                    
                    
                    // Mostrar resultados
                    String resultados = """
                                        Coste Produccion : %.3f
                                        Precio de venta unitario : %.3f
                                        Unidades que deben venderse para 2500€: %d
                                        """.formatted(costeProduccion,
                                                precioVentaUnitario,
                                                unidadesAvender);
                    
                    JOptionPane.showMessageDialog(null, resultados);
                    

                } else {
                    JOptionPane.showMessageDialog(null, 
                            "ERROR! El precio de la"
                            + " materia prima es erroneo");
                }
                break;

            case "M2":
                // Mensaje seleccion
                JOptionPane.showMessageDialog(null,
                        "--- Mazapanes --- ");
                
                //Determinar el coste de produccion de M2
                //Pedir el coste de la materia prima siempre siendo mayor que 0
                // y menor que 1
                materiaPrima = Double.parseDouble
                        (JOptionPane.showInputDialog("Introduce el precio "
                        + "de la materia prima para M2 (Turrón clásico)"));
                
                // Si el precio es mayor que 0 y menor que 1 hacer el coste 
                // de produccion sino, mensaje de error
                if (materiaPrima > 0 && materiaPrima <= 1) {
                    //coste de produccion
                    costeProduccion = materiaPrima + COSTE_MANO_OBRA_M2_T2_P1;
                    
                    //Precio de venta por unidad
                    precioVentaUnitario = costeProduccion
                            + (costeProduccion *  PORCENTAJE_BENEFICIO_M1_M2_P1);
                    
                    //Calcular unidades para tener un beneficio de 2500€
                    unidadesAvender =  (int) Math.ceil(
                            (DINERO_A_OBTENER / precioVentaUnitario))
                    ;
                    
                    
                    // Mostrar resultados
                    String resultados = """
                                        Coste Produccion : %.3f
                                        Precio de venta unitario : %.3f
                                        Unidades que deben venderse para 2500€: %d
                                        """.formatted(costeProduccion,
                                                precioVentaUnitario,
                                                unidadesAvender);
                    
                    JOptionPane.showMessageDialog(null, resultados);
                    

                } else {
                    JOptionPane.showMessageDialog(null, 
                            "ERROR! El precio de la"
                            + " materia prima es erroneo");
                }
                break;

            default:
                JOptionPane.showMessageDialog(null,
                        "--- El Codigo es ERRONEO --- ");
        }

    }
}
