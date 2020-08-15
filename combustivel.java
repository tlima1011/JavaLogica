package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class combustivel {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		int codigo = 0, alcool = 0, gasolina = 0, diesel = 0; 
		
		do {
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			codigo = sc.nextInt(); 
			switch(codigo) {
				case 1: 
					alcool++;
					break; 
				case 2: 
					gasolina++;
					break; 
				case 3: 
					diesel++; 
					break; 
				}
		}while(codigo != 4); 
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " +alcool);
		System.out.println("Gasolina: " +gasolina);
		System.out.println("Diesel: " +diesel);
		
		sc.close();
	}

}
