package exemploEncapsulamento;

public class gerente extends funcionario {
	private String usuario;
	private String senha;

	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getUsuario() {
		return this.usuario;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenha() {
		return this.senha;
	}
	public double calculaBonificacao() {
		return getSalario()*0.1+100;
	}
}
