package test;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

import reto.Escritura;
import reto.Lectura;

class sprint1 {
	Lectura lectura = new Lectura();
	Escritura escritura = new Escritura();

	@Test
	void entradaestandarporteclado() {
		String data = "ydgfyg gf df yus 54854 45gf 454 ";
		InputStream stdin = System.in;
		
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		
		escritura.EscribirSalidaEstandar(scanner);
	}
	@Test
	void recogerdatosconsola() throws IOException {
		String Titulo=" ";
		int idlibro = 0;
		String Autor=" ";
		String Fecha=" ";
		String Genero=" ";
		String Editorial=" ";
		
		InputStream stdin = System.in;
		idlibro= 200;
		System.setIn(new ByteArrayInputStream(Titulo.getBytes()));
		System.setIn(new ByteArrayInputStream(Autor.getBytes()));
		System.setIn(new ByteArrayInputStream(Fecha.getBytes()));
		System.setIn(new ByteArrayInputStream(Genero.getBytes()));
		System.setIn(new ByteArrayInputStream(Editorial.getBytes()));
		Scanner scanner = new Scanner(System.in);

	//	escritura.CrearLibroEntradaEstandar();
		
	}
	

}
