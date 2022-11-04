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

import com.edu.unab.model.entity.Categoria;
import com.edu.unab.model.service.CategoriaService;

@RestControllerAdvice
@RequestMapping("/api/categoria")
@CrossOrigin(origins="http://localhost:8080/", methods = {RequestMethod.POST, RequestMethod.DELETE,RequestMethod.GET})
public class CategoriaController {

	@Autowired 
	private CategoriaService categoriaService;
	
	@PostMapping
	public Categoria guardar(@RequestBody Categoria categoria) {
		return categoriaService.save(categoria);
	}	
		@GetMapping("/{id}")
		public Optional<Categoria>buscarporId(@PathVariable Integer id){
			return categoriaService.findById(id);
		}
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		categoriaService.deleteById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Categoria>listarTodos(){
		return categoriaService.findAll();
	}
	
	
	
}
