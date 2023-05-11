/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joseangel
 */
public class FacturaDAO implements InterfazDao {

    private Connection conexion1 = null;

    public FacturaDAO() {
        conexion1 = Conexion.getInstance();
    }

    @Override
    public List<Factura> obtenerTodosRegistrosTabla() throws SQLException {
        List<Factura> listaFacturas = new ArrayList<>();

        // Preparamos la consulta de datos mediante un objeto Statement
        // ya que no necesitamos parametrizar la sentencia SQL
        try ( Statement st = conexion1.createStatement()) {
            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            ResultSet resultado = st.executeQuery("select * from facturas");
            // Ahora construimos la lista, recorriendo el ResultSet y mapeando los datos
            while (resultado.next()) {
                // Recogemos los datos de la persona, guardamos en un objeto
                Factura f = new Factura(resultado.getInt("codigo"),
                        resultado.getDate("fecha").toLocalDate(),
                        resultado.getString("descripcion"),
                        resultado.getDouble("importe"));

                //Añadimos el objeto a la lista
                listaFacturas.add(f);
            }
        }

        return listaFacturas;
    }

    @Override
    public Factura buscarPorPK(int codigoFactura) throws SQLException {
        ResultSet resultado = null;
        Factura factura = new Factura();

        String sql = "select * from facturas where codigo = ?";

        try ( PreparedStatement prest = conexion1.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setInt(1, codigoFactura);

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            resultado = prest.executeQuery();

            // Nos posicionamos en el primer registro del Resultset. Sólo debe haber una fila
            // si existe esa pk
            if (resultado.next()) {
                // Recogemos los datos de la factura, guardamos en un objeto
                factura.setCodigo(resultado.getInt("codigo"));
                factura.setDescripcion(resultado.getString("descripcion"));
                factura.setFecha(resultado.getDate("fecha").toLocalDate());
                factura.setImporte(resultado.getDouble("importe"));
                return factura;
            }

            return null;
        }
    }

    @Override
    public int insertarFactura(Factura cualquierFactura) throws SQLException {
        int numFilas = 0;
        String sql = "insert into facturas values (?,?,?,?)";

        // si existe un registro con esa primary key, no se hace la inserccion
        if (buscarPorPK(cualquierFactura.getCodigo()) != null) {

            // No se hace la inserción y se devuelve que se han insertado 0 filas
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try ( PreparedStatement prest = conexion1.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setInt(1, cualquierFactura.getCodigo());
                prest.setDate(2, Date.valueOf(cualquierFactura.getFecha()));
                prest.setString(3, cualquierFactura.getDescripcion());
                prest.setDouble(4, cualquierFactura.getImporte());

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }
    }

    @Override
    public int insertarListaFactura(List<Factura> listaDeFacturas) throws SQLException {
        int numFilas = 0;

        // por cada factura de la lista que pasamos por parametro
        for (Factura tmp : listaDeFacturas) {
            // sumamos 1 a numero de filas por casa factura insertada
            numFilas += insertarFactura(tmp);
        }

        return numFilas;
    }

    @Override
    public int borrarFactura(Factura factura) throws SQLException {
        int numFilas = 0;

        String sql = "delete from facturas where codigo = ?";

        // Sentencia parametrizada
        try ( PreparedStatement prest = conexion1.prepareStatement(sql)) {

            // Establecemos los parámetros de la sentencia
            prest.setInt(1, factura.getCodigo());
            // Ejecutamos la sentencia
            numFilas = prest.executeUpdate();
        }
        return numFilas;
    }

    @Override
    public int borrarTabla() throws SQLException {
        String sql = "delete from facturas";

        int nfilas = 0;

        // Preparamos el borrado de datos  mediante un Statement
        // No hay parámetros en la sentencia SQL
        try ( Statement st = conexion1.createStatement()) {
            // Ejecución de la sentencia
            nfilas = st.executeUpdate(sql);
        }

        // El borrado se realizó con éxito, devolvemos filas afectadas
        return nfilas;
    }

    @Override
    public int actualizarFactura(int pk_facturaModificar, Factura facturaConLosDatosNuevos) throws SQLException {
        int numFilas = 0;
        String sql = "update facturas set fecha = ?, descripcion = ?, importe = ? where codigo = ?";
        
        // asegurarse de que la pk de la factura que queremos modificar existe en la tabla
        if (buscarPorPK(pk_facturaModificar) == null) {
            // La factura a actualizar no existe
            return numFilas;
            
        // si existe podemos actualizacion
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try ( PreparedStatement prest = conexion1.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setDate(1, Date.valueOf(facturaConLosDatosNuevos.getFecha()));
                prest.setString(2,facturaConLosDatosNuevos.getDescripcion());
                prest.setDouble(3, facturaConLosDatosNuevos.getImporte());
                prest.setInt(4, pk_facturaModificar);

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }
    }

}
