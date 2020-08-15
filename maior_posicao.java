package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int n = 0, posMaior = 0; 
		double maiorNumero = 0;
		System.out.print("Quanto numeros voce vai digitar? ");
		n = sc.nextInt();  
		double [] numeros = new double[n]; 
		for(int i = 0; i < n;i++) {
			System.out.print("Digite o " +(i + 1) +"º número: ");
			numeros[i] = sc.nextDouble(); 
		}
		
		maiorNumero = numeros[0];
		for(int i = 1; i < n;i++) {
			if(numeros[i] > maiorNumero) {
				maiorNumero = numeros[i]; 
				posMaior = i;
			}
		}
		System.out.println("MAIOR VALOR = " +String.format("%.1f", maiorNumero)); // 14.0
		System.out.println("POSICAO DO MAIOR VALOR = " + posMaior);  //3
		sc.close();
	}

}
