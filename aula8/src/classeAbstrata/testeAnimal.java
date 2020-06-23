package classeAbstrata;

public class testeAnimal {

	public static void main(String[] args) {

		gato gat1 = new gato("Jane");
		carneiro car1 = new carneiro();
		
		gat1.som();
		
		gat1.numeroPatas = 4;
		
		System.out.println(gat1.nome);
		car1.numeroPatas = 4;
		car1.numeroChifre = 1;
				
	}

}
