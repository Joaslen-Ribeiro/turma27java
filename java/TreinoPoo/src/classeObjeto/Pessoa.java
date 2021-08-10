package classeObjeto;

public class Pessoa {
	//atributos - caracteristicas-tipo Variaveis
public	 String genero;
public	 String nome;
public	 int idade;
public	 String cpf;
	public Pessoa(String genero, String nome, int idade, String cpf) {
		super();
		this.genero = genero;
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	public void darBomdia() {
		System.out.println("Bom Dia, "+this.nome);
		
	}
	 
	
	 }
	 
	 
	
	
	


