package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class validacao_de_nota {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double nota1 = 0, nota2 = 0, media = 0;

		System.out.print("Digite a primeira nota: "); // -3.5
		do {
			nota1 = sc.nextDouble();
			if ((nota1 < 0) || (nota1 > 10)) {
				System.out.print("Valor invalido! Tente novamente: ");
			}
		} while ((nota1 < 0) || (nota1 > 10));

		System.out.print("Digite a segunda nota: "); // -3.5
		do {
			nota2 = sc.nextDouble();
			if ((nota2 < 0) || (nota2 > 10)) {
				System.out.print("Valor invalido! Tente novamente: ");
			}
		} while ((nota2 < 0) || (nota2 > 10));

		media = (nota1 + nota2) / 2;
		System.out.println("MEDIA = " + String.format("%.2f", media));
		sc.close();
	}
}
