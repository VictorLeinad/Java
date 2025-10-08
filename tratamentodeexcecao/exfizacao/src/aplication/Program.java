package aplication;

import java.util.Scanner;

import model.entides.Conta;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados da conta");
		System.out.print("Numero: ");
		int n = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite de retirada: ");
		double retirar = sc.nextDouble();
		
		System.out.print("Insira o valor de saque: ");
		double saque = sc.nextDouble();
		
		Conta conta = new Conta(n, nome, saldo, retirar);
		
		try {
			conta.saque(saque);
			System.out.printf("Novo saldo: %.2f%n", conta.getSaldo());
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		sc.close();
		
	}	
}
