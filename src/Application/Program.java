package Application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Students> set = new HashSet<>();
		
		System.out.println("How many students for course A ?");
		int qtda = sc.nextInt();
		
		for (int i=0; i < qtda; i++ ) {
			
			System.out.println("Digite a matricula :");
			int mat = sc.nextInt();
			
			set.add(new Students(mat));
		}
		
		System.out.println("How many students for course B ?");
		int qtdb = sc.nextInt();
		
		for (int i=0; i < qtdb; i++ ) {
			
			System.out.println("Digite a matricula :");
			int mat = sc.nextInt();
			
			set.add(new Students(mat));
		}

		System.out.println("How many students for course C ?");
		int qtdc = sc.nextInt();
		
		for (int i=0; i < qtdc; i++ ) {
			
			System.out.println("Digite a matricula :");
			int mat = sc.nextInt();
			
			set.add(new Students(mat));
		}
		
			
		System.out.println("Total de estudantes: " + set.size());
			
			
			
			sc.close();
	}

}
