package com.amama.gestiondestock.model;

import java.util.List;

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
public class Category extends AbstractEntity{
	private String code ;
	
	private String designation; 
	@OneToMany(mappedBy = "category")
	private List<Article> articles;
	

}
