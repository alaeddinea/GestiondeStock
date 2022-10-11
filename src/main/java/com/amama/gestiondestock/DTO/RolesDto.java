package com.amama.gestiondestock.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {
	private Integer id ;
	private String roleName;
	
	
	
	private UtilisateurDto utilisateur;
}
