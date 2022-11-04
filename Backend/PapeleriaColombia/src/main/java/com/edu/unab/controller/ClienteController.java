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

import com.edu.unab.model.entity.Cliente;
import com.edu.unab.model.service.ClienteService;

@RestControllerAdvice
@RequestMapping("/api/cliente")
@CrossOrigin(origins="http://localhost:8080/", methods = {RequestMethod.POST, RequestMethod.DELETE,RequestMethod.GET})
public class ClienteController {

	@Autowired 
	private ClienteService clienteService;
	
	@PostMapping
	public Cliente guardar(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente>buscarPorId(@PathVariable Integer id){
		return clienteService.findById(id);
	}
	
	@GetMapping("/listar")
	public Iterable<Cliente>listarTodos(){
		return clienteService.findAll();
		
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		clienteService.deleteById(id);
	}
	
}

