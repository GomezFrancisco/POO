package figuras;

import util.Punto;

public class Cuadrado extends Rectangulo {
	private Integer lado;

	public Cuadrado(String nombre, String color, Punto centro, Integer lado) {
		super(nombre, color, centro);
		this.lado = lado;
	}

	public Integer area() {
		return lado * lado;
	}

	public Integer perimetro() {
		return 4 * lado;
	}

	public Integer getLado() {
		return lado;
	}

	public void setLado(Integer lado) {
		this.lado = lado;
	}

	public String toString() {
		return super.toString() + "Cuadrado [lado= " + lado + "]";
	}

}
