package aula2;
import java.util.Scanner;
public class exemplo4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double media;
		
		System.out.println("Digite primeira nota: ");
		double nota1 = ler.nextDouble();
		
		System.out.println("Digite segunda nota: ");
		double nota2 = ler.nextDouble();
		
		media = (nota1+nota2)/2;
		
		if (media >= 7){
			
			System.out.println("Aprovado");
		}
		else {
			
			System.out.println("Reprovado");
		}
			
		
	}

}
