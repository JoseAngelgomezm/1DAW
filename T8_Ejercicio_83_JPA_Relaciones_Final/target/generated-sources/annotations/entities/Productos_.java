package entities;

import entities.Facturas;
import entities.Proveedores;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-19T15:59:32", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, Proveedores> idProveedor;
    public static volatile SingularAttribute<Productos, String> refProducto;
    public static volatile SingularAttribute<Productos, Integer> idProducto;
    public static volatile SingularAttribute<Productos, Double> importeProducto;
    public static volatile ListAttribute<Productos, Facturas> facturasList;
    public static volatile SingularAttribute<Productos, String> nifProveedor;
    public static volatile SingularAttribute<Productos, String> nombreProducto;

}