package aula3;
import java.util.Scanner;
public class exemplo4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o numero:");
		int num = ler.nextInt();
		
		int valor = 0;
		while(valor<=10) {
			int res = num *valor;
			System.out.printf("Valor do %d x %d = %d\n",num,valor,res);
			valor++;
		}

	}

}
