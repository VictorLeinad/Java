package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("What is the dollar price? ");	
		double valor = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double compra = sc.nextDouble();
		
		double resultado = CurrencyConverter.dolar(valor, compra); 
		System.out.printf("Amount to be paid in reais = %.2f", resultado);
		
		sc.close();
		
	}

}
