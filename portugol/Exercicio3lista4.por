programa
{
	/*3.  	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
*/
	inclua biblioteca Util
	
	funcao inicio()
	{
		 inteiro n1 [x][y]
		 inteiro n2 [x][y]
		 inteiro m1 [x][y]
		 inteiro m2 [x][y]
		 inteiro x=0, y=0
		

		 para(x=0;x<4;x++){
		 	para(y=0;y<=6;y++){
		 		n1[x][y] = Util.sorteia(1, 9)
		 		leia(n1[x][y])
		 	}
		 }
		 
		 para(x=0;x<4;x++){
		 	para(y=0;y<=6;y++){
		 		n2[x][y] = Util.sorteia(1, 9)
		 		leia(n2[x][y])
		 	}
		 }
		 
			 para(x=0;x<4;x++){
			para(y=0;y<6;y++){
				m1[x][y] = n1[x][y] + n2[x][y]
				escreva(m1[x][y])
		 		
		 	}
		 	
		 }
		 
		 escreva(" A soma das matrizes N1 e N2 é: ",m1[x][y])
		 escreva(" A diferença entre as matrizes N1 e N2 é ")
		 }
		 
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 857; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */