package edu.ec.ups.est.biblioteca.clases;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private String nomhre;
	private String dirrecion;
	private List<Libro> listLibros;
	private List<Usuario> listaUsuario;
	
	public Biblioteca() {
		this.listaUsuario = new ArrayList<>();
		this.listLibros = new ArrayList<>();
	}
	
	public Biblioteca(String nomhre, String dirrecion) {
		super();
		this.nomhre = nomhre;
		this.dirrecion = dirrecion;
		this.listaUsuario = new ArrayList<>();
		this.listLibros = new ArrayList<>();
	}
	
	public Biblioteca(String nomhre) {
		super();
		this.nomhre = nomhre;
		this.listaUsuario = new ArrayList<>();
		this.listLibros = new ArrayList<>();
	}
	

	public String getNomhre() {
		return nomhre;
	}
	public void setNomhre(String nomhre) {
		this.nomhre = nomhre;
	}
	public String getDirrecion() {
		return dirrecion;
	}
	public void setDirrecion(String dirrecion) {
		this.dirrecion = dirrecion;
	}

	 public List<Libro> getListaLibros() {
		return listLibros;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}


	public void agregarLibro(Libro libro) {
		 listLibros.add(libro);
	 }
	 public void agregarUsuario(Usuario usuario) {
		listaUsuario.add(usuario);
	 }
	 
	 public Libro buscarLibroPorTitulo(String titulo) {
	        for (Libro libro : listLibros) {
	            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
	                return libro; // Devuelve el libro si se encuentra
	            }
	        }
	        return null; // Devuelve null si el libro no se encuentra
	    }
	
}
