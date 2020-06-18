package aula1;
import java.util.Scanner;
/*Escrever um programa em java que leia o nome de um vendedor, o salario fixo e o total de vendas efetuadas por ele no mes(em dinheiro). 
 * Sabendo que este vendedor ganha 15% de comissao sobre suas vendas efetuadas, informar o seu nome, o salario fixo e o salario no final do mes
 */
public class pratica3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o nome do vendedor: ");
		String nome = ler.next();
		System.out.println("Digite o salário fixo do vendedor "+nome+":");		
		double salario = ler.nextDouble();
		System.out.println("Digite o total de vendas do vendedor "+nome+":");		
		double vendas = ler.nextDouble();
		
		double salarioFinal = (vendas*0.15)+salario;
		System.out.println("Nome do Vendedor: "+nome+"\nSalário fixo: R$ "+salario+"\nSalário final: R$ "+salarioFinal);
	}

}
