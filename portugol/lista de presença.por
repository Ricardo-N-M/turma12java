programa
{
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	funcao inicio()
	{
		cadeia nome [29] = { "ANA VERONICA NASCIMENTO CRUZ" , "BRUNO ESTIVALLI VICENTE","BRUNO HENRIQUE MORAES SANTOS", "DANIEL FERREIRA", "DAYANE DE OLIVEIRA", "DENIS VINICIUS BOLLA DA SILVA", "DIEGO JOAQUIM SILVA", "ERICK ALAN","EVERSON SILVA", "GABRIEL HENRIQUE CABRAL SILVA" ,"GUILHERME ALEX" , "GUILHERME FIDELIS PEREIRA", "GUSTAVO MIQUEIAS LOPES SANTANA", "ISAC CORDEIRO DE OLIVEIRA", "IURI GARCIA NUNES", "JENIFER LIMA PLACIDO", "JESSICA CRISTIANE", "JOAO PEDRO SENA", "LARISSA MORAES RIBEIRO", "LEONARDO DE MORAES MAGALHAES", "LUCAS SANTOS GONSALVES", "MARIANA DE CASSIA ANTUNES OLIVEIRA", "PATRICIA DA SILVA MACHADO", "PAULA LETICIA", "RAUL FERNANDES", "RICARDO MAGALHAES RIBEIRO FINKELSTEIN", "THIAGO DOS ANJOS", "VITORIA GONÇALVES DE FREITAS", "WILLIAM XAVIER"}
		cadeia codigo [29] = {"G1-01","G1-02","G1-03","G1-04","G1-05","G1-06","G1-07","G1-08","G1-09","G1-10","G1-11","G1-12","G1-13","G1-14","G1-15","G1-16","G1-17","G1-18","G1-19","G1-20","G1-21","G1-22","G1-23","G1-24","G1-25","G1-26","G1-27","G1-28","G1-29"}
		cadeia mail [29] = { "anaveronica3001@hotmail.com", "bruno.estivalli@gmail.com","brunohmoraes93@gmail.com", "daniel.z.ferreira@hotmail.com" , "dayane873@gmail.com" , "denisvini@gmail.com" , "denisvini@gmail.com" , "erickalan068@gmail.com" , "eversonmessias@outlook.com" , "gabrieldgrafico@outlook.com" , "guilhermealex01@gmail.com" , "gui.fdsk@hotmail.com" , "gumiqueias@hotmail.com", "zaq.c@live.com","iurinunes01@gmail.com","jenifer.sdti@gmail.com","jessicacristianebtr@gmail.com","joao_usercon@hotmail.com","larissaribeiro03@hotmail.com","leo_o_nardo1@outlook.com","lucas.00.santos@outlook.com","mari_oli25@hotmail.com","pathsilva09@gmail.com","paula.leticia.braz@gmail.com","raulogus2@gmail.com","ricardomrfin@gmail.com","thiagohdosanjos99@gmail.com","vitoriagcf@hotmail.com","william.xavier07@hotmail.com"}
		caracter ENTREGA [29], continua
		inteiro  notas [29]
		logico masculino [29]= {falso, verdadeiro, verdadeiro, verdadeiro, falso, verdadeiro, verdadeiro, verdadeiro, verdadeiro, verdadeiro, verdadeiro, verdadeiro, verdadeiro, verdadeiro, verdadeiro, falso, falso, verdadeiro, falso, verdadeiro, verdadeiro, falso, falso, falso, verdadeiro, verdadeiro, verdadeiro, falso, verdadeiro}
		inteiro x=0
		                                                                                                                                                                                                                                                                                      
		// processo
		para (x=0; x<29; x++)
		{
			escreva(codigo[x],"\t",nome[x],"\t\t",mail[x])
			escreva("\n")
		}

		faca 
		{
			
			escreva ("\nVocê deseja continuar?[S] [N] ")
			leia (continua)
		} enquanto (continua != 'N')
		
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3576; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */