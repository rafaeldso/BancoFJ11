public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente() {

	}

	public ContaCorrente(String titular, int numero, int agencia) {
		super(titular, numero, agencia);
	}

	public void atualiza(double taxa) {
		this.setSaldo(this.getSaldo() * (taxa * 2));
	}

	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}