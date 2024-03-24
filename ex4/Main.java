package ex4;

public class Main {

	public static void main(String[] args) {
		Cliente c = new Cliente("Gabriela", 1500, 1700);
		c.checarSaldo();
		c.depositar(100);
		c.checarSaldo();
		c.sacar(9000);
		c.sacar(500);
		c.obterNome();

	}

}
