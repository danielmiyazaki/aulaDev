package aula3;

import java.util.Scanner;

public class exemplo7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		for (int i=1;i<=1;i++) {
		System.out.println("Digite o nome do aluno:");
		String nome = ler.nextLine();
		System.out.println("Digite a primeira nota do aluno:");
		double n1 = ler.nextDouble();
		System.out.println("Digite a segunda nota do aluno:");
		double n2 = ler.nextDouble();
		
		double med = (n1+n2)/2;
		
		System.out.printf("%S possui nota1 %.2f, nota2 %.2f e média %.2f%n",nome,n1,n2,med);
		}
	}

}
