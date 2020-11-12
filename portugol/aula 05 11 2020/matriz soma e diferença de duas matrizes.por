programa
{
	inclua biblioteca Util
	//3.  	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.

	funcao inicio()
	{
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]
		inteiro vlinha=0, vcoluna=0
		inteiro x=0, y=0
		

		escreva(" Primeira matriz: \n")
		para (x=0;x<4;x++)
		{
			para (y=0;y<6;y++)
			{
				N1[x][y] = Util.sorteia(1,9)
				escreva(N1[x][y])
				escreva(" ")
			}escreva("\n")
		}
		escreva("\n\n")
		escreva(" Segunda matriz: \n")
		para (x=0;x<4;x++)
		{
			para (y=0;y<6;y++)
			{
				N2[x][y] = Util.sorteia(1,9)
				escreva(N2[x][y])
				escreva(" ")
			}escreva("\n")
		}
		escreva("\n\n")
		escreva ("Matriz com a soma das matrizes 1 e 2: \n")
		para (x=0;x<4;x++)
		{
			para (y=0;y<6;y++)
			{
				M1[x][y] = N2[x][y] + N1[x][y]
				escreva(M1[x][y])
				escreva(" ")
			}escreva("\n")
		}
		escreva("\n\n")
		escreva ("Matriz com a diferença das matrizes 1 e 2: \n")
		para (x=0;x<4;x++)
		{
			para (y=0;y<6;y++)
			{
				M2[x][y] = N1[x][y] - N2[x][y]
				escreva(M2[x][y])
				escreva(" ")
			}escreva("\n")
		}
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */