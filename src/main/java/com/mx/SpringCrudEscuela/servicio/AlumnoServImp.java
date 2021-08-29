package com.mx.SpringCrudEscuela.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.SpringCrudEscuela.dao.AlumnoDao;
import com.mx.SpringCrudEscuela.dominio.Alumno;

@Service
public class AlumnoServImp implements AlumnoServ{

	@Autowired
	AlumnoDao alumnoDao;
	
	@Override
	public void guardar(Alumno alumno) {
		alumnoDao.save(alumno);
		
	}

	@Override
	public void editar(Alumno alumno) {
		alumnoDao.save(alumno);
		
	}

	@Override
	public void eliminar(Alumno alumno) {
		alumnoDao.delete(alumno);
		
	}

	@Override
	public Alumno buscar(Alumno alumno) {
		
		return alumnoDao.findById(alumno.getId_alumno()).orElse(null);
	}

	@Override
	public List<Alumno> listar() {
		
		return (List<Alumno>) alumnoDao.findAll();
	}

}
