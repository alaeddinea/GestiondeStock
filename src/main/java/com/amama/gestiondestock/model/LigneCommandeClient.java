package com.amama.gestiondestock.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
public class LigneCommandeClient extends AbstractEntity{
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idCommandeClient")
	private CommandeClient commandeClient;
	
	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;
	
	

}
