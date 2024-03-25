package ex8;

public class Main {

	public static void main(String[] args) {
		Porta p = new Porta(false);
		p.abrir();
		p.fechar();
		p.abrir();
		Porta f = new Porta(true);
		f.abrir();
		f.fechar();
		f.abrir();
		Porta g = new Porta(false);
		g.abrir();
		

	}

}
