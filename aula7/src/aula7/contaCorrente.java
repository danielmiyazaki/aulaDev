package aula7;
import java.util.Scanner;
public class contaCorrente {
	Scanner ler = new Scanner(System.in);
	private String nome,senha;
	private double saldo;
	
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public String getNome() {
		return this.nome;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenha() {
		return this.senha;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	public String cadastrarSenha() {
		System.out.println("Digite a senha:");
		setSenha(ler.next());
		System.out.println("Senha cadastrada!");
		return getSenha();
	}
	public String alterarSenha() {
		String resposta;
		System.out.println("Digite a senha antiga:");
		String senha = ler.next();
		if (this.senha.equals(senha)) {
			System.out.println("Digite a nova senha:");
			setSenha(ler.next());
			resposta = "Senha alterada com sucesso!";
			
		}else {
			
			resposta = "Senha antiga incorreta!";
			
		}
		return resposta;
	}
	
	public void debitar() {
		
		System.out.println("Digite a senha:");
		String senha = ler.next();
		
		if (senha.contentEquals(this.getSenha())) {
			System.out.println("Digite o valor a ser creditado: ");
			double valor = ler.nextDouble();
			
			setSaldo(this.getSaldo()-valor);
			System.out.println("Saldo: R$ "+this.saldo);
			System.out.println("Debito realizado com sucesso");
		}else {
			System.out.println("Senha incorreta!");
		}
	}
	
	public void creditar() {
		
		System.out.println("Digite a senha:");
		String senha = ler.next();
		
		if (senha.equals(this.getSenha())) {
			
			System.out.println("Digite o valor a ser creditado: ");
			double valor = ler.nextDouble();
			
			setSaldo(this.getSaldo()+valor);
			System.out.println("Saldo: R$ "+this.saldo);
			System.out.println("Debito realizado com sucesso");
		}else {
			System.out.println("Senha incorreta!");
		}
	}
	public void menu() {
		System.out.println("<<<< Conta corrente >>>>");
		System.out.println("<<<<<<<<< MENU >>>>>>>>>");
		System.out.println("  1 - ALTERAR SENHA");
		System.out.println("  2 - DEBITAR");
		System.out.println("  3 - CREDITAR");
		System.out.println("  4 - SAIR");
	}
}
