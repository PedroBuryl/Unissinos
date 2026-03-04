package classes_abtract_interface;

import java.util.Scanner;

/*Exercício 1:
  Implemente a hierarquia de classes ContaBancaria (superclasse)
  ContaCorrente (com senha, número, saldo e quantidade de transações realizadas) 
  ContaPoupanca (com senha, número, saldo e taxa de rendimento).*/

public abstract class ContaBancaria {
	
	private String senha;
	private int numConta;
	private double saldo;
	
	/*Quando uma ContaBancaria for criada, informe a senha da conta por parâmetro*/
	
	public ContaBancaria(String senha, int numConta) {
		this.senha = senha;
		this.numConta = numConta;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/*Na classe ContaBancaria, crie os seguintes métodos abstratos (os métodos devem simular as 
	 * situações acontecendo na conta corrente):
		saque(double valor)
		deposito(double valor)
		tiraExtrato()*/
	
	public abstract void saque(double valor);
	public abstract void deposito(double valor);
	public abstract void tiraExtrato();

	/*crie o método alteraSenha, que recebe uma senha por parâmetro e deve confirmar a senha anterior
	  (via teclado), e somente se a senha anterior estiver correta a senha recebida por parâmetro 
	  deve ser atribuída*/
	
	public void alteraSenha(String novaSenha) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Antes de alterar a senha, confirme sua senha atual:");
		
		if(sc.nextLine().equals(this.senha)) {
			this.senha = novaSenha;
			System.out.println("Senha alterada com sucesso!!!");
		}else {
			System.out.println("Senha INCORRETA!!!!!");
			System.out.println("Sua senha não foi alterada por motivos de segurança!");
		}
		sc.close();
	}
	
	/*Implemente os métodos abstratos acima nas classes ContaCorrente e ContaPoupanca*/

	@Override
	public String toString() {
		return "Conta nº"+ numConta;
	}
	
	

}
