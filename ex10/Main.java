package ex10;

public class Main {

	public static void main(String[] args) {
		Casa casa1 = new Casa("Amarela");
		
		casa1.abrirPortaEntrada();
		casa1.adicionarPorta();
		casa1.abrirPorta(0);
		casa1.abrirPorta(1);
		casa1.adicionarPorta();
		casa1.abrirPorta(1);
		
		System.out.println("Existem " + casa1.getNumPortasAbertas() + " Portas abertas");
		
		casa1.fecharPortaEntrada();
		
		System.out.println("Existem " + casa1.getNumPortasAbertas() + " Portas abertas");

	}

}
