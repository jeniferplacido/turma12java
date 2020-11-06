programa
{
	/*2-  	O IMC – Índice de Massa Corporal é um critério da 
	 Organização Mundial de Saúde para dar uma indicação sobre a 
	 condição de peso de uma pessoa adulta. 
	 A fórmula é IMC = peso / ( altura )2
Elabore um programa que leia o peso e a altura 
de um adulto e mostre sua condição de acordo com a tabela abaixo.
IMC em adultos Condição
Abaixo de 18,5 Abaixo do peso
Entre 18,5 e 25 Peso normal
Entre 25 e 30 Acima do peso
Acima de 30 obeso*/

	funcao inicio()
	{
		real p, a, imc
		cadeia msg
		escreva("Calcule o seu IMC\n")
		escreva("Informe o seu peso (kg): ")
		leia(p)
		escreva("Informe a sua altura (m): ")
		leia(a)
		imc= (a*a)/p
		escreva("Seu IMC é : ",imc)

		se (imc < 18.5)
		{ escreva("Você está abaixo do peso")
	} se (imc >= 18.5 e imc < 25)
	{escreva("Você está com o peso ideal")
} se (imc >= 25 e imc < 30)
{	escreva("Você está acima do peso")
} se (imc >30)
	escreva("Você está obeso")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 655; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */