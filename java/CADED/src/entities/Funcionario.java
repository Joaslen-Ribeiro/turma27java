package entities;

public class Funcionario {
	
	  private String matricula;
	  private int horasTrabalhadas;
	  private double valorHora;
   
	  public Funcionario(String matricula, int horasTrabalhadas, double valorHora) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	} 
	  public Funcionario() {
		  
	  }
	  
	  // sobrecarga de construtor
	public Funcionario(String matricula) {
		super();
		this.matricula = matricula;
	}


	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	 
	public double salario() {
		//double valorSalario;   "? a mesma coisa"
		//valorSalario = this.horasTrabalhadas*this.valorHora;
		return (this.horasTrabalhadas* this.valorHora);
		
	}
	
	
	
	
	
	
	
	
	
	
	  



}
