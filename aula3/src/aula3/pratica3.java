package aula3;
/*Fa�a um programa em Java que calcule e escreva a m�dia aritm�tica dos numeros inteiros entre 10 e 100.
 * 
 */
public class pratica3 {

	public static void main(String[] args) {
		int a=10;
		int b=100;
		int cont=1;
		int cont2=10;
		int g=0;
		
		while (cont2<=b) {
			a++;
			g=g+a;
			cont++;
			cont2++;
		}
		int med = g/cont;
		System.out.println("A m�dia aritmetica dos numeros entre 10 e 100 �: "+med);
	}

}
