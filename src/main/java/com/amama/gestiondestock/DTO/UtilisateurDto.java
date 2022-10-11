package com.amama.gestiondestock.DTO;

import java.time.Instant;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDto {
	private Integer id ;
	private String nom; 
	private String  prenom; 
	private String mail;
	private String motDePass;
	
	
	private AdresseDto adresse;
	
	private Instant dateDeNaissance;
	private String photo;
	
	
	private EntrepriseDto entreprise;
	
	List<RolesDto> roles;
}
