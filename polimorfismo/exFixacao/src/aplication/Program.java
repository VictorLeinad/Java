package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entides.ImportedProduct;
import entides.Product;
import entides.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.print("Digite o número de produtos: ");
		int n = sc.nextInt();
		
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Dados produto #" + i + ":");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Preco: ");
			double price = sc.nextDouble();
			
			if (ch == 'c'){
				list.add(new Product(name, price));
			}else if(ch == 'u') {
				System.out.print("Data de fabricação (DD/MM/AAAA):");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			}else {
				System.out.print("Taxa alfandegária: ");
				double taxa = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, taxa));
			}
			
			System.out.println();
		}
		
		System.out.println("ETIQUETAS DE PREÇO:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		sc.close();

	}

}
