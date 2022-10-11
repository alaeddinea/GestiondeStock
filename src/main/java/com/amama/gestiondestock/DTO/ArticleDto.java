package com.amama.gestiondestock.DTO;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ArticleDto {
	private Integer id ;
	private String codeArticle;
	
	private String designation;
	
	private BigDecimal prixUnitaireHT;
	
	private BigDecimal tauxTva;
	
	private BigDecimal prixUnitairettc;
	
	private String photo;

	private CategoryDto category;
	
	
}
