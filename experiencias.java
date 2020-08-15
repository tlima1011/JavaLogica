package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class experiencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int n = 0, qtde = 0, coelho = 0, rato = 0, sapo = 0, total = 0; 
		char tipo = '\u0000'; 
		double perc_coelho = 0, perc_rato = 0, perc_sapo = 0; 
		
		System.out.print("Quantos casos de teste serao digitados? ");  //10
		n = sc.nextInt(); 
		
		for(int i = 0; i < n; i++) {
			System.out.print("Quantidade de cobaias: ");
			qtde = sc.nextInt(); 
			System.out.print("Tipo de cobaia: [C] - Coelho [S] - Sapo [R] - Rato: ");
			sc.nextLine();
			tipo = sc.nextLine().charAt(0);
			tipo = Character.toUpperCase(tipo); 
			switch(tipo) {
				case 'C': 
					coelho += qtde;
					break;
				case 'R': 
					rato += qtde;
					break; 
				case 'S': 
					sapo += qtde; 
					break; 
				default: 
					do {
						if((tipo != 'C') && (tipo != 'R') && (tipo != 'S')) {
							System.out.println("Informe novamente...");
							System.out.print("Tipo de cobaia: [C] - Coelho [S] - Sapo [R] - Rato: ");
							//sc.nextLine();
							tipo = sc.nextLine().charAt(0);
							tipo = Character.toUpperCase(tipo);
						}
					}while((tipo != 'C') && (tipo != 'R') && (tipo != 'S'));
				}
			}
			total = coelho + sapo + rato;
			perc_coelho = (double) coelho / total; 
			perc_rato = (double) rato / total;  
			perc_sapo = (double) sapo / total;
			System.out.println("RELATORIO FINAL:");
			System.out.println("Total: " + total + " cobaias."); 
			System.out.println("Total de coelhos: " +coelho); //29
			System.out.println("Total de ratos: " +rato); // 40
			System.out.println("Total de sapos: " +sapo); // 23
			System.out.println("Percentual de coelhos: " +String.format("%.2f", perc_coelho * 100)+"%");
			System.out.println("Percentual de ratos: " +String.format("%.2f", perc_rato * 100)+"%");
			System.out.println("Percentual de sapos: " +String.format("%.2f", perc_sapo * 100)+"%");
			sc.close();
		}
	}
