package com.amama.gestiondestock.model;

import java.math.BigDecimal;
import java.util.List;

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
public class LigneCommandeFournisseur extends AbstractEntity{
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idCommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;
	

	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;
	
}
