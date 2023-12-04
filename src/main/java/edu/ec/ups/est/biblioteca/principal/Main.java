package edu.ec.ups.est.biblioteca.principal;
import java.util.Date;
import java.util.Scanner;
import edu.ec.ups.est.biblioteca.clases.*;

public class Main {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "123 Calle Principal");
		
		//Libros 
		Libro libroUno = new Libro("1984","George Orwell",1949,true);
		Libro libroDos = new Libro("Cien años de soledad","Gabriel García Marquez",1967,true);
		Libro libroTres = new Libro("To Kill a Mockingbird","Harper Lee",1960,true);
		Libro libroCuatro= new Libro("The Great Gatsby","F.Scott Fitzgerald",1925,true);
		Libro libroCinco = new Libro("Harry Poter y la piedra filosofal","J.K Rowling",1997,true);
		Libro libroSeis = new Libro("The Catcher in the Rye", "J.D. Salinger", 1951, true);
		Libro libroSiete = new Libro("The Hobbit", "J.R.R. Tolkien", 1937, true);
		Libro libroOcho = new Libro("The Lord of the Rings", "J.R.R. Tolkien", 1954, true);
		Libro libroNueve = new Libro("One Hundred Years of Solitude", "Gabriel García Márquez", 1967, true);
		Libro libroDiez = new Libro("The Da Vinci Code", "Dan Brown", 2003, true);
		biblioteca.agregarLibro(libroUno);
		biblioteca.agregarLibro(libroDos);
		biblioteca.agregarLibro(libroTres);
		biblioteca.agregarLibro(libroCuatro);
		biblioteca.agregarLibro(libroCinco);
		biblioteca.agregarLibro(libroSeis);
		biblioteca.agregarLibro(libroSiete);
		biblioteca.agregarLibro(libroOcho);
		biblioteca.agregarLibro(libroNueve);
		biblioteca.agregarLibro(libroDiez);
		
		
		Scanner scanner = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Bienvenido al Sistema de Gestión de Biblioteca");
				 System.out.println("1. Agregar Libro");
				 System.out.println("2. Registrar Usuario");
				 System.out.println("3. Buscar Libro");
				 System.out.println("4. Prestar Libro");
				 System.out.println("5. Devolver Libro");
				 System.out.println("6. Salir");
				 System.out.print("Ingrese una opción: ");
				 opcion = scanner.nextInt();
				 scanner.nextLine(); 
				 switch (opcion) {
				 case 1:
					System.out.println("\nIngrese el titulo del libro que desea agregar:");
					String titulo = scanner.nextLine();
					System.out.println("Ingrese el autor del libro que desea agregar:");
					String autor = scanner.nextLine();
					System.out.println("Ingrese el año de publicación del libro:");
					int año = scanner.nextInt();
					Libro libroNuevo = new Libro(titulo,autor,año,true);
					biblioteca.agregarLibro(libroNuevo);
					System.out.println("El libro se agrego correctamente.\n");
					
					 break;
				 case 2:
                    System.out.print("Ingrese el nombre del usuario: ");
                    String nombreUsuario = scanner.nextLine();
                    System.out.print("Ingrese su numero de identificacion: ");
                    String idUser = scanner.nextLine();
                    System.out.print("Ingrese un correo electronico: ");
                    String correoUser = scanner.nextLine();
                    Usuario nuevoUsuario = new Usuario(  correoUser,nombreUsuario,idUser);
                    biblioteca.agregarUsuario(nuevoUsuario);
                    System.out.println(nuevoUsuario.mostrarInformacion());
                    System.out.println("Su usuario se ha registrado con exito.\n");
					 
					 break;
				 case 3:
					 do{
	                    System.out.println("===== Opciones de Búsqueda =====");
	                    System.out.println("1. Buscar por Título ");
	                    System.out.println("2. Buscar por Titulo y Autor");
	                    System.out.print("Ingrese su opción: ");
	                    int opcionBusqu = scanner.nextInt();
	                    scanner.nextLine();
	                    switch (opcionBusqu) {
	                        case 1:
	                        	System.out.print("Ingrese el título del libro a buscar: ");
	    	                    String tituloBusqueda = scanner.nextLine();

	    	                    Libro libroEncontrado = biblioteca.buscarLibro(tituloBusqueda);
	    	                    
	    	                    if (libroEncontrado != null) {
	    	                        
	    							System.out.println("Libro encontrado: " + libroEncontrado.getTitulo() +
	    	                                " de " + libroEncontrado.getAutor()+ " el libro esta: "+ libroEncontrado.disponible());
	    	                    } else {
	    	                        System.out.println("Libro no encontrado.\n");
	    	                    }
	                            break;
	                        case 2:
	                        	System.out.print("Ingrese el título del libro a buscar: ");
	    	                    String tituloBusq = scanner.nextLine();
	    	                    System.out.print("Ingrese el autor del libro a buscar: ");
	    	                    String autorBusq = scanner.nextLine();

	    	                    Libro libroEnco = biblioteca.buscarLibro(tituloBusq, autorBusq);
	    	                    
	    	                    if (libroEnco != null) {
	    	                        
	    							System.out.println("Libro encontrado: " + libroEnco.getTitulo() +
	    	                                " de " + libroEnco.getAutor()+ " el libro esta: "+ libroEnco.disponible());
	    	                    } else {
	    	                        System.out.println("Libro no encontrado.\n");
	    	                    }
	                            break;
	                        	default:
	                        		System.out.println("Opción no válida. Inténtelo de nuevo.\n");
	                    		}
	                    }while (opcion != 6);
	       					 scanner.close();
	                    
					 break;
				 case 4:
					 long milisegundosActuales = System.currentTimeMillis();
					 Date fecha = new Date(milisegundosActuales);		
					 System.out.print("\nIngrese el título del libro a prestar: ");
	                    String libroPrestamo = scanner.nextLine();
	                    System.out.print("Ingrese su identificacion: ");
	                    String idUsuarioPrestamo = scanner.nextLine();
	                    System.out.println("Ingrese los dias de prestamo");
	                    int diasPrestamo = scanner.nextInt();
	                    long milisegundosFuturos = milisegundosActuales + ((long) diasPrestamo * 24 * 60 * 60 * 1000);
	                    Date fecha2 = new Date(milisegundosFuturos);
	                    biblioteca.prestarLibro(biblioteca.buscarLibro(libroPrestamo), biblioteca.buscarUsuario(idUsuarioPrestamo), fecha,fecha2);
	                    
	                    
	                    
					 break;
				 case 5:
					 System.out.print("\nIngrese el título del libro a devolver: ");
	                    String libroDevuelto = scanner.nextLine();
	                    System.out.print("Ingrese su identificacion: ");
	                    String idUsuarioDevuelto = scanner.nextLine();
	                    biblioteca.devolverLibro(biblioteca.buscarLibro(libroDevuelto), biblioteca.buscarUsuario(idUsuarioDevuelto));
					 break;
				 case 6:
					 System.out.println("Saliendo del sistema...");
					 break;
					 default:
					 System.out.println("Opción no válida. Por favor intente de nuevo.");
					 }
					 } while (opcion != 6);
					 scanner.close();
					 }

}

