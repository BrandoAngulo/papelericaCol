package com.edu.unab.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.edu.unab.model.entity.Ciudad;
import com.edu.unab.repository.CiudadRepository;

@Service
public class CiudadServiceImpl implements CiudadService {

	@Autowired
	private CiudadRepository ciudadRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Ciudad> findAll() {
		return ciudadRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Ciudad> findById(Integer id) {
		return ciudadRepository.findById(id);
	}

	@Override
	@Transactional
	public Ciudad save(Ciudad c) {
		return ciudadRepository.save(c);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		ciudadRepository.deleteById(id);
	}

}
