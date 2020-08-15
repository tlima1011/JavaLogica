package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 0, cont = 0;
		double media = 0, soma = 0;
				
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt(); 
		
		int numeros[] = new int[n]; 
		for(int i = 0; i < n; i++) {
			System.out.print("Digite o " +(i+1) + "º numero: ");
			numeros[i] = sc.nextInt(); 
		}
		for(int i = 0; i < n; i++) {
			if(numeros[i] % 2 == 0) {
				soma += numeros[i];
				cont++;
			}
		}
		if(cont == 0) {
			System.out.println("NENHUM NUMERO PAR"); 
		}else {
			media = soma / cont; 
			System.out.println("MEDIA DOS PARES = " +String.format("%.1f", media));
		}
		sc.close();
	}
}
