package introducao;

import java.util.Scanner;

public class maioresdeidade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade=0;
		int x=0;
		
		for  (x=1; x<=10;x++ )    {
			
		System.out.println(" Qual seu nome: ");
		nome=leia.next();
		System.out.println("Qual sua idade: ");
		idade=leia.nextInt();
		
		if(idade>=18 ) {
			System.out.println(nome+ " Voce é maior de idade ");
			System.out.println(" ");
		}else {
		    System.out.println(nome+" Voce é menor de idade " );
		    System.out.println(" ");
		 } 				
	   }
	 }

  }
