package tabla_de_multiplicar;

import java.util.Scanner;

public class Tabla_de_multiplicar {
	
	public static void main(String[] args) {
	
		Scanner teclado  = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
	
		int numero = teclado.nextInt();
		
		for (int i = 1; i <= 10; i++) {
				System.out.println(numero + "x" + i + "=" + (numero*i));
		}
		
		teclado.close();
	
	}

	
}