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

import com.edu.unab.model.entity.Producto;
import com.edu.unab.model.service.ProductoService;

@RestControllerAdvice
@RequestMapping("/api/producto")
@CrossOrigin(origins="http://localhost:8080/", methods = {RequestMethod.POST, RequestMethod.DELETE,RequestMethod.GET})
public class ProductoController {
	@Autowired
	private ProductoService productoService;
	
	@PostMapping
	public Producto guardar(@RequestBody Producto producto) {
		return productoService.save(producto);
	}
	
	@GetMapping("/{id}")
	public Optional<Producto>buscarporId(@PathVariable Integer id){
		return productoService.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Producto>listarTodos(){
		return productoService.findAll();
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		productoService.deleteById(id);
	}

}
