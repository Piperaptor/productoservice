package com.metodos.producto.controllers;

import com.metodos.producto.models.ProductoModel;
import com.metodos.producto.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @PostMapping("/add")
    public void saveProducto(@RequestBody ProductoModel Producto) {
        productoService.addProducto(Producto);
    }

    @GetMapping("/all")
    public List <ProductoModel> getAllProductos() {
        return productoService.getProductos();
    }
}
