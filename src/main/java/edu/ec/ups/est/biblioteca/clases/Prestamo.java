package edu.ec.ups.est.biblioteca.clases;
import java.util.Date;

public class Prestamo {
	private Libro libro;
	private Date fechaPrestamo;
	private Date fechaDevolucion;
	
	public Prestamo() {
		
	}
	public Prestamo(Libro libro, Date fechaPrestamo, Date fechaDevolucion) {
		super();
		this.libro = libro;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}
	public Prestamo(Libro libro, Date fechaPrestamo) {
		super();
		this.libro = libro;
		this.fechaPrestamo = fechaPrestamo;
	}
	
	
	
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	public void calcularDiasPrestamo(Date fechaPrestamo, Date fechaDevolucion) {
		
	}
	public void esPrestamoVigente(Date fechaPrestamo, Date fechaDevolucion) {
		
	}
	
	@Override
	public String toString() {
		return "Prestamo [libro=" + libro + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion
				+ "]";
	}
	
	
	
	
	
}
