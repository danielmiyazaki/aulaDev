package Herança;

import java.util.Scanner;

public class testeImovel {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o valor do imóvel?");
		double preco = ler.nextDouble();
		System.out.println("Imovel novo(1) ou velho(2)?");
		int estado = ler.nextInt();
		
		if (estado ==1) {
			novo n1 = new novo();
			n1.preco = preco;			
			System.out.println("Valor do imovel novo é de R$ "+n1.adicionaln());
		}else {
			velho n2 = new velho();
			n2.preco = preco;
			System.out.println("Valor do imovel novo é de R$ "+n2.adicionalv());
		}
		
	}

}
