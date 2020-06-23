package classeAbstrata;

public abstract class funcionario {
	
	String nome, endereco;
	double salario;
	
	public double calculaBonificacao() {
		return this.salario*0.1;
	}

}
