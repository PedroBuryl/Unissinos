package classes_abtract_interface;

import java.util.Scanner;

/*Exercício 2: Crie uma classe de teste para testar a hierarquia do exercício 1*/
public class Teste {

	public static void main(String[] args) {
		/*Pergunte quantas contas o usuário deseja criar e crie-as 
		 * (com a utilização de arrays para armazenar as contas)
		 * a cada conta criada, pergunte ao usuário se trata-se de uma ContaCorrente 
		 * ou de uma ContaPoupanca, e crie a conta de acordo com o informado pelo usuário*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas contas deseja criar? ");
		int quantidade = sc.nextInt();
		ContaBancaria[] contas = new ContaBancaria[quantidade];
		
		for (int i = 0; i < contas.length; i++) {
			System.out.println();
			System.out.println(i+1 +"ª conta");
			System.out.println("Selecione o tipo de conta");
			System.out.println("1 - Conta corrente");
			System.out.println("2 - Conta poupança");
			int opc = sc.nextInt();
			while(opc < 1 || opc > 2) {
				System.out.println("Opção invalida!!!!!!!");
				System.out.println("Selecione o tipo de conta");
				System.out.println("1 - Conta corrente");
				System.out.println("2 - Conta poupança");
				opc = sc.nextInt();
			}
			if(opc == 1) {
				//Vamos assumir que o usuario é bonzinho e digitou somente numeros inteiros :)
				System.out.print("Cadastre uma senha númerica: ");
				String senha = sc.next();
				contas[i] = new ContaCorrente(senha, (int)(Math.random()*1000));
			}else {
				System.out.print("Cadastre uma senha númerica: ");
				String senha = sc.next();     
				contas[i] = new ContaPoupanca(senha, (int)(Math.random()*1000));
			}
	
		}
		
		//Após as contas terem sido criadas, informe a taxa de rendimento de cada ContaPoupanca armazenada
		
		for (ContaBancaria cb : contas) {
			if(cb instanceof ContaPoupanca) {
				((ContaPoupanca) cb).setTxRend(Math.random()*3.5);
			}
		}
		//Realize saques, depósitos e extratos nestas contas
		for (ContaBancaria cb : contas) {
			cb.deposito(Math.random()*100000);
			cb.saque(Math.random()*10000);
			cb.tiraExtrato();
		}
		
		//imprima a quantidade de transações realizadas nas contas correntes e as taxas de rendimento das contas poupança
		
		for (ContaBancaria cb : contas) {
			if (cb instanceof ContaCorrente) {
				System.out.println("Transações realizadas na conta corrente "+ cb.getNumConta() +": "+((ContaCorrente) cb).getTransacoes());
			}else if (cb instanceof ContaPoupanca) {
				System.out.println("Taxa de rendimento da conta poupança "+ cb.getNumConta() +": "+ ((ContaPoupanca) cb).getTxRend());
			}
		}

	sc.close();}

}
