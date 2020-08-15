package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class soma_linhas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int n = 0, m = 0;
		System.out.print("Qual a quantidade de linhas da matriz? "); 
		m = sc.nextInt(); 
		System.out.print("Qual a quantidade de colunas da matriz?"); // 3
		n = sc.nextInt(); 
		
		double [][]mat = new double [m][n];
		double [] vet = new double [m]; 
		for(int i = 0; i < m;i++) {
			System.out.println("Digite os elementos da " +(i+ 1)+"ª linha:"); 
			for(int j = 0; j < n;j++) {
				mat[i][j] =sc.nextDouble(); 
			}
		}
		for(int i = 0; i < m;i++) {
			for(int j = 0; j < n;j++) {
				vet[i] += mat[i][j];
			}
		}
		System.out.println("VETOR GERADO");
		for (int i = 0; i < m;i++) {
			System.out.println(String.format("%.1f", vet[i]));
		}
		sc.close();
	}
}
