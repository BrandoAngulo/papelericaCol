package com.edu.unab.model.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.edu.unab.model.entity.Ventas;
import com.edu.unab.repository.VentasRepository;


@Service
public class VentasServiceImpl implements VentasService{

	
	@Autowired
	private VentasRepository ventasRepository;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Ventas> findAll() {

		return ventasRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Ventas> findById(Integer id) {
	
		return ventasRepository.findById(id);
	}

	@Override
	@Transactional 
	public Ventas save(Ventas v) {
		return ventasRepository.save(v);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		ventasRepository.deleteById(id);
		
	}

}
