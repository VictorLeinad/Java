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
		
		int cont= 1;
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Altura da %da pessoa: ",cont);
			double alt = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", cont);
			char gen = sc.next().charAt(0); 
			
			cont++;
			vect[i] = new Product(alt, gen);
		}
		
		int menoralt = 0;
		int maioralt = 0;
		double media, soma = 0;
		int homem = 0, contmulher = 0;
		
		for (int i =0; i< vect.length;i++) {
			if (vect[menoralt].getAltura() > vect[i].getAltura()) {
				menoralt++;
			}
			if (vect[maioralt].getAltura() < vect[i].getAltura()) {
				maioralt++;
			}
			if (vect[i].getGenero() == 'F') {
				soma += vect[i].getAltura();
				contmulher++;
			}
			if (vect[i].getGenero() == 'M') {
				homem++;
			}
		}
		
		media = soma / contmulher;
		
		System.out.printf("Menor altura = %.2f %n", vect[menoralt].getAltura());
		System.out.printf("Maior altura = %.2f %n", vect[maioralt].getAltura());
		System.out.printf("Media das alturas das mulheres = %.2f %n", media);
		System.out.println("Numero de homens = " + homem);
	}
	
}
