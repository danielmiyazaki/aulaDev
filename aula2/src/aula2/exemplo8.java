package aula2;
/*Ler o estado civil de uma pessoa como valor numerico. Se for 1 a Solteiro, 2 a Casado e 3 para Outros. 
 * Testar estes valores levando-se em conta que o usuário pode digitar errado.
 */
import java.util.Scanner;
public class exemplo8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe seu estado civil:");
		int estado = ler.nextInt();
		if (estado==1) {
			System.out.print("Solteiro");
		}else if(estado==2){
			System.out.print("Casado");}
			else {
				System.out.print("Outros");
			}
		}
	}

