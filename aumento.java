package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class aumento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		double salario = 0, aumento = 0, porcentagem = 0, novoSalario = 0; 
		
		System.out.print("Digite o salario da pessoa R$"); //2500.00
		salario = sc.nextDouble(); 
		if (salario <= 1000) {
			porcentagem = 0.20;
		}else if(salario <= 3000) {
			porcentagem = 0.15; 
		}else if(salario <= 8000) {
			porcentagem = 0.10;
		}else {
			porcentagem = 0.05; 
		}
		aumento = porcentagem * salario;
		novoSalario = salario + aumento;
		porcentagem *= 100;
		System.out.println("Salario atual R$" +String.format("%.2f", salario));
		System.out.println("Novo Salário R$" +String.format("%.2f", novoSalario));
		System.out.println("Aumento = R$" +String.format("%.2f", aumento));
		System.out.println("Porcentagem = " +String.format("%.0f", porcentagem) +"%");
		sc.close();
		/*Novo salario = R$ 2875.00
		Aumento = R$ 375.00
		Porcentagem = 15 %*/
	}

}
