package introducao;

import java.util.Scanner;

public class Revolver38 extends Revolver{
	Scanner leia = new Scanner (System.in);
	    int municao1;
	    int calibre;
	    String usuario;
	    boolean recarregar;
	    String resAtirar;
		public Revolver38(String usuario, String modelo, int municao, int calibre, boolean atira, boolean recarregar,
				int municao1, int calibre2, String usuario2) {
			super(usuario, modelo, municao, calibre, atira, recarregar);
			this.municao1 = municao1;
			calibre = calibre2;
			usuario = usuario2;
		}
		
		public String getResAtirar() {
			return resAtirar;
		}

		public void setResAtirar(String resAtirar) {
			this.resAtirar = resAtirar;
		}

		public int getMunicao1() {
			return municao1;
		}
		public void setMunicao1(int municao1) {
			this.municao1 = municao1;
		}
		public int getCalibre() {
			return calibre;
		}
		public void setCalibre(int calibre) {
			this.calibre = calibre;
		}
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		@Override
		public void atirar(int municao) {
			this.recarregar=true;
			if (this.municao1>0 )
				System.out.println("Acerte o alvo... Boa sorte ! ! !");
			
		if(municao>this.getMunicao()) {
		System.out.println(" BANG BANG PAH CRACK...");
		}
		}
		@Override
	    public void recarregando(int valor ) {
	    	if(valor >0 && valor <=6 ) {
	    this.setMunicao(getMunicao()+valor);
	    	}else {System.out.println("Impossivel recarregar essa quantidade... ");
	    		     
	    	}
	    			
	    }
		@Override
	    public void puxarCao() {
	    	System.out.println("Puxando cao, cuidao pode disparar a qualquer momento... ");
	    }
	
		public void respostaAtirar(String res ) {
			
				System.out.println("Tome cuidado com a arma, pois esta municiada");
			}
			
			
			}
		
	
	
	
	
		
	


