package aula1;
import java.util.Scanner;

/*Elaborar em programa que em Java que efetue a apresenta��o do valor da conversao em real de um valor lido em dolar.
 * O programa dever� solicitar o valor da cota��o do dolar e tambem a quantidade de dolares disponiveis com o usuario
 */
public class pratica4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira a cota��o do dolar: ");
		double cotacao = ler.nextDouble();
		System.out.println("Digite a quantidade de dolares: ");
		double dolares = ler.nextDouble();
		
		double valor = cotacao*dolares;
		System.out.println("Com a cota��o informada a quantia em reais � de: R$ "+valor);
				
	}

}
