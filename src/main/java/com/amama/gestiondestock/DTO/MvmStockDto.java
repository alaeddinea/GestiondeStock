package com.amama.gestiondestock.DTO;

import java.math.BigDecimal;
import java.time.Instant;

import com.amama.gestiondestock.model.TypeMvmStock;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MvmStockDto {
	
	private Integer id ;
	private ArticleDto article;
	
	private Instant dateMvt;
	private BigDecimal quantite;
	
	private TypeMvmStock typeMvmStock;
}
