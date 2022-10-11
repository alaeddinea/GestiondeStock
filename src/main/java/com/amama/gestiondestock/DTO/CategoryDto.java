package com.amama.gestiondestock.DTO;

import java.util.List;

import javax.persistence.OneToMany;

import com.amama.gestiondestock.model.Article;
import com.amama.gestiondestock.model.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryDto {
	private Integer id ;
	private String code ;
	
	private String designation; 

	@JsonIgnore
	private List<ArticleDto> articles;
	
	public static CategoryDto fromEntity(Category category) {
		if(category == null) {
			return null;
			// throw exception
		}
		return CategoryDto.builder()
				.id(category.getId())
				.code(category.getCode())
				.designation(category
				.getDesignation())
				.build();
		
	}
	public static Category toEntity(CategoryDto categoryDto) {
		if(categoryDto == null) {
			return null;
		}
		Category category= new Category();
		category.setId(categoryDto.getId());
		category.setCode(categoryDto.getCode());
		category.setDesignation(categoryDto.getDesignation());
		return category;
	}
}
