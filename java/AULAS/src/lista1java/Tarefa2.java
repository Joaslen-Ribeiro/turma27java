package lista1java;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int a,b,c;
		
		System.out.println("leia a: ");
		a= ler.nextInt();
		System.out.println("leia b: ");
		b= ler.nextInt();
		System.out.println("leia c: ");
		c= ler.nextInt();
		
		
		if(a==b && b==c) {
			System.out.printf("%d - %d - %d ",a,b,c);
			
		}
		else if(a>=b && b>=c) {
			System.out.printf("%d - %d - %d ",c,b,a);
     	}   
		else if(a>=b && a>=c && c>=b) {
			System.out.printf("%d - %d - %d ",b,c,a);
		}
		else if(b>=a && b>=c && c>=a) {
			System.out.printf("%d - %d - %d ",a,c,b);
	    }
	    
		
		}		
	


}
