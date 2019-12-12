package reto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lectura {
	File archivo = null;
	FileReader fr = null;
	BufferedReader br = null;
	String rutaArchivo;
	String linea;
	String[] palabras;

	public void leerficherotxt() throws IOException {

		// lectura desde fichero txt
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File("C:\\Users\\admin1\\Desktop\\prueba.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
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
		FileReader frcsv = null;
		// lectura desde fichero csv
		try {

			rutaArchivo = "C:\\Users\\admin1\\Desktop\\prueba.csv";
			frcsv = new FileReader(rutaArchivo);
			BufferedReader entradaArchivo = new BufferedReader(frcsv);
			String lineacsv = entradaArchivo.readLine();
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
				lineacsv = entradaArchivo.readLine();

			}
		} catch (IOException ex) {
			System.out.println("Error en la apertura del archivo " + ex.toString());
		} finally {
			frcsv.close();
			
		}

	}

	public void leerficherodoc() throws IOException {

		// lectura fichero doc
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File("C:\\Users\\admin1\\Desktop\\prueba.doc");
			FileReader frdoc = new FileReader(archivo);
			BufferedReader brdoc = new BufferedReader(frdoc);
			linea = null;
			System.out.println("Archivo doc");
			System.out.println("***");
			while ((linea = brdoc.readLine()) != null)
				System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fr.close();
			
		}

	}
}
