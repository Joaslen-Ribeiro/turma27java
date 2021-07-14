package entities;

public class Salgadinho extends Produto {
	
	   private String marca;

	public Salgadinho(String nome, String codigo, double valorUnitario, int estoque, String marca) {
		super(nome, codigo, valorUnitario, estoque);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	   
	   
	

}
