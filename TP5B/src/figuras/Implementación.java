package figuras;

import util.Punto;
import java.util.List;
import java.util.ArrayList;

public class Implementación {
	private List<Figura> figuras = new ArrayList<Figura>();

	public void inicializar() {
		Rectangulo r1 = new Rectangulo("Rectangulo", "Rojo", new Punto(3, 6), 4, 5);
		Elipse a = new Elipse("Elipse", "Morado", new Punto(4, 6), 2, 3);
		Circulo b = new Circulo("Circulo", "Rosa", new Punto(4, 7), 10);
		Cuadrado c = new Cuadrado("Cuadrado", "Verde", new Punto(10, 10), 5);

		figuras.add(r1);
		figuras.add(a);
		figuras.add(b);
		figuras.add(c);

		for (Figura r : figuras) {
			System.out.println("Primera impresión: ");
			System.out.println(r.toString());
			r.mover(new Punto(1, 1));
			r.setColor("Negro");
			System.out.println("Segunda impresión: ");
			System.out.println(r.toString());
			System.out.println("Area: " + r.area());
			System.out.println("Perímetro: " + r.perimetro());

			System.out.println("-------------------");
		}

		/*
		 * for(Figura r : lista) { System.out.println(r.toString()); if(r instanceof
		 * Rectangulo) { Rectangulo rec = (Rectangulo) r;
		 * System.out.println(rec.area()); System.out.println(rec.perimetro()); } if(r
		 * instanceof Elipse) { Elipse rec = (Elipse) r; System.out.println(rec.area());
		 * System.out.println(rec.perimetro()); }
		 * System.out.println("-------------------"); }
		 */
	}
}
