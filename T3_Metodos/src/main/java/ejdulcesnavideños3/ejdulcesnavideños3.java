/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejdulcesnavideños3;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author joseangel
 */
public class ejdulcesnavideños3 {

    public static void main(String[] args) {
        //Declaracion variables para condiciones de bucles
        String codigo = "";
        int opcion;
        
        do {
            // Muestra el menu
            opcion = mostrarMenu();
            // si la opcion es 1 pedir el codigo de polvoron
            if (opcion == 1) {
                //pedir el codigo del polvoron hasta que sea un codigo
                //o ponga la palabra salir
                codigo = leerCodigo();
                // si es un codigo
                if (codigo.equals("M1") || codigo.equals("P1")
                        || codigo.equals("T1") || codigo.equals("T2")
                        || codigo.equals("M2")) {

                    //Pedir la materia prima hasta que sea un numero entre 0 y 1 ambos excluidos
                    double costeMateriaPrima = leerMateriaPrima();

                    //Pedir mano de obra hasta que sea un numero entre 0.5 y 1
                    double costeManoObra = leerManoObra();

                    //Calcular coste produccion
                    double costeProduccion = calcularCosteProduccion(costeManoObra, costeMateriaPrima);

                    //Calcular precio venta unitario
                    double precioVentaUnitario = calcularPrecioVentaUnitario(codigo, costeProduccion);

                    //Calcular unidades para llegar al beneficio
                    int unidadesNecesariasBeneficio = calcularUnidadesParaBeneficio(precioVentaUnitario, costeProduccion);

                    // Mostrar los resultados
                    String resultados = """
                                    Coste de produccion : %.3f
                                    Precio de venta unitario : %.3f
                                    Unidades a vender para %s : %d
                                   """.formatted(costeProduccion,
                            precioVentaUnitario, codigo,
                            unidadesNecesariasBeneficio);

                    JOptionPane.showMessageDialog(null, resultados);

                } // al no ser un codigo, es salir
                else {
                    JOptionPane.showMessageDialog(null, "SALIENDO");
                    codigo = "SALIR";
                }
            }
        } while (!codigo.equals("SALIR") && opcion != 2);
        // muestra el menu hasta que la opcion sea 2
        // o hasta que ponga salir en el menu de los codigos
    }

    //1 Mostrar menu inicial
    //Muestra el menu inicial hasta que la respuesta sea 1 o 2 y sin que se introzucan letras
    private static int mostrarMenu() {
        int opcion = 0;
        do {
            String mensaje = """
                             Introduce una opcion:
                             1-Hacer calculos
                             2-Salir
                             """;
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Introduce un numero 1-2.");
            }

            return opcion;
        } while (opcion < 1 || opcion > 2);
    }

    //2 leer codigos
    // Lee el codigo 
    private static String leerCodigo() {
        String codigo = "";
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
        } while (!filtrarCodigo(codigo));//Hasta que el metodo filtrar codigo devuelva true
       
        return codigo;
    }

    //3 filtrar codigos
    private static boolean filtrarCodigo(String codigo) {
        return (codigo.equals("M1") || codigo.equals("P1")
                || codigo.equals("T1") || codigo.equals("T2")
                || codigo.equals("M2") || codigo.equals("SALIR"));
    }

    //4 leer materia prima
    //pide el coste de la materia prima controlando que no se introduzcan numeros
    //y que el numero sea entre 0 y 1 ambos excluidos
    private static double leerMateriaPrima() {
        double costeMateriaPrima = 0;
        do {
            try {
                costeMateriaPrima = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de"
                        + " la materia prima entre 0 y 1"));
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Introduce un numero.");
            }
        } while (!filtrarMateriaPrima(costeMateriaPrima));
        return costeMateriaPrima;
    }

    //5 filtrar materia prima
    // devuelve true si el precio de la materia prima esta entre 0 y 1 ambos excluidos
    private static boolean filtrarMateriaPrima(double costeMateriaPrima) {
        return (costeMateriaPrima > 0 && costeMateriaPrima < 1);
    }

    //6 leer mano de obra
    // pide la mano de obra hasta que se cumpla la condicion de filtrar mano de obra
    // controlando que no se metan letras y que el numero sea entre 0.5 y 1 ambos incluidos
    private static double leerManoObra() {
        double costeManoObra = 0;
        do {
            try {
                 costeManoObra = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de"
                + " la mano de obra entre 0.5 y 1"));
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Introduce un numero.");
            }
        } while (!filtrarManoObra(costeManoObra));
        

        return costeManoObra;
    }

    //7 filtrar mano de obra
    // devuelve true si el precio de la materia prima esta entre 0.5 y 1 ambos incluidos
    private static boolean filtrarManoObra(double costeManoObra) {
        return (costeManoObra >= 0.5 && costeManoObra <= 1);
    }

    //8 calcular coste produccion
    // devuelve el coste de produccion haciendo el calculo con la mano de obra
    // y la materia prima
    private static double calcularCosteProduccion(double costeManoObra, double costeMateriaPrima) {
        double costeProduccion = costeManoObra + costeMateriaPrima;
        return costeProduccion;
    }

    //9 calcular precio venta unitario
    // si el precio de venta es m1 t2 o p1 hace los calculos con unos datos
    // sino el precio de venta se calcula con otros datos
    private static double calcularPrecioVentaUnitario(String codigo, double costeProduccion) {
        double precioVentaUnitario;
        if (codigo.equals("M1") || codigo.equals("T2")
                || codigo.equals("P1")) {
            // declarar la constante del porcentaje de venta
            final double PORCENTAJE_VENTA_M1_T2_P1 = 1.5;

            precioVentaUnitario = costeProduccion
                    + (costeProduccion * PORCENTAJE_VENTA_M1_T2_P1);

        } // Sino hacer el precio de venta unitario de T1 y M2 (65%)
        else {
            // declarar la constante del porcentaje de venta
            final double PORCENTAJE_VENTA_T1_M2 = 1.65;

            precioVentaUnitario = costeProduccion
                    + (costeProduccion * PORCENTAJE_VENTA_T1_M2);
        }
        return precioVentaUnitario;
    }

    //10 calcular unidades para llegar al beneficio
    // devuelve el precio de venta por unidad haciendo el calculo con el precio
    // de venta unitario y el coste de produccion
    private static int calcularUnidadesParaBeneficio(double precioVentaUnitario, double costeProduccion) {
        final double DINERO_A_LLEGAR = 2500;

        // ver cuanto es el beneficio precioVentaUnitario - costeProduccion 
        double beneficio = precioVentaUnitario - costeProduccion;

        // las ventas necesarias para llegar al dinero deseado
        int numeroVentasNecesarias = (int) Math.ceil((DINERO_A_LLEGAR / beneficio));

        return numeroVentasNecesarias;
    }
}
