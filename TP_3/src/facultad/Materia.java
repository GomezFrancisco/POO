package facultad;

import java.util.List;
import java.util.ArrayList;

public class Materia {

	private String nombre;
	private Integer anio;
	private List<Alumno> alumnos = new ArrayList<Alumno>();
	private Profesor profesorTitular;
	private Profesor profesorAuxiliar;
	
	public Materia(String nombre, Integer anio) {
		this.nombre = nombre;
		this.anio = anio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	public void agregar(Alumno alumno) {
		this.alumnos.add(alumno);
	}

	public Profesor getProfesorTitular() {
		return profesorTitular;
	}

	public void setProfesorTitular(Profesor profesorTitular) {
		this.profesorTitular = profesorTitular;
	}

	public Profesor getProfesorAuxiliar() {
		return profesorAuxiliar;
	}

	public void setProfesorAuxiliar(Profesor profesorAuxiliar) {
		this.profesorAuxiliar = profesorAuxiliar;
	}
	
	
}
