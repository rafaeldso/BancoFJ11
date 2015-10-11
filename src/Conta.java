public abstract class Conta{
	
	private String titular;
	private int numero;
	private double saldo;
	private int agencia;
	private static int numContas;
	
	public Conta(){
		
	}
	
	public Conta(String titular, int numero, int agencia){
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		Conta.numContas++;
	}
	public abstract void atualiza(double taxa);
	
	public boolean saca(double valor){
		if(saldo > valor){
			saldo -= valor;
			return true;
		}
		return false;	
	}
	public void deposita(double valor){
		this.saldo += valor - 0.10;
	}
	public void setSaldo(double saldo){
		this.saldo += saldo;
	}
	public double getSaldo(){
		return this.saldo;
	}
	public int getNumero(){
		return this.numero;
	}
	public void setNumero(int numero){
		
		this.numero = numero;
	}
	public void setTitular(String titular){
		this.titular = titular;
	}
	public String getTitular(){
        return this.titular;     
    }
	public int getAgencia(){
		return this.agencia;
	}
	public void setAgencia(int agencia){
		this.agencia = agencia;
	}
    public static int getNumContas(){
		return Conta.numContas;
	}

}