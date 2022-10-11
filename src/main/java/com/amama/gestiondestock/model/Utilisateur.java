package com.amama.gestiondestock.model;

import java.time.Instant;
import java.util.List;

import javax.persistence.Embedded;
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
public class Utilisateur extends AbstractEntity{
	private 	String nom; 
	private String  prenom; 
	private String mail;
	private String motDePass;
	
	@Embedded
	private Adresse adresse;
	
	private Instant dateDeNaissance;
	private String photo;
	
	@ManyToOne
	@JoinColumn (name="idEntreprise")
	private Entreprise entreprise;
	
	@OneToMany(mappedBy = "utilisateur")
	List<Roles> roles;
}
