package exercicios;

import java.util.Scanner;

public class sequencia_impares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int x = 0; 
		System.out.print("Digite o valor de X: ");
		x = sc.nextInt();
		for(int i = 1; i <= x;i++) {
			if( i % 2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
