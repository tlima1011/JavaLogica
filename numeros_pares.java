package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int n = 0, qtde_pares = 0; 
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt(); 
		int [] numeros = new int[n];
		for(int i = 0; i < n;i++) {
			System.out.print("Digite o " +(i + 1) + "º número: ");
			numeros[i] = sc.nextInt(); 
		}
		System.out.println("NÚMEROS PARES: ");
		for(int i = 0; i < n;i++) {
			if(numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + "  ");
				qtde_pares++;
			}
		}
		System.out.println("\nQUANTIDADE DE PARES = " +qtde_pares); 
		sc.close();
	}
}
