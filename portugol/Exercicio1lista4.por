programa
{	/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação
	*de uma atividade e o escreva em seguida. 
	*Encontre após a maior pontuação e a apresente.
	*/
	funcao inicio()
	{
		inteiro pont[5]
		inteiro pontMaior=0

		para(inteiro x=0; x<5; x++)
		{
			escreva("DIGITE UM VALOR: ")
			leia(pont[x])
			se(pont[x]>pontMaior)
			{
				pontMaior = pont[x]
			}
		}
		limpa()
		escreva("A MAIOR PONTUAÇÃO FOI DE: ",pontMaior)
	}
}

















/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */