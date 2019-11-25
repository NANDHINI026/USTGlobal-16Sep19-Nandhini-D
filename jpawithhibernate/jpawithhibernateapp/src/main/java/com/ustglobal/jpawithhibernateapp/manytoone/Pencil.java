package com.ustglobal.jpawithhibernateapp.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="pencil")
public class Pencil {
	@Id
	@Column
private  int pid;
	@Column
private String color;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bid",nullable =false)//primary key in the another table is must be not null(ie.,forign key in the class)
	private PencilBox pencilBox;
}
