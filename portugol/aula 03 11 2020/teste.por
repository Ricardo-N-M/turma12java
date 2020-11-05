programa
{
	//Somar todos os números ímpares que são múltiplos de 3 e que se encontram entre 1 e 500
	
	funcao inicio()
	{
		inteiro x=1, multiploTotal = 0

		para (x=3; x<=500;x++)
		{
			se ((x%3) ==0 e (x%2 )==1)
			{
				multiploTotal = multiploTotal + x
			}
			
		}
	escreva(multiploTotal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 134; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {multiploTotal, 7, 15, 13}-{x, 7, 10, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */