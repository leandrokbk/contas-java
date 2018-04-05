package br.com.caelum.contas.modelo;

public abstract class Conta implements Comparable<Conta>{
	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;
	
	
	
	public String getTitular() {
		return this.titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}	
	
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	@Override
	public String toString(){
		return "[titular=" + titular.toUpperCase() + ",numero= " + numero + ", agencia=" + agencia + "]";
	}
	
	public boolean equals(Object obj){
		if (obj == null){
			return false;
		}
		Conta outraConta = (Conta) obj;/*casting garante para jvm que obj é uma conta*/
		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
	}
	
	public void deposita(double valor) {
		if (valor < 0){
			throw new IllegalArgumentException("Você tentou depositar " + "um valor negativo");
		}else{
		this.saldo += valor;
		}
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	public void transfere (double valor, Conta conta){
		this.saca(valor);
		conta.deposita(valor);
	}
	public String getTipo(){
		return "Conta";
	}
	
	  public String recuperaDadosImpressao() {
	        String dados = "Titular: " + this.getTitular();
	        dados += "\nNumero: " + this.getNumero();
	        dados += "\nAgência: " + this.getAgencia();
	        dados += "\nSaldo: " + this.getSaldo();

	        return dados;
	      }
	  public int compareTo(Conta outraConta){
		  return this.titular.compareTo(outraConta.titular);
	  }
	
	
}
