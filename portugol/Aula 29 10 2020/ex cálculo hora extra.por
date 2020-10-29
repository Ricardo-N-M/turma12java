programa
{
	
	funcao inicio()
	{
		//N= NÚMERO DE HORAS TRABALHADAS
		//E= HORAS TRABALHADAS ACIMA DE 50, OU SEJA EM EXCESSO
		//C= SALÁRIO EXCEDENTE
		//S= SALÁRIO TOTAL
		inteiro C, N, E, S
		escreva("Olá, quantas horas você trabalhou? ")
		leia(N)
		se (N>50)
		{
			E=N-50
			C=(E*20) 
			S=(C+500)
			escreva("Você trabalhou ",E," horas excedentes, o que lhe conferiu um salário de R$",S,",00 reais, sendo R$",C,",00 reais o valor em horas extras. Obrigado pelo seu esforço.")
			
		}
		senao
		{
			S=(N*10)
			escreva("O seu salário esse mês foi de R$",S,",00 reais.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 289; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */