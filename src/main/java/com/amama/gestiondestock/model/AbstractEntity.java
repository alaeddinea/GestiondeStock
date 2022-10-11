package com.amama.gestiondestock.model;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity  implements Serializable	{
	
	@Id
	@GeneratedValue
	private Integer id ;
	
	@CreatedDate
	@JsonIgnore
	private Instant creationDate;
	
	@LastModifiedDate
	@JsonIgnore
	private Instant lastModifiedDate;

}
