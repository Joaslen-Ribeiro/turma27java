package entities;

public class Revista extends Produto {

	private String editora;

	public Revista(String nome, String codigo, double valorUnitario, int estoque, String editora) {
		super(nome, codigo, valorUnitario, estoque);
		this.editora = editora;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	

	
	
	
}
