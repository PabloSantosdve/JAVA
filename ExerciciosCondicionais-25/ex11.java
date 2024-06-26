package ExerciciosCondicionais;
import java.util.Scanner;
public class ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Leitura do nome do vendedor
        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        // Leitura do salário fixo do vendedor
        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        // Leitura do total de vendas efetuadas pelo vendedor no mês
        System.out.print("Digite o total de vendas efetuadas pelo vendedor no mês (em dinheiro): ");
        double totalVendas = scanner.nextDouble();

        // Cálculo da comissão (15% sobre o total de vendas)
        double comissao = totalVendas * 0.15;

        // Cálculo do salário final no mês (salário fixo + comissão)
        double salarioFinal = salarioFixo + comissao;

     
        System.out.println("\nNome do vendedor: " + nome);
        System.out.printf("Salário fixo: R$ %.2f%n", salarioFixo);
        System.out.printf("Salário final no mês (com comissão): R$ %.2f%n", salarioFinal);

	}

}
