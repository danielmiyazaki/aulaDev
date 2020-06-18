package aula1;

import java.util.Scanner;

public class exemplo6 {

	public static void main(String[] args) {
		String nome;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		
		nome = ler.next();
		
		//System.out.println("Seu nome é: "+nome);
		
		System.out.println("Digite o seu sobrenome: ");
		
		String sobrenome = ler.next();
		
		//System.out.println("Seu sobrenome é: "+sobrenome);
		
		System.out.println("Digite o sua idade: ");
		
		int idade = ler.nextInt();
		
		//System.out.println("Sua idade é: "+idade);
		
		System.out.println("Seu nome completo é: "+nome+" "+sobrenome+"\nIdade: "+idade+" anos");

	}

}
