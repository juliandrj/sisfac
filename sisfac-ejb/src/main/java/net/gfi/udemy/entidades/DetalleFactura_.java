package net.gfi.udemy.entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-12-19T17:50:30.915-0500")
@StaticMetamodel(DetalleFactura.class)
public class DetalleFactura_ {
	public static volatile SingularAttribute<DetalleFactura, Integer> detfacCodigo;
	public static volatile SingularAttribute<DetalleFactura, Double> detfacCantidad;
	public static volatile SingularAttribute<DetalleFactura, String> detfacObservacion;
	public static volatile SingularAttribute<DetalleFactura, BigDecimal> detfacPrecio;
	public static volatile SingularAttribute<DetalleFactura, BigDecimal> detfacTotal;
	public static volatile SingularAttribute<DetalleFactura, Factura> factura;
	public static volatile SingularAttribute<DetalleFactura, Producto> producto;
}
