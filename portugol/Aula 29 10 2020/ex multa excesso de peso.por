programa
{
	
	funcao inicio()
	{
		inteiro Peso,Excesso,Multa
		escreva("Digite o peso dos tomates: ")
		leia(Peso)
		se (Peso > 50)
		{
			Excesso=Peso-50
			Multa=Excesso*4
			escreva("O peso excedente foi de ",Excesso," quilos e a multa foi de R$ ",Multa,",00 reais")
		}
		senao
		{
			escreva("EXCEDENTE ZERO, MULTA R$0,00")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 100; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */