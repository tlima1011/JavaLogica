package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class divisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 0, num = 0, den = 0;
		double divisao = 0;

		System.out.print("Quantos casos voce vai digitar? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Entre com o numerador: ");
			num = sc.nextInt();
			System.out.print("Entre com o denominador: ");
			den = sc.nextInt();
			if (den == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			} else {
				divisao = (double) num / den;
				System.out.println("DIVISAO = " + String.format("%.2f", divisao));
			}
		}
		sc.close();
	}
}
