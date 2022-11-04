package com.edu.unab.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.unab.model.entity.Proveedor;
import com.edu.unab.repository.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService {

	@Autowired
	private ProveedorRepository proveedorRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Proveedor> findAll() {
		return proveedorRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Proveedor> findById(Integer id) {
		return proveedorRepository.findById(id);
	}

	@Override
	public Proveedor save(Proveedor p) {
		return proveedorRepository.save(p);
	}

	@Override
	public void deleteById(Integer id) {
		proveedorRepository.deleteById(id);
	}

}
