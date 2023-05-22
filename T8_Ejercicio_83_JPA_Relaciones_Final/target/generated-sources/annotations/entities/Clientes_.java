package entities;

import entities.Facturas;
import entities.TarjetasBancarias;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-22T09:20:19", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> nifCliente;
    public static volatile SingularAttribute<Clientes, Integer> idCliente;
    public static volatile SingularAttribute<Clientes, String> apellidosCliente;
    public static volatile SingularAttribute<Clientes, Date> fechaNacimientocliente;
    public static volatile SingularAttribute<Clientes, TarjetasBancarias> idtarjetaBancaria;
    public static volatile SingularAttribute<Clientes, String> nombrecliente;
    public static volatile ListAttribute<Clientes, Facturas> facturasList;

}