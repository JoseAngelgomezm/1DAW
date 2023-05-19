package entities;

import entities.Clientes;
import entities.FacturasPK;
import entities.Productos;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-19T15:59:32", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Facturas.class)
public class Facturas_ { 

    public static volatile SingularAttribute<Facturas, Double> importeTotal;
    public static volatile SingularAttribute<Facturas, FacturasPK> facturasPK;
    public static volatile SingularAttribute<Facturas, Integer> cantidadProductos;
    public static volatile SingularAttribute<Facturas, Date> fechaFactura;
    public static volatile SingularAttribute<Facturas, Clientes> clientes;
    public static volatile SingularAttribute<Facturas, Productos> productos;

}