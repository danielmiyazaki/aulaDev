package aula3;

import java.util.Scanner;

public class exemplo9While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero,soma;
		soma=0;
		while(soma<10) {
			System.out.println("Digite um valor:");
			numero= ler.nextInt();
			
			soma=soma+numero;
			System.out.println("Total: "+soma);
		}

	}

}
