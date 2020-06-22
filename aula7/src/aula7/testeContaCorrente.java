package aula7;
import java.util.Scanner;

public class testeContaCorrente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int verif=0;
		contaCorrente c1 = new contaCorrente();
		c1.setNome("Daniel");
		c1.setSaldo(20000);
		
		c1.cadastrarSenha();
		
		while (verif!=4) {
			c1.menu();
			verif = ler.nextInt();
			switch(verif){
			case 1:
				System.out.println(c1.alterarSenha());
				break;
			case 2:
				c1.debitar();
				break;
			case 3:
				c1.creditar();
				break;
			case 4:
				System.out.println("Sistema encerrado");
				break;
			default:
				System.out.println("Item não reconhecido, tente novamente");
			}
		}
	}

}
