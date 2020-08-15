package exercicios;

import java.util.Scanner;

public class par_impar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0, x = 0;
		String resultado = "";

		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			x = sc.nextInt();
			if (x == 0) {
				System.out.println("NULO");
			} else if (x % 2 != 0) {
				resultado = "IMPAR ";
				if (x < 0) {
					resultado += "NEGATIVO";
					System.out.println(resultado);
				} else {
					resultado += "POSITIVO";
					System.out.println(resultado);
				}
			} else if (x % 2 == 0) {
				resultado = "PAR ";
				if (x < 0) {
					resultado += "NEGATIVO";
					System.out.println(resultado);
				} else {
					resultado += "POSITIVO";
					System.out.println(resultado);
				}
			}
		}
		sc.close();
	}

}
