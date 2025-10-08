package application;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entides.Funcionario;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão registrados? ");
		Integer n = sc.nextInt();
		
		List<Funcionario> list = new ArrayList<>();
		
		for (int i = 1; i<= n; i++ ) {
			System.out.println("");
			System.out.println("Funcionario #" + i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine(); 
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			
			list.add(new Funcionario(id, nome, salario));
		}
		System.out.println();
		System.out.print("Digite o ID do funcionário que terá aumento salarial: ");
		int idfunc = sc.nextInt();
		Funcionario func = list.stream().filter(x -> x.getId() == idfunc).findFirst().orElse(null);
		if (func == null) {
			System.out.println("Este id não existe!");
		}
		else { 
			System.out.print("Digite a porcentagem: ");
			double porcen = sc.nextDouble(); 
			func.aumentoSalario(porcen);
		}
		System.out.println();
		System.out.println("List of employees:");
		
		for (Funcionario obj : list) {
			System.out.println(obj);
		}
		
	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
}
