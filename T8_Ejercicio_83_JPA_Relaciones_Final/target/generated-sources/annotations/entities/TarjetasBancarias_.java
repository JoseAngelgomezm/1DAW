package entities;

import entities.Clientes;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-22T09:20:19", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(TarjetasBancarias.class)
public class TarjetasBancarias_ { 

    public static volatile ListAttribute<TarjetasBancarias, Clientes> clientesList;
    public static volatile SingularAttribute<TarjetasBancarias, Integer> idtarjetaBancaria;
    public static volatile SingularAttribute<TarjetasBancarias, String> numeroTarjeta;

}