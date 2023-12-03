package edu.ec.ups.est.biblioteca.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Usuario extends Persona {
	private String correo;
	private List<Prestamo> listaPrestamos;
	
	public Usuario() {
		this.listaPrestamos = new ArrayList<>();
	}
	
	public Usuario(String correo,String nombre, String identificacion) {
		super(nombre, identificacion);
		this.correo = correo;
		this.listaPrestamos = new ArrayList<>();
	}
	public Usuario(String correo,String nombre) {
		super(nombre);
		this.correo = correo;
		this.listaPrestamos = new ArrayList<>();
	}
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public void solicitarPrestamo(Libro libro, Date fechaPrestamo,Date fechaDevolucion) {
		listaPrestamos.add(new Prestamo(libro, fechaPrestamo, fechaDevolucion));
	}
	
	public void devolverLibro(Libro libro) {
		
	}
	
	
	
	@Override
	public String mostrarInformacion() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
