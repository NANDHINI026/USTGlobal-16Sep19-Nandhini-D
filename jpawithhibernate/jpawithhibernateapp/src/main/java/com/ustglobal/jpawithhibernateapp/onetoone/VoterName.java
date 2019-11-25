package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="votername")
public class VoterName {
	@Id
	@Column
private int vid;
	@Column
private String vname;
	@Exclude
	@OneToOne(mappedBy = "voterName")
	private Person person;

}
