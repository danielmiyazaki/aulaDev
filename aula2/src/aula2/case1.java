package aula2;
import java.util.Scanner;
public class case1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("=================================");
		System.out.println("DIGITE PRIMEIRO NUMERO PARA COMPARA��O");
		int n1 = ler.nextInt();
		System.out.println("DIGITE SEGUNDO");
		int n2 = ler.nextInt();
		System.out.println("=================================");
		
		if (n1<n2) {
			System.out.printf("%s � menor", n1);
		}else if (n1>n2) {
			System.out.printf("%s � menor", n2);
		}else {
			System.out.printf("Os n�meros s�o iguais", n2);
		}
		
	}

}
