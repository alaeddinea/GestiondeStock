package com.amama.gestiondestock.model;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Entreprise")
@EqualsAndHashCode(callSuper = true)
public class Entreprise extends AbstractEntity {
	private String nom;
	@Embedded
	private Adresse adresse;
	
	private String codeFiscal;
	
	private String photo;
	
	private String mail;
	private String numTel; 
	private String siteWeb;
	
	@OneToMany(mappedBy = "entreprise")
	List<Utilisateur> utilisateurs;
	
}
