package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double nota1 = 0, nota2 = 0, soma = 0;

		System.out.print("Digite a primeira nota: "); // 45.5
		nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: "); // 31.3
		nota2 = sc.nextDouble();
		soma = nota1 + nota2;
		System.out.println("NOTA FINAL = " + String.format("%.1f", soma));
		if (soma < 60) {
			System.out.println("REPROVADO");
		}
		sc.close();
	}
}
