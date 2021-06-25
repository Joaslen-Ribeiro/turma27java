programa
{
	/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um 
	 * operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 
	 * 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
	 * A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o 
	 * salário excedente.
	 * 
	 */
	funcao inicio()
	{ inteiro codf ,horastr ,salario , salarioex, horaex
		escreva ("digite seu codigo na empresa")
		leia(codf)
		escreva("quantas horas voce trbalhou")
		leia(horastr)

		se(horastr<=50){
		salario=horastr*10
			}
	     senao { 
	     salario=50*10	
	     horaex=horastr-50
	     salario=salario+(horaex*20)
	     
	
		
		}escreva("seu salario desse mes é"+salario)
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 799; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */