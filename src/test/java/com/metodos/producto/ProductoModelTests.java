package com.metodos.producto;

import com.metodos.producto.models.ProductoModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import com.metodos.producto.models.ProductoModel;

public class ProductoModelTests {
    ProductoModel producto = new ProductoModel();
    @Test
    void testgetNombre() {
        producto.setNombre("Paraguas");
        assertEquals("Paraguas", producto.getNombre());
    }

    @Test
    void testgetPrecio(){
        producto.setPrecio(1500);
        assertEquals(1500, producto.getPrecio());
    }

}
