package Lista2;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner leia= new Scanner (System.in);
		
		int idade;
		
		System.out.println("Digite a sua idade: ");
		idade=leia.nextInt();
		
		if(idade>=5 && idade<=7)
		{
			System.out.println("Você se encaixa no grupo Infantil A");
		}

			else if(idade>=8 && idade<=11)
		{
			System.out.println("Você se encaixa no grupo Infantil B");
		}

			else if(idade>=12 && idade<=13)
		{
			System.out.println("Você se encaixa no grupo Juvenil A");
		}

			else if(idade>=14 && idade<=17)
		{
			System.out.println("Você se encaixa no grupo Juvenil B");
		}

			else if(idade>=18)
		{
			System.out.println("Você se encaixa no grupo de Adultos");
		}
		else
		{
			System.out.println("Não temos um grupo para essa faixa etária");
		}
		
	}
}