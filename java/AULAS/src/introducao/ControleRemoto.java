package introducao;

public class ControleRemoto implements Controlador {
	//atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//metodos especiais
	public ControleRemoto() {
		super();
		this.volume=50;
		this.tocando=false;
		this.ligado=false;
	
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	//metodos abstratos

	@Override
	public void ligar() {
		this.setLigado(true);
		
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("Esta ligado? "+this.getLigado());
		System.out.println("Esta tocando? "+this.getTocando());
		System.out.print("volume: "+this.getVolume());
		for(int i=0;i<=this.volume;i+=10  ) {
			System.out.println("/");
		}
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu... ");
		
	}

	@Override
	public void maisVolume() {
		if(this.getLigado()==true){
			this.setVolume(this.getVolume()+5);
		}
		
	}

	@Override
	public void menosVolume() {
		if(this.getLigado()==false) {
			this.setVolume(this.getVolume()-5);
		}
		
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado()==true && this.getVolume()>0) {
			this.setVolume(0);
		}
		
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado()==true && this.getVolume()==0 ) {
			this.setVolume(50);
		}
		
	}

	@Override
	public void play() {
	    if(this.getLigado()==true && this.getTocando()==false) {
	    	this.setLigado(true);
	    }
		
	}

	@Override
	public void pause() {
		if(this.getLigado()==true && this.getTocando()==true ) {
		  this.setTocando(false);
	     }
	}
	
}
