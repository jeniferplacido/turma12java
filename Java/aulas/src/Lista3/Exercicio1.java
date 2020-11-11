package Lista3;

// 
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
Scanner leia = new Scanner(System.in);
		

		int cont=0, Par=0, Impar=0;
		int soma=0;
				

		System.out.println("Calculo dos números impar múltiplos de 3 de 1 até 500\n");
						
		for(cont=1; cont<=500; cont++)
		{
			Par = (cont%2);
					
			if (Par != 0)
			{
				Impar = (cont%3);

				if (Impar == 0)
				{
					soma = (soma+cont);
				}
					
			}
		}
				
			System.out.printf("\nO resultado da soma é de: %d",soma);

	}

}