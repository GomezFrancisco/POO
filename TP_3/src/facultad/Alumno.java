package facultad;

import java.util.List;
import java.util.ArrayList;

public class Alumno {

	private String nombre;
	List<Materia> materias = new ArrayList<Materia>();

	public Alumno(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
	
	public void agregar(Materia materia) {
		materias.add(materia);
	}
}
