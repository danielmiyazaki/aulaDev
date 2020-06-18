package aula3;

import java.util.Scanner;

/*Escreva um programa em Java para ler 10 numeros.
 * Todos os numeros lidos com valor inferior a 40 devem ser somados.
 * Escreva o valor final da soma efetuada.
 */
public class pratica4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int cont=1,a=0,numero;

		while(cont<=10) {
			System.out.printf("Digite %d de 10 números: %n",cont);
			numero= ler.nextInt();
			if (numero<40) {
				a = a+numero;
			}
			cont++;
			
	}
		System.out.println("A soma final é de: "+a);

}}
