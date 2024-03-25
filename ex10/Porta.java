package ex10;

public class Porta {
	private boolean isOpen;
	private static int numAberturas;

	void abrir() {
		if (isOpen == false) {
			setOpen(true);
			numAberturas++;
			System.out.println("Porta aberta");
		} else {
			System.out.println("A porta já está aberta");
		}
	}
	
	void fechar() {
		if (isOpen == true) {
			setOpen(false);
		} else {
			System.out.println("Porta já fechada");
		}
	}

	private void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public static int getNumAberturas() {
		return numAberturas;
	}
	
	public boolean getIsOpen() {
		return isOpen;
	}

}
