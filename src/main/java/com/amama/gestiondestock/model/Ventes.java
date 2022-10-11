package com.amama.gestiondestock.model;

import java.time.Instant;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ventes extends AbstractEntity{
// fixe
	private String code;
	
	private Instant dateVente;
	
	private String commentaire;
	
}
