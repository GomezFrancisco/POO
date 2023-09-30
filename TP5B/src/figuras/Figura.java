package figuras;

import util.Punto;

public abstract class Figura {

	private String nombre;
	private String color;
	private Punto centro;

	public Figura(String nombre, String color, Punto centro) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.centro = centro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Punto getCentro() {
		return centro;
	}

	protected void mover(Punto centro) {
		this.centro = centro;
	}

	public void moverX(Integer x) {
		this.centro.setX(this.centro.getX() + x);
	}

	public void moverY(Integer y) {
		this.centro.setY(y);
	}

	public String toString() {
		return "Figura [nombre= " + nombre + ", color= " + color + ", " + 
				centro.getCoordenadas() + "]";
	}

	public abstract Integer area();

	public abstract Integer perimetro();

}
