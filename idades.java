package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class idades {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1 = "", nome2 = ""; 
		int idade1 = 0, idade2 = 0; 
		double media = 0; 
				
		System.out.println("Dados da primeira pessoa: ");
		System.out.print("Nome: ");
		nome1 = sc.nextLine(); 
		System.out.print("Idade: ");
		idade1 = sc.nextInt(); 
		
		System.out.println("Dados da segunda pessoa: ");
		System.out.print("Nome: ");
		sc.nextLine();
		nome2 = sc.nextLine(); 
		System.out.print("Idade: ");
		idade2 = sc.nextInt(); 
		media = (double) (idade1 + idade2) / 2; 
		System.out.println("A idade m�dia de " + nome1 + " e " + nome2 + " � de " + media + " anos.");   
		
		sc.close();
		
	}

}
