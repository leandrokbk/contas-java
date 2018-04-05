package br.com.caelum.contas.modelo;

public class SaldoInsuficienteException extends RuntimeException{
	
	public SaldoInsuficienteException(double valor){
		super("saldo insuficiente para sacar o valor de: " + valor);
	}
	public SaldoInsuficienteException() {
		// TODO Auto-generated constructor stub
	}
}
