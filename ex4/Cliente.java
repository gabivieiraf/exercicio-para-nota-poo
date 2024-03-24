package ex4;

public class Cliente {
	private String nome;
	private double saldo, limite;
	
	public Cliente(String nome, double saldo, double limite) {
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public void sacar(double quantia) {
		if ((saldo+limite) > quantia) {
			System.out.println("Saque efetuado com sucesso. Valor: " + quantia);
			saldo = saldo  - quantia;
			System.out.println("Saldo atual: " + (saldo+limite));
		}
		else {
			System.out.println("Você não possui valor suficiente para este saque.");
			System.out.println("Valor possível de saque: " + (saldo+limite));
	}
}
	public void depositar(double quantia) {
		saldo = saldo + quantia;
		System.out.println("Deposito efetuado com sucesso.");
		System.out.println("Saldo atual: " + (saldo+limite));
	}
	
	public void checarSaldo() {
		 System.out.println("Saldo atual: " + (saldo+limite));
	}
	
	public void obterNome() {
		System.out.println("Nome: " + nome);
	}
	
}
