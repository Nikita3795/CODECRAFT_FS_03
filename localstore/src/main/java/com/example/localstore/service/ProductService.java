package com.example.localstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.localstore.model.Product;
import com.example.localstore.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public List<Product> getAllProducts() { return repo.findAll(); }
    public Product saveProduct(Product product) { return repo.save(product); }
    public void deleteProduct(Long id) { repo.deleteById(id); }
}
