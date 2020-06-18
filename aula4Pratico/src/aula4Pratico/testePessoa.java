package aula4Pratico;

public class testePessoa {
	
	public static void main(String[] args) {
		pessoa pessoa1 = new pessoa();
		pessoa pessoa2 = new pessoa();
		
		pessoa1.nome = "João";
		pessoa1.end = "Rua Ali";
		pessoa1.cpf = "223.333.444-22";
		pessoa1.tel = "11 2233-4455";
		pessoa1.nregistro = "11233978";
		pessoa2.nome = "Zé";
		pessoa2.end = "Rua Lá";
		pessoa2.cpf = "223.333.423-44";
		pessoa2.tel = "19 3433-4665";
		pessoa2.nregistro = "049575248";
		
		pessoa1.mostrarDetalhes();
		pessoa2.mostrarDetalhes();
		
		System.out.println(pessoa1.nome);
	}
		
}
