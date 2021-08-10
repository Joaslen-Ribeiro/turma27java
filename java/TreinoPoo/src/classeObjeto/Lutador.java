package classeObjeto;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public void apresentar() {
		System.out.println("--------------------------------------------------");
		System.out.println("Chegou a hora!! A vez dele!!! "+this.getNome());
		System.out.println("Diretamente de "+ this.getNacionalidade()  );
		System.out.println("Com a idade de "+this.getIdade()+" a altura de "+this.getAltura());
		System.out.println("Pesando "+this.getPeso()+" Kg ");
		System.out.println(this.getVitorias() + " vitorias");
		System.out.println(this.getDerrotas() + " Derrotas ");
		System.out.println(this.getEmpates()+ " Empates ");
		
	} 
	public void status() {
		System.out.println(this.getNome()+" é um  "+this.getCategoria());
		System.out.println("Ganhou: "+this.getVitorias());
		System.out.println("Perdeu: "+this.getDerrotas());
		System.out.println("Empatou: "+this.getEmpates());
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
		//this.vitorias = this.vitorias + 1;  -- esse jeito tambe serve
 	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
			
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
		
	}
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
			int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(this.peso<52.2) {
			this.categoria=" Invalido ";
		}else if(this.peso<=70.3) {
			this.categoria=" Peso Leve ";
		}else if(this.peso<=83.9 ) {
			this.categoria=" Peso Médio ";
		}else if( this.peso<120.2) {
			this.categoria=" Peso Pesado ";
		}else { this.categoria=" Invalido ";
			
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}

}
