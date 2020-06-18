package aula3;

import java.util.Scanner;

public class exemplo9DoWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero,soma;
		soma=0;
		do {
			System.out.println("Digite um valor:");
			numero= ler.nextInt();
			
			soma=soma+numero;
			System.out.println("Total: "+soma);
		}while(soma<10);

	}

}
