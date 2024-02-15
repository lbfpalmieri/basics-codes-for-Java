
public class PrincipalParaAluno {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setNome("Lucas");
		aluno.teste = 9;
		aluno.prova = 8;
		
		System.out.println(aluno.getMedia());
		System.out.println(aluno.getNome());
	}

}
