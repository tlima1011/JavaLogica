package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class medidas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		double a = 0, b = 0, c = 0, areaQuadrado = 0, areaTriangulo = 0, areaTrapezio = 0;
		
		System.out.print("Digite a medida A: "); //4.0
		a = sc.nextDouble(); 
		System.out.print("Digite a medida B: "); //3.5
		b = sc.nextDouble(); 
		System.out.print("Digite a medida C: "); //5.2
		c = sc.nextDouble(); 
		areaQuadrado = a * a; 
		areaTriangulo = (a * b) / 2; 		
		areaTrapezio = c * (a + b) / 2;
		System.out.println("AREA DO QUADRADO = " + String.format("%.4f",areaQuadrado)); //16.0000
		System.out.println("AREA DO TRIANGULO = " +String.format("%.4f", areaTriangulo));   //7.0000
		System.out.println("AREA DO TRAPEZIO = " +String.format("%.4f", areaTrapezio));  //19.5000
		sc.close();
	}

}
