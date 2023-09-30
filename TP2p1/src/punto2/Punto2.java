package punto2;

import java.util.Scanner;

public class Punto2 {
	
	private static Scanner in = new Scanner(System.in); 

	public static void main(String[] args) {
		
		ejecutar();
	 
	}
	
	private static void ejecutar() {
		
		System.out.println("ingrese numero 1");
		Integer numero1 = in.nextInt();
		System.out.println("ingrese numero 2");
		Integer numero2 = in.nextInt();
		System.out.println("ingrese numero 3");
		Integer numero3 = in.nextInt();

		Integer suma = 0;
		Integer producto = 0;
		
		if(numero1 > 0) {
			producto = numero2 * numero3;
		} else {
			suma = numero2 + numero3;
		}
		
		System.out.println("El producto es : " + producto);
		System.out.println("La suma es : " + suma);
		System.out.println("Dessea continuar? y: Si - n: No");
		in.nextLine();
		String continuar = in.nextLine();
		System.out.println("Eligio : " + continuar);
		
		if(continuar.equalsIgnoreCase("y")) {
			ejecutar();
		}
	}

}
