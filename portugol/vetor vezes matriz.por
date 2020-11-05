programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro vetor[3]
		inteiro matriz[3][3]
		inteiro tamanhoVetor = 0, linha = 0, coluna = 0
		inteiro matrizMult[3][3]

		escreva("Vetor: \n")
		para (tamanhoVetor = 0; tamanhoVetor<3; tamanhoVetor++)
		{
			vetor[tamanhoVetor] = Util.sorteia(1, 9) //vetor carregado
			escreva(" ", vetor[tamanhoVetor])
		}
		escreva("\n Matriz: \n")
		para (linha = 0; linha <3; linha++)
		{
			para (coluna = 0; coluna < 3; coluna++)
			{
				matriz [linha][coluna] = Util.sorteia(1,9)
				escreva(matriz[linha][coluna]," ")
			}
			escreva("\n")
		}
		escreva("Resultado da multiplicação: \n")
		para (linha = 0; linha <3; linha++)
		{
			para (coluna = 0; coluna < 3; coluna++)
			{
				escreva(vetor[coluna]*matriz[linha][coluna]," ")
			}
			escreva("\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 719; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */