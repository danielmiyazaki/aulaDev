package aula7;

public class testeAluno {

	public static void main(String[] args) {

		aluno a1 = new aluno();
		aluno a2 = new aluno();
		
		a1.setCurso("ADM");
		a1.setNome("João");
		a1.setRa("33311100");
		a1.setValorMensalidade(1231.00);
		a1.setNota1(7.5);
		a1.setNota2(8.9);
		
		a2.setCurso("Engenharia");
		a2.setNome("Pedro");
		a2.setRa("8875574");
		a2.setValorMensalidade(2334.00);
		a2.setNota1(6.0);
		a2.setNota2(5.9);
		
		a1.exibirDadosAluno();
		a1.calculoMedia();
		a2.exibirDadosAluno();
		a2.calculoMedia();
	}

}
