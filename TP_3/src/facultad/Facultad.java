package facultad;

import java.util.List;
import java.util.ArrayList;

public class Facultad {

	public static void main(String[] args) {
		
		List<Materia> materias = new ArrayList<Materia>();
		
		Materia materia1 = new Materia("Programacion Orientada a Objetos", 2);
		Materia materia2 = new Materia("Ingenieria del software", 2);
		
		materias.add(materia1);
		materias.add(materia2);
		
		materia1.setProfesorTitular(new Profesor("Adrian Tournour"));
		materia2.setProfesorTitular(new Profesor("Pedro Colla"));
		
		Alumno laura = new Alumno("Laura");
		Alumno francisco = new Alumno("Francisco");
		
		materia1.agregar(laura);
		laura.agregar(materia1);
		materia1.agregar(francisco);
		francisco.agregar(materia1);
		materia1.agregar(new Alumno("Thomas"));
		materia1.agregar(new Alumno("Esteban"));
		materia1.agregar(new Alumno("Nicolas"));
		materia1.agregar(new Alumno("Juan"));
		
		materia2.agregar(laura);
		laura.agregar(materia2);
		materia2.agregar(francisco);
		francisco.agregar(materia2);
		
		
		System.out.println(materia1.getNombre() + " - Año: " + materia1.getAnio() );
		System.out.println("Profesor: " + materia1.getProfesorTitular().getNombre());
		
		System.out.println("Listado de alumnos");

		for(Alumno alumno : materia1.getAlumnos()) {
			System.out.println(alumno.getNombre());
		}
		
		
		
		System.out.println(materia2.getNombre() + " - Año: " + materia2.getAnio() );
		System.out.println("Profesor: " + materia2.getProfesorTitular().getNombre());
		
		System.out.println("Listado de alumnos");

		for(Alumno alumno : materia2.getAlumnos()) {
			System.out.println(alumno.getNombre());
		}
		
		
		System.out.println("Materias a las que se inscribio: " + laura.getNombre());
		for(Materia materia : laura.getMaterias()) {
			System.out.println(materia.getNombre());
		}
		
		
	}

}
