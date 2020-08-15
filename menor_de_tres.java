package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class menor_de_tres {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int menor = 0, a = 0, b = 0, c = 0;
		
		System.out.print("Primeiro valor: "); // 7
		a = sc.nextInt(); 
		System.out.print("Segundo valor: ");  //3
		b = sc.nextInt(); 
		System.out.print("Terceiro valor: "); // 8
		c = sc.nextInt(); 
		
		if(a < b && a < c) {
			menor = a;
		}else if(b < c) {
			menor = b;
		}else {
			menor = c; 
		}
		
		System.out.println("MENOR = " +menor); 
		sc.close();
	}

}
