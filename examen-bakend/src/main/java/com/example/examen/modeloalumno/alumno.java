package com.example.examen.modeloalumno;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "alumno")




public class alumno {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 @Column(name = "nombre_1")
 private String nombre;
 @Column(name = "apellid_1o")
 private String apellido;
 @Column(name = "correo_1")
 private String correo;
 @Column(name = "telefono_1")
 private int telefono;
 @Column(name = "departamento_1")
 private String departamento;
 
 public alumno() {
	 
 }
 

public alumno(String nombre, String apellido, String correo, int telefono, String departamento) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.correo = correo;
	this.telefono = telefono;
	this.departamento = departamento;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public int getTelefono() {
	return telefono;
}
public void setTelefono(int telefono) {
	this.telefono = telefono;
}
public String getDepartamento() {
	return departamento;
}
public void setDepartamento(String departamento) {
	this.departamento = departamento;
}
 
 
}

