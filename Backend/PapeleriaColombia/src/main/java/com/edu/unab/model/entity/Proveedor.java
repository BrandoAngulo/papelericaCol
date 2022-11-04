package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor {
	@Id
	@Column(name = "id_proveedor")
	private Integer id_proveedor;
	@Column(name = "nit")
	private Integer nit;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "celular")
	private Integer celular;
	@Column(name = "estado")
	private String estado;

	public Proveedor() {

	}

	public Proveedor(Integer id_proveedor, Integer nit, String nombre, String direccion, Integer celular,
			String estado) {
		super();
		this.id_proveedor = id_proveedor;
		this.nit = nit;
		this.nombre = nombre;
		this.direccion = direccion;
		this.celular = celular;
		this.estado = estado;
	}

	public Integer getId_proveedor() {
		return id_proveedor;
	}

	public void setId_proveedor(Integer id_proveedor) {
		this.id_proveedor = id_proveedor;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Proveedor [id_proveedor=" + id_proveedor + ", nit=" + nit + ", nombre=" + nombre + ", direccion="
				+ direccion + ", celular=" + celular + ", estado=" + estado + "]";
	}

}
