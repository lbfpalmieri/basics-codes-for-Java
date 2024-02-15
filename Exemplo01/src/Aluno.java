public class Aluno {
	String nome;
	double teste, prova;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public double getTeste() {
		return teste;
	}



	public void setTeste(double teste) {
		this.teste = teste;
	}



	public String getNome() {
		return nome;
	}



	double getMedia() {
		return(teste + prova)/2;
	}
}
