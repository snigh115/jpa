package com.jdc.jpa;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="nation")
public class Nation implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer id;
	
	@Column(nullable= false,length = 40, unique = true)
	private String name;
	
	@Column(nullable= false)
	private double population;
	
	@Column(nullable= false,length = 40, unique = true)
	private String capital;
	
	
	@OneToOne
	private Player player;
}
