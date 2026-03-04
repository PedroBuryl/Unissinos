package classes_abtract_interface;

public class ContaCorrente extends ContaBancaria{
	
	private int transacoes;
	
	public ContaCorrente(String senha, int numConta) {
		super (senha,numConta);
	}
	
	@Override
	public void saque(double valor) {
		setSaldo(getSaldo()-valor);
		this.transacoes ++;
	}
	
	@Override
	public void deposito(double valor) {
		setSaldo(getSaldo()+valor);
		this.transacoes ++;
	}
	
	@Override
	public void tiraExtrato() {
		System.out.println(this.toString());
	}
	public int getTransacoes() {
		return this.transacoes;
	}

	@Override
	public String toString() {
		return super.toString() +" -conta corrente- Saldo: R$ "+ super.getSaldo();
	}
	
	
}
