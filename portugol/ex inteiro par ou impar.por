programa
{
	
	funcao inicio()
	{
		inteiro n
		escreva("Diga um número: ")
		leia(n)
		se (n<0)
		{
			escreva("O número requisitado é negativo")
		}
		senao se (n>0) 
		{
			se ((n%2)==0)
			{
				escreva("O número digitado é positivo e par")
			}
			senao
			{
				escreva("O número digitado é positivo e ímpar")
			}
		}
		senao
		{
			escreva("Você digitou 0, espertinho")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 376; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */