package com.example.Product.Review.repo;

import com.example.Product.Review.entities.join_column.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {
}