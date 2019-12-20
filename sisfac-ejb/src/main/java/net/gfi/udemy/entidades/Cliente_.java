package net.gfi.udemy.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-12-19T17:50:30.856-0500")
@StaticMetamodel(Cliente.class)
public class Cliente_ {
	public static volatile SingularAttribute<Cliente, Integer> cliCodigo;
	public static volatile SingularAttribute<Cliente, String> cliApellidos;
	public static volatile SingularAttribute<Cliente, String> cliDireccion;
	public static volatile SingularAttribute<Cliente, String> cliIdentificacion;
	public static volatile SingularAttribute<Cliente, String> cliNombres;
	public static volatile SingularAttribute<Cliente, String> cliTelefono;
	public static volatile ListAttribute<Cliente, Factura> facturas;
}
