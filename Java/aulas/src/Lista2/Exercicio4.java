package Lista2;

import java.util.Scanner;
//  
//4) Fa�a um sistema que leia um n�mero inteiro e mostre uma 
//mensagem indicando se este n�mero � par ou �mpar, e se � positivo ou negativo.

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);

		
		 
		 System.out.println("Digite um n�mero + ou -: ");
		 int num = leia.nextInt() ;
		 
		 if(num <0 )
		 {
		 	System.out.println("\nN�mero negativo, por favor digite um n�mero positivo");
		 }
		 
		 else if(num>0)
		 {
			if ((num%2)==0) 
			{
		 			System.out.println("\nO n�mero digitado � par e positivo");
			}
				else 		
		 	{
		 		System.out.println("O n�mero digitado � impar positivo");
		 	}
		 }
		 
		
	}

}