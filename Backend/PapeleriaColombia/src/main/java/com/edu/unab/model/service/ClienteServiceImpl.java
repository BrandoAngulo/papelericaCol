package com.edu.unab.model.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.unab.model.entity.Cliente;
import com.edu.unab.repository.ClienteRepository;

@Service

public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Cliente> findAll() {
		
		return clienteRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Cliente> findById(Integer id) {
		return clienteRepository.findById(id);
	}

	@Override
	@Transactional
	public Cliente save(Cliente c) {
		return clienteRepository.save(c);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		clienteRepository.deleteById(id);
		
	}
	
	
	
}
