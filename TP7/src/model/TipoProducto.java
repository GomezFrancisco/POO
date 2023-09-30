package model;

public enum TipoProducto {
	LACTEOS("lacteos"),
	BEBIDAS("bebidas"),
	FIDEOS("fideos");
	
	private String nombre;
	
	private TipoProducto(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
}
