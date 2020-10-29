programa
{
	
	funcao inicio()
	{
		inteiro temposeg, horas
		inteiro minutos, segundos
		escreva("Tempo do evento em segundos: ")
		leia(temposeg)
		horas=temposeg/3600
		minutos=(temposeg%3600)/60
		segundos=((temposeg%3600)%60)
		escreva("O evento durou ",horas," horas, ",minutos," minutos e ",segundos," segundos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */