package model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Compra {
	private Date fecha = new Date();
	private List<LineaCompra> lineas = new ArrayList<LineaCompra>();
	private Cliente cliente;
	private Promocion promocion;

	public Compra(Date fecha, List<LineaCompra> lineas, Cliente cliente) {
		super();
		this.fecha = fecha;
		this.lineas = lineas;
		this.cliente = cliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<LineaCompra> getLineas() {
		return lineas;
	}

	public void setLineas(List<LineaCompra> lineas) {
		this.lineas = lineas;
	}

	@Override
	public String toString() {
		return "Compra [fecha=" + fecha + ", lineas=" + lineas + ", cliente=" + cliente + "]";
	}
	
	public void add (LineaCompra linea) {
		this.lineas.add(linea);
	}
	
	public boolean delete (LineaCompra linea) {
		return this.lineas.remove(linea);
	}
	
	public Double getTotal () {
		Double total = (double) 0;
		for (LineaCompra r: lineas) {
			total = total + r.subtotal();
		}
		return total - promocion.getPromocion(this);
	}
}
