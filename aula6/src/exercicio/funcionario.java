package exercicio;

public class funcionario {
	int idFunc;
	String nomeFunc,departamento,dataContratacao,documento;
	double salario;
	boolean situacao;
	
	void exibirFunc() {
		System.out.println("########CADASTRO########");
		System.out.println("________________________");
		System.out.println("NOME: "+nomeFunc);
		System.out.println("ID: "+idFunc);
		System.out.println("DEPARTAMENTO: "+departamento);
		System.out.println("DATA CONTRATA��O: "+dataContratacao);
		System.out.println("DOCUMENTO: "+documento);
		System.out.println("SALARIO: "+salario);

	}
	double atualizarFunc() {
		double aumento = salario*0.20;
		if(situacao) {
			salario = salario+aumento;
			System.out.println("SALARIO ATUALIZADO: "+salario);
		}else {
			System.out.println("Funcion�rio inativo");
		}
		
		return salario;
	}
	void verificaFunc(){
		if (situacao) {
			System.out.println("Usu�rio ativo");
		}else {
			System.out.println("Usu�rio inativo");
		}
	}
	
}
