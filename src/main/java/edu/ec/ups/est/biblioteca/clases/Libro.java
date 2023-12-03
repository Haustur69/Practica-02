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

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public void prestar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
