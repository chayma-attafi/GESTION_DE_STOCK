package com.esprit.GestionDeStock.repository;

import com.esprit.GestionDeStock.Entites.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
    Optional<Category> findCategoriesByCodeCategory (String codeCategory) ;

}
