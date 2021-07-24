package introducao;

abstract public class Revolver {
	private String usuario;
	private String modelo;
	private int municao=0;
	private int calibre=0;
	private boolean atira;
	private boolean recarregar;
	

	public Revolver(String usuario, String modelo, int municao, int calibre, boolean atira, boolean recarregar) {
		super();
		this.usuario = usuario;
		this.modelo = modelo;
		this.municao = municao;
		this.calibre = calibre;
		this.atira = atira;
		this.recarregar = recarregar;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getMunicao() {
		return municao;
	}
	public void setMunicao(int municao) {
		this.municao = municao;
	}
	public boolean isAtira() {
		return atira;
	}
	public int getCalibre() {
		return calibre;
	}
	public void setCalibre(int calibre) {
		this.calibre = calibre;
	}
	public void setAtira(boolean atira) {
		this.atira = atira;
	}
	public boolean isRecarregar() {
		return recarregar;
	}
	public void setRecarregar(boolean recarregar) {
		this.recarregar = recarregar;
	}
	public void atirar(int municao) {
		this.recarregar=true;
	if(municao>this.getMunicao()) {
	System.out.println(" BANG BANG PAH CRACK...");
	}
	}
    public void recarregando(int valor ) {
    	if(valor >0 && valor <6 ) {
    this.setMunicao(getMunicao()+valor);
    	}else {System.out.println("Impossivel recarregar essa quantidade... "); }
    }
    public void puxarCao() {
    	System.out.println("Puxando cao, cuidao pode disparar a qualquer momento... ");
    }
}
