package com.example.examen.modelodepartamento;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "departamento ")

public class departamento {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)	
private long id;
	@Column(name = "N_departamento")
private String Ndepartamento;



public departamento() {
	
}


public departamento(String ndepartamento) {
	super();
	Ndepartamento = ndepartamento;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNdepartamento() {
	return Ndepartamento;
}
public void setNdepartamento(String ndepartamento) {
	Ndepartamento = ndepartamento;
}

}
