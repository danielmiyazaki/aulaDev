package aula4Pratico;

public class livro {
	String titulo;
	int valor;
	String autor;
	String isbn;
	String edicao;
	int codLivro;
	int ano;
	String descricao;
	
	void exibirCadastro() {
		
		System.out.println("_____________________");
		System.out.println("Cadastro ");
		System.out.println("C�digo: "+codLivro);
		System.out.println("O nome do livro �: "+titulo);
		System.out.println("Descri��o: "+descricao);
		System.out.println("O valor:"+valor);
		System.out.println("O ISBN: "+isbn);
		System.out.println("O ISBN: "+ano);
		System.out.println("O ISBN: "+edicao);
		System.out.println("_____________________");
	
	}

}
