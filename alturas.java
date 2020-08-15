package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 0, cont = 0;
		double soma = 0, media = 0, porcentagem = 0;

		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}

		for (int i = 0; i < n; i++) {
			soma += alturas[i];
		}
		media = soma / n;
		System.out.println("\nAltura média: " + String.format("%.2f", media)+"m");

		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				cont++;
			}
		}
		porcentagem = cont * 100 / n;
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", porcentagem)+"%");

		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		sc.close();
	}
}
