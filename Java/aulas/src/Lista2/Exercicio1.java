package Lista2;

import java.util.Scanner;

// 1) Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento
// di�rio de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
// regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
//Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e verifique se h� excesso. 
//Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar. 
//Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.

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
		System.out.print("Voc� n�o ultrapassou o limite de peso do tomate e n�o gerou multa");
	}
	

}
	
}
