import java.util.Scanner;

public class ComandoFor {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------");
		
		double nota1, nota2, media;
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 1; i <= 2; i++) {
			System.out.println("Aluno " + i);
			System.out.println("Digite nota 1: ");
			nota1 = input.nextDouble();
			System.out.println("Digite nota 2: ");
			nota2 = input.nextDouble();
			media = (nota1+nota2)/2;
			System.out.println("Media: " + media);
			System.out.println("=========================");
		}
	}
}
