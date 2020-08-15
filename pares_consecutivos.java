package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class pares_consecutivos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 0, soma = 0;
		do {
			System.out.print("Digite um numero inteiro: ");
			x = sc.nextInt();
			if (x % 2 != 0) {
				x++;
			}
			soma = 5 * x + 20;
		} while (x == 0);
		System.out.println("SOMA = " + soma);
		sc.close();
	}
}
