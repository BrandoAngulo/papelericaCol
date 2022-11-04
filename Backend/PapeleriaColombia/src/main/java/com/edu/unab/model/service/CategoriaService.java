package com.edu.unab.model.service;

import java.util.Optional;

import com.edu.unab.model.entity.Categoria;

public interface CategoriaService {

	public Iterable<Categoria>findAll();
	public Optional<Categoria>findById(Integer id);
	public Categoria save(Categoria c);
	public void deleteById(Integer id);
	
}
