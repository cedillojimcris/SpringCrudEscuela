package com.mx.SpringCrudEscuela.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.SpringCrudEscuela.dominio.Calificacion;

public interface CalificacionDao extends CrudRepository<Calificacion, Integer> {

}
