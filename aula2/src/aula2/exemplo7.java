package aula2;

/*Abaixo de 16 anos: N�o eleitor
 * Entre 18 e 65 anos: Eleitor obrigatorio
 * Acima de 65 anos: Eleitor nao obrigatorio
 */
import java.util.Scanner;

public class exemplo7 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = ler.nextInt();

		if (idade < 16) {
			System.out.print("N�o eleitor");

		} else if (idade >= 16 && idade < 65) {
			System.out.print("Eleitor obrigat�rio");
		}
		else {
			System.out.print("Eleitor facultativo");
		}

	}

}
