package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double troco = 0, precoTotal = 0, preco = 0, quantidade = 0, dinheiro = 0, valor = 0;

		System.out.print("Preço unitário do produto R$"); // 8.00
		preco = sc.nextDouble();
		System.out.print("Quantidade comprada: "); // 2
		quantidade = sc.nextInt();
		System.out.print("Dinheiro recebido R$ ");// 20.00
		dinheiro = sc.nextDouble();
		valor = preco * quantidade;
		if (dinheiro < valor) {
			precoTotal = valor - dinheiro;
			precoTotal *= -1;
			System.out.println("DINHEIRO INSUFICIENTE. FALTAM  R$" + String.format("%.2f", precoTotal));
		} else {
			troco = dinheiro - valor;
			System.out.println("TROCO = R$" + String.format("%.2f", troco)); // 4.00
		}
		sc.close();
	}
}
