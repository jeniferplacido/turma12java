package Lista2;

import java.util.Scanner;

public class Exercicio2 {
	
	// 3) Desenvolva um sistema em que:
	//Leia 4 (quatro) números;
	//Calcule o quadrado de cada um;
	//Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	//Caso contrário, imprima os valores lidos e seus respectivos quadrados.


	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		double a,b,c,d,r1,r2,r3,r4;
		

		System.out.println("Digite 4 valores diferentes: ");
		a= leia.nextDouble();
		b= leia.nextDouble();
		c= leia.nextDouble();
		d= leia.nextDouble();
		
		r1= Math.pow(a, 2);
		r2= Math.pow(b, 2);
		r3= Math.pow(c, 2);
		r4= Math.pow(d, 2);
		
		if (r1>=1000)
		{
			System.out.println("Valor resultante do quadrado do terceiro: "+r1);
		}
		else
		{
			System.out.println("Valor resultante do numero 1: "+r1);
			System.out.println("\nValor resultante do numero 2: "+r2);
			System.out.println("\nValor resultante do numero 3: "+r3);
			System.out.println("\nValor resultante do numero 4: "+r4);
		}
		
	}



	}


