
public class AtualizadorDeContas {
	
	private double saldoTotal;
	private double selic;

	public AtualizadorDeContas(double selic) {
		// TODO Auto-generated constructor stub
		this.selic = selic;
	}
	
	public void roda(Conta c) {
		System.out.println("O Saldo Anterior �: "+c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("O Saldo Final �: "+c.getSaldo());
		this.saldoTotal += c.getSaldo();
		
	}
	public double getSaldoTotal() {
		return saldoTotal;
	}
	

}
