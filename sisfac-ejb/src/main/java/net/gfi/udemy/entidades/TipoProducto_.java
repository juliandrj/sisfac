package net.gfi.udemy.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-12-19T17:50:30.923-0500")
@StaticMetamodel(TipoProducto.class)
public class TipoProducto_ {
	public static volatile SingularAttribute<TipoProducto, Integer> tipproCodigo;
	public static volatile SingularAttribute<TipoProducto, String> tipproDescripcion;
	public static volatile SingularAttribute<TipoProducto, String> tipproNombre;
	public static volatile ListAttribute<TipoProducto, Producto> productos;
}
