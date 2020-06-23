package exercicio;

public class testeProfessor {

	public static void main(String[] args) {

		professorAssociado prof1 = new professorAssociado();
		professorHorista prof2 = new professorHorista();
		prof1.calcularPagamento();
		prof2.calcularPagamento(10);
	}

}
