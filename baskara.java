package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class baskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		double a = 0, b = 0, c = 0, delta = 0, x1 = 0, x2 = 0; 
		
		System.out.print("Coeficiente a: "); // 1
		a = sc.nextDouble(); 
		System.out.print("Coeficiente b: ");//0
		b = sc.nextDouble();
		System.out.print("Coeficiente c: "); //-9
		c = sc.nextDouble(); 
		delta = Math.pow(b, 2) - (4 * a * c); 
		if (a == 0 || delta < 0) {
			System.out.println("Esta equação não possui raízes reais"); 
		}else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a); 
		    x2 = (-b - Math.sqrt(delta)) / (2 * a);
		    System.out.println("X1 = " +String.format("%.4f", x1)); //( , x1:6:4)
		    System.out.println("X2 = " +String.format("%.4f", x2));
		}
		sc.close();
		//X1 = 3.0000
		//X2 = -3.0000
	}

}
