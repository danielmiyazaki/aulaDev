package Herança;

public class professor extends funcionario{
	
	String titulo, disciplina;
	
	void exibirProf() {
		
		System.out.println("Titulo é: "+titulo);
		System.out.println("Disciplina é: "+disciplina);
	}
	void ensinar() {
		System.out.println("Ensinando Java");
	}
}
