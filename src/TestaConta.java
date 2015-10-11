
public class TestaConta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c1 = new ContaCorrente("Rafael", 1234, 4321);
		Conta c2 = new ContaPoupanca("Maria", 4321, 3456);

		int num = Conta.getNumContas();
		System.out.println(num);
		
		Conta c = new ContaCorrente();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}

}
