package exemploEncapsulamento;

public class funcionario {
	private String nome, endereco;
	private double salario;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public double getSalario() {
		return this.salario;
	}
	
	public void exibirDados() {
		System.out.println("##### DADOS #####");
		System.out.println("NOME � = "+nome);
		System.out.println("ENDERE�O � = "+getEndereco());
		System.out.println("SALARIO � = "+getSalario());
	}
	public double calculaBonificacao() {
		return this.salario*0.1;
	}
}
