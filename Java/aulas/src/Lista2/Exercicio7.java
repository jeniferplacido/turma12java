package Lista2;

import java.util.Scanner;

public class Exercicio7 {

	
	public static void main(String[] args)
		{
				
			
			Scanner leia = new Scanner(System.in); 
			double base=0.0, altura=0.0, area=0.0; 
			System.out.print("Digite a base:"); 
			base = leia.nextDouble(); 
			System.out.print("Digite a altura: "); 
			altura = leia.nextDouble(); 
			
	
			System.out.println( (base > 0 && altura > 0 )? "A �rea do triangulo � "+((base * altura)/2):"Vc n�o digitou valores validos!!!" );
			
			
			if (base > 0 && altura > 0 )
			{
				System.out.printf("A area do triangulo � %.2f", ((base * altura)/2));
			
			}
			else
			{
				System.out.println("Vc n�o digitou valores validos!!!");
			}
			
			
		}
	}





