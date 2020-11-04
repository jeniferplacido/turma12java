programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
	/*		
	 * 		2.	Um dado é lançado 10 vezes e o valor correspondente é anotado.
	 * 		Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
	 * 		A seguir determine e imprima a média aritmética dos lançamentos, contabilize
	 * 		e apresente também quantas foram as ocorrências da maior pontuação.
	 * 		
	 */
	//variaveis
	const inteiro LIMITE=10
	inteiro lancamentos[LIMITE]
	inteiro x = 0
	inteiro somaLancamentos = 0
	inteiro maiorValor = 0
	inteiro contadorMaior=0
	para (x = 0; x<LIMITE; x++)
	{
		lancamentos[x] = Util.sorteia(1,6)
		escreva("\nVALOR NA POSIÇÃO ",x+1," : ",lancamentos[x])
		somaLancamentos = somaLancamentos + lancamentos[x]
		se (lancamentos[x] >= maiorValor )
		{
			se (lancamentos[x] != maiorValor)
			{
				contadorMaior = 0
			}
			maiorValor = lancamentos[x]
			contadorMaior++
		}
		
	}
	
	escreva("\nTotal de valores somados: ", somaLancamentos)
	escreva("\nMedia aritmetica: ", (somaLancamentos/LIMITE) )
	escreva("\nMaior valor ", maiorValor)
	escreva("\nQuantas vezes aparece: ",contadorMaior)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1110; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */