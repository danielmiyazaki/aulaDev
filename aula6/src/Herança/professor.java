package Heran�a;

public class professor extends funcionario{
	
	String titulo, disciplina;
	
	void exibirProf() {
		
		System.out.println("Titulo �: "+titulo);
		System.out.println("Disciplina �: "+disciplina);
	}
	void ensinar() {
		System.out.println("Ensinando Java");
	}
}
