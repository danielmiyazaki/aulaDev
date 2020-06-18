package aula1;
import java.util.Scanner;
/*Faça um programa que receba um valor que foi depositado e exiba o valor com rendimento apos um mes. 
 * Considere fixo o juro da poupança em 0,7% a.m.
 */
public class pratica5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor depositado na poupança: ");
		double poupanca = ler.nextDouble();
		//System.out.println("Informe a quantidade de meses: ");
		//int meses = ler.nextInt();
		double rendi = poupanca*1.007;
		//double tes = Math.pow(1.007, meses);
		//double composto = poupanca*tes;
		System.out.println("O valor total após 1 mês é de: R$ "+rendi);
		//System.out.println("O valor total após "+meses+" meses: R$ "+composto);
	}

}
