package com.esprit.GestionDeStock.services.Impl;

import com.esprit.GestionDeStock.DTOs.CategoryDto;
import com.esprit.GestionDeStock.repository.CategoryRepository;
import com.esprit.GestionDeStock.services.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    public CategoryRepository categoryRepository;

    @Override
    public CategoryDto save(CategoryDto dto) {
        return null;
    }

    @Override
    public CategoryDto findById(Integer id) {
        return null;
    }

    @Override
    public List<CategoryDto> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {
        if(id == null) {
            log.error("CATEGORY ID is null");
            return ;
        }
        categoryRepository.deleteById(id);
    }
}
