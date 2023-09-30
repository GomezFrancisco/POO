package figuras;

import util.Punto;
import java.lang.Math;

public class Circulo extends Elipse {
	private Integer radio;
	
	public Circulo(String nombre, String color, Punto centro, Integer radio) {
		super(nombre, color, centro);
		this.radio = radio;
	}
	
	public Integer area() {
		return (int) ((Math.PI) * (radio^2));
	}

	public Integer perimetro() {
		return  (int) (2*(Math.PI)*radio);
	}
	
	public String toString() {
		return super.toString() + 
				" Circulo [radio= " + radio + "]";
	}
	
	
}
