package ExerciciosCondicionais;
import java.util.Scanner;
public class ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 // Leitura da porcentagem do IPI
        System.out.print("Digite a porcentagem do IPI a ser acrescido no valor das peças: ");
        double ipi = scanner.nextDouble();

        // Leitura dos dados da peça 1
        System.out.print("Digite o código da peça 1: ");
        int codigoPeca1 = scanner.nextInt();
        System.out.print("Digite o valor unitário da peça 1: ");
        double valorUnitarioPeca1 = scanner.nextDouble();
        System.out.print("Digite a quantidade de peças 1: ");
        int quantidadePeca1 = scanner.nextInt();

        // Leitura dos dados da peça 2
        System.out.print("Digite o código da peça 2: ");
        int codigoPeca2 = scanner.nextInt();
        System.out.print("Digite o valor unitário da peça 2: ");
        double valorUnitarioPeca2 = scanner.nextDouble();
        System.out.print("Digite a quantidade de peças 2: ");
        int quantidadePeca2 = scanner.nextInt();

        
        double valorTotalPeca1 = valorUnitarioPeca1 * quantidadePeca1;
        double valorTotalPeca2 = valorUnitarioPeca2 * quantidadePeca2;
        double valorTotal = (valorTotalPeca1 + valorTotalPeca2) * (ipi / 100 + 1);

    
        // Quando você usa %.2f em uma string de formato, o valor correspondente será arredondado e exibido com exatamente duas casas decimais.
        System.out.printf("O valor total a ser pago é: R$ %.2f%n", valorTotal);

	}

}
