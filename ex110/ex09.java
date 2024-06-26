package ex110;
import java.util.Scanner;
public class ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Solicita o valor do depósito mensal ao usuário
        System.out.print("Digite o valor do depósito mensal: ");
        double depositoMensal = scanner.nextDouble();

        // Solicita a taxa de juros mensal ao usuário
        System.out.print("Digite a taxa de juros mensal (em %): ");
        double taxaJurosMensal = scanner.nextDouble() / 100;

        // Calcula o montante após 12 meses
        double montante = 0;
        for (int i = 0; i < 12; i++) {
            montante = (montante + depositoMensal) * (1 + taxaJurosMensal);
        }

        System.out.printf("Montante após 12 meses: R$ %.2f\n" + montante);

	}

}
