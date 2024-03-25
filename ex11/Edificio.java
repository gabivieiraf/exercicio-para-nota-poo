package ex11;

public class Edificio {
	private Apartamento[] apartamentos;

	public Edificio() {
		this.apartamentos = new Apartamento[3];
	}

	public void adicionarApartamento(int identificador) {
		for (int i = 0; i < apartamentos.length; i++) {
			if (apartamentos[i] == null) {
				apartamentos[i] = new Apartamento(identificador);
				System.out.println("Apartamento adicionado");
				return;
			} else if (apartamentos[i].getApartamento() == identificador) {
				System.out.println("Apartamento com esse identificador já existe");
				return;
			}
		}
		System.out.println("Limite de apartamento atingido");
	}

	public void procuraApartamento(int identificador) {
		for (int i = 0; i < apartamentos.length; i++) {
			if (apartamentos[i].getApartamento() == identificador) {
				System.out.println("Apartamento encontrado");
				return;
			} else {
				System.out.println("Apartamento inexistente");
			}

		}
	}

	public void listaApartamentos() {
		for (Apartamento apartamento : apartamentos) {
			if (apartamento != null) {
				System.out.println("Apartamento: " + apartamento.getApartamento());
			}
		}
	}
	

}
