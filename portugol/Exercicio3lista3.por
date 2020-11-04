programa
{/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos 
	e apresente no final o total do somatório, a média e o total de valores lidos. 
	O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
	Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
	*/
	
	funcao inicio()
	{
		inteiro valor
		inteiro totalSoma
	     inteiro numero
	     real media

	     valor = 0
	     numero = 0
	     totalSoma = 0
	     media = 0

	     enquanto(valor>=0)
          {
	    	 	numero = numero+1
	    	 	totalSoma = totalSoma + valor
	    	 	media = totalSoma/numero
	    	 	escreva("INSIRA UM VALOR: ")
	    	 	leia(valor)
	    	 
	     }
	     escreva("O programa rodou ", numero, " vezes, tendo como soma total o valor de: ", totalSoma, " com a média de: ", media)
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