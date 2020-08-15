package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class tempo_de_jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		int horaInicial, horaFinal, horas; 
		
		System.out.print("Hora Inicial: ");
		horaInicial = sc.nextInt(); 
		System.out.print("Hora Final: ");
		horaFinal = sc.nextInt(); 
		horas = 24;
		if( horaFinal > horaInicial) {
			horas = horaFinal - horaInicial;
		}else {
			horas = (horaFinal + 24) - horaInicial; 
		}
		System.out.println("O JOGO DUROU " + horas + " HORA(S)");
		sc.close();
	}
}
