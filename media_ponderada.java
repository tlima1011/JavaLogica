package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class media_ponderada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		int n = 0; 
		double media = 0, nota1 = 0, nota2 = 0, nota3 = 0; 
		System.out.println("Quantos casos voce vai digitar? ");
		n = sc.nextInt(); 
		for(int i = 0; i < n;i++) {
			System.out.println("Digite tres numeros: ");
			nota1 = sc.nextDouble(); 
			nota2 = sc.nextDouble(); 
			nota3 = sc.nextDouble(); 
			media = (2 * nota1 + 3 * nota2 + 5 * nota3) / 10;
			System.out.println("MEDIA = " +String.format("%.1f", media));
		}
		sc.close();	
	}

}
