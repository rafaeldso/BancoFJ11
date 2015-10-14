class GerenciadorDeImpostoDeRenda {
	private double total;

	void adiciona(Tributavel t) {
		System.out.println("Adicionando Tribut�vel: " + t);

		this.total += t.calculaTributos();
	}

	public double getTotal() {
		return total;
	}

}