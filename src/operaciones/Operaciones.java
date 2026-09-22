package operaciones;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//declarar dos variables de tipo int con valores fijos
		//calculamos la suma
		//mostramos el resultado por pantalla
		
		int n1= 3;
		int n2= 7;
		int n3 = 8;
		int n4 = 4;
		int n5 = 2;
		
		int suma = n1 + n2;
		System.out.println("La suma es: " + suma);
		
		//le restamos 8
		
		int resta = suma - n3;
		System.out.println("La resta es:" + resta);
		
		//Lo multiplicamos por 4
		
		int multiplicacion = resta * n4;
		System.out.println("La multiplicacion es: " + multiplicacion);
		
		//Lo dividimos entre 2
		
		int division = multiplicacion / n5;
		System.out.println("La division es: " + division);
		
	}

}
