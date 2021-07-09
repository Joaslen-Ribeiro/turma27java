package OBJETOS;

public class Funcionarioo extends Pessoa1 {

	private String departamento;
	
	public Funcionarioo(String nome, int matricula, String departamento) {
		
		super(nome,matricula);
		this.departamento=departamento;
		
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	

}
