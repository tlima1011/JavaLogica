package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class matriz_geral {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int n = 0, linha = 0, coluna = 0; 
		double soma = 0;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt(); 
		
		double [][] mat = new double[n][n]; 
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n;j++) {
				System.out.print("Elemento ["+i+","+j+"]: ");
				mat[i][j] = sc.nextDouble(); 
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n;j++) {
				if(mat[i][j] > 0) {
					soma += mat[i][j]; 
				}
			}
		}
		System.out.print("SOMA DOS POSITIVOS: " +String.format("%.1f", soma));  
				
		System.out.print("\nEscolha uma linha: ");
		linha = sc.nextInt(); 
		
		System.out.print("\nLINHA ESCOLHIDA: "); // -2.0 3.0 5.0
		for(int j = 0; j < n;j++) {
			System.out.print(String.format("%.1f", mat[linha][j]) + "  ");
		}
		
		System.out.print("\nEscolha uma coluna:");  
		coluna = sc.nextInt(); 
		
		System.out.print("\nCOLUNA ESCOLHIDA: "); // 10.0 5.0 4.0
		for(int i = 0; i < n;i++) {
			System.out.print(String.format("%.1f", mat[i][coluna]) + "  ");
		}
		System.out.println();
		System.out.println("\nDIAGONAL PRINCIPAL: ");  //7.0 3.0 4.0
		for(int i = 0; i < n; i++) {
			System.out.print(String.format("%.1f", mat[i][i]) + "  ");
		}
		System.out.println();
		System.out.println("\nMATRIZ ALTERADA: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n;j++) {
				if(mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2);
					System.out.print(String.format("%.1f", mat[i][j]) + "  ");
				}else {
					System.out.print(String.format("%.1f", mat[i][j]) + "  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
