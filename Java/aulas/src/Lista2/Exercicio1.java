package Lista2;

import java.util.Scanner;

// 1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento
// diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
// regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
//João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. 
//Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
//Caso contrário mostrar tais variáveis com o conteúdo ZERO.

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		double P, E, M;
		
		System.out.print("Digite o peso dos tomates:");
		P = leia.nextDouble();
		
		E = (P-50);
		M = (E*4);
		
		
		 
	if (P > 50){
			System.out.print("O peso do seu tomate excedeu: "+ E + "\nE gerou uma multa de: " + M);
		}
	else {
		System.out.print("Você não ultrapassou o limite de peso do tomate e não gerou multa");
	}
	

}
	
}
