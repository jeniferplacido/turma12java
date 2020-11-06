programa
{
	inclua biblioteca Matematica-->mat
	/*
	 * 	 4 - Faça um programa que calcula e escreve a seguinte soma: 
	 * 	 soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
	 */
	funcao inicio()
	{
		
		real z=0.0,soma=0.0,y=0.0,x=0.0
	
		para(x=0.0;x<99.0;x++){	
			
			y=y++
			x=x+1
			z=x/y
			escreva(x,"/",y,"= ",mat.arredondar(z,2),"\n")	
		}		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */