programa
{
	
	funcao inicio()
	{
		real P, E, M
		
		escreva("Digite o peso dos tomates: ")
		leia(P)

		E = (P-50)
		M = (E*4)

		se (P <=50 e P >0)
          {
           	escreva("\nO peso é de ",P, "havera multa no valor de: 0")
          }
          senao se (P==0)
          {
          	escreva("O peso de hoje foi", P)
          }
          senao 
          {
          	escreva("O peso foi de", P, "teve o excesso de:", E, "\no valor da multa é:",M)
          }
          
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 470; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */