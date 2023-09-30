package ejercicio;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MapaMundial {
	private List<Continente> continentes = new ArrayList<Continente>();
	private List<Pais> paises = new ArrayList<Pais>();

	public void inicializar() {

		List<Pais> america = new ArrayList<Pais>();
		List<Pais> europa = new ArrayList<Pais>();
		List<Pais> vacio = new ArrayList<Pais>();

		Pais argentina = new Pais("Argentina", "CABA");
		argentina.add(new Provincia("Entre Rios", argentina));
		argentina.add(new Provincia("Santa Fe", argentina));
		argentina.add(new Provincia("Buenos Aires", argentina));
		argentina.add(new Provincia("Corrientes", argentina));
		argentina.add(new Provincia("Cordoba", argentina));

		Pais uruguay = new Pais("Uruguay", "Montevideo");
		uruguay.add(new Provincia("Salto", uruguay));
		uruguay.add(new Provincia("Paysandú", uruguay));
		uruguay.add(new Provincia("Canelones", uruguay));
		uruguay.add(new Provincia("Rocha", uruguay));
		uruguay.add(new Provincia("Maldonado", uruguay));
		
		Pais brasil = new Pais("Brasil", "Brazilia");
		Pais chile = new Pais("Chile", "Santiago");
		Pais paraguay = new Pais("Paraguay", "Asuncion");
		Pais bolivia = new Pais("Bolivia", "Sucre, La paz");
		america.add(argentina);
		america.add(uruguay);
		america.add(brasil);
		america.add(chile);
		america.add(paraguay);
		america.add(bolivia);
		
		Pais españa = new Pais("España", "Madrid");
		Pais francia = new Pais("Francia", "Paris");
		Pais italia = new Pais("Italia", "Roma");
		Pais portugal = new Pais("Portugal", "Lisboa");
		europa.add(españa);
		europa.add(francia);
		europa.add(portugal);
		europa.add(italia);
	
		continentes.add(new Continente("America", america));
		continentes.add(new Continente("Europa", europa));
		continentes.add(new Continente("Asia", vacio));
		continentes.add(new Continente("África", vacio));
		continentes.add(new Continente("Oceanía", vacio));
		continentes.add(new Continente("Antártida", vacio));
		
		paises.add(españa);
		paises.add(chile);
		paises.add(argentina);
		paises.add(portugal);
		paises.add(italia);
		paises.add(francia);
		paises.add(bolivia);
		paises.add(paraguay);
		paises.add(brasil);
		paises.add(uruguay);
		
		/*
		 * for (Continente c: continentes) { System.out.println(c); }
		 */

		for (Provincia c : argentina.getProvincias()) {
			System.out.println(c);
			System.out.println(c.getPais());
		}
		
		System.out.println();
		
		for (Provincia c : uruguay.getProvincias()) {
			System.out.println(c);
			System.out.println(c.getPais());
		}
		
		System.out.println();
		
		Frontera frontera = new Frontera(argentina, uruguay, "Rio");
		argentina.add(frontera);
		System.out.println(argentina.getLimitrofes());

	}

	public List<Pais> getPaises(String continent) {
		Iterator<Continente> iterator = continentes.iterator();
		while (iterator.hasNext()) {
			Continente continente = iterator.next();
			if (continente.getNombre().equalsIgnoreCase(continent)) {
				return continente.getPaises();
			}
		}
		return new ArrayList<Pais>();
	}
	
	public List<Provincia> getProvincias(String pa) {
		Iterator<Pais> iterator = paises.iterator();
		while (iterator.hasNext()) {
			Pais pais = iterator.next();
			if (pais.getNombre().equalsIgnoreCase(pa)) {
				return pais.getProvincias();
			}
		}
		return new ArrayList<Provincia>();
	}
}