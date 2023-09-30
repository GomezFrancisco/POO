package dto;

import model.TipoProducto;

public class ProductoDTO {
    private String nombre;
    private double precio;
    private int stock;
    private TipoProducto tipoProducto;

    public ProductoDTO(String nombre, double precio, int stock, TipoProducto tipoProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.tipoProducto = tipoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }
}
