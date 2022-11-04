package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="papeleria")
public class Papeleria {
	@Id
	@Column(name="id_papeleria") 
	private Integer id_papeleria;
	@Column(name="nit")
	private Integer nit;
	@Column(name="nombre")
	private String nombre;
	@ManyToOne
	@JoinColumn(name="id_ciudad")
	private Ciudad id_ciudad;
	
	public Papeleria() {

	}

	public Integer getId_papeleria() {
		return id_papeleria;
	}

	public Papeleria(Integer id_papeleria, Integer nit, String nombre, Ciudad id_ciudad) {
		super();
		this.id_papeleria = id_papeleria;
		this.nit = nit;
		this.nombre = nombre;
		this.id_ciudad = id_ciudad;
	}

	public Integer getNit() {
		return nit;
	}

	public void setNit(Integer nit) {
		this.nit = nit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ciudad getId_ciudad() {
		return id_ciudad;
	}

	public void setId_ciudad(Ciudad id_ciudad) {
		this.id_ciudad = id_ciudad;
	}

	public void setId_papeleria(Integer id_papeleria) {
		this.id_papeleria = id_papeleria;
	}

	@Override
	public String toString() {
		return "Papeleria [id_papeleria=" + id_papeleria + ", nit=" + nit + ", nombre=" + nombre + ", id_ciudad="
				+ id_ciudad + "]";
	}
	
}