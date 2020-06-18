package aula3;

public class pratica1 {
/*Escreva um programa em Java para: gerar a sucessao: 0 1 2 -3 4 5 -6 7 8 -9
 * 
 */
	public static void main(String[] args) {
		int a=0;
		while(a<=9) {
			if (a%3==0) {
				int b =a*-1;
				a++;
				System.out.println(b);
			}else {
				System.out.println(a);
				a++;
			}
			
		}

	}

}
