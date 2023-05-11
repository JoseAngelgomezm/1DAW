/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author joseangel
 */
public interface InterfazDao {
    
    // Método para obtener todos los registros de la tabla facturas
    List<Factura> obtenerTodosRegistrosTabla() throws SQLException;
    
    // Méodo para obtener un registro a partir de la PK
    Factura buscarPorPK(int codigoFactura) throws SQLException;
    
    // Método para insertar una sola factura
    int insertarFactura (Factura cualquierFactura) throws SQLException;
    
    // Método para insertar varios registros pasando una lista de facturas
    int insertarListaFactura (List<Factura> listaDeFacturas) throws SQLException;
    
    // Método para borrar una factura
    int borrarFactura (Factura factura) throws SQLException;
    
    // Método para borrar toda la tabla
    int borrarTabla() throws SQLException;
    
    // Método para modificar una factura. Se modifica la factura que tenga la pk que se pasa por parametro
    // con los nuevos datos que traiga la factura 'facturaConLosDatosNuevos'
    int actualizarFactura (int pk_facturaModificar, Factura facturaConLosDatosNuevos) throws SQLException;
}
