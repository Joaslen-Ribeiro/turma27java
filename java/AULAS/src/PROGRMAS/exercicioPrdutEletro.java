package PROGRMAS;
import OrientacaoOBEJTO.produtoeletronico;
public class exercicioPrdutEletro {

	public static void main(String[] args) {
		
	produtoeletronico produtoeletronico1=new produtoeletronico();
	
	produtoeletronico1.modelo= "SOM TARAMPS ";
	produtoeletronico1.volume=0;
	produtoeletronico1.ligado=false;
	
      System.out.printf("\n%sO som no momento",produtoeletronico1.ligado);
	  System.out.printf("\nBEM VINDO A FESTA, NOSSO DJ VIRTUAL VAI COMEÇAR ! ! ! ");
	  produtoeletronico1.ligar();
	  System.out.printf("\n ligandoo..",produtoeletronico1.ligado);
	  //produtoeletronico1.aumentarvolume();
	  //produtoeletronico1.aumentarvolume();
	  produtoeletronico1.aumentarvolume(10);
	  
	  produtoeletronico1.radioligada();
	  System.out.printf("\nOla ouvintes da tr##**-*dmerica, ##33 xiiiiiiiiiii ",produtoeletronico1.radioFM);
	  produtoeletronico1.radiodesligada();
	  produtoeletronico1.ligarMp3();
	  System.out.println("\naguarde... ");
	  produtoeletronico1.mp3ligado();
	  System.out.println("\ne ela ta, ta movimentandooo, ta ta movimentando...  ");
	  
	}

}
