package application;

import java.util.Locale;
import java.util.Scanner;

import entides.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %da pessoa: %n", i);
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vect[i] = new Product(name, idade, altura);
			
		}
		
		double media, soma, menor,porcentagem;
		
		
		soma = 0.0;
		menor = 0.0;
		for (int i=0; i < vect.length; i++) {
			soma = soma + vect[i].getAltura();
			if (vect[i].getIdade() < 16) {
				menor++;
			}
		}
		
		media = soma / vect.length;
		porcentagem = (double)(menor / vect.length) * 100;
		
		
		System.out.printf("Altura média: %.2f %n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", porcentagem);
		for (int i=0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getName());
			}
		}
	}

}
