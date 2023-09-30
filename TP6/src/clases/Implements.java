package clases;

import java.util.List;
import java.util.ArrayList;

public class Implements {
	
	public void init(){
		List<ImpactoEcologico> impacto = new ArrayList<ImpactoEcologico>();
		
		Auto A = new Auto("4x4", 2023);
		Bicicleta B = new Bicicleta("Ruta", 2023);
		Edificio E = new Edificio("Concreto", 12.2);
		
		impacto.add(A);
		impacto.add(B);
		impacto.add(E);
		
		for (ImpactoEcologico r: impacto) {
			System.out.println("Impacto Ecologico" + r.impactoEcologico());
		}
		
	}
}
