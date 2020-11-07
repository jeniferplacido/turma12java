package Lista1;

import java.util.Scanner;

// 2. Faça um sistema que leia a idade de uma pessoa expressa em dias
//e mostre-a expressa em anos, meses e dias.
public class Exercicio2 {
	public static void main(String[] args) {
		java.util.Scanner leia = new Scanner(System.in);
		int idade;
		int anos;
		int mes;
		int dias;
		
		System.out.print("Digite a sua idade em dias: ");
		idade= leia.nextInt();
	
			
		idade = dias/365 + mes/12 + dias/1;
		System.out.println("Ano(s):+anos+ // Mes(es): +mes+ // Dia(s): "+dias);
}
}
