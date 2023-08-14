package com.jdc.jpa;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="player")
public class Player implements Serializable {

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer id;
	
	@Column(nullable= false,length = 40, unique = true)
	private String name;
	
	@Column(nullable= false)
	private double weight;
	
	@Column(nullable= false,length = 40)
	private int age;
	
	@Column(nullable=false,length=40)
	private  double wage;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	public enum Role{
		Attacker,Middle,Defender,Goalkeeper
	}
	
	@OneToOne
	private Nation nation;
	
	@ManyToOne
	private Team team;
}
