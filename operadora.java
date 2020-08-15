package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class operadora {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int minutos = 0;
		double valor = 0;

		System.out.print("Digite a quantidade de minutos: ");// 22
		minutos = sc.nextInt();
		valor = 50;
		if (minutos > 100) {
			valor = valor + 2 * (minutos - 100);
		}
		System.out.println("Valor a pagar R$" + String.format("%.2f", valor)); // 50.00
		sc.close();
	}
}
