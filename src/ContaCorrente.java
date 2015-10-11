
public class ContaCorrente extends Conta{

	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}
	public ContaCorrente(String titular, int numero, int agencia){
		super(titular,numero,agencia);
	}
	public void atualiza(double taxa){
		this.setSaldo(this.getSaldo() * (taxa*2));
	}

}
