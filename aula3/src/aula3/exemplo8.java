package aula3;

import java.util.Scanner;

public class exemplo8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double mtotal = 0;
		String nome;
		int cont=0;
		double mAlunos=0;
		while (mtotal<=40) {
			
			//System.out.println("Digite o nome do aluno:");
			//nome = ler.nextLine();
			System.out.println("Digite a primeira nota do aluno:");
			double n1 = ler.nextDouble();
			System.out.println("Digite a segunda nota do aluno:");
			double n2 = ler.nextDouble();
			
			double med = (n1+n2)/2;
			mtotal = mtotal+med;
			cont++;
			mAlunos = mtotal/cont;
						
			//ler.nextLine();
		}
		System.out.printf("A média das notas dos %d alunos é de: %.2f%n",cont,mAlunos);
	}

}
