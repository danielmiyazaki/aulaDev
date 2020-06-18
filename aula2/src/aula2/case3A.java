package aula2;

import java.util.Scanner;

public class case3A {

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
		System.out.println("|  + - Soma                       |");
		System.out.println("|  - - Subtração                  |");
		System.out.println("|  * - Multiplicação              |");
		System.out.println("|  / - Divisão                    |");
		System.out.println("|                                 |");
		System.out.println("|=================================|");
		System.out.println("Selecione a operação:");
		String n3 = ler.next();
		double res;
		if (n3.equals("+")) {
			res = n1+n2;
			System.out.println("Soma: "+res);
		}else if(n3.equals("-")) {
			res = n1-n2;
			System.out.println("Subtração: "+res);			
		}else if(n3.equals("*")) {
			res = n1*n2;
			System.out.println("Multiplicação: "+res);
		}else if(n3.equals("/")) {
			res = n1/n2;
			System.out.println("Divisão: "+res);
		}else {
			System.out.println("Operação não disponível");
		}

	}

}
