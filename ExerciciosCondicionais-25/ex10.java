package ExerciciosCondicionais;
import java.util.Scanner;
public class ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Leitura do saldo
        System.out.print("Digite o valor do saldo: ");
        double saldo = scanner.nextDouble();

        // Cálculo do saldo com reajuste de 1.5%
        double reajuste = saldo * 0.015;
        double saldoReajustado = saldo + reajuste;

        
        System.out.printf("O saldo com reajuste de 1.5%% é: R$ %.2f%n", saldoReajustado);

	}

}
