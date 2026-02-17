package org.educandoweb.course.services;

import org.educandoweb.course.entities.Category;
import org.educandoweb.course.entities.Product;
import org.educandoweb.course.repositories.CategoryRepository;
import org.educandoweb.course.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();

    }
}
