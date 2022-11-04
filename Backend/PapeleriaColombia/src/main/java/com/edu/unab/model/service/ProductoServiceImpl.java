package com.edu.unab.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.unab.model.entity.Producto;
import com.edu.unab.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository productoRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Producto> findAll() {
		return productoRepository.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Optional<Producto> findById(Integer id) {
		return productoRepository.findById(id);
	}


	@Override
	@Transactional
	public Producto save(Producto p) {
		return productoRepository.save(p);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		productoRepository.deleteById(id);
	}

}
