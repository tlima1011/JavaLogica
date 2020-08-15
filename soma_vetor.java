package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 0;
		double media = 0, soma = 0;

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		double[] numeros = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numeros[i] = sc.nextDouble();
		}

		System.out.print("\nVALORES = ");
		for (int i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", numeros[i]) + "  ");
			soma += numeros[i];
		}
		
		System.out.println("\nSOMA = " + String.format("%.2f", soma)); // 36.00
		media = soma / n;
		System.out.println("MEDIA = " + String.format("%.2f", media)); // 9.00
		sc.close();
	}
}
