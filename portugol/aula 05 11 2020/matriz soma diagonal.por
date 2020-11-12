programa
{
	inclua biblioteca Util
	//4.  	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
	//		exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
	funcao inicio()
	{
		const inteiro TAMANHO = 3
		inteiro matriz[TAMANHO][TAMANHO]
		inteiro vlinha=0, vcoluna=0
		inteiro x=0, y=0
		inteiro somaDiagonal = 0
		
		para (x=0;x<TAMANHO;x++)
		{
			para (y=0;y<TAMANHO;y++)
			{
				matriz[x][y] = Util.sorteia(1,9)
				se (x == y)
				{
					somaDiagonal = somaDiagonal + matriz[x][y]
				}
			}
		}
		para (x=0;x<TAMANHO;x++)
		{
			para (y=0;y<TAMANHO;y++)
			{
				escreva(matriz[x][y])
			}
			escreva("\n")
		}
		escreva("\n Total da soma diagonal é ", somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 762; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */