import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		double nota1 = 9.0;
		double nota2 = 10;
		
		double media = 0; 
		
		media = (nota1+nota2)/2;
		
		System.out.println(media);
		
		int valor = 15;
		System.out.println(valor/2);
		System.out.println(valor%2);
		
		if(valor%2 == 1) {
			double x;
			x = valor;
			x = (x/2);
			System.out.println(x);
		}
		else {
			System.out.println("Divisao com numero multiplo de 2");
		}
		
		System.out.println("--------------------");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor1 = 0;
		valor1 = teclado.nextInt();
		
		if(valor1%2 == 1) {
			double x;
			x = valor;
			x = (x/2);
			System.out.println(x);
		}
		else {
			System.out.println("Divisao com numero multiplo de 2");
		}
		
	}
}
