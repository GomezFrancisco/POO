package clases;

public class Edificio implements ImpactoEcologico{
	private String tipoConstruccion;
	private double Altura;
	
	public Edificio(String tipoConstruccion, double altura) {
		super();
		this.tipoConstruccion = tipoConstruccion;
		Altura = altura;
	}

	public String getTipoConstruccion() {
		return tipoConstruccion;
	}

	public void setTipoConstruccion(String tipoConstruccion) {
		this.tipoConstruccion = tipoConstruccion;
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}

	public String impactoEcologico() {
		
		return "Edificio - Alto";
	}


}
