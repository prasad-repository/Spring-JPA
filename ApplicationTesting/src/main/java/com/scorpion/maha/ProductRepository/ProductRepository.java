package com.scorpion.maha.ProductRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scorpion.maha.Product.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}