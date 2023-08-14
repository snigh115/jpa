package com.jdc.jpa;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="team")
public class Match  implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer id;
	

	@Column(nullable=false)
	private LocalDateTime matchDate;
	

	@Column(nullable=false,length=40)
	private String stadiumName;
	

	@Column(nullable=false,length=40)
	private String refreeName;
	
	@ManyToOne
	private Season season;
	
	@ManyToMany
	private List<Match> match;

}
