package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class media_idades {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = 0, cont = 0, soma = 0;
		double media = 0;

		System.out.println("Digite as idades: ");
		idade = sc.nextInt();
		if (idade < 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		} else {
			do {
				soma += idade; 
				idade = sc.nextInt();
				cont++;
			} while (idade > 0);
			media = (double) soma / cont;
			System.out.println("MEDIA = " + String.format("%.2f", media)); // 34.67
		}
		sc.close();
	}
}
