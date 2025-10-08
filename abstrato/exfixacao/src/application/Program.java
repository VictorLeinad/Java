package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entides.PessoaFisica;
import entides.PessoaJuridica;
import entides.TaxaPessoa;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o número de contribuintes: ");
		int n = sc.nextInt();
		
		List<TaxaPessoa> list = new ArrayList<>();
		
		for (int i = 1;i <= n; i++) {
			System.out.println("Dados do contribuinte nº " + i + ":");
			System.out.print("Pessoa física ou jurídica (f/j)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			if (ch == 'f') {
				System.out.print("Despesas com saúde: ");
				double saude = sc.nextDouble();
				list.add(new PessoaFisica(name, renda, saude));
			}else {
				System.out.print("Número de funcionários: ");
				int func = sc.nextInt();
				list.add(new PessoaJuridica(name, renda, func));
			}
		}
		
		System.out.println();
		double total = 0;
		System.out.println("IMPOSTOS PAGOS:");
		for (TaxaPessoa itens : list) {
			System.out.printf( "%s: $ %.2f %n", itens.getNome(), itens.taxa());
			total += itens.taxa();
		}
		
		System.out.println();
		System.out.printf("IMPOSTOS TOTAIS: %.2f", total);
		
		
		
		
	}
}
