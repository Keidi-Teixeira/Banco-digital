package br.com.dio.bancodigital;

public class ContaPoupanca extends Conta {

	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato conta poupança");
		System.out.println(String.format("Agência: %d", super.agencia));
		System.out.println(String.format("Número: %d", super.numero));
		System.out.println(String.format("Saldo: %f", super.saldo));
		
	}
	
	
	

}
