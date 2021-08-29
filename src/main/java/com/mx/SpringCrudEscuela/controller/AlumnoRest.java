package com.mx.SpringCrudEscuela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mx.SpringCrudEscuela.dominio.Alumno;
import com.mx.SpringCrudEscuela.servicio.AlumnoServ;

@CrossOrigin
@RestController
@RequestMapping("alumnoRs")
public class AlumnoRest {

	@Autowired
	AlumnoServ alumnoServ;
	
	@GetMapping("listar")
	public List<Alumno> listar(){
		var lista = alumnoServ.listar();
		System.out.println("listar -->"+lista);
		return lista;
	}
	
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Alumno alumno)
	{
		alumnoServ.guardar(alumno);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Alumno alumno)
	{
		alumnoServ.editar(alumno);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Alumno alumno)
	{
		alumnoServ.eliminar(alumno);
	}
	
	@PostMapping("buscar")
	public Alumno buscar(@RequestBody Alumno alumno)
	{
		alumno = alumnoServ.buscar(alumno);
		return alumno;
	}

}
