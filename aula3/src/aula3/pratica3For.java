package aula3;
/*Fa�a um programa em Java que calcule e escreva a m�dia aritm�tica dos numeros inteiros entre 10 e 100.
 * 
 */
public class pratica3For {

	public static void main(String[] args) {
		int a =10,cont=1,med=0,cont2=0;
		
		for(a=10;a<=100;a++) {
			cont2=cont2+a;
			
			med=cont2/cont;
			
			cont++;
		}
		System.out.println("A m�dia aritmetica dos numeros entre 10 e 100 �: "+med);
	}

}
