package aula3;

import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1=0,saques=0;
		
		double conta = 15000;
		System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<Caixa Eletrônico>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
		System.out.println("___________________________________");
		System.out.println("                                   ");
		System.out.println("TELA DE CADASTRO INICIAL");
		System.out.println("NOME: DANIEL LOPES");
		System.out.println("VALOR DISPONÍVEL: R$ "+conta+"\n");
		
		do {

		System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<Caixa Eletrônico>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
		System.out.println("___________________________________");
		System.out.println("                                   ");
		System.out.println("          MENU DE OPÇÕES           ");
		System.out.println("<<<<< 1 - Extrato   >>>>>");
		System.out.println("<<<<< 2 - Sacar     >>>>>");
		System.out.println("<<<<< 3 - Depositar >>>>>");
		System.out.println("<<<<< 4 - Sair      >>>>>");
		
		System.out.println("Selecione a operação:");
		n1 = ler.nextInt();
		switch (n1) {
		case 1:
			
			System.out.println("OPÇÃO 1           ");
			System.out.println("NOME: DANIEL LOPES");
			System.out.println("NUMERO DA CONTA: 2223");
			System.out.println("SALDO ATUAL: R$ "+conta);
			System.out.println("SAQUES REALIZADOS HOJE: "+saques+"\n");
			break;
		case 2:
			if (saques<3) {
			System.out.println("OPÇÃO 2           ");
			System.out.println("Digite valor para saque: ");
			double saque = ler.nextDouble();
			if (saque>conta) {
				System.out.println("Saldo insuficiente");
				System.out.println("Gostaria de realizar empréstimo consignado de 11% de juros?");
				String resp = ler.next();
				if (resp.equals("sim")||resp.equals("Sim")||resp.equals("SIM")||resp.equals("s")){
					System.out.println("Digite o valor do empréstimo: ");
					double empr = ler.nextDouble();
					conta = empr+conta-saque;
					double taxa = empr*0.11;
					System.out.println("Valor dos Juros: R$ "+taxa);
					System.out.println("Sacado: R$ "+saque);
					System.out.println("Saldo: R$ "+conta);
					System.out.println("\nOperação realizada com sucesso!");
					saques++;
				}else {
					System.out.println("\nOperação cancelada");
					break;
				}
			}else {
			System.out.println("Sacado: R$ "+saque);
			conta = conta-saque;
			System.out.println("Saldo: R$ "+conta);
			System.out.println("\nOperação realizada com sucesso!\n");
			saques++;
			}
			break;
			}else {
				System.out.println("Limite de saques atingido: "+saques);
				System.out.println("\nOperação finalizada!\n");
			}
			break;
		case 3:
			System.out.println("OPÇÃO 3           ");
			System.out.println("Digite valor para deposito: ");
			double depos = ler.nextDouble();
			System.out.println("Deposito para mesmo CPF?");
			String cpfCheck = ler.next();
			if (cpfCheck.equals("sim")||cpfCheck.equals("Sim")||cpfCheck.equals("SIM")||cpfCheck.equals("s")){
				System.out.println("Valor depositado: R$ "+depos);
				conta=conta+depos;
				System.out.println("Saldo atual: R$ "+conta);
				System.out.println("\nOperação realizada com sucesso!\n");
			}else {
				if (depos>conta) {
					System.out.println("Saldo insuficiente para deposito para outra conta!");
					System.out.println("\nSaldo atual: R$ "+conta);
					System.out.println("\nOperação finalizada!\n");
					
				}else {
				System.out.println("Nome: ");
				String nome2 = ler.nextLine();
				ler.nextLine();
				System.out.println("CPF: ");
				int cpf = ler.nextInt();
				System.out.println("Banco: ");
				String banco = ler.next();
				System.out.println("Agência: ");
				int agencia = ler.nextInt();
				System.out.println("Conta: ");
				int conta2 = ler.nextInt();
				
				conta=conta-depos;
				System.out.println("Nome: "+nome2);
				System.out.println("CPF: "+cpf);
				System.out.println("Banco: "+banco);
				System.out.println("Agência: "+agencia);
				System.out.println("Conta: "+conta2);
				System.out.println("\nSaldo atual: R$ "+conta);
				System.out.println("\nDepósito realizado com sucesso!\n");
				}
			}
			break;
		case 4:
			System.out.println("OPÇÃO 4           ");
			System.out.println("Operação finalizada!");
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA");
			System.out.println("FAVOR INICIAR UMA NOVA TENTATIVA");
			break;
		}
		}while(n1!=4);
	
		
	}
}

