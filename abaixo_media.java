package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_media {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 0; 
		double media = 0, soma = 0; 
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt(); 
		
		double [] numeros = new double[n]; 
		for(int i = 0; i < n;i++) {
			System.out.print("Digite o " +(i + 1) + "º número: ");
			numeros[i] = sc.nextDouble(); 
		}
		
		for(int i = 0; i < n;i++) {
			soma += numeros[i]; 
		}
		media = soma / n; 
		System.out.print("MEDIA DO VETOR = " +String.format("%.3f", media));
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < n;i++) {
			if(numeros[i] < media) {
				System.out.println(numeros[i]);
			}
		}
	sc.close();	
	}

}
