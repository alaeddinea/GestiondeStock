package com.amama.gestiondestock.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Embeddable
public class Adresse implements Serializable  {
	private String adresse1;
	private String adresse2;
	private String ville;
	private String codePostale;
	private String pays;
}
