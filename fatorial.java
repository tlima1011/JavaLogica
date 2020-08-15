package exercicios;

import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int f = 1, n = 0;
		System.out.print("Digite o valor de N: ");  
		n = sc.nextInt(); 
		for(int i = 1; i <= n; i++) {
			f *= i;
		}
		System.out.println("FATORIAL = " +f);
		sc.close();
	}

}
