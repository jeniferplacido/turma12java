programa
{
	//4) Faça um sistema que leia um número inteiro e mostre uma mensagem 
	//indicando se este número é par ou ímpar, e se é positivo ou negativo.

	
	funcao inicio()
	{
		
		inteiro numero

		escreva("Digite um número inteiro [positivo ou negativo]:")
		leia(numero)
				
		se (numero <0){
			escreva("\nO número digitado é negativo")
		}
		senao se (numero > 0){
			se ((numero % 2)==0){
			escreva("\nO número positivo e par!")
			}
			senao {
				escreva("\nO número digitado é positivo e impar!!")
			}
			
		}
		senao
		{
			escreva("\nVocê digitou o zero que é neutro")
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 490; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */