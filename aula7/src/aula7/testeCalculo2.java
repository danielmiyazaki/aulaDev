package aula7;

public class testeCalculo2 {

	public static void main(String[] args) {

		calculo2 calc12 = new calculo2();
		
		calc12.setNumero1(10);
		calc12.setNumero2(12);
		
		System.out.println(calc12.getNumero1());
		System.out.println(calc12.getNumero2());
		
		calc12.exibirSoma();
		
		System.out.println(calc12.exibirSoma2());
	}

}
