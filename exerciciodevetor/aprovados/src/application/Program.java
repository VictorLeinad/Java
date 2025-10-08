package application;

import java.util.Scanner;

import entides.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		int cont= 1;
		for (int i =0; i < vect.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n",cont);
			sc.nextLine();
			String name = sc.nextLine();
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			
			vect[i] = new Product(name, n1, n2);
			cont++;
		}
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < vect.length; i++) {
			if ((vect[i].getNota1() + vect[i].getNota2()) / 2 >= 6.0) {
				System.out.println(vect[i].getName());
			}
		}
		
		
	}
	
}
