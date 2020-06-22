package exemploEncapsulamento;

public class testeFuncionario {

	public static void main(String[] args) {

		funcionario f1 = new funcionario();
		
		f1.setNome("Maria");
		f1.setEndereco("Casa");
		f1.setSalario(123541);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getSalario());
		
		gerente gerente1 = new gerente();
		gerente1.setNome("jao");
		gerente1.setSalario(1231222);
		gerente1.setUsuario("Jao");
		gerente1.setSenha("12345");
		
		System.out.println(gerente1.getSenha());
		System.out.println(gerente1.getNome());
		System.out.println(gerente1.getUsuario());
		
	}

}
