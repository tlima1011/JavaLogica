package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class dardo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		double d1, d2, d3, maior;
		
		System.out.println("Digite as tres distancias: "); 
		d1 = sc.nextDouble(); //83.21
		d2 = sc.nextDouble();//79.53
		d3 = sc.nextDouble(); //89.15
		if(d1 > d2 && d1 > d3) {
			maior = d1;
		}else if (d2 > d3){
			maior = d2;
		}else {
			maior = d3; 
		}
		System.out.println("MAIOR DISTANCIA = " +String.format("%.2f", maior)+"m"); // 89.15
		sc.close();
	}

}
