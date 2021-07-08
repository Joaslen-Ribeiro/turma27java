package EXERCIOCIOS1JAVA;
 import java.util.Scanner;
public class pedirinformacao {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int anoN1=0;
		int anoN2=0;
		int anoN3=0;		
		int idade1;
		int idade2;
		int idade3;
		String sexo1;
		String sexo2;
		String sexo3;
		String nome1;
		String nome2;
		String nome3;
		System.out.println(" OLA SEJA BEM VINDE ! ! !");
		
		  System.out.println("Poderia me informar seu nome: ");
		  nome1 =ler.next();
		  System.out.println("Poderia me informar seu nome: ");
		  nome2 =ler.next();
		  System.out.println("Poderia me informar seu nome: ");
		  nome3 =ler.next();
		  System.out.println("Qual o ano de seu nascimento: ");
		  idade1= ler.nextInt();
		  System.out.println("Qual o ano de seu nascimento: ");
		  idade2= ler.nextInt();
		  System.out.println("Qual o ano de seu nascimento: ");
		  idade3= ler.nextInt();
		  System.out.println("Voce se conseidera do sexo masculino, feminino ou neutro: ");
		  sexo1=ler.next();
		  System.out.println("Voce se conseidera do sexo masculino, feminino ou neutro: ");
		  sexo2=ler.next();
		  System.out.println("Voce se conseidera do sexo masculino, feminino ou neutro: ");
		  sexo3=ler.next();
		  
		  anoN1=2021-idade1;
		  anoN2=2021-idade2;
		  anoN3=2021-idade3;
		  
		  System.out.println("Ola, "+nome1+" voce se considera no sexo "+sexo1+ " sua idade é "+anoN1+" anos. " );
		  System.out.println("Ola, "+nome2+" voce se considera no sexo "+sexo2+ " sua idade é "+anoN2+" anos. " );
		  System.out.println("Ola, "+nome3+" voce se considera no sexo "+sexo3+ " sua idade é "+anoN3+" anos. " );
	
		  if(anoN1>anoN2 && anoN1>anoN3) {
			  System.out.println("O "+ nome1+ " é o mais velho");}
		  if(anoN2>anoN1 && anoN2 >anoN3 ) {
			  System.out.println("O "+nome2+ " é o mais velho ");}
		  if(anoN3>anoN1 && anoN3>anoN2 ) {
			  System.out.println("O "+nome3+ " é o mais velho  " );
				} if(anoN1<anoN2 && anoN1<anoN3) {
					  System.out.println( nome1+ " é o mais novo");}
				  if(anoN2<anoN1 && anoN2 <anoN3 ) {
					  System.out.println(nome2+ " é o mais novo ");}
				  if(anoN3<anoN1 && anoN3<anoN2 ) {
					  System.out.println(nome3+ " é o mais novo " );
		  }}
			  	 
	
	}	


