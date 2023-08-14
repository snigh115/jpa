package com.jdc.jpa;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="team")
public class Team implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer id;
	
	@Column(nullable= false,length = 40, unique = true)
	private String name;
	
	@Column(nullable= false)
	private double netWorth;
	
	@Column(nullable=false,length=40)
	private  String sponsers;
	
	@OneToMany(mappedBy = "team")
	private List<Player> players;
//	(mappedBy = "team")
	@ManyToMany
	private List<Match> match;
}
