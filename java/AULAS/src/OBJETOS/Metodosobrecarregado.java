package OBJETOS;

public class Metodosobrecarregado {
	
	public void testaMetodosSobrecarregados() {
		
		System.out.printf("Salario em numero inteiro: %d \n", salario(1000));
		System.out.printf("Salario em numero double: %f \n", salario(7.500));
	}
	
	public int salario(int valorInt) {
		System.out.printf("Salario com argumento inteiro: %d \n", valorInt);
		return valorInt*valorInt;
	}

	public double salario(double valorDouble) {
		System.out.printf("Salario com argumrnto double %f: \n", valorDouble);		
		return valorDouble*valorDouble;
	}
}
