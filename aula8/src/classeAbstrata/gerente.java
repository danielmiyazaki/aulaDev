package classeAbstrata;

public class gerente extends funcionario{
	String usuario;
	String senha;

	public void calculaBonificacao(double valor) {
		double salario;
		salario = valor*0.1+100;
		
		System.out.println(salario);
	}
}
