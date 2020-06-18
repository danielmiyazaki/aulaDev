package aula3;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: O programa termina quando idade for = -99.
 * 
 */
public class pratica2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade=0;
		
		while(idade!=-99) {
			System.out.println("Digite sua idade:\nO programa termina quando idade for = -99");
			idade= ler.nextInt();
			
		}
		System.out.println("Programa finalizado");

	}

}
