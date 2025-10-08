package aplicatinon;

import java.util.Locale;
import java.util.Scanner;

import entides.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee salario = new Employee();
		
		System.out.print("Name: ");
		salario.name = sc.next();
		
		System.out.print("Gross salary: ");
		salario.grossSalary = sc.nextDouble();
				
		System.out.print("Tax: ");
		salario.tax = sc.nextDouble();
		
		System.out.println("Employee: " + salario);
		
		System.out.print("Which percentage to increase salary? ");
		double porcentagem = sc.nextDouble();
		salario.increaseSalary(porcentagem);
		
		System.out.println("Updated data: " + salario);
		
		
		sc.close();
		
	}

}
