package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vecta = new int[n];
		int[] vectb = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i=0; i < vecta.length; i++) {
			vecta[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor b: ");
		for (int i=0; i < vectb.length; i++) {
			vectb[i] = sc.nextInt();
		}
		
		
		int soma;
		System.out.println("VETOR RESULTANTE:");
		for (int i= 0; i < n; i++) {
			soma = vecta[i] + vectb[i];
			System.out.println(soma);
		}
		
	}

}
