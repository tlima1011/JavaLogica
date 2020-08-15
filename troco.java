package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class troco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		double preco = 0, troco = 0, dinheiro = 0, total = 0;
		int qtde = 0; 
		
		System.out.print("Preço unitário do produto R$");
		preco = sc.nextDouble(); 
		System.out.print("Quantidade comprada: ");
		qtde = sc.nextInt(); 
		System.out.print("Dinheiro recebido R$");
		dinheiro = sc.nextDouble(); 
		total = preco * qtde; 
		troco = dinheiro - total; 
		System.out.println("TROCO R$" + String.format("%.2f", troco));
		sc.close();
	}
}
