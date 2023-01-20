package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> CursoA = new HashSet<>();
		Set<Integer> CursoB = new HashSet<>();
		Set<Integer> CursoC = new HashSet<>();
		
		
		System.out.print("Quantos alunhos estão no curso A?" );
		int n = sc.nextInt();
		for (int i =0; i <n ;i++) {
			int numberAluno = sc.nextInt();
			CursoA.add(numberAluno);
		}
		
		System.out.print("Quantos alunhos estão no curso B?" );
		n = sc.nextInt();
		for (int i =0; i <n ;i++) {
			int numberAluno = sc.nextInt();
			CursoB.add(numberAluno);
		}
		
		System.out.print("Quantos alunhos estão no curso C?" );
		n = sc.nextInt();
		for (int i =0; i <n ;i++) {
			int numberAluno = sc.nextInt();
			CursoC.add(numberAluno);
		}
		
		//Calcular o total de numero de alunhos do professor 
		
		Set<Integer> totalDeAlunhos = new HashSet<>(CursoA);
				totalDeAlunhos.addAll(CursoB);
				totalDeAlunhos.addAll(CursoC);
		
		System.out.println("Total de alunhos: " + totalDeAlunhos.size());

		sc.close();

	}
}
