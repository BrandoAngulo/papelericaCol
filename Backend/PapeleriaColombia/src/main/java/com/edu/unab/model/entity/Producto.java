package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos")

public class Producto {

	@Id
	@Column(name = "id_producto")
	private Integer id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "precio")
	private Double precio;

	@Column(name = "estado")
	private String estado;

	@Column(name = "descripcion")
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "id_proveedor")
	private Proveedor id_proveedor;
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria id_categoria;

	public Producto(Integer id, String nombre, Double precio, String estado, String descripcion, Proveedor id_proveedor,
			Categoria id_categoria) {

		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.estado = estado;
		this.descripcion = descripcion;
		this.id_proveedor = id_proveedor;
		this.id_categoria = id_categoria;

	}

	public Producto() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Proveedor getId_proveedor() {
		return id_proveedor;
	}

	public void setId_proveedor(Proveedor id_proveedor) {
		this.id_proveedor = id_proveedor;
	}

	public Categoria getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Categoria id_categoria) {
		this.id_categoria = id_categoria;
	}

	@Override
	public String toString() {
		return "Producto [id= " + id + ", nombre= " + nombre + ", precio= " + precio + ", estado=" + estado
				+ ", descripcion= " + descripcion + ", id_proveedor=" + id_proveedor + ", id_categoria=" + id_categoria
				+ "]";
	}

}
