package entities;

import entities.Productos;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-22T09:20:19", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Proveedores.class)
public class Proveedores_ { 

    public static volatile SingularAttribute<Proveedores, String> nombreProveedor;
    public static volatile SingularAttribute<Proveedores, String> direccionProveedor;
    public static volatile SingularAttribute<Proveedores, Integer> idProveedor;
    public static volatile ListAttribute<Proveedores, Productos> productosList;
    public static volatile SingularAttribute<Proveedores, String> nifProveedor;

}