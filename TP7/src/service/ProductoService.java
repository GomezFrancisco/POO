package service;

import model.Producto;
import java.util.ArrayList;
import java.util.List;
import dto.ProductoDTO;
import Exceptions.ProductoExceptions;

public class ProductoService {
    private List<Producto> productos = new ArrayList<Producto>();

    public void crear(ProductoDTO productoDTO) throws ProductoExceptions {
        validarPrecio(productoDTO.getPrecio());
        productos.add(convertirDtoAProducto(productoDTO));
    }

    public void buscar(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                System.out.println("Producto encontrado: " + producto.toString());
                return;
            }
        }
        System.out.println("Producto no encontrado");
    }

    private void validarPrecio(double precio) throws ProductoExceptions {
        if (precio <= 0) {
            throw new ProductoExceptions(ProductoExceptions.MSG_PRECIO);
        }
    }

    private Producto convertirDtoAProducto(ProductoDTO productoDTO) {
        return new Producto(productoDTO.getNombre(), productoDTO.getPrecio(), productoDTO.getStock(), productoDTO.getTipoProducto());
    }
}