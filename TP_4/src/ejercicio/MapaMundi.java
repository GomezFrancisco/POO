package ejercicio;
import java.util.Scanner;
public class MapaMundi {

	public static void main(String[] args) {
		MapaMundial mapa = new MapaMundial();
		mapa.inicializar();
		System.out.println("Ingrese un continente ");
		Scanner in = new Scanner(System.in);
		String continente = in.nextLine();
		System.out.println (mapa.getPaises(continente));
		
		System.out.println("Ingrese un pais ");
		String pais = in.nextLine();
		System.out.println (mapa.getProvincias(pais));
	}

}
