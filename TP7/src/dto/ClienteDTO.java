package dto;

public class ClienteDTO {
	private String nombre;
	private String cuit;
	private String email;
	private String numeroCelular;
	
	public ClienteDTO(String nombre, String cuit, String email, String numeroCelular) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.email = email;
		this.numeroCelular = numeroCelular;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public  String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}
}
