package figuras;

import util.Punto;
import java.lang.Math;

public class Elipse extends Figura {
	private Integer radioMenor;
	private Integer radioMayor;

	public Elipse(String nombre, String color, Punto centro) {
		super(nombre, color, centro);
	}
	
	
	public Elipse(String nombre, String color, Punto centro, Integer radioMenor, Integer radioMayor) {
		super(nombre, color, centro);
		this.radioMenor = radioMenor;
		this.radioMayor = radioMayor;
	}

	public Integer area() {
		return (int) Math.PI * radioMayor * radioMenor;
	}

	public Integer perimetro() {
		return  (int) (Math.PI * (radioMayor + radioMenor));
	}
	
	

	public String toString() {
		if ((radioMenor == null) && (radioMayor == null)){
			return super.toString();}
			else{
				return super.toString() + 
						" Elipse [radioMenor= " + radioMenor + ", radioMayor= " + radioMayor + "]";
			}
		/*return super.toString() + 
						" Elipse [radioMenor= " + radioMenor + ", radioMayor= " + radioMayor + "]";*/
		 
	}
	
	
}
