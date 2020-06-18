package aula2;
import java.util.Scanner;

public class exemplo9 {

	public static void main(String[] args) {
		String loginUser = "Daniel";
		String senhaUser = "123";
				
		Scanner ler = new Scanner(System.in);
		System.out.println("=================================");
		System.out.println("Login:");
		String login = ler.next();
		System.out.println("Senha:");
		String senha = ler.next();
		System.out.println("=================================");
		
		if (login.equals(loginUser)&&senha.contentEquals(senhaUser)) {
			System.out.printf("Usuário %s logado com sucesso!", login);
		}else {
			System.out.print("Usuário ou senha inválidos");
		}
	}
}
