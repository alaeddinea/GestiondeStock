package com.amama.gestiondestock.DTO;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EntrepriseDto {
	private Integer id ;
	private String nom;

	private AdresseDto adresse;
	
	private String codeFiscal;
	
	private String photo;
	
	private String mail;
	private String numTel; 
	private String siteWeb;
	
	List<UtilisateurDto> utilisateurs;
}
