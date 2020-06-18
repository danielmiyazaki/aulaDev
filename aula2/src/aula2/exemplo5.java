package aula2;

import java.util.Scanner;

public class exemplo5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome: ");
		String nome = ler.next();
		
		System.out.println("Digite sua idade: ");
		int idade = ler.nextInt();
		
		if (idade< 18){
			
			System.out.println("Menor de idade");
		}
		else {
			
			System.out.println("Maior de idade");
		}

	}

}
