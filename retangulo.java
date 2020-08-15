package exercicios;

import java.util.Locale;
import java.util.Scanner;
import java.math.*;

public class retangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double base = 0, altura = 0, area = 0, perimetro = 0, diagonal = 0;

		System.out.print("Base do retangulo: ");
		base = sc.nextDouble();
		System.out.print("Altura do retangulo: ");
		altura = sc.nextDouble();

		area = base * altura;
		perimetro = 2 * (base + altura);
		diagonal = Math.sqrt((Math.pow(base, 2) + Math.pow(altura, 2)));

		System.out.println("AREA = " + String.format("%.4f", area));
		System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));
		System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
		sc.close();
	}
}