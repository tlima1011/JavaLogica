package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class lanchonete {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		int codigo = 0, qtde = 0;
		double valor = 0; 
		
		System.out.print("Codigo do produto comprado: "); //1
		codigo = sc.nextInt(); 
		
		switch(codigo) {
			case 1: 
				System.out.print("Quantidade comprada: ");  
				qtde = sc.nextInt(); 
				valor = qtde * 5; 
				System.out.print("Valor a pagar: R$" +String.format("%.2f", valor));  //15.00
				break;
			case 2: 
				System.out.print("Quantidade comprada: ");  
				qtde = sc.nextInt(); 
				valor = qtde * 3.50; 
				System.out.print("Valor a pagar: R$" +String.format("%.2f", valor)); 
				break;
			case 3: 
				System.out.print("Quantidade comprada: ");  
				qtde = sc.nextInt(); 
				valor = qtde * 4.80; 
				System.out.print("Valor a pagar: R$" +String.format("%.2f", valor)); 
				break;
			case 4: 
				System.out.print("Quantidade comprada: ");  
				qtde = sc.nextInt(); 
				valor = qtde * 8.90; 
				System.out.print("Valor a pagar: R$" +String.format("%.2f", valor));
				break;
			case 5: 
				System.out.print("Quantidade comprada: ");  
				qtde = sc.nextInt(); 
				valor = qtde * 7.32; 
				System.out.print("Valor a pagar: R$" +String.format("%.2f", valor));
				break;
			default: 
				System.out.println("Nada!!");
		}
		sc.close();
	}

}
