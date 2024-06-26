package ExerciciosCondicionais;
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o saldo médio
        System.out.print("Digite o saldo médio do último ano: ");
        double saldoMedio = scanner.nextDouble();

        // Variável para armazenar o valor do crédito
        double valorCredito = 0;

        // Calcula o valor do crédito com base na tabela
        if (saldoMedio >= 0 && saldoMedio <= 200) {
            valorCredito = 0;
        } else if (saldoMedio >= 201 && saldoMedio <= 400) {
            valorCredito = saldoMedio * 0.20;
        } else if (saldoMedio >= 401 && saldoMedio <= 600) {
            valorCredito = saldoMedio * 0.30;
        } else if (saldoMedio > 600) {
            valorCredito = saldoMedio * 0.40;
        }

        // Imprime o saldo médio e o valor do crédito
        System.out.printf("Saldo médio: R$ %.2f\n", saldoMedio);
        System.out.printf("Valor do crédito: R$ %.2f\n", valorCredito);

      
        scanner.close();
	}

}
