package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 0, qtde_mulheres = 0, qtde_homens = 0; 
		double menorAltura = 0, maiorAltura = 0, mediaMulheres = 0, soma_altura_mulheres = 0; 
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt(); 
		
		char [] generos = new char[n]; 
		double [] alturas = new double[n]; 
		
		for(int i = 0; i < n; i++) {
			System.out.print("Genero da " +(i + 1) + "ª pessoa: ");
			sc.nextLine();
			generos[i] = sc.nextLine().charAt(0);
			generos[i] = Character.toUpperCase(generos[i]);
			System.out.print("Altura da " +(i + 1) +"ª pessoa: ");
			alturas[i] = sc.nextDouble();
		}
		
		menorAltura = maiorAltura  = alturas[0];  
		
		for(int i = 1; i < n;i++) {
			if(alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
			if(alturas[i] < menorAltura) {
				menorAltura = alturas[i]; 
			}
		}
		System.out.println("Menor altura = " +String.format("%.2f", menorAltura)); // 1.54
		System.out.println("Maior altura = " +String.format("%.2f", maiorAltura)); // 1.83
		
		for(int i = 0; i < n; i++) {
			if(generos[i] == 'F') {
				qtde_mulheres++;
				soma_altura_mulheres += alturas[i]; 
			}else {
				qtde_homens++;
			}
		}
		mediaMulheres = soma_altura_mulheres / qtde_mulheres; 
		System.out.println("Media das alturas das mulheres = " +String.format("%.2f", mediaMulheres)); //1.69
		System.out.println("Numero de homens = " +qtde_homens);// Numero de homens = 2
		sc.close();
	}

}
