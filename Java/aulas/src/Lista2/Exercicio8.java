package Lista2;

// 8) Construa um sistema para ler uma variável numérica N e imprimi-la 
//somente se a mesma for maior que 100, caso contrário imprimi-la com o valor zero.

import java.util.Scanner;

public class Exercicio8 {

	// TODO Auto-generated method stub
		public static void main(String[] args) {
			Scanner leia= new Scanner(System.in);
			
			int N = 0;
			System.out.println("Digite um numero maior que 100, caso ao contrario esse valor será zerado: ");
			
			N=leia.nextInt();
			
			if(N>100)
			{
				System.out.println("Seu valor é de "+N);
				
			}
			else if (N<100)
			{
				N = N - N;
				System.out.println("Seu valor foi zerado: "+N);
			}
			
		}
	
	}


