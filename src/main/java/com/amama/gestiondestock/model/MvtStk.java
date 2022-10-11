package com.amama.gestiondestock.model;

import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MvtStk extends AbstractEntity{
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	private Instant dateMvt;
	private BigDecimal quantite;
	
	private TypeMvmStock typeMvmStock;
}
