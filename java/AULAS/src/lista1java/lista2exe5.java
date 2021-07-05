package lista1java;
  import java.util.Scanner;
public class lista2exe5 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int numero=0,soma=0;
		
		
		
		do {  
			
			System.out.println("digite um numero ");
			 numero = ler.nextInt();
			 
			 soma+=numero;			
					
			
		}while (numero!=0);  
		  System.out.println("a soma dos  numeros digitados é: "+ soma);
		
	}
}
