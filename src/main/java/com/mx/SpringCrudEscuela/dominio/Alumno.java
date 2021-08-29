package com.mx.SpringCrudEscuela.dominio;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ALUMNOP")
public class Alumno {

/*CREATE TABLE ALUMNOP (
ID_ALUMNO NUMBER PRIMARY KEY,
NOMBRE VARCHAR2(30),
APEP VARCHAR2(30),
APM VARCHAR2(30),
MATERIA VARCHAR2(30)
);*/
	
	@Id
	long id_alumno;
	String nombre;
	String apep;
	String apm;
	String materia;
	
	
	@OneToMany(mappedBy="alumno", cascade=CascadeType.ALL)
	List<Calificacion> lista = new ArrayList<Calificacion>();
	
	public Alumno() {
	}
	
	public Alumno(long id_alumno, String nombre, String apep, String apm, String materia) {
		this.id_alumno = id_alumno;
		this.nombre = nombre;
		this.apep = apep;
		this.apm = apm;
		this.materia = materia;
	}
	public long getId_alumno() {
		return id_alumno;
	}
	public void setId_alumno(long id_alumno) {
		this.id_alumno = id_alumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApep() {
		return apep;
	}
	public void setApep(String apep) {
		this.apep = apep;
	}
	public String getApm() {
		return apm;
	}
	public void setApm(String apm) {
		this.apm = apm;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
}
