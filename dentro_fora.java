package exercicios;

import java.util.Scanner;

public class dentro_fora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = 0, n = 0, dentro = 0, fora = 0;
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			x = sc.nextInt(); 
			if (x >= 10 && x <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}
		System.out.println(dentro + " DENTRO");
		System.out.println(fora + " FORA");
		sc.close();
	}
}
