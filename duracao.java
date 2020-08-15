package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class duracao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		int resto, segundos = 0, horas = 0, minutos = 0, duracao = 0; 
		
		System.out.print("Digite a duracao em segundos: "); // 300
		duracao = sc.nextInt(); 
		
		horas = duracao / 3600;
		resto = duracao % 3600;
		minutos = resto / 60;
		segundos = resto % 60; 
		System.out.println(horas +"hh " +minutos +" mm " +segundos +" s");
		sc.close();//0:5:0
	}
}
