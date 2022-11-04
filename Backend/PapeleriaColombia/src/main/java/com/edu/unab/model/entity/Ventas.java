package com.edu.unab.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ventas")
public class Ventas {
	
	@Id
	@Column(name="id_ventas")
	private Integer id_ventas;
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente id_cliente;
	@Column(name="cantidad")
	private Integer cantidad;
	@Column(name="fecha")
	private Date fecha;
	@Column(name="tipo_pago")
	private String tipo_pago;
	@Column(name="valor_total")
	private Integer valor_total;
	@ManyToOne
	@JoinColumn(name="id_producto")
	private Producto id_producto;
	
	public Ventas() {
	}

	public Ventas(Integer id_ventas, Cliente id_cliente, Integer cantidad, Date fecha, String tipo_pago,
			Integer valor_total, Producto id_producto) {
		this.id_ventas = id_ventas;
		this.id_cliente = id_cliente;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.tipo_pago = tipo_pago;
		this.valor_total = valor_total;
		this.id_producto = id_producto;
	}

	public Integer getId_ventas() {
		return id_ventas;
	}

	public void setId_ventas(Integer id_ventas) {
		this.id_ventas = id_ventas;
	}

	public Cliente getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Cliente id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipo_pago() {
		return tipo_pago;
	}

	public void setTipo_pago(String tipo_pago) {
		this.tipo_pago = tipo_pago;
	}

	public Integer getValor_total() {
		return valor_total;
	}

	public void setValor_total(Integer valor_total) {
		this.valor_total = valor_total;
	}

	public Producto getId_producto() {
		return id_producto;
	}

	public void setId_producto(Producto id_producto) {
		this.id_producto = id_producto;
	}

	@Override
	public String toString() {
		return "Ventas [id_ventas=" + id_ventas + ", id_cliente=" + id_cliente + ", cantidad=" + cantidad + ", fecha="
				+ fecha + ", tipo_pago=" + tipo_pago + ", valor_total=" + valor_total + ", id_producto=" + id_producto
				+ "]";
	}

	
	
}

