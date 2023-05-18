package entities;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-18T23:23:50", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Facturas.class)
public class Facturas_ { 

    public static volatile SingularAttribute<Facturas, String> descripcion;
    public static volatile SingularAttribute<Facturas, Date> fecha;
    public static volatile SingularAttribute<Facturas, Integer> codigo;
    public static volatile SingularAttribute<Facturas, Double> importe;

}