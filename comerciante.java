package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class comerciante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int n = 0, abaixo = 0, entre = 0, acima = 0; 
		double totalCompra = 0, totalVenda = 0, totalLucro = 0, lucro = 0, percentualLucro = 0;
		
		System.out.println("Serao digitados dados de quantos produtos? "); //4
		n = sc.nextInt(); 
		
		String [] nomes = new String[n];
		double [] preco_compra = new double[n]; 
		double [] preco_venda = new double[n]; 
		
		for(int i = 0; i < n; i++) {
			System.out.println("Produto " +(i + 1)+":");
			sc.nextLine();
			System.out.print("Nome: ");  
			nomes[i] = sc.nextLine();
			System.out.print("Preco de compra: R$");  
			preco_compra[i] = sc.nextDouble(); //0.00
			System.out.print("Preco de venda: R$"); 
			preco_venda[i] = sc.nextDouble();
		}
		for(int i = 0; i < n; i++) {
			totalCompra += preco_compra[i]; 
			totalVenda += preco_venda[i];  
			totalLucro = totalVenda - totalCompra; 
		}
		
		for(int i = 0; i < n;i++) {
			lucro = preco_venda[i] - preco_compra[i];  
			percentualLucro = lucro * 100 / preco_compra[i]; 
			if (percentualLucro < 10) {
				abaixo++;
			}else if(percentualLucro <= 20) {
				entre++; 
			}else {
				acima++; 
			}
		}
		System.out.println("RELATORIO:");		
		System.out.println("Lucro abaixo de 10%: " +abaixo); // 1
		System.out.println("Lucro entre 10% e 20%: " +entre); //2 
		System.out.println("Lucro acima de 20%: " +acima);  //1
		System.out.println("Valor total de compra: R$" +String.format("%.2f", totalCompra));  //30.00
		System.out.println("Valor total de venda: R$" +String.format("%.2f", totalVenda)); //33.50
		System.out.println("Lucro total: R$" +String.format("%.2f", totalLucro)); //3.50
		sc.close();
	}

}
