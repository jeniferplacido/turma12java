package Lista2;

import java.util.Scanner;
//  
//4) Faça um sistema que leia um número inteiro e mostre uma 
//mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);

		
		 
		 System.out.println("Digite um número + ou -: ");
		 int num = leia.nextInt() ;
		 
		 if(num <0 )
		 {
		 	System.out.println("\nNúmero negativo, por favor digite um número positivo");
		 }
		 
		 else if(num>0)
		 {
			if ((num%2)==0) 
			{
		 			System.out.println("\nO número digitado é par e positivo");
			}
				else 		
		 	{
		 		System.out.println("O número digitado é impar positivo");
		 	}
		 }
		 
		
	}

}