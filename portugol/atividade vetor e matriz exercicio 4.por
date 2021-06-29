/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
 * ou seja, diagonal principal.

 * 
 */
programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{       inteiro Matriz[3][3]
	 	   inteiro somadosV=0
	 	   inteiro somaDiagonal=0
	 	   inteiro linha=0
	 	   inteiro coluna=0
	 	   para( linha =0; linha<3;linha++  ) {
	 	   	para( coluna=0;coluna<3;coluna++   ){  
	 	   		Matriz[linha][coluna]= Util.sorteia(1,3)
	 	   		somadosV+=Matriz[linha][coluna]
	 	   		
	 	   		
	}
	 	   	somaDiagonal+=Matriz[linha][linha]
 	}
	 	  escreva(somadosV)
	 	   		escreva("\n")
	 	   		escreva(somaDiagonal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 576; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {Matriz, 12, 17, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */