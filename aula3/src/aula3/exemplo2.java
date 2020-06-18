package aula3;

import java.util.Scanner;

public class exemplo2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		int idade = ler.nextInt();
		
		
		while (idade<=18) {
			
			System.out.println(idade);
			
			idade++;
		}

	}

}
