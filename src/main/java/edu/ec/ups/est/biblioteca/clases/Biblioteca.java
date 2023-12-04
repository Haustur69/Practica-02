package edu.ec.ups.est.biblioteca.clases;

import java.util.ArrayList;
import java.util.Date;
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
	 
	 //Sobrecarga de metodos
	 public Libro buscarLibro(String titulo) {
	        for (Libro libro : listLibros) {
	            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
	                return libro; // Devuelve el libro si se encuentra
	            }
	        }
	        return null; // Devuelve null si el libro no se encuentra
	    }
	 
	 public Libro buscarLibro(String titulo,String autor) {
		 for(Libro libro : listLibros) {
			 if(libro.getAutor().equalsIgnoreCase(autor)&& libro.getTitulo().contentEquals(titulo)) {
				 return libro;
			 }
		 }
		return null;
	 }
	
	 public Usuario buscarUsuario(String id) {
		 for(Usuario usuario : listaUsuario) {
			 if (usuario.getIdentificacion().equalsIgnoreCase(id)) {
				 return usuario;
			 }
		 }
		 return null;
	 }
	 
	 
	public void prestarLibro(Libro libro, Usuario usuario,Date fechaPrestamo,Date fechaDevolucion) {
	 if(libro.getDisponibilidad()==true && usuario.verificarUsuario(usuario)== true) {
		 usuario.solicitarPrestamo(libro, fechaPrestamo, fechaDevolucion);
		 libro.prestar();
		 System.out.println("El prestamo se a realizado con exito.");
	 }else {
		 System.out.println("El libro no esta disponible o usuario incorrecto.");
	 }
	}
	
	public void devolverLibro(Libro libro, Usuario usuario) {
		if(libro.getDisponibilidad()== false && usuario.verificarUsuario(usuario)== true) {
			usuario.devolverLibro(libro);
			System.out.println("El libro ha sido devuelto con exito.");
		}else {
		System.out.println("El libro no esta prestado.");
	}}
	
}
