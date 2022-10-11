package com.amama.gestiondestock.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.amama.gestiondestock.DTO.CategoryDto;


public class CategoryValidator {

	public static List<String> validate(CategoryDto categoryDto){
		List<String> errors= new ArrayList<>();
		if(categoryDto==null || !StringUtils.hasLength(categoryDto.getCode())){
			errors.add("Veuillez rensigner le code");
		}
		return errors;
	}
}
