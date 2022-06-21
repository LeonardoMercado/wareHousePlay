package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void existeProducto() {
        Product producto = new Product();
        assertEquals("Se espera que el producto no exista [FALSE]",false,producto.existeProducto());
    }
}