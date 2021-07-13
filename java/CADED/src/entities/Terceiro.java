package entities;

public class Terceiro extends Funcionario {
	
	private double adicional;
	
	public Terceiro() {
		
	}
		
	

	public Terceiro(String matricula, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}

	public Terceiro(String matricula, double adicional) {
		super(matricula);
		this.adicional = adicional;
	}



	public Terceiro(double adicional) {
		super();
		this.adicional = adicional;
	}
	@Override
	
	public double salario() {
		//double valorSalario;   "� a mesma coisa"
		//valorSalario = this.horasTrabalhadas*this.valorHora;
		return (super.getHorasTrabalhadas()* super.getValorHora())+adicional;
		
	}
	
	
	
	

}
