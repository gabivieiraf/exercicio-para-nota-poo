package ex11;

public class Main {

	public static void main(String[] args) {
		Edificio edificio = new Edificio();
		
		edificio.adicionarApartamento(1);
		edificio.adicionarApartamento(1);
		edificio.adicionarApartamento(3);
		
		edificio.listaApartamentos();
		
		edificio.procuraApartamento(1);
		
		edificio.adicionarApartamento(2);
		edificio.adicionarApartamento(4);
		
		
		
	}

}
