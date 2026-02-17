package org.educandoweb.course.services;

import org.educandoweb.course.entities.Category;
import org.educandoweb.course.repositories.CategoryRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();

    }
}
