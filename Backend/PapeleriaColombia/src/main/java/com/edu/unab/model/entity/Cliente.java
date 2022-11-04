package com.edu.unab.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
	
	@Id
	@Column(name="id_clientes")
	private Integer id_clientes;
	@Column(name="estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario id_usuario;
	
	public Cliente() {
		super();
	}

	public Cliente(Integer id_clientes, String estado, Usuario id_usuario) {
		this.id_clientes = id_clientes;
		this.estado = estado;
		this.id_usuario = id_usuario;
	}

	public Integer getId_clientes() {
		return id_clientes;
	}

	public void setId_clientes(Integer id_clientes) {
		this.id_clientes = id_clientes;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Usuario getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Usuario id_usuario) {
		this.id_usuario = id_usuario;
	}

	@Override
	public String toString() {
		return "Cliente [id_clientes=" + id_clientes + ", estado=" + estado + ", id_usuario=" + id_usuario + "]";
	}
		
}
