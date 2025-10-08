package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		int soma = 0;
		int cont=0;
		for (int i = 0; i< vect.length; i++) {
			if (vect[i] % 2 == 0){
				soma = soma + vect[i];
				cont++;
			} 
		}
		
		
		if (soma == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}else {
			double media = soma / cont;
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		}
		
	}
}
