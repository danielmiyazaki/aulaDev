package aula2;
import java.util.Scanner;
public class case2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double saldo = 4567.80;
		double salario = 3500.00;
		System.out.println("Prezado, favor digitar valor para saque:");
		double saque = ler.nextDouble();
		double empre = salario*0.05;
		if (saque>saldo) {
			System.out.println("Saldo insuficiente");
			System.out.println("Você possui empréstimo disponível de: R$ "+empre);
			double saldo3 = saldo+empre;
			System.out.println("Gostaria de realizar o empréstimo?\nSaldo total com emprestimo: R$ "+saldo3);
			String resp = ler.next();
			if (resp.equals("sim")||resp.equals("Sim")||resp.equals("SIM")||resp.equals("s")){
				if (saque>saldo3) {
					System.out.println("Saldo insuficiente\nOperação finalizada");
				}else {
					double saldo4 = saldo3-saque;
					System.out.println("Saque realizado\nSaldo atual de: R$ "+saldo4);
				}
			}else {
				System.out.println("Operação finalizada");
			}
			
		}else {
			double saldo2 = saldo-saque;
			System.out.println("Saque realizado\nSaldo atual de: R$ "+saldo2);
		}
	}

}
