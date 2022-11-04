package com.edu.unab.model.service;

import java.util.Optional;

import com.edu.unab.model.entity.Ciudad;

public interface CiudadService {
public Iterable<Ciudad>findAll();
public Optional<Ciudad>findById(Integer id);
public Ciudad save (Ciudad c);
public void deleteById(Integer id);
}