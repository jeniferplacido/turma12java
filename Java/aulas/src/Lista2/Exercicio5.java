package Lista2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5) A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 
		// 3 grupos de ind�strias que s�o altamente poluentes do meio ambiente. 
		//O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3
		// as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades, se o �ndice 
		//crescer para 0,4 as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas 
		//atividades, se o �ndice atingir 0,5 todos os grupos devem ser notificados a 
		//paralisarem suas atividades. Fa�a um sistema que leia o �ndice de polui��o medido e 
		//emita a notifica��o adequada aos diferentes grupos de empresas.


		Scanner leia = new Scanner(System.in);
		
		System.out.println("�ndice de polui��o dos grupos de Industria: ");
		double gpIndustria= leia.nextDouble();
		

		if ((gpIndustria>=0.05) && (gpIndustria<=0.25))
		{
			System.out.println("O �ndice de polui��o est� aceit�vel");
		}
		else if((gpIndustria>=0.3) && (gpIndustria<0.4))
		{
			System.out.println("As ind�strias do 1� grupo foram intimadas a suspenderam as suas atividades");
		}
		else if((gpIndustria>=0.4) && (gpIndustria<0.5))
		{
			System.out.println("As ind�strias do 1� e 2� grupo foram intimadas a suspenderem suas atividades");
		}
		else if (gpIndustria>=0.5)
		{
			System.out.println("Todos os grupos devem ser notificados a paralisarem suas atividades");
		}
		
	}


	}


