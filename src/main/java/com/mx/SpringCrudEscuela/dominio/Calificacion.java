package com.mx.SpringCrudEscuela.dominio;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CALIFP")
public class Calificacion {
	
/*CREATE TABLE CALIFP(
ID_CALIF NUMBER PRIMARY KEY,
IDALUMNO NUMBER,
CALIF NUMBER,
CONSTRAINT IDALUMNOFK FOREIGN KEY(IDALUMNO) REFERENCES ALUMNOP(ID_ALUMNO));
*/
	@Id
	int id_calif;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="IDALUMNO")
	Alumno alumno;
	
	double calif;
	
}
