package model;

import java.util.ArrayList;
import java.util.List;

public class LineaCompra {
	private Producto producto;
	private Integer cantidad;
	
	public LineaCompra(Producto producto, Integer cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String toString() {
		return "LineaCompra [producto=" + producto + ", cantidad=" + cantidad + "]";
	}
	
	public Double subtotal () {
		return producto.getPrecio() * cantidad;
	}
}
