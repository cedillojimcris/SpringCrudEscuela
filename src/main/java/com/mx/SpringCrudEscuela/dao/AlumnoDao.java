package com.mx.SpringCrudEscuela.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.SpringCrudEscuela.dominio.Alumno;

public interface AlumnoDao extends CrudRepository<Alumno, Long> {

}
