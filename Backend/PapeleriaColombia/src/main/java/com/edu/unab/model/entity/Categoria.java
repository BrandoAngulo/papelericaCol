package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria {
	
	@Id
	@Column(name="id_categoria")
	private Integer id_categoria;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="nombre")
	private String nombre;
	
	public Categoria() {
	
	}

	public Categoria(Integer id_categoria, String descripcion, String nombre) {
		super();
		this.id_categoria = id_categoria;
		this.descripcion = descripcion;
		this.nombre = nombre;
	}

	public Integer getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Integer id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Categoria [id_categoria=" + id_categoria + ", descripcion=" + descripcion + ", nombre=" + nombre + "]";
	}
	
	
}
