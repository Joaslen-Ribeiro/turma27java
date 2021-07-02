package introducao;

import java.util.Scanner;

public class classe {

	public static void main(String[] args) {
		
		Scanner ler =new Scanner(System.in);
		int a, b , soma;	
	
	System.out.println("entre com o valor de A: ");
	a = ler.nextInt();
	

	System.out.println("entre com o valor de B: ");
	b = ler.nextInt();
	soma = a+b;
	System.out.println("o valor de A + B é igual a: "+soma);
	}

}
