package com.edu.unab.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.edu.unab.model.entity.Ciudad;
import com.edu.unab.model.service.CiudadService;

@RestControllerAdvice
@RequestMapping("api/ciudad")
@CrossOrigin(origins="http://localhost:8080/", methods = {RequestMethod.POST, RequestMethod.DELETE,RequestMethod.GET})
public class CiudadController {

	@Autowired
	private CiudadService ciudadService;

	@PostMapping
	public Ciudad guardar(@RequestBody Ciudad ciudad) {
		return ciudadService.save(ciudad);
	}

	@GetMapping("/{id}")
	public Optional<Ciudad>buscarPorId(@PathVariable Integer id){
	return ciudadService.findById(id);
	}
	
	@GetMapping("listar")
	public Iterable<Ciudad>listarTodos(){
		return ciudadService.findAll();
	}
	
	@DeleteMapping("{id}")
	public void eliminar (@PathVariable Integer id) {
		ciudadService.deleteById(id);
	}
}
