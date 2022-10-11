package com.amama.gestiondestock.model;

import java.time.Instant;
import java.util.List;

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
public class CommandeClient extends AbstractEntity{
	
	private String code;
	
	
	private Instant dateCommande;
	
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	@OneToMany(mappedBy = "commandeClient")
	private List<LigneCommandeClient> ligneCommandeClients;
	
		
}
