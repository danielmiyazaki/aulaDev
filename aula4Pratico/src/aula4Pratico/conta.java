package aula4Pratico;

public class conta {
	String numConta;
	String nome;
	String agencia;
	double saldo;
	
	void extrato() {
		System.out.println("_____________________");
		System.out.println("Detalhes da Conta");
		System.out.println("Nome: "+nome);
		System.out.println("N�mero da conta: "+numConta);
		System.out.println("Ag�ncia: "+agencia);
		System.out.println("Saldo: R$ "+saldo);
		System.out.println("_____________________");
	}

}
