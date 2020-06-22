package aula7;

public class testeCalculo {

	public static void main(String[] args) {
		
		calculo calculo1 = new calculo();
		
		calculo1.numero1 = 3;
		calculo1.numero2 = 5;
		System.out.println(calculo1.soma(calculo1.numero1,calculo1.numero2));
	}

}
