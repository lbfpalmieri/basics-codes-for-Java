import java.util.Scanner;

public class ExemploDeString {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String matricula, nome, situacao, turma;
		double teste, prova, media;
		
		System.out.println("Digite a turma: ");
		turma = teclado.next();
		
		for(int i=0; i < 3; i++) {
			System.out.println("Digite o nome do aluno: ");
			nome = teclado.next();
			System.out.println("Qual o teste?: ");
			teste = teclado.nextDouble();
			System.out.println("Qual a prova?: ");
			prova = teclado.nextDouble();
			media = (teste + prova)/2;
			
			if(media > 6)
				situacao = "Aprovado";
			else
				situacao = "Reprovado";
			
			System.out.println("=================================");
			System.out.println(nome + ": " + media + " ---> " + situacao);
		}

	}

}
