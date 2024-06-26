package testandobanco;
import java.util.*; // Trazendo TODAS as classes da biblioteca util do JAVA
public class Conta {
	String titular_conta;
	int numero_conta;
	double saldo;
	
	Scanner entrada = new Scanner(System.in);
	
	
	//Criando o metodo construtor
	public Conta(String nome_titular, double saldo_inicial){
		this.titular_conta = nome_titular;
		this.saldo = saldo_inicial;
		
		Random gerador_numero = new Random();
		numero_conta = gerador_numero.nextInt(1000); // Gerador randomico de numero de 1 até 1000
	}
	
	void VerSaldo() {
		System.out.println("O numero da conta é: " + numero_conta);
		System.out.println("O nome do titular é: " + titular_conta);
		System.out.println("O saldo da conta é: " + saldo);
	}
	
	void Saque(double valor_saque) {
		if (saldo >= valor_saque) {
			saldo = saldo - valor_saque;
			System.out.println("Seu saldo atual é de: "+ saldo);
		}else {
			System.out.println("Seu saldo atual é insulficiente para saque ");
		}
	}	
	void Deposito(double valor_deposito) {
		if (valor_deposito <=0) {
			System.out.println("Valor de deposito invalido");
		}else {
			saldo = saldo + valor_deposito;
			System.out.println("Seu saldo atual é de:" + saldo);
		}
	}
	
	void Exibir_menu() {
		System.out.println("Bem vindo ao banco Pablão enterprises");
		System.out.println("Escolha sua opção");
		System.out.println("1 - Ver Saldo");
		System.out.println("2 - Sacar");
		System.out.println("3 - Depositar");
		System.out.println("4 - Finalizar");
	}
	
	
	void Iniciar() {
		int opcao;
		do {
			Exibir_menu();
			opcao = entrada.nextInt();
			Escolher_funcao(opcao);
			}while (opcao != 4);
		}		
	
	void Escolher_funcao(int opcao) {
		
		double saque;
		double deposito;
	
		switch(opcao) {
			case 1:
				VerSaldo();
				break;
			case 2:
				System.out.println("Digite o valor a ser sacado: ");
				saque = entrada.nextDouble();
				Saque(saque);
				break;
			case 3:
				System.out.println("Digite o valor a ser depositado: ");
				deposito = entrada.nextDouble();
				Deposito(deposito);
				break;
			case 4:
				System.out.println("Operação finalzada!");
				break;
				
			default:
				System.out.println("Opção inválida");
	}	
		
		
}
	
}
