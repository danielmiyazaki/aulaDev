package classeAbstrata;

public class testeFuncionario {

	public static void main(String[] args) {

		gerente g1 = new gerente();
		
		g1.nome = "Julio";
		g1.usuario = "root";
		g1.senha = "1234";
		
		g1.calculaBonificacao(200);
	}

}
