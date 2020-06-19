package exercicio;

public class pessoa {
	
	String nome,sexo;
	int idade,altura;
	
	void imprimir() {
		
		System.out.println("Nome: "+nome);
		System.out.println("Sexo: "+sexo);
		System.out.println("Idade: "+idade);
		System.out.println("Altura: "+altura);
		
		if (idade<=2) {
			System.out.println("Característica: Bebê");
		}else if (idade<=13) {
			System.out.println("Característica: Criança");
		}else if (idade<=21) {
			System.out.println("Característica: Jovem");
		}else if(idade<=40) {
			System.out.println("Característica: Adulto");
		}else {
			System.out.println("Característica: Idoso");
		}
	}
	
}
