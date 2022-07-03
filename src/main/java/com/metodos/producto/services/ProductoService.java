package com.metodos.producto.services;

import com.metodos.producto.models.ProductoModel;
import com.metodos.producto.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository repository;

    public void addProducto(ProductoModel producto) {
        repository.save(producto);
    }
    public ArrayList<ProductoModel> getProductos() {
        return (ArrayList<ProductoModel>) repository.findAll();
    }

    public boolean deleteProducto(ProductoModel producto) {
        try{
            repository.delete(producto);
            return true;
        }catch (Exception ex){
            return false;
        }
    }
}
