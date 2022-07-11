package aplicacao;

import entidades.Aluno;

public class AlunoMain {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Aluno1", "12/03/2001", "03/07/2022");
		Aluno aluno2 = new Aluno("Aluno2", "12/12/1999", "Turma 1", "22/06/2022");
		
		System.out.println(aluno1.toString());
		System.out.println(aluno2.toString());
	}

}