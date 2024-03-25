package ex8;

public class Porta {
	private static int numAberturas = 0;
	private boolean isOpen;
	
	public Porta(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public void abrir() {
		if (isOpen == false) {
		isOpen = true;
		numAberturas++;
		System.out.println("Porta aberta");
		if (numAberturas == 1)
		System.out.println("A porta já foi aberta " + numAberturas + " vez.");
		else
			System.out.println("As portas já foram abertas " + numAberturas + " vezes.");
		}
		else
		System.out.println("A porta já está aberta.");
	}
	
	public void fechar() {
		if (isOpen == true) {
		isOpen = false;
		System.out.println("Porta fechada");
		}
		else
		System.out.println("A porta já está fechada.");
	}
}
