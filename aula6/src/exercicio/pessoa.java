package exercicio;

public class pessoa {
	
	String nome,sexo;
	int idade,altura;
	
	void imprimir() {
		
		System.out.println("Nome: "+nome);
		System.out.println("Sexo: "+sexo);
		System.out.println("Idade: "+idade);
		System.out.println("Altura: "+altura);
		
		if (idade<=2) {
			System.out.println("Caracter�stica: Beb�");
		}else if (idade<=13) {
			System.out.println("Caracter�stica: Crian�a");
		}else if (idade<=21) {
			System.out.println("Caracter�stica: Jovem");
		}else if(idade<=40) {
			System.out.println("Caracter�stica: Adulto");
		}else {
			System.out.println("Caracter�stica: Idoso");
		}
	}
	
}
