/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.GestionDeStock.Validator;
import java.util.ArrayList;
import java.util.List;
import  com.esprit.GestionDeStock.DTOs.CategoryDto;
import lombok.Builder;
import lombok.Data;
import org.springframework.util.StringUtils;

@Data
@Builder
public class CategoryValidator {
    public static List<String> validator(CategoryDto categoryDto) {
        List<String> errors = new ArrayList<>();

        if (categoryDto == null || !StringUtils.hasLength(categoryDto.getCode())) {
            errors.add("Veuiliez renseigner le code de la category");
        }
            return errors;
    }
}
