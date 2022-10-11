package com.amama.gestiondestock.model;

import java.math.BigDecimal;

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
public class LigneVente extends AbstractEntity{

	@ManyToOne
	@JoinColumn(name = "idvente")
	private Ventes vente;

	private BigDecimal quantite;
	
	private BigDecimal prixUnitaire;
	
}
