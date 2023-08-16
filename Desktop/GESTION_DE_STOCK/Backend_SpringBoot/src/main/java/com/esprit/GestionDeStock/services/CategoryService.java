package com.esprit.GestionDeStock.services;
import com.esprit.GestionDeStock.DTOs.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto save (CategoryDto dto);
    CategoryDto findById (Integer id);

    //CategoryDto findByCodeArticle(String CodeCategory);
    List<CategoryDto> findAll();
    void delete (Integer id);
}
