// 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e 
//mostre-a expressa em anos, meses e dias.

programa
{
	funcao inicio()
	{
		inteiro idadeAnos = 0
		inteiro idadeMeses = 0
		inteiro idadeDias = 0
          inteiro diasTotal = 1

        escreva("Digite a quantidade de dias\n")
        leia (diasTotal)
        idadeAnos = (diasTotal / 365)
        diasTotal = (diasTotal % 365)
        idadeMeses = (diasTotal / 30)
        diasTotal = (diasTotal % 30)
        idadeDias = diasTotal
        escreva("\nA sua idade é "+idadeAnos)
        escreva("\nA quantidade de meses é " +idadeMeses)
        escreva("\nA quantidade de dias é " +idadeDias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 634; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */