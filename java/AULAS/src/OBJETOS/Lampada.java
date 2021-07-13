package OBJETOS;

public class Lampada {
	
	 private String tipo;
	 private double preco=0.0;
	 private String qualidade;
	 private String cor;
	 private int consumo=0;
	 private boolean ligado;
	 
	
	 public Lampada(String tipo, double preco, String qualidade, String cor, int consumo) {
		super();
		this.tipo = tipo;
		this.preco = preco;
		this.qualidade = qualidade;
		this.cor = cor;
		this.consumo = consumo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getQualidade() {
		return qualidade;
	}

	public void setQualidade(String qualidade) {
		this.qualidade = qualidade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	 
    public void ligar () {
    	ligado=true;
    System.out.println(" Lampada ligada ");
    }
    public void desligar() {
    	ligado=false;
    System.out.println(" Lampada desligada ");
    }
    

}
