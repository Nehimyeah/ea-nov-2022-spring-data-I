package com.example.Product.Review.service;

import com.example.Product.Review.entities.join_column.Category;
import com.example.Product.Review.entities.join_column.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();
    Product findById(long id);
    void save(Product product);
    void update(Product product);
    void deleteById(long id);
    void delete(Product product);
}