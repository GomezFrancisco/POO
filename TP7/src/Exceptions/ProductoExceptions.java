package Exceptions;

public class ProductoExceptions extends Exception {
	public static final String MSG_PRECIO = "El precio debe ser mayor que cero";
	public static final String MSG_NOT_FOUND = "Producto no encontrado";
	private String name;

	public ProductoExceptions(String name) {
        this.name =name;
    }
    public String toString() {
        return "Error: "+ name;
    }
}
