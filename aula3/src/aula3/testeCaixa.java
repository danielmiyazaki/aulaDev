package aula3;
import java.util.Scanner;
public class testeCaixa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		caixa caixa1= new caixa();
		System.out.println("Nome: ");
		caixa1.nome = ler.next();
		System.out.println("Numero da Cona: ");
		caixa1.numConta = ler.nextInt();
		caixa1.conta = 354.00;
		
		caixa1.telaInicial();
		caixa1.caixaPrinci();
	}

}
