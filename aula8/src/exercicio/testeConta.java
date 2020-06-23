package exercicio;

public class testeConta {

	public static void main(String[] args) {

		contaPoupanca cp = new contaPoupanca();
		contaCorrente cc = new contaCorrente();
		
		cp.setSaldo(20000);
		cp.setTaxaSelic(2.3);
		cc.setSaldo(4594954);
		cc.setTaxaSelic(4.3);
		
		cp.depositar(2003);
		cp.sacar(8889);
		System.out.println(cc.atualiza(4.9));
		cc.saldo();
	}

}
