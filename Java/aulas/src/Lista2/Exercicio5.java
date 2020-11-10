package Lista2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 
		// 3 grupos de indústrias que são altamente poluentes do meio ambiente. 
		//O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3
		// as indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice 
		//crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas 
		//atividades, se o índice atingir 0,5 todos os grupos devem ser notificados a 
		//paralisarem suas atividades. Faça um sistema que leia o índice de poluição medido e 
		//emita a notificação adequada aos diferentes grupos de empresas.


		Scanner leia = new Scanner(System.in);
		
		System.out.println("Índice de poluição dos grupos de Industria: ");
		double gpIndustria= leia.nextDouble();
		

		if ((gpIndustria>=0.05) && (gpIndustria<=0.25))
		{
			System.out.println("O Índice de poluição está aceitável");
		}
		else if((gpIndustria>=0.3) && (gpIndustria<0.4))
		{
			System.out.println("As indústrias do 1º grupo foram intimadas a suspenderam as suas atividades");
		}
		else if((gpIndustria>=0.4) && (gpIndustria<0.5))
		{
			System.out.println("As indústrias do 1º e 2º grupo foram intimadas a suspenderem suas atividades");
		}
		else if (gpIndustria>=0.5)
		{
			System.out.println("Todos os grupos devem ser notificados a paralisarem suas atividades");
		}
		
	}


	}


