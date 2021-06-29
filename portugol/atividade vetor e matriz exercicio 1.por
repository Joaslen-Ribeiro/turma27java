
/*
 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma 
 * atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. 

 */programa
{
	
	funcao inicio()
	{inteiro valorP[5],numeP=0
	
	
	inteiro maiorP=0 
	para (inteiro x=0; x<5; x++   )  {

		escreva("digite um sua pontuaçao ",(x+1), ":")
			leia(numeP)
		     se(numeP >maiorP   ) 
		     limpa()
		    	
		    	maiorP=numeP 
		    	escreva("\n maior nota é: "+ maiorP)
			

}
}
		    
			
			
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 485; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */