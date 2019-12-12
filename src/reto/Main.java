package reto;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) throws Exception {
		
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		Escritura escritura = new Escritura();
		Lectura lectura = new Lectura();
		Metodos metodos = new Metodos();
		Libro libro = null;
		boolean salir = true;
		
		while(salir)
		{
			System.out.println("1. Escribe un texto");
			System.out.println("2. Escribir en fichero");
			System.out.println("3. Leer de fichero");
			System.out.println("4. Salir");
			
			menu = metodos.OpcionMenu(sc);

			switch (menu) {
			case 1:
				System.out.println("Has seleccionado la opcion 1, escribir un texto salida estandar");
				escritura.EscribirSalidaEstandar(sc);
				break;
			case 2:
				System.out.println("Has seleccionado la opcion 2,Crear un Libro y escribir en fichero");
				libro = escritura.CrearLibroEntradaEstandar(sc, libro);
				escritura.EscribirLibroFichero(libro);
				break;
			case 3:
				System.out.println("Has seleccionado la opcion 3 leer ficheros");
				lectura.leerficherotxt();
				lectura.leerficherocsv();
				lectura.leerficherodoc();
				break;
			case 4:
				salir = false;
				sc.close();
				break;
			default:
				System.out.println("Solo numeros entre 1 y 4");
			}
		} 
	}
}

