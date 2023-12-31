package com.jdc.jpa;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jdc.jpa.conventer.DateToYearConventer;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="season")
public class Season implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer id;
	
	@Column(nullable=false)
	@Convert(converter = DateToYearConventer.class)
	private LocalDate seasonBefore;
	
	
	@Column(nullable=false)
	@Convert(converter = DateToYearConventer.class)
	private LocalDate seasonAfter;
}
