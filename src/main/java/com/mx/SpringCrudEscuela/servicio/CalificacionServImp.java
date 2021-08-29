package com.mx.SpringCrudEscuela.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mx.SpringCrudEscuela.dominio.Calificacion;
import com.mx.SpringCrudEscuela.dao.CalificacionDao;

@Service
public class CalificacionServImp implements CalificacionServ{
	
	@Autowired
	CalificacionDao califDao;

	@Override
	public void guardar(Calificacion calificacion) {
		califDao.save(calificacion);
		
	}

	@Override
	public void editar(Calificacion calificacion) {
		califDao.save(calificacion);
		
	}

	@Override
	public void eliminar(Calificacion calificacion) {
		califDao.delete(calificacion);
		
	}

	@Override
	public Calificacion buscar(Calificacion calificacion) {
		
		return califDao.findById(calificacion.getId_calif()).orElse(null);
	}

	@Override
	public List<Calificacion> listar() {
		
		return (List<Calificacion>)califDao.findAll();
	}

}


