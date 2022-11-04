package com.edu.unab.model.service;

import java.util.Optional;
import com.edu.unab.model.entity.Ventas;

public interface VentasService {

public Iterable<Ventas>findAll();
	
	public Optional<Ventas>findById(Integer id);

	public Ventas save(Ventas c);

	public void deleteById(Integer id);
		
	
}
