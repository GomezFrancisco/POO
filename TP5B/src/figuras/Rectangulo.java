package figuras;

import util.Punto;

public class Rectangulo extends Figura {
	
	private Integer ladoMayor;
	private Integer ladoMenor;

	public Rectangulo(String nombre, String color, Punto centro) {
		
		super(nombre, color, centro);
	}
	
	public Rectangulo(String nombre, String color, Punto centro, Integer ladoMayor, Integer ladoMenor) {
		super(nombre, color, centro);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
	}

	public Integer getLadoMayor() {
		return ladoMayor;
	}

	public void setLadoMayor(Integer ladoMayor) {
		this.ladoMayor = ladoMayor;
	}

	public Integer getLadoMenor() {
		return ladoMenor;
	}

	public void setLadoMenor(Integer ladoMenor) {
		this.ladoMenor = ladoMenor;
	}

	public String toString() {
		if ((ladoMayor == null) && (ladoMenor == null)) {
			return super.toString();}
		else {
			return super.toString() + 
					" Rectangulo [radioMenor= " + ladoMenor + ", radioMayor= " + ladoMayor + "]";
		}
		/*return super.toString() + 
					" Rectangulo [ladoMenor= " + ladoMenor + ", ladoMayor= " + ladoMayor + "]"; */
		 
	}
	
	public Integer area() {
		return this.ladoMayor * this.ladoMenor;
	}
	
	public Integer perimetro() {
		return 2 * this.ladoMayor + 2 * this.ladoMenor;
	}
	
	public void cambiarTamanio(Integer factor) {
		this.setLadoMayor(factor * this.ladoMayor);
		this.setLadoMenor(factor * this.ladoMenor);
	}
	
	public String getNombre() {
		return super.getNombre();
	}
	
}
