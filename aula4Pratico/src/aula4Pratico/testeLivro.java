package aula4Pratico;

public class testeLivro {

	public static void main(String[] args) {
		
		livro livro1 = new livro();
		livro livro2 = new livro();
		
		livro1.titulo = "Java para todos";
		livro1.autor = "Ela";
		livro1.ano = 2020;
		livro1.codLivro = 1234567;
		livro1.descricao = "Aprenda Java facilmente";
		livro1.edicao = "Editora A";
		livro1.isbn = "7893547894";
		livro1.valor = 500;
		
		
		livro2.titulo = "Git - Versionamento";
		livro2.autor = "Ele";
		livro2.ano = 2010;
		livro2.codLivro = 354345655;
		livro2.descricao = "Git para Iniciantes";
		livro2.edicao = "Editora B";
		livro2.isbn = "093049039";
		livro2.valor = 60;
		
		livro1.exibirCadastro();
		livro2.exibirCadastro();
	}

}
