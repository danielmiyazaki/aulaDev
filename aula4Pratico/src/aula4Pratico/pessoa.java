package aula4Pratico;

public class pessoa {
	String nome;
	String end;
	String cpf;
	String tel;
	String nregistro;
	
	void mostrarDetalhes() {
		
		System.out.println("_____________________");
		System.out.println("Detalhes ");
		System.out.println("Nome: "+nome);
		System.out.println("Endere�o: "+end);
		System.out.println("CPF: "+cpf);
		System.out.println("Telefone: "+tel);
		System.out.println("N�mero do registro: "+nregistro);
		System.out.println("_____________________");
	}
}
