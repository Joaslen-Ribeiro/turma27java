package lista1java;
  import java.util.Scanner;
public class lista2exe3 {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		
		int contador=0,cont=0, idad=0;
		
		
		while(idad<=99 && idad>=0  ) {
			 System.out.println("digite sua idade:  ");
		      idad= ler.nextInt();
	     
		
		 if(idad<21   ) {
	          contador++;
		         
		 }  if (idad>50 && idad<100) {
	        	cont++;
	        } }
	         System.out.println("Total de pessoas com menos de 21 anos: "+contador);
		
	         System.out.println("total de pessoas com mais de 50 anos: "+cont);	
	
	
	}
	
	}
	
	
