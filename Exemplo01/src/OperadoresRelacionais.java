import java.util.Scanner;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor1 = teclado.nextInt();
		Scanner teclado2 = new Scanner(System.in);
		int valor2 = teclado2.nextInt();
		
		if((valor1 > valor2) && (valor1 != valor2)) {
			System.out.println("Maior -> ( > )");
			System.out.println("Diferente -> ( != )");
		}
		else if((valor1 < valor2)&& (valor1 != valor2)) {
			System.out.println("Menor -> ( < )");
			System.out.println("Diferente -> ( != )");
		}
		else if(valor1 == valor2) {
			System.out.println("Igual -> ( == )");
		}
		else if((valor1 >= valor2)&& (valor1 != valor2)) {
			System.out.println("Maior ou igual -> ( >= )");
			System.out.println("Diferente -> ( != )");
		}
		else if((valor1 <= valor2)&& (valor1 != valor2)) {
			System.out.println("Menor ou igual -> ( <= )");
			System.out.println("Diferente -> ( != )");
		}
	}
}
