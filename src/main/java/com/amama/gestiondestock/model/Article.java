package com.amama.gestiondestock.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

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
public class Article extends AbstractEntity{
	
	
	@Column(name = "codeArticle")
	private String codeArticle;
	
	@Column(name = "designation")
	private String designation;
	
	private BigDecimal prixUnitaireHT;
	
	private BigDecimal tauxTva;
	
	private BigDecimal prixUnitairettc;
	
	private String photo;
	
	@ManyToOne
	@JoinColumn(name = "idCategory")
	private Category category;
	
	
}
