package com.mx.SpringCrudEscuela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.SpringCrudEscuela.dominio.Calificacion;
import com.mx.SpringCrudEscuela.servicio.CalificacionServ;

@CrossOrigin 
@RestController
@RequestMapping("calificacionRest")
public class CalificacionRest {

	@Autowired
	CalificacionServ califServ;
	
	@GetMapping("listar")
	public List<Calificacion> listar(){
		var lista = califServ.listar();
		System.out.println("listar -->"+lista);
		return lista;
	}
	
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Calificacion calificacion)
	{
		califServ.guardar(calificacion);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Calificacion calificacion)
	{
		califServ.editar(calificacion);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Calificacion calificacion)
	{
		califServ.eliminar(calificacion);
	}
	
	@PostMapping("buscar")
	public Calificacion buscar(@RequestBody Calificacion calificacion)
	{
		calificacion = califServ.buscar(calificacion);
		return calificacion;
	}

	
}
