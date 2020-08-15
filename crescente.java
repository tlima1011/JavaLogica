package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class crescente {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 0, y = 0;
		System.out.println("Digite dois numeros:");
		do {
			x = sc.nextInt();
			y = sc.nextInt();
			if (x > y) {
				System.out.println("DECRESCENTE!");
			} else if(x < y) {
				System.out.println("CRESCENTE!");
			}else {
				break; 
			}
			System.out.println("Digite outros dois numeros: ");
		} while (x != y);
		System.out.println("Encerrado");
		sc.close();
	}
}
