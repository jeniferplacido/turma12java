programa
{
	/*/1-  	Elabore um programa que calcule o que deve ser 
	 * pago por um produto, considerando o preço normal de etiqueta 
	 * e a escolha da condição de pagamento. Utilize os códigos 
	 * da tabela a seguir para ler qual a condição de pagamento 
	 * escolhida e efetuar o cálculo adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 20% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em três vezes, preço normal de etiqueta mais juros de 10%*/

	funcao inicio()
	{
		real valor, valortotal

       inteiro pag
	
    escreva(" Digite o valor do produto :")
       leia (valor)      	

       escreva (" ")
       escreva("Digite a forma de pagamento")
       escreva("\n1. À Vista em dinheiro ou cheque.")
       escreva("\n2. À Vista no cartão de crédito.")
       escreva("\n3. Em 2x sem juros")
       escreva("\n4. Em 3x com 10% de juros.\n")
       leia(pag)

       se (pag == 1)
       { escreva("Pagamento á vista: R$", (valor-(valor*20/100)))
       }
       senao se (pag == 2)
       { escreva("Pagamento á vista no cartão de crédito: R$", (valor-(valor*15/100)))
       }
       se (pag == 3)
       { escreva("Pagamento em 2x sem juros: R$:", valor)
       }
       senao se (pag == 4)
       { escreva("Pagamento em 3x com juros: R$",(valor+(valor*10/100)))
       }



	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 955; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */