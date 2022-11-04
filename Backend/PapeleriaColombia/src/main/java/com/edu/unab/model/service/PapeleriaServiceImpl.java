package com.edu.unab.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.edu.unab.model.entity.Papeleria;
import com.edu.unab.repository.PapeleriaRepository;

@Service
public class PapeleriaServiceImpl implements PapeleriaService {

	@Autowired
	private PapeleriaRepository papeleriaRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Papeleria> findAll() {
		return papeleriaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Papeleria> findById(Integer id) {
		return papeleriaRepository.findById(id);
	}

	@Override
	@Transactional
	public Papeleria save(Papeleria p) {
		return papeleriaRepository.save(p);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		papeleriaRepository.deleteById(id);
	}

}
