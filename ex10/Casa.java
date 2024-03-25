package ex10;

public class Casa {
	private String cor;
	private Porta portaEntrada;
	private Porta[] portas;
	private int numPortasAbertas;
	
	
	public Casa(String cor) {
		this.cor = cor;
		this.portaEntrada = new Porta();
		this.portas = new Porta[3];
		this.numPortasAbertas = 0;
	}
	
	public void abrirPortaEntrada() {
		portaEntrada.abrir();
		numPortasAbertas++;
	}
	
	public void fecharPortaEntrada() {
		portaEntrada.fechar();
		if(!portaEntrada.getIsOpen()) {
			numPortasAbertas--;
		}
	}
	
	public void adicionarPorta() {
		if (portas[2] != null) {
			System.out.println("Limite de portas atingido");
			return;
		} 
		for (int i =  0; i < portas.length; i++ ) {
			if(portas[i] == null) {
				portas[i] = new Porta();
				return;
			}
		}
	}
	
	public void abrirPorta(int indice) {
		if(indice >= 0 && indice < portas.length && portas[indice] != null) {
			portas[indice].abrir();
			numPortasAbertas++;
		} else {
			System.out.println("Porta inválida");
		}
	}
	
	public void fecharPorta(int indice) {
		if(indice >= 0 && indice < portas.length && portas[indice] != null) {
			portas[indice].fechar();
			if(!portas[indice].getIsOpen()) {
				numPortasAbertas--;
			}
		} else {
			System.out.println("Porta inválida");
		}
	}
	
	public int getNumPortasAbertas() {
		return numPortasAbertas;
	}
	
}
