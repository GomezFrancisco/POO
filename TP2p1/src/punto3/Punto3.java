package punto3;

import java.util.Scanner;

public class Punto3 {

	public static void main(String[] args) {
		System.out.println("Ingrese la palabra a testear");
		Scanner in = new Scanner(System.in);
		String texto = in.nextLine();
		String aux = "";
		int cont = 0;
		for (int i = texto.length() - 1; i >= 0; i--) {
			aux = aux + texto.charAt(i);
		}
		/*
		 * for (int i = texto.length() - 1; i >= 0; i--) { if (texto.charAt(i) ==
		 * aux.charAt(i)) { cont += 1; } }
		 */
		if (texto.equals(aux)) {
			System.out.println("Es palíndromo");
		} else {
			System.out.println("No es palíndromo");
		}

		/*
		 * if (texto.length() == cont) { System.out.println("Es palíndromo"); } else {
		 * System.out.println("No es palíndromo"); }
		 */
	}
}
