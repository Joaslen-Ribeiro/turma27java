package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testecad {
		public static void main(String[] args) {
			
	
	/*	Funcionario func1 = new Funcionario("001",40,10.00);
		Terceiro ter1 = new Terceiro("100",40,10.00,50.00);
		
		System.out.println(" Funcionario CLT");
		System.out.println("matricula: "+func1.getMatricula());
		System.out.println("Salario atual: "+func1.salario());
		

		System.out.println(" Funcionario Terceiro");
		System.out.println("matricula: "+ter1.getMatricula());
		System.out.println("Salario atual: "+ter1.salario());*/
		
		Scanner leia = new Scanner(System.in);
		
		List <Funcionario> lista = new ArrayList();
		
		System.out.println("Cadastro de Funcionarios");
		int numero= leia.nextInt();
		
		for(int x=1;x<=numero; x++ ) { 
		System.out.println("Funcionario: "+x );	
		System.out.println("Funcionario Terceiro S/N ?");
		char op= leia.next().toUpperCase().charAt(0);
		System.out.println();
		String matricula = leia.next();
		System.out.println(" Digite as horas trabalhadas :");
		int horasTrabalhadas = leia.nextInt();
		System.out.println("Digite o valor por horas trabalhada: ");
		double valorHora= leia.nextDouble();
		
		if(op == 'S') {
			System.out.println(" Digite o valor do adicional :");
			double adicional = leia.nextDouble();
			lista.add(new Terceiro(matricula,horasTrabalhadas,valorHora,adicional) );			
			
		}else if (op == 'N'){
			lista.add(new Funcionario(matricula,horasTrabalhadas,valorHora) );
		
		}
		
		
		}	
		System.out.println();
		System.out.println("Folha de Pàgamento");
		for(Funcionario emp: lista) {
			System.out.println("Matricula do colaborador : "+ emp.getMatricula()+"salario : "+emp.salario());
		}
		}
		
		

}
