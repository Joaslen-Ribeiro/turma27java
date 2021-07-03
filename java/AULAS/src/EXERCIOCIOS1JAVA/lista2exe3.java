/* Desenvolva um sistema em que:
Leia 4 (quatro) números;Calcule o quadrado de cada um;Se o valor resultante do quadrado do 
terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/
package EXERCIOCIOS1JAVA;
        import java.util.Scanner;
public class lista2exe3 {
           
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int n1,n2,n3,n4,  nq1, nq2 , nq3 , nq4;
		System.out.println(" digite um numero ");
		n1 = ler.nextInt();
		System.out.println(" digite um numero ");
		n2 = ler.nextInt();
		System.out.println(" digite um numero ");
		n3 = ler.nextInt();
		System.out.println(" digite um numero ");
		n4 = ler.nextInt();
		nq1=n1*n1;
		nq2=n2*n2;
		nq3=n3*n3;
		nq4=n4*n4;
	
		 if (nq3>=1000 ) {
			  System.out.println("o valor de "+ n3+" * "+n3+ " = "+nq3);
			  
		 }  if(nq3<=1000  ) {    
			       System.out.println(n1+ " * "+n1+" = "+nq1 );
		 		   System.out.println(n2+ " * "+n2+" = "+nq2 );
		           System.out.println(n3+ " * "+n3+" = "+nq3 );
				   System.out.println(n4+ " * "+n4+" = "+nq4 );
		 }
		 }
	

}
