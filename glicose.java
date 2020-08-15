package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class glicose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double glicose = 0;
		String classificacao = "";

		System.out.print("Digite a medida da glicose: "); // 90.0 - 140 - 143.2
		glicose = sc.nextDouble();
		if (glicose <= 100) {
			classificacao = "Normal";
		} else if (glicose <= 140) {
			classificacao = "Elevado";
		} else {
			classificacao = "Diabetes";
		}
		System.out.println("Classificação: " + classificacao);
		sc.close();
	}
}
