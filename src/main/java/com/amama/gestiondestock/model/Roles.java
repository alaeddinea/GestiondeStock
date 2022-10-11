package com.amama.gestiondestock.model;

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
public class Roles extends AbstractEntity{

	private String roleName;
	
	
	
	@ManyToOne
	@JoinColumn(name = "idUtilisateur")
	private Utilisateur utilisateur;
	
}
