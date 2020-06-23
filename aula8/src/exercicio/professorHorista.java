package exercicio;

public class professorHorista extends professor{
	
	double valor = 250;
	public void calcularPagamento(int horas) {
		double salario = horas * valor;
		System.out.println("O salario do professor horista é de: R$ "+salario);
	}
}
