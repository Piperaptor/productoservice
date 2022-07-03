package com.metodos.producto.repositories;

import com.metodos.producto.models.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository <ProductoModel, Integer > {
    
}
