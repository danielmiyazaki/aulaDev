package aula2;

import java.util.Scanner;

public class case3 {
	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite primeiro numero:");
		double n1 = ler.nextDouble();
		System.out.println("Digite segundo numero:");
		double n2 = ler.nextDouble();
		
		System.out.println("|=================================|");
		System.out.println("|      Calculadora de Valores     |");
		System.out.println("|              Menu               |");
		System.out.println("|                                 |");
		System.out.println("|  1 - Soma                       |");
		System.out.println("|  2 - Subtração                  |");
		System.out.println("|  3 - Multiplicação              |");
		System.out.println("|  4 - Divisão                    |");
		System.out.println("|                                 |");
		System.out.println("|=================================|");
		System.out.println("Selecione a operação:");
		double n3 = ler.nextDouble();
		double res;
		if (n3==1) {
			res = n1+n2;
			System.out.println("Soma: "+res);
		}else if(n3==2) {
			res = n1-n2;
			System.out.println("Subtração: "+res);			
		}else if(n3==3) {
			res = n1*n2;
			System.out.println("Multiplicação: "+res);
		}else if(n3==4) {
			res = n1/n2;
			System.out.println("Divisão: "+res);
		}else {
			System.out.println("Operação não disponível");
		}
	}
}
