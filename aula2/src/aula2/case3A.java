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
		System.out.println("|  - - Subtra��o                  |");
		System.out.println("|  * - Multiplica��o              |");
		System.out.println("|  / - Divis�o                    |");
		System.out.println("|                                 |");
		System.out.println("|=================================|");
		System.out.println("Selecione a opera��o:");
		String n3 = ler.next();
		double res;
		if (n3.equals("+")) {
			res = n1+n2;
			System.out.println("Soma: "+res);
		}else if(n3.equals("-")) {
			res = n1-n2;
			System.out.println("Subtra��o: "+res);			
		}else if(n3.equals("*")) {
			res = n1*n2;
			System.out.println("Multiplica��o: "+res);
		}else if(n3.equals("/")) {
			res = n1/n2;
			System.out.println("Divis�o: "+res);
		}else {
			System.out.println("Opera��o n�o dispon�vel");
		}

	}

}
