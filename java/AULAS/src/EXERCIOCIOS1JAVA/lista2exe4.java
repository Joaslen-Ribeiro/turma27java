package EXERCIOCIOS1JAVA;

import java.util.Scanner;

public class lista2exe4 {
   
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int numero;
		System.out.println("digite um numero inteiro ");
		numero = ler.nextInt();
		
		if (numero<0 && numero%2==-1 ) {
			System.out.println(" O numero "+numero +" é negativo e impar ");
			
		}else if (numero>0 && numero%2==1 ) {  
			 System.out.println("O numero "+numero+" é positivo e impar ");
		}else if (numero >0 && numero%2==0  ) {
			System.out.println("O numero "+numero+" é positivo e par ");			
		}else if (numero<0 && numero%2==0) {
			System.out.println("O numero "+numero+" é negativo e par ");
		}else if(numero==0 ) {
			System.out.println(" Zero é Neutro");
		}
		

	}

}
