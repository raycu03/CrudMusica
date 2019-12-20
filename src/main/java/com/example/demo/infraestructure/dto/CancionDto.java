package com.example.demo.infraestructure.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="canciones")
public class CancionDto extends BaseEntity{
	

	String nombre;
	String autor;
	Double valor;
	Double duracion;
	String genero;
	Double calificacion;
	
	public CancionDto() {
		// TODO Auto-generated constructor stub
	}

	public CancionDto(String nombre, String autor, Double valor, Double duracion, String genero, Double calificacion) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.valor = valor;
		this.duracion = duracion;
		this.genero = genero;
		this.calificacion = calificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getDuracion() {
		return duracion;
	}

	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}
	
	
	
	
	
}
