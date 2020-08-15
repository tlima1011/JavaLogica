package exercicios;

import java.util.Scanner;

public class senha_fixa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int senha = 0; 
		
		System.out.print("Digite a senha: ");
		do {
			senha = sc.nextInt(); 
			if (senha != 2002) {
				System.out.print("Senha Invalida! Tente novamente: "); 
			}
		}while(senha != 2002);
		System.out.println("Acesso permitido!!");
		sc.close();
	}
}
