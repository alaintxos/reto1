package test;
import reto.Lectura;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class TestLectura {

	private Lectura lectura = new Lectura();
	private String resultado;
	@Test
	void test() {
		String input = "esta frase";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Scanner sc = new Scanner(System.in);
		    
		resultado = lectura.LecturaEntradaEstandarString(sc);
		assertEquals("esta frase", resultado);
	}

}
