import java.util.Scanner;

public class Relacionais {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int i[] = {1,2,3,4,5};
		for (int sex : i) {
			System.out.println(sex + " - Digite um numero: ");
			int x = teclado.nextInt();
			if(x > 0) {
				System.out.println("Positivo");
			}
			else
			{
				System.out.println("Negativo");
			}
		}
	}

}
