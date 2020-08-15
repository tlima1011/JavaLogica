package exercicios;

import java.util.Locale;
import java.util.Scanner;


public class temperatura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		double f = 0, c = 0; 
		char conversao = '\u0000'; 
		
		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? "); //F
		conversao = sc.nextLine().charAt(0);
		conversao = Character.toUpperCase(conversao); 
		switch(conversao) {
			case 'F': 
				System.out.print("Digite a temperatura em Fahrenheit: "); 
				f = sc.nextDouble(); 
				c = 5 / 9.0 * (f - 32);
				System.out.print("Temperatura equivalente em Celsius: " +String.format("%.2f", c)+"ºC");
				break; 
			case 'C': 
				System.out.print("Digite a temperatura em Celsius: "); 
				c = sc.nextDouble();
				f = c * 9 / 5.0 + 32;
				System.out.println("Temperatura equivalente em Fahrenheit: " +String.format("%.2f", f)+"ºF"); 
				break;
			default: 
				System.out.println("Inválido");
		}
		sc.close();
	}
}
