package ExerciciosCondicionais;
import java.util.Scanner;
public class ex09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Definição do valor do salário mínimo
        final double SALARIO_MINIMO = 1212.00;

        // Leitura do valor do salário do usuário
        System.out.print("Digite o valor do seu salário: ");
        double salarioUsuario = scanner.nextDouble();

        // Cálculo da quantidade de salários mínimos
        double quantidadeSalariosMinimos = salarioUsuario / SALARIO_MINIMO;

       
        System.out.printf("Você ganha o equivalente a %.2f salários mínimos.%n", quantidadeSalariosMinimos);


	}

}
