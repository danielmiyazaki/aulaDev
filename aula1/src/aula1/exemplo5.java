package aula1;
import java.util.Scanner;

public class exemplo5 {

	public static void main(String[] args) {

		String nome;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		
		nome = ler.next();
		
		System.out.println("seu nome é: "+nome);
	}

}
