package com.edu.unab.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@Column(name = "id_usuario")
	private Integer id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "fecha_nacimiento")
	private Date fecha_nacimiento;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "cedula")
	private Integer cedula;
	@Column(name = "celular")
	private Integer celular;
	@Column(name = "correo")
	private String correo;
	@ManyToOne
	@JoinColumn(name = "id_ciudad")
	private Ciudad id_ciudad;
	@Column(name = "pass")
	private String pass;
	@Column(name = "estado")
	private String estado;
	@ManyToOne
	@JoinColumn(name = "id_roles")
	private Roles id_roles;
	
	public Usuario() {

	}

	
	public Usuario(Integer id, String nombre, Date fecha_nacimiento, String direccion, Integer cedula, Integer celular,
			String correo, Ciudad id_ciudad, String pass, String estado, Roles id_roles) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.direccion = direccion;
		this.cedula = cedula;
		this.celular = celular;
		this.correo = correo;
		this.id_ciudad = id_ciudad;
		this.pass = pass;
		this.estado = estado;
		this.id_roles = id_roles;
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


	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Integer getCedula() {
		return cedula;
	}


	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}


	public Integer getCelular() {
		return celular;
	}


	public void setCelular(Integer celular) {
		this.celular = celular;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public Ciudad getId_ciudad() {
		return id_ciudad;
	}


	public void setId_ciudad(Ciudad id_ciudad) {
		this.id_ciudad = id_ciudad;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Roles getId_roles() {
		return id_roles;
	}


	public void setId_roles(Roles id_roles) {
		this.id_roles = id_roles;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + ", direccion="
				+ direccion + ", cedula=" + cedula + ", celular=" + celular + ", correo=" + correo + ", id_ciudad="
				+ id_ciudad + ", pass=" + pass + ", estado=" + estado + ", id_roles=" + id_roles + "]";
	}

	
}
