package application;

import java.util.Scanner;

import entides.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		int cont = 1;
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %da pessoa: %n", cont);
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vect[i] = new Product(name, idade);
			cont++;
		}
		
		
		int num = 0;
		for (int i = 0; i< vect.length; i++) {
			if (vect[num].getIdade() < vect[i].getIdade()) {
				num++;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + vect[num].getName());
		
		
	}

}
