programa
{
	
	funcao inicio()
	{
		cadeia nomes[29] = {"Ana Veronica", "Bruno Estivalli", "Bruno Henrique", "Daniel Ferreira",
"Dayane Oliveira", "Denis Vinicius", "Diego Joaquim ", "Erick Alan",
"Everson Silva", "Gabriel Enrique", "Guilherme Alex", "Guilherme F.",
"Gustavo M.", "Isac Cordeiro", "Iuri Garcia", "Jenifer Lima",
"Jéssica C.", "Joao Pedro Sena", "Larissa Moraes ", "Leonardo M. ", "Lucas Santos",
"Mariana  C.", "Patricia S.", "Paula Leticia", "Raul Fernandes",
"RICARDO M.", "Thiago A.", "Vitória G.", "William Xavier"}
		cadeia emails[29] = {"anaveronica3001@hotmail.com", "bruno.estivalli@gmail.com", "brunohmoraes93@gmail.com", "daniel.z.ferreira@hotmail.com", "dayane873@gmail.com", "denisvini@gmail.com", "joaquim.diego8@gmail.com", "erickalan068@gmail.com", "eversonmessias@outlook.com", "gabrieldgrafico@outlook.com", "guilhermealex01@gmail.com", "gui.fdsk@hotmail.com", "gumiqueias@hotmail.com", "zaq.c@live.com", "iurinunes01@gmail.com", "jenifer.sdti@gmail.com", "jessicacristianebtr@gmail.com", "joao_usercon@hotmail.com", "larissaribeiro03@hotmail.com", "leo_o_nardo1@outlook.com", "lucas.00.santos@outlook.com", "mari_oli25@hotmail.com", "pathsilva09@gmail.com", "paula.leticia.braz@gmail.com", "raulogus2@gmail.com", "ricardomrfin@gmail.com", "thiagohdosanjos99@gmail.com", "vitoriagcf@hotmail.com", "william.xavier07@hotmail.com"}
		caracter entrega[29]
		inteiro notas[29]
		logico feminina[29]
		cadeia codigos[29]
		logico loop = verdadeiro
		inteiro contador = 0
		caracter resposta
		cadeia leCodigo
		caracter respostaGenero
		
		enquanto(loop) {
			escreva("CÓDIGO\t\tNOME\t\t\tNOTA\t\tEMAIL\t\t\n")
			
			enquanto(loop) {
				codigos[contador] = "G6-" + (contador + 1)
				escreva(codigos[contador], "\t\t", nomes[contador], "\t\t ", notas[contador],"\t\t", emails[contador], "\n")
				contador++
				se (contador == 29) {
					loop = falso
				}
			}
			escreva("Digite um código do aluno para consulta, OU digite 'S' para sair: ")
			leia(leCodigo)
			
			inteiro verificadorIndice = 0
			logico continua = verdadeiro
			
			enquanto(verdadeiro) {
				se (leCodigo == "S" ou leCodigo == "s") {
					continua = falso
					pare
				}
				senao se (leCodigo == codigos[verificadorIndice]) {
					escreva("Você é uma mulher? [S/N] ")
					leia(respostaGenero)
					se (respostaGenero == 'S' ou respostaGenero == 's') {
						feminina[verificadorIndice] = verdadeiro
						pare
						
					} senao se (respostaGenero == 'N' ou respostaGenero == 'n') {
						feminina[verificadorIndice] = falso
						pare
					} senao {
						escreva("Resposta inválida. Responda somente com sim ou não!")
					}
				} senao se (verificadorIndice < 28){
					verificadorIndice++
				} senao {
					escreva("Digite um código válido. \n")
					continua = falso
					pare
				}
			}
			caracter respostaNota
			se(continua) {
				se (feminina[verificadorIndice]) {
					escreva("Olá aluna ", nomes[verificadorIndice], ", houve a entrega do trabalho? [S/N] ")
					leia(respostaNota)
					se (respostaNota == 'S' ou respostaNota == 's') {
						escreva("1 ponto adicionado, Parabéns!")
						notas[verificadorIndice]++
					} senao se (respostaNota == 'n' ou respostaNota == 'N') {
						escreva("Atividade pendente.")
						
					}senao {
						escreva("Digite apenas com Sim ou Não.")
					}
				} se(nao feminina[verificadorIndice]) {
					escreva("Olá aluno ", nomes[verificadorIndice], ", houve a entrega do trabalho? [S/N] ")
					leia(respostaNota)
					se (respostaNota == 'S' ou respostaNota == 's') {
						escreva("1 ponto adicionado, Parabéns!")
						notas[verificadorIndice]++
					} senao se (respostaNota == 'n' ou respostaNota == 'N') {
						escreva("Atividade pendente.")
						
					}senao {
						escreva("Digite apenas com Sim ou Não.")
					}
				}
			}
			
			escreva("Deseja continuar? [S/N] ")
			leia(resposta)
			se (resposta == 'S' ou resposta == 's') {
				loop = verdadeiro
				contador = 0
			} senao se (resposta == 'N' ou resposta == 'n') {
				pare
			}
				
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4018; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */