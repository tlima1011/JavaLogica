package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class consumo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		double distancia = 0, combustivel = 0, consumo = 0; 
				
		System.out.print("Distancia percorrida: " );  //500
		distancia = sc.nextDouble(); 
		System.out.print("Combustível gasto: "); //38.5
		combustivel = sc.nextDouble(); 
		consumo = distancia / combustivel; 
		System.out.println("Consumo medio = " +String.format("%.3f", consumo) ); // 12.987
		sc.close();
	}

}
