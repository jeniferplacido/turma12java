programa
{/*Desenvolver um sistema que efetue a soma de todos os números ímpares que são 
       múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
       */
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro x
		inteiro soma=0
		const inteiro RAPIDEZ=500
		
		escreva("Os números impares multiplos de 3, do 1 a 500 são:  ")
		para (x=1;x<=500;x++)
		{
		se (x%2==1) 
		{	
				limpa()
			escreva("\nNumero impar: ",x)
			soma=x*3
			escreva("\nA soma dos valores é de ",soma,"\n")
			Util.aguarde(RAPIDEZ)
			
			}	
		}
			
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 554; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */