package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class diagonal_negativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		int n = 0, negativos = 0; 
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt(); 
		int [][] mat = new int[n][n]; 
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("Elemento [" +i +"," +j+"]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.print("\nDIAGONAL PRINCIPAL: ");
		for(int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n;j++) {
				if(mat[i][j] < 0) {
					negativos++; 
				}
			}
		}
		System.out.print("\nQUANTIDADE DE NEGATIVOS = " +negativos); // 2
		sc.close();
	}

}
