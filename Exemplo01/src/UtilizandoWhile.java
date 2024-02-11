import java.util.Scanner;

public class UtilizandoWhile {

	public static void main(String[] args) {
		int numero = 8;                                                                                                                                                                                                                                                                                                        
		
		do {
			System.out.println(numero);
			numero++;
		}while(numero <= 9);
		
		while(numero <= 9) {
			System.out.println(numero);
			numero++;
		}
		
		System.out.println("========================");
		
		Scanner teclado = new Scanner(System.in);
		int op;
		
		do {
			System.out.println("-------------");
			System.out.println("Select only one option: ");
			System.out.println("-------------");
			System.out.println("1 -> Student");
			System.out.println("2 -> Teacher");
			System.out.println("3 -> Coordinator");
			System.out.println("0 -> Exit");
			
			System.out.println("Which option do you want? ");
			op = teclado.nextInt();
			
			if(op == 0)
				break;
			
			switch(op) {
			
			case 1:
				System.out.println("Student");
				break;
			case 2:
				System.out.println("Teacher");
				break;
			case 3:
				System.out.println("Coordinator");
				break;
			}
			
		}while(true);
		
		System.out.println("GoodBye");
	}
		
}
