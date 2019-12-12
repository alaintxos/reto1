package reto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Abrirfitxero {
	public BufferedReader abrirfitxerotxt() throws FileNotFoundException {
		File archivo = new File("C:\\Users\\admin1\\Desktop\\prueba.txt");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		return br;
	}
	
		public BufferedReader abrirfitxerodoc() throws FileNotFoundException {
			File archivo = new File("C:\\Users\\admin1\\Desktop\\prueba.doc");
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			return br;
		}
		
			public BufferedReader abrirfitxerocsv() throws FileNotFoundException {
				File archivo = new File("C:\\Users\\admin1\\Desktop\\prueba.csv");
				FileReader fr = new FileReader(archivo);
				BufferedReader br = new BufferedReader(fr);
				return br;
			}

}
