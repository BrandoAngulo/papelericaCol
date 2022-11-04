package com.edu.unab.model.service;

import java.util.Optional;

import com.edu.unab.model.entity.Producto;

public interface ProductoService {

	public Iterable<Producto>findAll();
	public Optional<Producto>findById(Integer id);
	public Producto save(Producto p);
	public void deleteById(Integer id);

}
