package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ciudad")
public class Ciudad {
	@Id
	@Column(name="id_ciudad") 
	private Integer id_ciudad;
	@Column(name="nombre")
	private String nombre;
	
	public Ciudad(Integer id_ciudad, String nombre) {
	
		this.id_ciudad = id_ciudad;
		this.nombre = nombre;
	}

	public Ciudad() {
		
	}

	public Integer getId_ciudad() {
		return id_ciudad;
	}

	public void setId_Ciudad(Integer id_ciudad) {
		this.id_ciudad = id_ciudad;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Ciudad [id_ciudad=" + id_ciudad + ", nombre=" + nombre + "]";
	}
	
	

}
