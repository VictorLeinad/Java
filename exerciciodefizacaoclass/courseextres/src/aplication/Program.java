package aplication;

import java.io.NotActiveException;
import java.util.Locale;
import java.util.Scanner;

import entides.Study;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Study aluno = new Study();
		
		aluno.name = sc.nextLine();
		aluno.a = sc.nextDouble();
		aluno.b = sc.nextDouble();
		aluno.c = sc.nextDouble();
		
		if (aluno.nota()  > 60) {
			System.out.println(aluno);
			System.out.println("Pass");
		}else {
			
			System.out.println(aluno);
			System.out.printf("FAILED %nMISSING %.2f Points", aluno.media());
			
		}		
		
		sc.close();
		
	}

}
