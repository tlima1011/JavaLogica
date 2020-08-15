package exercicios;

import java.util.Scanner;

public class soma_matrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int m = 0, n = 0;
		
		System.out.print("Quantas linhas vai ter cada matriz? ");  
		m = sc.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		n = sc.nextInt();
				
		int [][] a = new int[m][n]; 
		int [][] b = new int[m][n];
		int [][] c = new int[m][n];
		
		System.out.println("Digite os valores da matriz A:");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n;j++) {
				System.out.print("Elemento [" +i+ "," +j+"]: ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite os valores da matriz B:");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n;j++) {
				System.out.print("Elemento [" +i+ "," +j+"]: ");
				b[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n;j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("MATRIZ SOMA:");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n;j++) {
				System.out.print(c[i][j] + "  ");
			}
		System.out.println();
		}
		sc.close();
	}
}
