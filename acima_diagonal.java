package exercicios;

import java.util.Scanner;

public class acima_diagonal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int n = 0, soma = 0; 
		System.out.print("Qual a ordem da matriz? "); //4
		n = sc.nextInt(); 
		
		int [][] mat = new int[n][n]; 
		for(int i = 0; i < n;i++) {
			for(int j = 0; j < n;j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				mat[i][j] = sc.nextInt(); 
			}
		}
		for(int i = 0; i < n;i++) {
			for(int j = i + 1; j < n;j++) {
				soma += mat[i][j];
			}
		}	
		System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " +soma);
		sc.close();
	}
}
