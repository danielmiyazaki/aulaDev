package aula7;

public class aluno {
	
	private String nome,curso,ra;
	private double valorMensalidade,nota1,nota2;
	
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public String getNome() {
		return this.nome;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getCurso() {
		return this.curso;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getRa() {
		return this.ra;
	}
	
	public void setValorMensalidade(double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
	public double getValorMensalidade() {
		return this.valorMensalidade;
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota1() {
		return this.nota1;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota2() {
		return this.nota2;
	}
	
	public void exibirDadosAluno() {
		System.out.println("<<<<<Dados do Aluno>>>>>");
		System.out.println("Nome do Aluno: "+getNome());
		System.out.println("RA do Aluno: "+getRa());
		System.out.println("Curso Matriculado: "+getCurso());
		System.out.println("Valor da Mensalidade: "+getValorMensalidade());
	}
	public double calculoMedia() {
		double media = (getNota1()+getNota2())/2;
		if (media>=7.0) {
			System.out.printf("Aluno %s Aprovado!!\n",getNome());
		}else {
			System.out.printf("Aluno %s Reprovado!!\n",getNome());
		}
		return media;
	}
}
