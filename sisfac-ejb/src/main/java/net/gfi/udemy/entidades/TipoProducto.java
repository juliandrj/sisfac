package net.gfi.udemy.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_producto database table.
 * 
 */
@Entity
@Table(name="tipo_producto")
@NamedQuery(name="TipoProducto.findAll", query="SELECT t FROM TipoProducto t")
public class TipoProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tippro_codigo")
	private int tipproCodigo;

	@Column(name="tippro_descripcion")
	private String tipproDescripcion;

	@Column(name="tippro_nombre")
	private String tipproNombre;

	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="tipoProducto")
	private List<Producto> productos;

	public TipoProducto() {
	}

	public int getTipproCodigo() {
		return this.tipproCodigo;
	}

	public void setTipproCodigo(int tipproCodigo) {
		this.tipproCodigo = tipproCodigo;
	}

	public String getTipproDescripcion() {
		return this.tipproDescripcion;
	}

	public void setTipproDescripcion(String tipproDescripcion) {
		this.tipproDescripcion = tipproDescripcion;
	}

	public String getTipproNombre() {
		return this.tipproNombre;
	}

	public void setTipproNombre(String tipproNombre) {
		this.tipproNombre = tipproNombre;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto addProducto(Producto producto) {
		getProductos().add(producto);
		producto.setTipoProducto(this);

		return producto;
	}

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setTipoProducto(null);

		return producto;
	}

}