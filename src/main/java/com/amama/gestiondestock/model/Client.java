package com.amama.gestiondestock.model;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
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
public class Client extends AbstractEntity{
private String nom;

private String prenom; 

@Embedded
private Adresse adresse; 



private String photo;
private String mail;
private String numTel;

@OneToMany(mappedBy = "client")
List<CommandeClient> commandeClients;

}
