package aula4Pratico;

public class testeConta {

	public static void main(String[] args) {
		conta conta1 = new conta();
		conta conta2 = new conta();
		
		conta1.numConta = "32078914";
		conta1.nome = "João";
		conta1.agencia = "09814";
		conta1.saldo = 455657.08;
		
		conta2.numConta = "32074321";
		conta2.nome = "Zé";
		conta2.agencia = "88714";
		conta2.saldo = 1.08;
		
		
		conta1.extrato();
		
		conta2.extrato();

	}

}
