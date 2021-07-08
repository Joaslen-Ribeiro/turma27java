package OrientacaoOBEJTO;

public class produtoeletronico {
	public boolean ligado;
	public int volume=0;
	public boolean mp3;
	public boolean desligado;
	public boolean radioFM;
	public String  modelo;
	
	public void ligar() {
		ligado=true;
	}
	public void desligado() {
		ligado=false;
	}public void aumentarvolume() {
		volume++;	
	}
	public void aumentarvolume(int acrescimo) {
		
		volume=volume+acrescimo;	
		System.out.println("\nvolume: "+volume);
	}
	public void radioligada() {
		radioFM=true;
		
		
		System.out.println("Radio FM: ON");
		
		mp3=false;
	}public void radiodesligada() {
		radioFM=false;
		
		System.out.println("\nRadio FM: OFF ");
		
	}
	
	public void ligarMp3() {
		mp3=true;
		for(int x=1;x<5;x++) {
		aumentarvolume();}
		
	}
	public void mp3ligado() {
		mp3=true;
		for(int x=1;x<5;x++) {
			aumentarvolume();}
	        radioFM=false; 
	        System.out.println("Mp3 ON ");}
	
	
  	public void diminuirvolume() {
  		volume--;
}}
