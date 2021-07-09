package entidades;

public class Conta {
	//atributos
	private int numero;
	private String nomeCliente;
	private double saldo;
	
	
	//construtor
	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}

	//encapsulamento - getter and setters
	public int getNumero() {
		return numero;
	}

/*
	public void setNumero(int numero) {
		this.numero = numero;
	}
*/

	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public double getSaldo() {
		return saldo;
	}
/*

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	*/
	public void Credito(double valorCredito) {
	this.saldo=this.saldo +valorCredito;
	
	}
	
	

}
