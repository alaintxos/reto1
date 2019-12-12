package reto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodos {
	public int OpcionMenu(Scanner sc)
	{
		boolean valor_entre_1_y_4 = false;
		int menu = 0;
		while(!valor_entre_1_y_4)
		{
			System.out.println("Escribe una de las opciones");
			try {
				menu = sc.nextInt();
				if(menu > 0 && menu < 5)
					valor_entre_1_y_4 = true;
			} catch (InputMismatchException error) {
				System.out.println("Introduce un valor numerico!");
				sc.next();
			}
		}
		return menu;
	}
}
