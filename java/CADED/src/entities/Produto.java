package entities;

public abstract class Produto {
		
	 	private String nome;
		private String codigo;
		private double valorUnitario;
		private int estoque;
		public Produto(String nome, String codigo, double valorUnitario, int estoque) {
			super();
			this.nome = nome;
			this.codigo = codigo;
			this.valorUnitario = valorUnitario;
			this.estoque = estoque;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public double getValorUnitario() {
			return valorUnitario;
		}
		public void setValorUnitario(double valorUnitario) {
			this.valorUnitario = valorUnitario;
		}
		public int getEstoque() {
			return estoque;
		}
		public void setEstoque(int estoque) {
			this.estoque = estoque;
		}
		 public void colocarEstoque(int valorIncluir) {
			 
			 estoque=estoque + valorIncluir;
			 
		 }
		
		public void tirarEsqtoque(int valorTirar ) {
			
			estoque-=valorTirar;
			
		} 
		 
		 
		 
		 
		 
		

}
