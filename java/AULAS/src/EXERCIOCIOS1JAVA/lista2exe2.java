/*Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas trabalhadas de um 
 * oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. Quando o n�mero de horas exceder a 
 * 50 calcule o excesso de pagamento armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. 
* A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o 
 * * sal�rio excedente.  */
package EXERCIOCIOS1JAVA;
      import java.util.Scanner;
public class lista2exe2 {

	public static void main(String[] args) {
		 Scanner ler=new Scanner(System.in);
         
		 int codf, horastr=0, salario=0, salarioex=0, horaex=0, total=0;
		 
		   System.out.println("Digite seu codigo: ");
		   codf = ler.nextInt();
		   System.out.println("Quantas horas voce trabalhou: " );
		   horastr = ler.nextInt();
		   
		     if (horastr<50  ) {
		    	 salario=horastr*10;
		    	    
		     }    else {
		    	 salario=50*10;
		    	 horaex=horastr-50;		    	 
		    	 salarioex=horaex*20;
		    	 total=salarioex+salario;
		     }
		     
		    	 System.out.println("\nseu salario no mes �: "+salario);
		    	 System.out.println("\no salario extra �: "+salarioex);
		    	 System.out.println("\ne o total �: "+total);
		    	 
		    	 
		    	 
		    	 
		    	 
		     }
		   
		   
           		 
	

}
