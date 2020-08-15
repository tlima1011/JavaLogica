package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class negativos_matriz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int m = 0, n = 0; 
		System.out.print("Qual a quantidade de linhas da matriz? "); //2
		m = sc.nextInt(); 
		System.out.print("Qual a quantidade de colunas da matriz? ");//3
		n = sc.nextInt(); 
		
		int [][] mat = new int[m][n]; 
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("VALORES NEGATIVOS:");
		for(int i = 0; i < m;i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] < 0) {
					System.out.println(mat[i][j]);
				}
			}
		}
		sc.close();
	}
}
