//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
//meses e dias e mostre-a expressa apenas em dias;

package Lista1;

import java.util.Scanner;


public class Exercicio1 {
	
	public static void main(String[] args) {
		java.util.Scanner leia = new Scanner(System.in);
		int idadeAnos;
		int idadeMeses;
		int idadeDias;
		int idadeTotalEmDias;
		
		System.out.print("Calcule a sua idade em dias\n\n");
		
		System.out.print("Digite os anos: ");
		idadeAnos = leia.nextInt();
		
		System.out.print("Digite os meses: ");
		idadeMeses = leia.nextInt();
		
		System.out.print("Digite os dias: ");
		idadeDias = leia.nextInt();
		
		idadeTotalEmDias = idadeAnos * 365 + idadeMeses * 30 + idadeDias;
		System.out.print("Idade total em dias = "+idadeTotalEmDias+"\n");
	}

}
