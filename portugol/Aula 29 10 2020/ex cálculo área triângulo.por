programa
{
	
	funcao inicio()
	{
		inteiro B,A,Area
		escreva("Por favor, digite o valor da base do triângulo em metros: ")
		leia(B)
		escreva("Por favor, digite o valor da altura do triângulo em metros: ")
		leia(A)
		se((A>0) e (B>0))
		{
			Area=((B*A)/2)
			escreva ("A área deste triângulo é de ",Area,"m²")
		}
		senao
		{
			escreva("ERRO FATAL")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */