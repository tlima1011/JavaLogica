package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class aprovados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 0;

		System.out.print("Quantos alunos serao digitados? ");
		n = sc.nextInt();
		String[] nomes = new String[n];
		double[] notas1 = new double[n];
		double[] notas2 = new double[n];
		double[] medias = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "� aluno:");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			notas1[i] = sc.nextDouble();
			notas2[i] = sc.nextDouble();
			medias[i] = (notas1[i] + notas2[i]) / 2;
		}
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < n; i++) {
			if (medias[i] >= 6.0) {
				System.out.println(nomes[i]);
			}
		}
		sc.close();
	}
}
