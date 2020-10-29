// 3. Faça um sistema que leia o tempo de duração de um evento 
//em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 

programa
{
	
	funcao inicio()
	{
		inteiro duracaoSegundos
		inteiro horas
		inteiro minutos
		inteiro segundos
		
		escreva ("Insira o tempo de duração do evento em segundos:\n ")
		leia(duracaoSegundos)
		horas = (duracaoSegundos/3600)
		minutos = ((duracaoSegundos % 3600)/60)
		segundos=((duracaoSegundos % 3600)%60)
		escreva("---------------------- \n")
		escreva("O evento teve uma duração de:\n")
		escreva(" Horas: " +horas)
		escreva(" \n Minutos: " +minutos)
		escreva("\n Segundos: " +segundos)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 660; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */