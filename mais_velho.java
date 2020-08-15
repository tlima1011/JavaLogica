package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class mais_velho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 0, idadeVelho = 0;
		String nomeVelho = "";

		System.out.print("Quantas pessoas voce vai digitar? "); // 5
		n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa: ");
			sc.nextLine();
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		nomeVelho = nomes[0];
		idadeVelho = idades[0];

		for (int i = 1; i < n; i++) {
			if (idades[i] > idadeVelho) {
				nomeVelho = nomes[i];
				idadeVelho = idades[i];
			}
		}
		System.out.println("PESSOA MAIS VELHA: " +nomeVelho + " com " + idadeVelho + " anos.");
		sc.close();
	}
}