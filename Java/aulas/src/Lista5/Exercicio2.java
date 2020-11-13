package Lista5;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {


	Scanner leia = new Scanner(System.in);
	
	String nome;
	double peso;
	double altura;
	double IMC;
	
	System.out.println("DIGITE SEU NOME: ");
	nome = leia.nextLine();
	System.out.println("DIGITE SEU PESO: ");
	peso = leia.nextDouble();
	System.out.println("DIGITE SUA ALTURA: ");
	altura = leia.nextDouble();
	
	
	IMC = peso/(altura*altura);
	
	while (IMC > 0 && IMC <18.5 )
	{		
		System.out.println("ABAIXO DO PESO!");	
	}
		
	if (IMC > 18.5 && IMC < 25 ) 
	{
	   System.out.println("PESO NORMAL!");	
	}
	else if (IMC > 25 && IMC < 30 ) 
	{
		   System.out.println("ACIMA DO PESO!");	
	}
	else
	{
		System.out.printf("OBESO!");
	}
}
}

