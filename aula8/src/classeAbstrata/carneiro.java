package classeAbstrata;

public class carneiro extends animal{
	
	int numeroChifre;
	int tamanhoChifre;

	public carneiro() {
		this.nome = "M�";
		this.numeroChifre = 2;
		this.tamanhoChifre = 10;
	}
	public void som() {
		System.out.println("M�����...!!!");
	}
}
