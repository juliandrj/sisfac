package net.gfi.udemy.entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-12-19T17:50:30.918-0500")
@StaticMetamodel(Factura.class)
public class Factura_ {
	public static volatile SingularAttribute<Factura, Integer> facCodigo;
	public static volatile SingularAttribute<Factura, Date> facFecha;
	public static volatile SingularAttribute<Factura, BigDecimal> facImpuesto;
	public static volatile SingularAttribute<Factura, String> facNumero;
	public static volatile SingularAttribute<Factura, BigDecimal> facSubtotal;
	public static volatile SingularAttribute<Factura, BigDecimal> facTotal;
	public static volatile ListAttribute<Factura, DetalleFactura> detalleFacturas;
	public static volatile SingularAttribute<Factura, Cliente> cliente;
}
