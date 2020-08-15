package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class terreno {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in); 
	Locale.setDefault(Locale.US);
	double area, largura, comprimento, valor, preco;  
		
	System.out.print("Digite a largura do terreno.: ");
	largura = sc.nextDouble(); 
	
	System.out.print("Digite o comprimento do terreno: ");
	comprimento = sc.nextDouble(); 
	
	System.out.print("Digite o valor do metro quadrado: ");
	valor = sc.nextDouble(); 
	
	area = largura * comprimento; 
	preco = valor * area; 
	System.out.println("Area do Terreno: " +String.format("%.2f", area) + "m");
	System.out.println("Preco do Terreno R$" + String.format("%.2f", preco));
		
	sc.close();
	}

}
