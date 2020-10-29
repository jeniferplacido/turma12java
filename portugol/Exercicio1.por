//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
// meses e dias e mostre-a expressa apenas em dias.

programa
{
	
	funcao inicio()
	{
		
real:dia, mes, mesDias, ano, anoDias, idade, idadeDias

  escreva ("Insira DIA de nascimento\n")
  leia (dia)
  escreva ("Insira MÊS de nascimento\n")
  leia (mes)
  escreva ("Insira ANO de nascimento\n")
  leia (ano)
  
  idade = (2020 - ano)
  mesDias= (mes * 30)
  anoDias = (idade * 365)
  idadeDias= (dia + mes + anoDias)
  escreva("---------------\n")
  escreva ("Sua idade em dias é:", idadeDias, " dias")    

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 577; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */