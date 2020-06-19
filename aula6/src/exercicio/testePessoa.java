package exercicio;

public class testePessoa {

	public static void main(String[] args) {	
		
		pessoa pessoa1 = new pessoa();
		
		pessoa1.idade = 10;
		pessoa1.altura = 170;
		pessoa1.nome = "Joao";
		pessoa1.sexo = "M";
		
		pessoa1.imprimir();
	}

}
