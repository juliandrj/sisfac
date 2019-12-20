package net.gfi.udemy.entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-12-19T17:50:30.920-0500")
@StaticMetamodel(Producto.class)
public class Producto_ {
	public static volatile SingularAttribute<Producto, Integer> proCodigo;
	public static volatile SingularAttribute<Producto, String> proDescripcion;
	public static volatile SingularAttribute<Producto, String> proNombre;
	public static volatile SingularAttribute<Producto, BigDecimal> proPrecio;
	public static volatile ListAttribute<Producto, DetalleFactura> detalleFacturas;
	public static volatile SingularAttribute<Producto, TipoProducto> tipoProducto;
}
