package exercicios;

import java.util.Scanner;

public class soma_impares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int soma = 0, aux = 0, x = 0, y = 0;
		System.out.println("Digite dois números: ");
		x = sc.nextInt(); 
		y = sc.nextInt(); 
		if (x > y) {
			aux = x;
			x = y;
			y = aux;
		}
		for (int i = x + 1; i < y; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		System.out.println("SOMA DOS IMPARES = " + soma);
		sc.close();
	}
}
