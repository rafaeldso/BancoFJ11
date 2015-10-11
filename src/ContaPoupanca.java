
public class ContaPoupanca extends Conta{

	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
	}
	public ContaPoupanca(String titular, int numero, int agencia){
		super(titular,numero,agencia);
	}
	public void atualiza(double taxa){
		this.setSaldo(this.getSaldo() * (taxa*3));
	}
}
