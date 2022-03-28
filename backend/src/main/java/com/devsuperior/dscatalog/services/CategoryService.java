package com.devsuperior.dscatalog.services;

import com.devsuperior.dscatalog.entites.Category;
import com.devsuperior.dscatalog.repositories.CategotyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategotyRepository categotyRepository;

    @Transactional(readOnly = true)
    public List<Category> findAll() {
        return categotyRepository.findAll();
    }
}
