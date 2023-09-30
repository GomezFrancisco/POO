package MatrizProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matriz extends Thread  {
	public static void main(String[] args) throws Exception {
		Random rand = new Random();
		int size = 10;
		int[][] A = new int[size][size];
		int[][] B = new int[size][size];
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				A[i][j] = rand.nextInt(5) + 1;
				B[i][j] = rand.nextInt(5) + 1;
			}
		}
		
		List <MultiplicaVector> hilos= new ArrayList <MultiplicaVector>();
		
		for (int i = 0;i<A.length;i++) {
			for (int j = 0;j<B[0].length;j++) {
				int[] vectorA = A[i];
				int[] vectorB = new int[B.length];
				for (int k = 0;k<B.length;k++) {
					vectorB[k] = B[k][j];
				}
				MultiplicaVector v= new MultiplicaVector(vectorA, vectorB); 
				hilos.add(v);
			}
		}
		for (MultiplicaVector v:hilos) {
			v.start();
		}
		//Solucion al posicionamiento de los resultados
		int cont = 0;
		int x = 1; 
		int y = 1;
		for (MultiplicaVector v:hilos) {
			v.join();
			if (cont == (size)) {
				System.out.println("---");
				x += 1;
				y = 1;
				cont = 0;
			}
			System.out.println("Posición" + ("("+ x + ","+ y + "): ") + v.getResultado() );
			cont += 1;
			y += 1;
		}
		
		/*int[][] C = new int[2][size];
		int[][] D = new int[size][4];
		
		for (int i = 0; i < C[0].length; i++) {
			for (int j = 0; j < D[1].length; j++) {
				C[i][j] = rand.nextInt(5) + 1;
				D[i][j] = rand.nextInt(5) + 1;
			}
		}
		
		List <MultiplicaVector> hilo= new ArrayList <MultiplicaVector>();
		
		for (MultiplicaVector v:hilo) {
			v.start();
		}
		//Solucion al posicionamiento de los resultados
		int conts = 0;
		int xs = 1; 
		int ys = 1;
		for (MultiplicaVector v:hilo) {
			v.join();
			if (conts == (C[0].length)) {
				System.out.println("---");
				xs += 1;
				ys = 1;
				conts = 0;
			}
			System.out.println("Posición" + ("("+ xs + ","+ ys + "): ") + v.getResultado() );
			conts += 1;
			ys += 1;
		}*/
	}
}
