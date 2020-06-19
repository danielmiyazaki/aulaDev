package exercicio;

public class testeFuncionario {

	public static void main(String[] args) {
		funcionario func1 = new funcionario();
		func1.idFunc = 3334442;
		func1.nomeFunc = "Pedro";
		func1.dataContratacao = "20/01/20";
		func1.departamento = "Financeiro";
		func1.documento = "3999889366";
		func1.salario = 5455.99;
		func1.situacao = true;
		
		funcionario func2 = new funcionario();
		func2.idFunc = 33355672;
		func2.nomeFunc = "Xuxa";
		func2.dataContratacao = "10/01/09";
		func2.departamento = "Marketing";
		func2.documento = "399345345";
		func2.salario = 4000.88;
		func2.situacao = false;
	
		func1.exibirFunc();
		System.out.println("\n");
		func1.verificaFunc();
		System.out.println("\n");
		func1.atualizarFunc();
		System.out.println("\n");
		func1.exibirFunc();
		
		func2.exibirFunc();
		System.out.println("\n");
		func2.verificaFunc();
		System.out.println("\n");
		func2.atualizarFunc();
		System.out.println("\n");
		func2.exibirFunc();
	}

}
