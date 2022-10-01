package br.com.dio.bancodigital;

public class Main {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca();
		cc.transferir(20, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
