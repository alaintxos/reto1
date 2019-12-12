package reto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Escritura {
	
	private boolean seguir;
	private String frase = "";

	public void EscribirSalidaEstandar(Scanner sc) {
			
		System.out.print("Introduce el texto que mas desees: ");
		sc.nextLine();
		frase = sc.nextLine();
		System.out.println(frase);

	}
	
	public Libro CrearLibroEntradaEstandar(Scanner sc, Libro libro) {
		
		libro = new Libro();
		seguir = false;
		
		System.out.println("empieza a escribir los datos del libro: ");
		
		while(!seguir) {
			try {
				System.out.println("Introducir Id: ");
				libro.setId(sc.nextInt());
				seguir = true;
			} catch (InputMismatchException error) {
				System.out.println("Introduce un valor numerico!");
				seguir = false;
				sc.next();
			}
		}
		
		System.out.println("Introducir Titulo: ");
		libro.setTitulo(sc.nextLine());
		libro.setTitulo(sc.nextLine());
		System.out.println("Introducir Autor: ");
		libro.setAutor(sc.nextLine());
		System.out.println("Introducir Genero: ");
		libro.setGenero(sc.nextLine());
		System.out.println("Introducir Editorial: ");
		libro.setEditorial(sc.nextLine());
		System.out.println("Introducir Fecha: ");
		libro.setFecha(sc.nextLine());
		
		return libro;
	}
	
	public void EscribirLibroFichero(Libro libro) throws IOException {
		
		EscribirTxt(libro);
		EscribirDoc(libro);
		EscribirCSV(libro);	
		
	}
	
	private void EscribirTxt(Libro libro) {
		FileWriter ficherotxt = null;
		PrintWriter pw;
		try {
			ficherotxt = new FileWriter("C:\\Users\\admin1\\Desktop\\prueba.txt", true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw = new PrintWriter(ficherotxt);
		pw.write("Id: " + libro.getId() + '\n' + "Autor: " + libro.getAutor() + '\n' + "Genero: " 
				+ libro.getGenero() + '\n' + "Editorial: " + libro.getEditorial()
				+ '\n' + "Titulo: " + libro.getTitulo() + '\n' + "Fecha Edicion: " + libro.getFecha() + '\n');
		pw.write("---------------------------------------------------" + '\n');
		pw.write("");
		pw.close();	
	}
	
	private void EscribirDoc(Libro libro) {
		FileWriter ficherodoc = null;
		PrintWriter pw;
		try {
			ficherodoc = new FileWriter("C:\\Users\\admin1\\Desktop\\prueba.doc", true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw = new PrintWriter(ficherodoc);
		pw.write("Id: " + libro.getId() + '\n' + "Autor: " + libro.getAutor() + '\n' + "Genero: " 
				+ libro.getGenero() + '\n' + "Editorial: " + libro.getEditorial()
				+ '\n' + "Titulo: " + libro.getTitulo() + '\n' + "Fecha Edicion: " + libro.getFecha() + '\n');
		pw.write("---------------------------------------------------------" +'\n');
		pw.write("");
		pw.close();
	}
	
	private void EscribirCSV(Libro libro) {
		FileWriter ficherocsv = null;
		PrintWriter pw;
		try {
			ficherocsv = new FileWriter("C:\\Users\\admin1\\Desktop\\prueba.csv", true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw = new PrintWriter(ficherocsv);
		String entrada = Integer.toString(libro.getId()) + ',' + libro.getAutor() + ',' 
				+ libro.getGenero() + ',' + libro.getEditorial() + ',' + libro.getTitulo() + ',' + libro.getFecha()+ '\n';
		pw.write(entrada);
		pw.close();

	}

}
