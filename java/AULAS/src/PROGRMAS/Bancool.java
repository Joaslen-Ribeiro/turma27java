package PROGRMAS;

import OrientacaoOBEJTO.Conta;

public class Bancool {

	public static void main(String[] args) {
		Conta cliente1 = new Conta(221);  //instanciar
		Conta clienteVip= new Conta(1000,55.55);
		Conta clienteEspecial=new Conta(3);
		Conta cliJaque = new Conta(45,1955.45,2000.00);
		
	//cliente1.setNumero(888);
	System.out.println("numero da conta "+cliente1.getNumero());
	
	
	cliJaque.imprimeExtrato();
	clienteVip.imprimeExtrato();
	
	
	cliJaque.saca(1000.33);
	cliJaque.imprimeExtrato();
	clienteEspecial.depositar(5000.55);
	clienteEspecial.imprimeExtrato();
		 
		
		
	}

}
