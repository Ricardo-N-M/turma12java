programa
{
	inclua biblioteca Util
	//Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes 
	//intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um número negativo.

	funcao inicio()
	{
		inteiro S1 = 0,S2 = 0 ,S3 = 0 ,S4 = 0 
		inteiro N = 0

		faca 
		{
			escreva("Escreva N: ")
			leia(N)
			se (N>=0 e N<=25)
			{
				S1++
			}
			senao se (N>=26 e N<=50)
			{
				S2++
			}
			senao se (N>=51 e N<=75)
			{
				S3++
			}
			senao se (N>=76 e N<=100)
			{
				S4++
			}
		} enquanto (N > 0)
		escreva("\n A soma de valores entre 0 e 25 é ", S1, ", a soma de valores entre 26 e 50 é ", S2, ", a soma de valores entre 51 e 75 é ",S3,", e a soma de valores entre 76 e 100 é ",S4)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 386; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */