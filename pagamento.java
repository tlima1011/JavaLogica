package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class pagamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		String nome = ""; 
		double valorHora = 0, salario = 0; 
		int horas = 0; 
		
		System.out.print("Nome: "); 
		nome = sc.nextLine();
		System.out.print("Valor por hora: ");  
		valorHora = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");  
		horas = sc.nextInt(); 
		salario = horas * valorHora; 
		System.out.println("O pagamento para " + nome + " deve ser R$" + String.format("%.2f", salario));  
		sc.close();
	}

}
