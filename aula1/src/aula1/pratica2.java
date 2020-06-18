package aula1;
import java.util.Scanner;
/*Escrever um programa Java para determinar o consumo medio de um automovel sendo fornecida a distancia percorrida 
 * pelo automovel e o total de combustivel gasto
 */
public class pratica2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a distância percorrida (km): ");		
		int dist = ler.nextInt();
		System.out.println("Digite o total de combustível gasto (l): ");		
		double comb = ler.nextDouble();
		
		double consumo = dist/comb;
		
		System.out.println("Consumo médio foi de: "+consumo+" km/l");
				
	}

}
