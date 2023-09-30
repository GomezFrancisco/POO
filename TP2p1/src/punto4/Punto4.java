package punto4;


public class Punto4 {
	public static void main(String[] args) {
		int[] numeros={4,2,3,8,1};
		int mayor = 0;
		int cont = 0;
		for (int i=0; i < numeros.length; i++) {
			cont += numeros[i];
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}
		System.out.println("La cantidad de numeros en el arreglo es de "+ numeros.length);
		System.out.println("El numero mayor es "+ mayor);
		System.out.println("El promedio de los numeros es de "+ cont/numeros.length);
		int[] mayorr = ordenarMayor(numeros);
		for (int item:  mayorr) {
			System.out.print(item + " ");
			}
		System.out.println("");
		int[] menorr = ordenarMenor(numeros);
		for (int item:  menorr) {
			System.out.print(item + " ");
			}
	}
	public static int[] ordenarMayor(int[] numeros) {		
		for (int i=0; i < numeros.length; i++) {
			for (int j=i+1; j < numeros.length; j++) {
				if (numeros[j]<numeros[i]) {
					int arriba = numeros[i];
					int abajo = numeros[j];	
					numeros[i] = abajo;
				    numeros[j] = arriba;
				}
			}
		}
		return numeros;
	}
	public static int[] ordenarMenor(int[] numeros) {		
		for (int i=0; i < numeros.length; i++) {
			for (int j=i+1; j < numeros.length; j++) {
				if (numeros[j]>numeros[i]) {
					int abajo = numeros[i];
					int arriba = numeros[j];	
					numeros[i] = arriba;
				    numeros[j] = abajo;
				}
			}
		}
		return numeros;
	}
	
}
