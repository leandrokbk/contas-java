package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaConta {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		
		c1.setTitular("Leandro");
		c1.setNumero(1234);
		c1.setAgencia("5877"); 
		c1.deposita(100.0);
		c1.saca(20.0);
	
	
		System.out.println(c1.recuperaDadosImpressao());
	
	}
	
	
}
