package clases;

public class Bicicleta implements ImpactoEcologico{
	
	private String tipo;
	private int rodado;
	
	public Bicicleta(String tipo, int rodado) {
		super();
		this.tipo = tipo;
		this.rodado = rodado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getRodado() {
		return rodado;
	}

	public void setRodado(int rodado) {
		this.rodado = rodado;
	}

	public String impactoEcologico() {
		return "Bicicleta - Bajo";
	}

}
