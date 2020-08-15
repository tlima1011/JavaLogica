package exercicios;

import java.util.Scanner;

public class negativos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0;

		System.out.println("Quantos números você vai digitar? ");
		n = sc.nextInt();
		int[] numeros = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numeros[i] = sc.nextInt();
		}

		System.out.println("NÚMEROS DIGITADOS: ");
		for (int i = 0; i < n; i++) {
			if (numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}
		sc.close();
	}
}
