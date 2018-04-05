package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[10];
		
		for(int i = 0; i < contas.length; i++){
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100);
			
			contas[i] = conta;	
			System.out.println(conta.getSaldo());
			System.out.println(i);
		}
			double total = 0;
			int indice = contas.length ;
			//System.out.println(contas.length);
			
		for (Conta conta : contas) {
			total += conta.getSaldo();
		}	
		System.out.println("A média dos saldos é: " + (total/indice));
		
		}
}
		
		
		

