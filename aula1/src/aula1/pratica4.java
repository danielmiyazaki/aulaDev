package aula1;
import java.util.Scanner;

/*Elaborar em programa que em Java que efetue a apresentação do valor da conversao em real de um valor lido em dolar.
 * O programa deverá solicitar o valor da cotação do dolar e tambem a quantidade de dolares disponiveis com o usuario
 */
public class pratica4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira a cotação do dolar: ");
		double cotacao = ler.nextDouble();
		System.out.println("Digite a quantidade de dolares: ");
		double dolares = ler.nextDouble();
		
		double valor = cotacao*dolares;
		System.out.println("Com a cotação informada a quantia em reais é de: R$ "+valor);
				
	}

}
