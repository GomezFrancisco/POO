package model;

public class Producto {

    private String nombre;
    private double precio;
    private int stock;
    private TipoProducto tipoProducto;

    public Producto(String nombre, double precio, int stock, TipoProducto tipoProducto) {
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);
        this.tipoProducto = tipoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
            this.nombre = nombre;
            }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

            this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
            this.stock = stock;

    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}
