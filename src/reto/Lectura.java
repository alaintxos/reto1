package reto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lectura {
	File archivo = null;
	FileReader fr = null;
	BufferedReader br = null;
	String rutaArchivo;
	String linea;
	String[] palabras;

	public String LecturaEntradaEstandarString(Scanner sc) {
		System.out.print("Introduce el texto que mas desees: ");
		return sc.nextLine();	
	}
	
	public void leerficherotxt() throws IOException {
		Abrirfitxero abrir = new Abrirfitxero();
		// lectura desde fichero txt
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			br = abrir.abrirfitxerotxt();
			
			System.out.println("Archivo txt");
			System.out.println("***");
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fr.close();
		}
	}

	public void leerficherocsv() throws IOException {
		Abrirfitxero abrir = new Abrirfitxero();
		// lectura desde fichero csv
		try {

			br= abrir.abrirfitxerocsv();
			String lineacsv = br.readLine();
			System.out.println("Archivo csv");
			System.out.println("***");
			while (lineacsv != null) {
				palabras = lineacsv.split(",");
				System.out.println("Id: " + palabras[0]);
				System.out.println("Titulo: " + palabras[4]);
				System.out.println("Autor: " + palabras[1]);
				System.out.println("Genero: " + palabras[2]);
				System.out.println("Editorial: " + palabras[3]);
				System.out.println("Fecha Edicion: " + palabras[5]);
				System.out.println("************");
				lineacsv = br.readLine();

			}
		} catch (IOException ex) {
			System.out.println("Error en la apertura del archivo " + ex.toString());
		} finally {
			fr.close();
			
		}

	}

	public void leerficherodoc() throws IOException {
		 Abrirfitxero abrir = new Abrirfitxero();
			
		// lectura fichero doc
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			br=abrir.abrirfitxerodoc();
			linea = null;
			System.out.println("Archivo doc");
			System.out.println("***");
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fr.close();
			
		}

	}
}
