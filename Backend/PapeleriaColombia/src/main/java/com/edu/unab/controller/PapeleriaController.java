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

import com.edu.unab.model.entity.Papeleria;
import com.edu.unab.model.service.PapeleriaService;

@RestControllerAdvice
@RequestMapping("api/papeleria")
@CrossOrigin(origins="http://localhost:8080/", methods = {RequestMethod.POST, RequestMethod.DELETE,RequestMethod.GET})
public class PapeleriaController {

	@Autowired
	private PapeleriaService papeleriaService;

	@PostMapping
	public Papeleria guardar(@RequestBody Papeleria papeleria) {
		return papeleriaService.save(papeleria);
	}

	@GetMapping("/{id}")
	public Optional<Papeleria>buscarPorId(@PathVariable Integer id){
	return papeleriaService.findById(id);
	}
	
	@GetMapping("listar")
	public Iterable<Papeleria>listarTodos(){
		return papeleriaService.findAll();
	}
	
	@DeleteMapping("{id}")
	public void eliminar (@PathVariable Integer id) {
		papeleriaService.deleteById(id);
	}
}
