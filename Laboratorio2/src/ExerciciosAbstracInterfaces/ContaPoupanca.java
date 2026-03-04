package classes_abtract_interface;

public class ContaPoupanca extends ContaBancaria implements Rentavel{
	
	private double txRend;
	
	public ContaPoupanca(String senha, int numConta) {
		super(senha, numConta);
	}
	
	public double getTxRend() {
		return this.txRend;
	}

	public void setTxRend(double txRend) {
		this.txRend = txRend;
	}
	
	@Override
	public void saque(double valor) {
		setSaldo(getSaldo()-valor);
	}
	
	@Override
	public void deposito(double valor) {
		setSaldo(getSaldo()+valor);
	}
	
	@Override
	public void tiraExtrato() {
		System.out.println(this.toString());
	}
	
	@Override
	public double calculaRendimento() {
		return super.getSaldo()*this.txRend;
	}

	@Override
	public String toString() {
		return super.toString() +" -conta poupança- Saldo: R$ "+ super.getSaldo();
	}
	
}
