programa
{
	//Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
	//Infantil A = 5 a 7 anos
	//Infantil B = 8 a 11 anos
	//Juvenil A = 12 a 13 anos
	//Juvenil B = 14 a 17 anos
	//Adultos = Maiores de 18 anos

	funcao inicio()
	{
		inteiro idade
		escreva("Olá, quantos anos você tem?\n (1) 5 a 7\n (2) 8 a 11\n (3) 12 a 13\n (4) 14 a 17\n (5) 18 ou mais\n")
		leia(idade)
		limpa()
		escolha (idade)
		{
			caso 1:
			escreva ("Você está na categoria Infantil A")
			pare
			caso 2:
			escreva ("Você está na categoria Infantil B")
			pare
			caso 3:
			escreva ("Você está na categoria Juvenil A")
			pare
			caso 4:
			escreva ("Você está na categoria Juvenil B")
			pare
			caso 5:
			escreva ("Você está na categoria Adulto")
			pare
			caso contrario:
			escreva("Sai daqui, você vai se afogar menine")
			pare
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 427; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */