package edu.ec.ups.est.biblioteca.clases;

import edu.ec.ups.est.biblioteca.interfaces.IPrestable;

public class Libro implements IPrestable {
	private String titulo;
	private String autor;
	private int año;
	private boolean disponible;
		
	public Libro() {
	}
	
	public Libro(String titulo, String autor, int año, boolean disponible) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.año = año;
		this.disponible = disponible;
	}

	public Libro(String titulo, String autor, boolean disponible) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.disponible = disponible;
	}

	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public boolean getDisponibilidad() {
		return disponible;
	}
	public String disponible() {
		if(this.disponible==true) {
        	 return "disponible";
        }else {
        	return "no disponible";
        }
		
	}

	@Override
	public void prestar() {
		this.disponible = false;
	}

	@Override
	public void devolver() {
	this.disponible = true;
	}
	//Mostrar informacion
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", año=" + año + ", disponible=" + disponible + "]";
	}
	
	
	
	
}
