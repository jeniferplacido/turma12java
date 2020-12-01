package Lista4;

import java.util.Scanner;

public class ExercicioMatriz {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double ponto;
		double valorM = 0;
		
		
		for(int x = 0; x<5; x++) 
		{
			System.out.println("DIGITE UM NUMERO:  ");
			leia.next();
			if (x>valorM) 
			{
			valorM = x;
			}
		}System.out.printf("A MAIOR PONTUAÇÃO FOI: "+ valorM);

	}
}
