package exercicio;

public interface conta {
	
	
	public abstract void saldo();
	public abstract double depositar(double valor);
	public abstract double sacar(double valor);
	public abstract double atualiza(double taxaSelic);
	
}
