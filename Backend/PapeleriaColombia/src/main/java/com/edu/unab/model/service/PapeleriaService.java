package com.edu.unab.model.service;

import java.util.Optional;

import com.edu.unab.model.entity.Papeleria;

public interface PapeleriaService {
public Iterable<Papeleria>findAll();
public Optional<Papeleria>findById(Integer id);
public Papeleria save (Papeleria p);
public void deleteById(Integer id);
}