package PROGRMAS;

import OrientacaoOBEJTO.Aviao;

public class exerciocioAviao {

	public static void main(String[] args) {
		
       Aviao aviao1= new Aviao();  //instanciar
       
       aviao1.modelo= "BIMOTOR";
       aviao1.rodas=3;
       aviao1.tipo="PASSAGEIRO 14 LUGARES";
       aviao1.noAr=false;
       aviao1.ligado=false;
       aviao1.velocidade=0;
       
       
       // vamos colocar o aviao pra voar...
       System.out.println("\n SITUAÇAO DO AVIAO...");
       System.out.println("velocimetro atual: "+ aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
       System.out.println("\n VAMOS PRA PISTA ");
       aviao1.ligar();
       aviao1.aumentarvelocidade();
       aviao1.aumentarvelocidade();
       aviao1.aumentarvelocidade();
       aviao1.diminuirVelocidade();
       aviao1.diminuirVelocidade();
       aviao1.diminuirVelocidade();
       aviao1.decolando();
       aviao1.aumentarvelocidade(40);
       System.out.println("velocimetro atual: "+ aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
       aviao1.diminuirVelocidade(40);
       System.out.println("velocimetro atual: "+ aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
       aviao1.pousar();
       System.out.println("velocimetro atual: "+ aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);    
       aviao1.desliga();
       System.out.println("velocimetro atual: "+ aviao1.velocidade+" NO AR "+aviao1.noAr+" LIGADO "+aviao1.ligado);
       
	}

}
