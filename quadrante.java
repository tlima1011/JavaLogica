package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class quadrante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		double x = 0, y = 0;
		
		 
		do {
			System.out.println("Digite os valores das coordenadas X e Y: ");
			x = sc.nextDouble(); 
			y = sc.nextDouble(); 
			if (x > 0 && y > 0) {
				System.out.println("QUADRANTE Q1");
			}else if(x < 0 && y > 0) {
				System.out.println("QUADRANTE Q2");
			}else if(x < 0 && y < 0) {
				System.out.println("QUADRANTE Q3");
			}else if(x > 0 && y < 0 ) {
				System.out.println("QUADRANTE Q4");
			}else {
				break; 
			}
		}while(x != 0 || y != 0);
		System.out.println("Saindo...");
		sc.close();
	}

}
