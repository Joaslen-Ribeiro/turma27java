package OrientacaoOBEJTO;

public class Aviao {
	//atributos
	public int rodas;
	public String modelo;
	public String tipo;
	public boolean noAr;
	public int velocidade;
	public boolean ligado;
	
	public void ligar() {
		ligado=true;
	}
	public void desliga() {
		ligado=false;
	}
	public void decolando() {
	for(int x=1;x<=10;x++) {
		aumentarvelocidade();}
	
	noAr=true;
	}
	public void pousar() {
		for(int x=1;x<=10;x++) {
		diminuirVelocidade();
		}
			noAr=false;
	}
	public void aumentarvelocidade() {
	velocidade++;	
	}
	public void aumentarvelocidade(int acrescimo) {
		velocidade=velocidade+acrescimo;	
		}
	public void diminuirVelocidade() {
		velocidade--;
	}
	public void diminuirVelocidade(int decrescimo) {
		velocidade-=decrescimo;
	}
}
