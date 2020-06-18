package aula3;

import java.util.Scanner;

public class exemplo10Switchcase {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao;
		
		System.out.println("Digite o mês em número inteiro (Entre 1 até 4)");
		opcao = ler.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		default:
			System.out.println("Erro, digite somente numeros entre 1 e 4");
			break;
		}

	}

}
