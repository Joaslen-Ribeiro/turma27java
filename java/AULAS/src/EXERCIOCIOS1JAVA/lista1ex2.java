package EXERCIOCIOS1JAVA;
   import java.util.Scanner;
public class lista1ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int dia, ano, mes, dias;
		
				
		 System.out.println("Qual a sua idade em dias: " );
		 dias = ler.nextInt();
		 
		 ano= dias/365;
		 mes =(dias%365)/30;
		 dia=(dias%30);
		 
		 System.out.println("Sua idade é " + ano + " anos " );
		 System.out.println(mes+ " meses " );
		 System.out.println(" e "+ dia + " dias " );
				 

	}

}
