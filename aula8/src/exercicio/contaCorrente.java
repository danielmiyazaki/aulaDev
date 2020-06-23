package exercicio;

public class contaCorrente implements conta {
	private double saldo;
	private double taxaSelic;
	
	@Override
	public void saldo() {
		System.out.println("Saldo: "+getSaldo());
	}

	@Override
	public double depositar(double valor) {
		System.out.println("Depositado o valor: R$ "+valor);
		setSaldo(getSaldo()+valor);
		System.out.println("Saldo: "+getSaldo());
		return valor;
	}

	@Override
	public double sacar(double valor) {
		System.out.println("Sacado o valor: R$ "+valor);
		setSaldo(getSaldo()-valor);
		System.out.println("Saldo: "+getSaldo());
		return valor;
	}

	@Override
	public double atualiza(double taxaSelic) {
		setTaxaSelic(taxaSelic);
		return getTaxaSelic();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTaxaSelic() {
		return taxaSelic;
	}

	public void setTaxaSelic(double taxaSelic) {
		this.taxaSelic = taxaSelic;
	}



}
