package com.mustore.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mustore.store.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByName(String name);

    List<Product> findByNameContainingIgnoreCase(String keyword);

}