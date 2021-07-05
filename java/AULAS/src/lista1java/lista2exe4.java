package lista1java;

import java.util.Scanner;


public class lista2exe4{

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade=0, pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, 
			pessoasNervosasMais40=0, pessoasCalmasMenos18=0, contador=1;
		final int limite = 2;
		char sexo;
		char opcoes, op='S';
		
		while(op == 'S' && contador <= limite){
			System.out.println("Participante "+contador);
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println("Digite");
			System.out.println("\n 1- feminino\n 2- masculino \n 3- outros: ");
			sexo = leia.next().charAt(0);
			System.out.println("Selecione ");
			System.out.println("1 - pessoa calma"+"\n"+"2 - pessoa nervosa"+"\n"+"3 - pessoa agressiva");
			opcoes = leia.next().charAt(0);
			
			if(opcoes == '1') {
				pessoasCalmas++;
				
			}
			if(sexo== '1' && opcoes == '2') {
				mulheresNervosas++;
			}
			if(sexo == '2' && opcoes == '3') {
				homensAgressivos++;
			}
			if(sexo == '3' && opcoes == '1') {
				outrosCalmos++; 
			}
			if(idade<18 && opcoes == '1') {
				pessoasCalmasMenos18++;
			}
			if(idade>40 && opcoes == '2') {
				pessoasNervosasMais40++;
			}
			
			System.out.println("Continua S/N: ");
			op = leia.next().toUpperCase().charAt(0);
			
			contador++;
		}
		System.out.println("pessoas calmas: "+pessoasCalmas);
		System.out.println("mulheres nervosas: "+mulheresNervosas);
		System.out.println("homens agressivos: "+homensAgressivos);
		System.out.println("Outros calmos: "+outrosCalmos);
		System.out.println("Calmos menores de 18: "+pessoasCalmasMenos18);
		System.out.println("Nervosos maiores de 40: "+pessoasNervosasMais40);
	}

}
