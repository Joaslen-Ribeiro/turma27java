package EXERCIOCIOS1JAVA;

import java.util.Scanner;

public class marrentoparimpar {

	public static void main(String[] args) {     //REFATORAR CODIGO
		Scanner leia=new Scanner(System.in);	 //DEIXAR CODIGO MENOR, COM MESMA FUN�AO
		
		int valor;
		System.out.println("digite o valor: ");
		 valor = leia.nextInt();
		System.out.println(((valor%2)==0)?"par":"impar");
		//LAMBDA
		/*
		if (   ) {  }
	}
     ()?"positivo":"negativo"
    		*/ 
}}
