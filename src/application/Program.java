package application;

import java.util.Scanner;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Conta conta = new Conta();
		
		System.out.println("Bem vindo ao Banco.");


		System.out.println("==============================================");
		
		System.out.println("Digite o seu nome: ");
		conta.nome = sc.nextLine();
		
		System.out.println("Digite o seu saldo: ");
		conta.saldo = sc.nextDouble();
		
		System.out.println("Digite o seu Deposito: ");
		conta.deposito = sc.nextDouble();
		
		System.out.println("O saldo atualizado é: " + conta.adicionarSaldo());
		
		System.out.println("==============================================");
		
		System.out.println("Digite o saque que deseja realizar: ");
		conta.saque = sc.nextDouble();
		
		
		System.out.println("O saldo atualizado após saque é: " + conta.retiraSaldo());
		
		sc.close();
		
	}

}
