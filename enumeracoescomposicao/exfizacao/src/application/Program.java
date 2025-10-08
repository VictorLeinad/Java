package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entides.Client;
import entides.Ordem;
import entides.OrdemItens;
import entides.Product;
import entides.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter cliente data:\n");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date data = sdf.parse(sc.next());
		
		Client cliente = new Client(name, email, data);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Ordem order = new Ordem(new Date(), status, cliente);
		
		for (int i =1; i <= n; i++) {
			System.out.println("Enter #"+ i +" item data:");
			System.out.print("Product name: ");
			String produto = sc.nextLine();
			System.out.print("Product price: ");
			double valor = sc.nextDouble();
			
			Product product = new Product(produto, valor);
			
			System.out.print("Quantity: ");
			int quant = sc.nextInt();
			
			OrdemItens informacao = new OrdemItens(quant, valor, product);
			
			order.addItem(informacao);
			sc.nextLine();
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		
		sc.close();
		
	}

}
