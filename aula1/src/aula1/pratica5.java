package aula1;
import java.util.Scanner;
/*Fa�a um programa que receba um valor que foi depositado e exiba o valor com rendimento apos um mes. 
 * Considere fixo o juro da poupan�a em 0,7% a.m.
 */
public class pratica5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o valor depositado na poupan�a: ");
		double poupanca = ler.nextDouble();
		//System.out.println("Informe a quantidade de meses: ");
		//int meses = ler.nextInt();
		double rendi = poupanca*1.007;
		//double tes = Math.pow(1.007, meses);
		//double composto = poupanca*tes;
		System.out.println("O valor total ap�s 1 m�s � de: R$ "+rendi);
		//System.out.println("O valor total ap�s "+meses+" meses: R$ "+composto);
	}

}
