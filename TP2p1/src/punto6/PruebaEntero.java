package punto6;

import java.util.Scanner;

public class PruebaEntero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero1 = scanner.nextInt();
        Punto6 entero1 = new Punto6(numero1);
        System.out.println("El número ingresado es: " + entero1.getNumero());
        System.out.println("El cuadrado del número es: " + entero1.cuadrado());
        System.out.println("El número es " + entero1.parImpar());
        System.out.println("El factorial del número es: " + entero1.factorial());
        System.out.println("El número es primo: " + entero1.esPrimo());
    }
}
